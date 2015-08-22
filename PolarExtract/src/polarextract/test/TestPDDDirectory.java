package polarextract.test;

import java.io.File;

import polarextract.PDDDirectory;
import polarextract.PDDFile;

public class TestPDDDirectory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestPDDDirectory().run();
	}

	private void run() {
		File dir = new File("C:/Program Files/Polar/Polar ProTrainer/Svante Bj�rkberg/2008");
		
		PDDDirectory pddDirectory = new PDDDirectory(dir);
		System.out.println(PDDFile.getHeadings());
		System.out.println(pddDirectory.getData());
	}
}
