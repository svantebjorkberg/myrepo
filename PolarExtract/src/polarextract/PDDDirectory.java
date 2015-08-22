package polarextract;

import java.io.File;
import java.io.FilenameFilter;

public class PDDDirectory {
	File directory = null;
	File[] files = null;
	int fileIndex = -1;
	
	public PDDDirectory(File dir) {
		directory = dir;
	}
	
	protected boolean hasMoreFiles() {
		return fileIndex < files.length - 1; 
	}
	
	protected void nextFile() {
		fileIndex++;
	}
	
	public String getData() {
    	PDDFilenameFilter filter = new PDDFilenameFilter();
    	files = directory.listFiles(filter);
    	PDDFile pddFile = null;

    	StringBuffer sb = new StringBuffer();
    	for (int i=0;i<files.length;i++) {
    		pddFile = new PDDFile(files[i]);
    		String data = pddFile.getData();
    		
    		if (data != null) {
        		sb.append(data);
        		sb.append("\r\n");
    		}
    	}

		return sb.toString();
	}

	class PDDFilenameFilter implements FilenameFilter {
		public boolean accept(File dir, String name) {
			if (name.endsWith(".pdd")) return true;
			return false;
		}
	}
}
