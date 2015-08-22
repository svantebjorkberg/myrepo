package polarextract.test;

import java.io.File;

import polarextract.PDDFile;

public class TestPDDFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestPDDFile().run();
	}

	private void run() {
		File file = new File("C:/Program Files/Polar/Polar ProTrainer/Svante Bj�rkberg/2008/20080625.pdd");
		
		PDDFile pddFile = new PDDFile(file);
		String data = pddFile.getData();
		System.out.println(PDDFile.getHeadings());
		System.out.println(data);
	}
}
