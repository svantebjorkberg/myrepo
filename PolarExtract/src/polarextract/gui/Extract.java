package polarextract.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

import polarextract.PDDDirectory;
import polarextract.PDDFile;
import polarextract.Profiles;

public class Extract extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel pddDirectoryLabel = null;
	private JTextField pddDirectoryPath = null;
	private JButton browse = null;
	private JPanel panelNorth = null;
	private JButton btnProcess = null;
	private JTextArea resultText = null;
	private JFileChooser fileChooser = null;
	private Profiles profiles = new Profiles();

	/**
	 * This method initializes pddDirectoryPath	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Extract thisClass = new Extract();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.pack();
				int width = 600;
				int height = 200;
				thisClass.setMinimumSize(new Dimension(width, height));
				thisClass.setVisible(true);
				Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				int x = (int)screenSize.getWidth() / 2 - width / 2;
				int y = (int)screenSize.getHeight() / 2 - height / 2;
				thisClass.setLocation(x, y);
			}
		});
	}

	public Extract() {
		super();
		initialize();
	}

	private void initialize() {
		this.setSize(500, 300);
		this.setLocation(new Point(100, 100));
		this.setContentPane(getJContentPane());
		this.setTitle("Extract data from Polar data files");
	}

	private JPanel getPanelNorth() {
		if (panelNorth == null) {
			//Create panel north
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 1;
			gridBagConstraints.gridy = 0;
			panelNorth = new JPanel();
			panelNorth.setLayout(new BoxLayout(panelNorth, BoxLayout.Y_AXIS));

			//Create line to choose profile
			JPanel panelProfile = new JPanel();
			panelProfile.setLayout(new BoxLayout(panelProfile, BoxLayout.X_AXIS));
			panelProfile.add(getSelectProfilesLabel(), null);
			panelProfile.add(getProfilesDdl(), null);
			panelProfile.add(getEditProfiles(), null);
			panelNorth.add(panelProfile, null);
			panelNorth.add(getBtnProcess(), null);
		}
		return panelNorth;
	}

	private JLabel getSelectProfilesLabel() {
		JLabel label = new JLabel();
		label.setText("Select the Profile you want to work with");
		label.setPreferredSize(new Dimension(250, 20));
		label.setVerticalAlignment(SwingConstants.CENTER);
		return label;
	}

	private JComboBox getProfilesDdl() {
		JComboBox ddl = new JComboBox(profiles.listProfileNames());
		ddl.setPreferredSize(new Dimension(90, 20));
		return ddl;
	}

	private JButton getEditProfiles() {
		if (browse == null) {
			browse = new JButton();
			Action editProfilesAction = new EditProfilesAction();
			browse.addActionListener(editProfilesAction);
			browse.setToolTipText("Manage your profiles");
			browse.setText("Edit");
		}
		return browse;
	}

	private JButton getBtnProcess() {
		if (btnProcess == null) {
			btnProcess = new JButton();
			btnProcess.setText("Process");
			ProcessAction processAction = new ProcessAction();
			btnProcess.addActionListener(processAction);
		}
		return btnProcess;
	}

	/**
	 * This method initializes resultText	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getResultText() {
		if (resultText == null) {
			resultText = new JTextArea();
		}
		return resultText;
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
/*	private JMenuBar getMenu() {
		//Where the GUI is created:
		JMenuBar menuBar;
		JMenu menu;
		JMenuItem menuItem;

		//Create the menu bar.
		menuBar = new JMenuBar();

		//Build the first menu.
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription(
		        "The only menu in this program that has menu items");
		menuBar.add(menu);

		//a group of JMenuItems
		menuItem = new JMenuItem("Open profile ...", KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
//		OpenProfile openProfile = new OpenProfile();
//		menuItem.addActionListener(openProfile);
		menu.add(menuItem);

		return menuBar;
		
	}
*/	
	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getPanelNorth(), BorderLayout.NORTH);
			jContentPane.add(getResultText(), BorderLayout.CENTER);
//			this.setJMenuBar(getMenu());
		}
		return jContentPane;
	}
	
	class BrowseAction extends AbstractAction {
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
	    	resultText.setText("");
	    	fileChooser = new JFileChooser();
	    	fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	        fileChooser.setFileFilter(null);
	        //In response to a button click:
	    	int returnValue = fileChooser.showOpenDialog(jContentPane);
	    	if (returnValue == JFileChooser.APPROVE_OPTION) {
	    		pddDirectoryPath.setText(fileChooser.getSelectedFile().getAbsolutePath());
	    	} else {
	    		fileChooser = null;
	    	}
	    }
	}

	class ProcessAction extends AbstractAction {
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
	    	if (fileChooser == null) {
		    	resultText.setText("Please first select the directory holding your PDD-files.");
		    	return;
	    	} else {
		    	resultText.setText("Process started ... ");
	    	}

			PDDDirectory pddDirectory = new PDDDirectory(fileChooser.getSelectedFile());
	    	resultText.setText(PDDFile.getHeadings());
	    	resultText.append("\r\n");
	    	resultText.append(pddDirectory.getData());
	    }
	}

	class EditProfilesAction extends AbstractAction {
		private static final long serialVersionUID = 1L;

		public void actionPerformed(ActionEvent e) {
			System.out.println("Open profile selected");
	    	fileChooser = new JFileChooser();
	    	fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	        FileNameExtensionFilter filter = new FileNameExtensionFilter("xml-files", "xml");
	        fileChooser.setFileFilter(filter);

	        //In response to a button click:
	    	int returnValue = fileChooser.showOpenDialog(jContentPane);
	    	if (returnValue == JFileChooser.APPROVE_OPTION) {
	    		File file = fileChooser.getSelectedFile();
	    		Profiles profileReader = new Profiles();
	    	} else {
	    		fileChooser = null;
	    	}
	    }
	}
}  //  @jve:decl-index=0:visual-constraint="9,15"
