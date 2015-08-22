package polarextract;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class PDDExerciseInfo {
	private HashMap<String, String[]> exercises = new HashMap<String, String[]>();
	private static final int ROW1_DATA_NO_REPORT		= 1;
	private static final int ROW1_DATA_START_TIME		= 4;
	private static final int ROW1_DATA_TOTAL_TIME		= 5;
	private static final int ROW3_DATA_DISTANCE			= 0;
	private static final int ROW9_DATA_HR_AVERAGE		= 0;
	private static final int ROW9_DATA_HR_MAX			= 1;
	private static final int ROW9_DATA_SPEED_AVERAGE	= 2;
	private static final int ROW9_DATA_SPEED_MAX		= 3;
	private static final int ROW9_DATA_CADENCE_AVERAGE	= 4;
	private static final int ROW9_DATA_CADENCE_MAX		= 5;
	private static final int ROW15_DATA_RUNNING_INDEX	= 3;
	static final int NO_OF_FIELDS	= 12;

	private static final int START_TIME		= 0;
	private static final int TOTAL_TIME		= 1;
	private static final int DISTANCE		= 2;
	private static final int HR_AVERAGE		= 3;
	private static final int HR_MAX			= 4;
	private static final int SPEED_AVERAGE	= 5;
	private static final int SPEED_MAX		= 6;
	private static final int CADENCE_AVERAGE	= 7;
	private static final int CADENCE_MAX		= 8;
	private static final int RUNNING_INDEX	= 9;
	private static final int NO_REPORT		= 10;
	private static final int EXERCISE_NO  	= 11;
	
	public PDDExerciseInfo(PDDLine[] lines) {
		boolean headerFound = false;
		boolean isThereAnUnsavedExercise = false;
		int exerciseIndex = 0;
		int lineIndex = 0;
		String[] exercise = null;

		for (int i=0;i<lines.length;i++) {
			if (lines[i].isExerciseInfoHeader()) {
				if (exercise != null) {
					exercises.put(String.valueOf(exerciseIndex), exercise);
					isThereAnUnsavedExercise = false;
				}
				exercise = new String[NO_OF_FIELDS];
				headerFound = true;
				lineIndex = 0;
				exerciseIndex = lines[i].getExerciseInfoIndex();
				exercise[EXERCISE_NO] = String.valueOf(exerciseIndex);
				continue;
			}
			
			if (lines[i].isHeader()) headerFound = false;
			if (!headerFound) continue;
			
			String[] fields = lines[i].getFields("\t");
			if (lineIndex == 1) exercise[NO_REPORT]			= fields[ROW1_DATA_NO_REPORT]; 
			if (lineIndex == 1) exercise[START_TIME]		= fields[ROW1_DATA_START_TIME]; 
			if (lineIndex == 1) exercise[TOTAL_TIME]		= fields[ROW1_DATA_TOTAL_TIME]; 
			if (lineIndex == 3) exercise[DISTANCE]			= fields[ROW3_DATA_DISTANCE]; 
			if (lineIndex == 9) exercise[HR_AVERAGE]		= fields[ROW9_DATA_HR_AVERAGE]; 
			if (lineIndex == 9) exercise[HR_MAX]			= fields[ROW9_DATA_HR_MAX]; 
			if (lineIndex == 9) exercise[SPEED_AVERAGE]		= fields[ROW9_DATA_SPEED_AVERAGE]; 
			if (lineIndex == 9) exercise[SPEED_MAX]			= fields[ROW9_DATA_SPEED_MAX]; 
			if (lineIndex == 9) exercise[CADENCE_AVERAGE]	= fields[ROW9_DATA_CADENCE_AVERAGE]; 
			if (lineIndex == 9) exercise[CADENCE_MAX]		= fields[ROW9_DATA_CADENCE_MAX]; 
			if (lineIndex == 15) exercise[RUNNING_INDEX]	= fields[ROW15_DATA_RUNNING_INDEX];
			isThereAnUnsavedExercise = true;
			lineIndex++;
		}

		if (isThereAnUnsavedExercise) {
			exercises.put(String.valueOf(exerciseIndex), exercise);
		}
	}
	
	public String[] getData() {
		Vector<String> data = new Vector<String>();
		Iterator<Map.Entry<String, String[]>> iter = exercises.entrySet().iterator();
		int exerciseNo = 0;
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			String[] exercise = (String[]) entry.getValue();
			
			if (exercise[PDDExerciseInfo.NO_REPORT].equals("1") || exercise[PDDExerciseInfo.NO_REPORT].equals("3")) continue; //Not in reports

			StringBuffer sb = new StringBuffer();
			boolean firstField = true;
			for (int i=0;i<exercise.length;i++) {
				if (firstField) {
					firstField = false;
				} else {
					sb.append("\t");
				}
				sb.append(exercise[i]);
			}
			
			data.add(sb.toString());
			exerciseNo++;
		}
		
		String[] output = new String[data.size()];
		for (int i=0;i<output.length;i++) output[i] = (String) data.get(i);
		return output;
	}
	
	public static String getHeadings() {
		String[] headings = new String[NO_OF_FIELDS];
		headings[START_TIME]		= "Start time";
		headings[TOTAL_TIME]		= "Total time";
		headings[DISTANCE]			= "Distance";
		headings[HR_AVERAGE]		= "HR ave";
		headings[HR_MAX]			= "HR max";
		headings[SPEED_AVERAGE]		= "Speed ave";
		headings[SPEED_MAX]			= "Speed max";
		headings[CADENCE_AVERAGE]	= "Cadence ave";
		headings[CADENCE_MAX]		= "Cadence max";
		headings[RUNNING_INDEX]		= "Running index";
		headings[NO_REPORT]			= "No report";
		headings[EXERCISE_NO]		= "Exercise no";
		
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
