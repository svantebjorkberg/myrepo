package polarextract.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import polarextract.PDDExerciseInfo;
import polarextract.PDDLine;

public class TestPDDExerciseInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestPDDExerciseInfo().run();
	}

	private void run() {
		File file = new File("C:/Program Files/Polar/Polar ProTrainer/Svante Bj�rkberg/2008/20080625.pdd");
		
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

		PDDLine[] pddLines = new PDDLine[lines.size()];
		for (int i=0;i<lines.size();i++) pddLines[i] = (PDDLine) lines.get(i);
		PDDExerciseInfo pddExerciseInfo = new PDDExerciseInfo(pddLines);
		String[] data = pddExerciseInfo.getData();

		System.out.println(PDDExerciseInfo.getHeadings());
		for (int exerciseNo=0;exerciseNo<data.length;exerciseNo++) {
			System.out.println(data[exerciseNo]);
		}
	}
}
