package polarextract.test;

import polarextract.PDDLine;

public class TestPDDLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestPDDLine().run();
	}

	private void run() {
		PDDLine pddLine = new PDDLine("[DayInfo]");
		System.out.println("isDayInfo: " + pddLine.isDayInfoHeader());
		System.out.println("isExerciseInfoHeader: " + pddLine.isExerciseInfoHeader());
		System.out.println("getExerciseInfoIndex: " + pddLine.getExerciseInfoIndex());
	}
}
