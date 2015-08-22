package polarextract;

public class PDDLine {
	private String line = null;
	public PDDLine(String inLine) {
		line = inLine;
	}
	
	protected String[] getFields(String separator) {
		return line.split(separator);
	}
	
	protected String getLine() {
		return line;
	}
	
	protected boolean isHeader() {
		return isDayInfoHeader() || isExerciseInfoHeader(); 
		
	}

	public boolean isDayInfoHeader() {
		return line.indexOf("[DayInfo]") == 0;
	}

	public boolean isExerciseInfoHeader() {
		return line.indexOf("[ExerciseInfo") == 0;
	}
	
	public int getExerciseInfoIndex() {
		if (!isExerciseInfoHeader()) return -1;
		
		int i1 = line.lastIndexOf("o");
		int i2 = line.lastIndexOf("]");
		return Integer.parseInt(line.substring(i1+1, i2));
	}
}
