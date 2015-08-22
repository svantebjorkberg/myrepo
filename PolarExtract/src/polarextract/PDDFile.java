package polarextract;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class PDDFile {

	private PDDLine[] pddLines = null;
	private PDDDayInfo pddDayInfo = null;
	private PDDExerciseInfo pddExerciseInfo = null;
	
	@SuppressWarnings("unchecked")
	public PDDFile(File file) {
		String line = null;
		Vector lines = new Vector();
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			line = br.readLine();
			
			while (line != null) {
				lines.add(new PDDLine(line));
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}

		pddLines = new PDDLine[lines.size()];
		for (int i=0;i<lines.size();i++) pddLines[i] = (PDDLine) lines.get(i);
		pddDayInfo = new PDDDayInfo(pddLines);
		pddExerciseInfo = new PDDExerciseInfo(pddLines);
	}
	
	@SuppressWarnings("unchecked")
	public String getData() {
		StringBuffer data = new StringBuffer();

		String   dayInfo 		= pddDayInfo.getData();
		String[] exerciseInfo 	= pddExerciseInfo.getData();

		if (exerciseInfo.length > 0) {
			for (int exerciseNo=0;exerciseNo<exerciseInfo.length;exerciseNo++) {
				if(exerciseNo > 0) {
					data.append("\r\n");
				}

				data.append(dayInfo);
				data.append("\t");
				data.append(exerciseInfo[exerciseNo]);
			}
		
			return data.toString();
		}
		
		return null;
	}
	
	public static String getHeadings() {
		StringBuffer headings = new StringBuffer();
		headings.append(PDDDayInfo.getHeadings());
		headings.append("\t");
		headings.append(PDDExerciseInfo.getHeadings());
		return headings.toString();
	}
}

