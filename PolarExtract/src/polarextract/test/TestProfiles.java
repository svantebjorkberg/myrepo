package polarextract.test;

import polarextract.Profiles;

public class TestProfiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestProfiles().run();
	}

	private void run() {
		Profiles p = new Profiles();
		p.addProfile("Svante1", "C:\\path1");
		p.addProfile("Svante2", "C:\\path2");
		p.addProfile("Svante3", "C:\\path3");
		p.addProfile("Svante4", "C:\\path4");
		p.addProfile("Svante5", "C:\\path5");
		p.addProfile("Svante6", "C:\\path6");
		p.addProfile("Svante7", "C:\\path7");
		p.addProfile("Svante8", "C:\\path8");
		p.addProfile("Svante9", "C:\\path9");
		p.addProfile("Svante10", "C:\\path10");
		String[] names = p.listProfileNames();
		
		for (int i=0;i<names.length;i++) System.out.println("Profile["+i+"]="+names[i]);
		System.out.println("done!");
		System.out.println("done!");
	}
}
