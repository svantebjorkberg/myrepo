package polarextract;

import java.io.FileNotFoundException;

public class PDDDayInfo {
	private String date = null;
	private static final int ROW1_DATA_DATE = 0;
	static final int NO_OF_FIELDS = 1;
	
	public static final int DATE = 0;
	
	public PDDDayInfo(PDDLine[] lines) {
		boolean headerFound = false;
		int lineIndex = 0;
		for (int i=0;i<lines.length;i++) {
			if (lines[i].isDayInfoHeader()) {
				headerFound = true;
				lineIndex = 0;
				continue;
			}
			
			if (lines[i].isHeader()) break;
			if (!headerFound) continue;
			
			if (lineIndex == 1) date = lines[i].getFields("\t")[ROW1_DATA_DATE]; 
			lineIndex++;
		}
	}
	
	public String getData() {
		StringBuffer sb = new StringBuffer();
		sb.append(date);
		return sb.toString();
	}

	public static String getHeadings() {
		String[] headings = new String[NO_OF_FIELDS];
		headings[DATE]		= "Date";
		
		StringBuffer sb = new StringBuffer();
		boolean firstHeading = true;
		for (int i=0;i<headings.length;i++) {
			if (firstHeading) {
				firstHeading = false;
			} else {
				sb.append("\t");
			}
			sb.append(headings[i]);
		}
		
		return sb.toString();
	}
}
