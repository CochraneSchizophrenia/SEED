import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.awt.CardLayout;
import java.awt.Desktop;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.JComboBox;

public class GUIClass extends JFrame {

	ParseAndTitle ttl = new ParseAndTitle();
	
	public JPanel panelStart;
	public JPanel panelTblSelection;
	public JPanel newpanel;
	
	public JPanel contentPane;
	public JTextField textTbl1;
	public JTextField textTbl2;
	public JTextField textTbl3;
	public JTextField textTbl4;
	public JTextField textTbl5;
	public JTextField textTbl6;
	public JTextField textTbl7;
	public JTextField textTbl8;
	public JTextField textTbl9;
	public JTextField textTbl13;
	public JTextField textTbl14;
	public JTextField textTbl15;
	public JTextField textTbl16;
	public JTextField textTbl17;
	public JTextField textTbl18;
	public JTextField textTbl19;
	public JTextField textTbl20;
	public JTextField textTbl21;
	public JTextField textTbl22;
	public JTextField textTbl23;
	public JTextField textTbl24;
	public JTextField textTbl11;
	public JTextField textTbl10;
	public JTextField textTbl12;
	
	public JCheckBox chckbxTbl1;
	public JCheckBox chckbxTbl2;
	public JCheckBox chckbxTbl3;
	public JCheckBox chckbxTbl4;
	public JCheckBox chckbxTbl5;
	public JCheckBox chckbxTbl6;
	public JCheckBox chckbxTbl7;
	public JCheckBox chckbxTbl8;
	public JCheckBox chckbxTbl9;
	public JCheckBox chckbxTbl10;
	public JCheckBox chckbxTbl11;
	public JCheckBox chckbxTbl12;
	public JCheckBox chckbxTbl13;
	public JCheckBox chckbxTbl14;
	public JCheckBox chckbxTbl15;
	public JCheckBox chckbxTbl16;
	public JCheckBox chckbxTbl17;
	public JCheckBox chckbxTbl18;
	public JCheckBox chckbxTbl19;
	public JCheckBox chckbxTbl20;
	public JCheckBox chckbxTbl21;
	public JCheckBox chckbxTbl22;
	public JCheckBox chckbxTbl23;
	public JCheckBox chckbxTbl24;
	
	public JMenuBar menuBar;
	
	public JMenuItem mntmClose;
	public JMenuItem mntmHowItWorks;
	public JMenuItem mntmCochrane;
	public JMenuItem mntmCochraneSchozophreniagroup;
	public JMenuItem mntmPrgoramDeveloper;
	public JMenuItem mntmContacts;
	
	
	public JMenu mnFile;
	public JMenu mnNewMenu;
	public JMenu mnHelp;
	
	public JButton btnWikiButton;
	public JButton btnSQuit;
	public JButton btnOpenFile;
	public JButton btnClose;
	public JButton btnBack;
	public JButton btnOk;
	
	public JLabel lblLanguage;
	public JLabel labelWikiBild;
	public JLabel lblWelcomeToSeed;
	public JLabel lblOpenFile;
	public JLabel lblSelection;
	
	
	

	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				//try {
				//	Versuch1 frame = new Versuch1();
				//	frame.setVisible(true);
				//} catch (Exception e) {
				//	e.printStackTrace();
				//}
			//}
		//});
	//}

	/**
	 * Create the frame.
	 */
	public GUIClass() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUIClass.class.getResource("/Pictures/Wikilogokom.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmClose = new JMenuItem("Close");
		mntmClose.setIcon(new ImageIcon(GUIClass.class.getResource("/Pictures/button16.png")));
		
		mntmClose.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int ret = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? ");
				if(ret == JOptionPane.YES_OPTION)
						System.exit(0);		
			}
		});
		mnFile.add(mntmClose);
		
		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		mntmHowItWorks = new JMenuItem("How it works");
		mntmHowItWorks.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				
				JOptionPane.showMessageDialog(getContentPane(), "Using SEED is very simple."
						+ " \n Choose your specific Review Manager file and upload it with the 'Open Review' Button."
						+ " \n In the next step, SEED will show you an overview of all Summary of Findings tables in this review and it will tell you which table was selected for conversion."
						+ " \n Click OK and a message pops up telling you that the table has been saved to your clipboard."
						+ " \n In some cases there will be a warning message for possibly incorrect conversions."
						+ " \n In case you want another table of the same review to be converted select the number of the table you wish before re-uploading the file with the Open-Button. \n To display the table correctly insert code into Wikipedias source editor. "
						+ " \n  If you want to open Wikipedia click 'Go to Wikipedia-Login' button. ");
			}
		});
		mnHelp.add(mntmHowItWorks);
		
		
		mnNewMenu = new JMenu("About");
		menuBar.add(mnNewMenu);
		
		mntmCochrane = new JMenuItem("Cochrane");
		mntmCochrane.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Desktop desktop = Desktop.getDesktop();
				URL Cochrane = null;
				try {
					Cochrane = new URL("http://cochrane.org");
				} catch (MalformedURLException e1) {
					// TODO: handle exception
					
				}
				try {
					desktop.browse(Cochrane.toURI());
				} catch (IOException e1) {
				
				} catch (URISyntaxException e1) {
			}
			}
		});
		mnNewMenu.add(mntmCochrane);
		
		mntmCochraneSchozophreniagroup = new JMenuItem("Cochrane Schizophrenia Group");
		mntmCochraneSchozophreniagroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Desktop desktop = Desktop.getDesktop();
				URL Cochrane = null;
				try {
					Cochrane = new URL("http://schizophrenia.cochrane.org");
				} catch (MalformedURLException e1) {
				}
				try {
					desktop.browse(Cochrane.toURI());
				} catch (IOException e1) {
				} catch (URISyntaxException e1) {
				}
			}
		});
		mnNewMenu.add(mntmCochraneSchozophreniagroup);
		
		mntmPrgoramDeveloper = new JMenuItem("Program Developer");
		mntmPrgoramDeveloper.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(getContentPane(), " Johannes Friedel \n Lena Schmidt \n Prof. Clive Adams");
			}
		}
		);
		mnNewMenu.add(mntmPrgoramDeveloper);
		
		mntmContacts = new JMenuItem("Contacts");
		mnNewMenu.add(mntmContacts);
		mntmContacts.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Cochrane Schizophrenia Group, \n E-Mail: cszg@nottingham.ac.uk \n Phone: 0044 1158231287  ", "Contacts", JOptionPane.INFORMATION_MESSAGE );
			}
		});
		
			
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////For adding code to the start window please add code below		
		
		panelStart = new JPanel();
		contentPane.add(panelStart, "name_18015059997281");
		panelStart.setLayout(null);
		panelStart.setVisible(true);
		
		btnWikiButton = new JButton("Go to Wikipedia-Login");
		btnWikiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Desktop desktop = Desktop.getDesktop();
				URL Cochrane = null;
				try {
					Cochrane = new URL("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page");
				} catch (MalformedURLException e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
				try {
					desktop.browse(Cochrane.toURI());
				} catch (IOException e1) {
					// TODO: handle exception
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
			}
		});
		panelStart.add(btnWikiButton);
		btnWikiButton.setBounds(10, 417, 151, 23);
		
		btnSQuit = new JButton("Quit");
		btnSQuit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
						int ret = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? ");
						if(ret == JOptionPane.YES_OPTION)
						System.exit(0);			
			}
		});
		btnSQuit.setBounds(575, 417, 89, 23);
		panelStart.add(btnSQuit);
		
		btnOpenFile = new JButton("Open File. . . ");
		btnOpenFile.setIcon(new ImageIcon(GUIClass.class.getResource("/Pictures/openfile.png")));
		btnOpenFile.setBounds(10, 280, 151, 41);
		panelStart.add(btnOpenFile);
		
		labelWikiBild = new JLabel("");
		labelWikiBild.setIcon(new ImageIcon(GUIClass.class.getResource("/Pictures/Wikilogokom.png")));
		labelWikiBild.setBounds(464, 11, 200, 183);
		panelStart.add(labelWikiBild);
		
		lblWelcomeToSeed = new JLabel("Welcome To SEED: Systematic EvidEnce Disseminator ");
		lblWelcomeToSeed.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWelcomeToSeed.setBounds(10, 22, 444, 41);
		panelStart.add(lblWelcomeToSeed);
		
		lblOpenFile = new JLabel("Please select a RevMan file");
		lblOpenFile.setBounds(10, 255, 340, 14);
		panelStart.add(lblOpenFile);
		
		
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// for adding information to the Selection window use the space below
		
		
		
		
		
		panelTblSelection = new JPanel();
		contentPane.add(panelTblSelection, "name_3564923041301");
		panelTblSelection.setLayout(null);
		panelTblSelection.setVisible(false);
		
		
		
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//This method gets the SOF-Tables titles as an Array. If the title is filled a checkbox and the title of the table appear in the GUI. (Method used in Controller Class) 
	public void tblSelect(String[] ttlArray) {
		lblSelection = new JLabel("Please select the tables you want to use for Wikipedia ");
		lblSelection.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSelection.setBounds(10, 25, 331, 14);
		panelTblSelection.add(lblSelection);
		
		String nameOfT1 = ttlArray[0];
		String nameOfT2 = ttlArray[1];
		String nameOfT3 = ttlArray[2];
		String nameOfT4 = ttlArray[3];
		String nameOfT5 = ttlArray[4];
		String nameOfT6 = ttlArray[5];
		String nameOfT7 = ttlArray[6];
		String nameOfT8 = ttlArray[7];
		String nameOfT9 = ttlArray[8];
		String nameOfT10 = ttlArray[9];
		String nameOfT11= ttlArray[10];
		String nameOfT12 = ttlArray[11];
		String nameOfT13 = ttlArray[12];
		String nameOfT14 = ttlArray[13];
		String nameOfT15 = ttlArray[14];
		String nameOfT16 = ttlArray[15];
		String nameOfT17 = ttlArray[16];
		String nameOfT18 = ttlArray[17];
		String nameOfT19 = ttlArray[18];
		String nameOfT20 = ttlArray[19];
		String nameOfT21 = ttlArray[20];
		String nameOfT22 = ttlArray[21];
		String nameOfT23 = ttlArray[22];
		String nameOfT24 = ttlArray[23];
		
		//following are all the CheckBoxes which includes the code that does: 
		//If the String of the title of a SoF is empty,
		//don't show the checkbox
		chckbxTbl1 = new JCheckBox("Table 1");
		chckbxTbl1.setBounds(0, 46, 68, 23);
		panelTblSelection.add(chckbxTbl1);
		
		if(nameOfT1 == null || nameOfT1.equals("")){
			chckbxTbl1.setVisible(false);
			}
		else if (nameOfT1 != null || !nameOfT1.equalsIgnoreCase("")) {
			chckbxTbl1.setVisible(true);
		}
		
		chckbxTbl2 = new JCheckBox("Table 2");
		chckbxTbl2.setBounds(0, 72, 68, 23);
		panelTblSelection.add(chckbxTbl2);
		if(nameOfT2 == null || nameOfT2.equals("")){
			chckbxTbl2.setVisible(false);
			}
		else if (nameOfT2 != null || !nameOfT2.equalsIgnoreCase("")) {
			chckbxTbl2.setVisible(true);
			}
		
		chckbxTbl3 = new JCheckBox("Table 3");
		chckbxTbl3.setBounds(0, 98, 68, 23);
		panelTblSelection.add(chckbxTbl3);
		if(nameOfT3 == null || nameOfT3.equals("")){
			chckbxTbl3.setVisible(false);
			}
		
		chckbxTbl4 = new JCheckBox("Table 4");
		chckbxTbl4.setBounds(0, 124, 68, 23);
		panelTblSelection.add(chckbxTbl4);
		if(nameOfT4 == null || nameOfT4.equals("")){
			chckbxTbl4.setVisible(false);
			}
		
		chckbxTbl5 = new JCheckBox("Table 5");
		chckbxTbl5.setBounds(0, 150, 68, 23);
		panelTblSelection.add(chckbxTbl5);
		if(nameOfT5 == null || nameOfT5.equals("")){
			chckbxTbl5.setVisible(false);
			}
		
		chckbxTbl6 = new JCheckBox("Table 6");
		chckbxTbl6.setBounds(0, 176, 68, 23);
		panelTblSelection.add(chckbxTbl6);
		if(nameOfT6 == null || nameOfT6.equals("")){
			chckbxTbl6.setVisible(false);
			}
		
		chckbxTbl7 = new JCheckBox("Table 7");
		chckbxTbl7.setBounds(0, 202, 68, 23);
		panelTblSelection.add(chckbxTbl7);
		if(nameOfT7 == null || nameOfT7.equals("")){
			chckbxTbl7.setVisible(false);
			}
		
		chckbxTbl8 = new JCheckBox("Table 8");
		chckbxTbl8.setBounds(0, 228, 68, 23);
		panelTblSelection.add(chckbxTbl8);
		if(nameOfT8 == null || nameOfT8.equals("")){
			chckbxTbl8.setVisible(false);
			}
		
		chckbxTbl9 = new JCheckBox("Table 9");
		chckbxTbl9.setBounds(0, 254, 68, 23);
		panelTblSelection.add(chckbxTbl9);
		if(nameOfT9 == null || nameOfT9.equals("")){
			chckbxTbl9.setVisible(false);
			}		
		
		chckbxTbl10 = new JCheckBox("Table 10");
		chckbxTbl10.setBounds(0, 280, 74, 23);
		panelTblSelection.add(chckbxTbl10);
		if(nameOfT10 == null || nameOfT10.equals("")){
			chckbxTbl10.setVisible(false);
			}
		
		chckbxTbl11 = new JCheckBox("Table 11");
		chckbxTbl11.setBounds(0, 306, 77, 23);
		panelTblSelection.add(chckbxTbl11);
		if(nameOfT11 == null || nameOfT11.equals("")){
			chckbxTbl11.setVisible(false);
			}
		
		chckbxTbl12 = new JCheckBox("Table 12");
		chckbxTbl12.setBounds(0, 332, 77, 23);
		panelTblSelection.add(chckbxTbl12);
		if(nameOfT12 == null || nameOfT12.equals("")){
			chckbxTbl12.setVisible(false);
			}
		
		chckbxTbl13 = new JCheckBox("Table 13");
		chckbxTbl13.setBounds(264, 46, 77, 23);
		panelTblSelection.add(chckbxTbl13);
		if(nameOfT13 == null || nameOfT13.equals("")){
			chckbxTbl13.setVisible(false);
			}
		
		chckbxTbl14 = new JCheckBox("Table 14");
		chckbxTbl14.setBounds(264, 72, 77, 23);
		panelTblSelection.add(chckbxTbl14);
		if(nameOfT14 == null || nameOfT14.equals("")){
			chckbxTbl14.setVisible(false);
			}
		
		chckbxTbl15 = new JCheckBox("Table 15");
		chckbxTbl15.setBounds(264, 98, 77, 23);
		panelTblSelection.add(chckbxTbl15);
		if(nameOfT15 == null || nameOfT15.equals("")){
			chckbxTbl15.setVisible(false);
			}
		
		chckbxTbl16 = new JCheckBox("Table 16");
		chckbxTbl16.setBounds(264, 124, 77, 23);
		panelTblSelection.add(chckbxTbl16);
		if(nameOfT16 == null || nameOfT16.equals("")){
			chckbxTbl16.setVisible(false);
			}
		
		chckbxTbl17 = new JCheckBox("Table 17");
		chckbxTbl17.setBounds(264, 150, 77, 23);
		panelTblSelection.add(chckbxTbl17);
		if(nameOfT17 == null || nameOfT17.equals("")){
			chckbxTbl17.setVisible(false);
			}
		
		chckbxTbl18 = new JCheckBox("Table 18");
		chckbxTbl18.setBounds(264, 176, 77, 23);
		panelTblSelection.add(chckbxTbl18);
		if(nameOfT18 == null || nameOfT18.equals("")){
			chckbxTbl18.setVisible(false);
			}
		
		chckbxTbl19 = new JCheckBox("Table 19");
		chckbxTbl19.setBounds(264, 202, 77, 23);
		panelTblSelection.add(chckbxTbl19);
		if(nameOfT19 == null || nameOfT19.equals("")){
			chckbxTbl19.setVisible(false);
			}
		
		chckbxTbl20 = new JCheckBox("Table 20");
		chckbxTbl20.setBounds(264, 228, 77, 23);
		panelTblSelection.add(chckbxTbl20);
		if(nameOfT20 == null || nameOfT20.equals("")){
			chckbxTbl20.setVisible(false);
			}
		
		chckbxTbl21 = new JCheckBox("Table 21");
		chckbxTbl21.setBounds(264, 254, 77, 23);
		panelTblSelection.add(chckbxTbl21);
		if(nameOfT21 == null || nameOfT21.equals("")){
			chckbxTbl21.setVisible(false);
			}
		
		chckbxTbl22 = new JCheckBox("Table 22");
		chckbxTbl22.setBounds(264, 280, 77, 23);
		panelTblSelection.add(chckbxTbl22);
		if(nameOfT22 == null || nameOfT22.equals("")){
			chckbxTbl22.setVisible(false);
			}
		
		chckbxTbl23 = new JCheckBox("Table 23");
		chckbxTbl23.setBounds(264, 306, 77, 23);
		panelTblSelection.add(chckbxTbl23);
		if(nameOfT23 == null || nameOfT23.equals("")){
			chckbxTbl23.setVisible(false);
			}
		
		chckbxTbl24 = new JCheckBox("Table 24");
		chckbxTbl24.setBounds(264, 332, 77, 23);
		panelTblSelection.add(chckbxTbl24);
		if(nameOfT24 == null || nameOfT24.equals("")){
			chckbxTbl24.setVisible(false);
			}
		
		
		
		btnOk = new JButton("Finish");
		
		btnOk.setBounds(482, 417, 89, 23);
		panelTblSelection.add(btnOk);
		
		
		//following are all the Textfields: If the String of the title of a SoF is empty,
		//don't show the Textfield
		textTbl1 = new JTextField();
		textTbl1.setBounds(80, 47, 178, 20);
		panelTblSelection.add(textTbl1);
		textTbl1.setColumns(10);
		if(nameOfT1 == null || nameOfT1.equals(""))
			{
			textTbl1.setVisible(false);
			}
		else if (nameOfT1 != null || !nameOfT1.equalsIgnoreCase("")) {
			textTbl1.setVisible(true);
			textTbl1.setText(nameOfT1);
			textTbl1.setCaretPosition(0);
		}
		
		textTbl2 = new JTextField();
		textTbl2.setBounds(80, 73, 178, 20);
		panelTblSelection.add(textTbl2);
		textTbl2.setColumns(10);
		if(nameOfT2 == null || nameOfT2.equals(""))
		{
		textTbl2.setVisible(false);
		}
		else if (nameOfT2 != null || !nameOfT2.equalsIgnoreCase("")) {
			textTbl2.setVisible(true);
			textTbl2.setText(nameOfT2);
			textTbl2.setCaretPosition(0);
		}
		
		textTbl3 = new JTextField();
		textTbl3.setBounds(80, 99, 178, 20);
		panelTblSelection.add(textTbl3);
		textTbl3.setColumns(10);
		if(nameOfT3 == null || nameOfT3.equals(""))
		{
		textTbl3.setVisible(false);
		}
		else if (nameOfT3 != null || !nameOfT3.equalsIgnoreCase("")) {
			textTbl3.setVisible(true);
			textTbl3.setText(nameOfT3);
			textTbl3.setCaretPosition(0);
		}
		
		textTbl4 = new JTextField();
		textTbl4.setBounds(80, 125, 178, 20);
		panelTblSelection.add(textTbl4);
		textTbl4.setColumns(10);
		if(nameOfT4 == null || nameOfT4.equals(""))
		{
		textTbl4.setVisible(false);
		}
		else if (nameOfT4 != null || !nameOfT4.equalsIgnoreCase("")) {
			textTbl4.setVisible(true);
			textTbl4.setText(nameOfT4);
			textTbl4.setCaretPosition(0);
		}
		
		textTbl5 = new JTextField();
		textTbl5.setBounds(80, 151, 178, 20);
		panelTblSelection.add(textTbl5);
		textTbl5.setColumns(10);
		if(nameOfT5 == null || nameOfT5.equals(""))
		{
		textTbl5.setVisible(false);
		}
		else if (nameOfT5 != null || !nameOfT5.equalsIgnoreCase("")) {
			textTbl5.setVisible(true);
			textTbl5.setText(nameOfT5);
			textTbl5.setCaretPosition(0);
		}
		
		textTbl6 = new JTextField();
		textTbl6.setBounds(80, 177, 178, 20);
		panelTblSelection.add(textTbl6);
		textTbl6.setColumns(10);
		if(nameOfT6 == null || nameOfT6.equals(""))
		{
		textTbl6.setVisible(false);
		}
		else if (nameOfT6 != null || !nameOfT6.equalsIgnoreCase("")) {
			textTbl6.setVisible(true);
			textTbl6.setText(nameOfT6);
			textTbl6.setCaretPosition(0);
		}
		
		textTbl7 = new JTextField();
		textTbl7.setBounds(80, 203, 178, 20);
		panelTblSelection.add(textTbl7);
		textTbl7.setColumns(10);
		if(nameOfT7 == null || nameOfT7.equals(""))
		{
		textTbl7.setVisible(false);
		}
		else if (nameOfT7 != null || !nameOfT7.equalsIgnoreCase("")) {
			textTbl7.setVisible(true);
			textTbl7.setText(nameOfT7);
			textTbl7.setCaretPosition(0);
		}
		
		textTbl8 = new JTextField();
		textTbl8.setBounds(80, 229, 178, 20);
		panelTblSelection.add(textTbl8);
		textTbl8.setColumns(10);
		if(nameOfT8 == null || nameOfT8.equals(""))
		{
		textTbl8.setVisible(false);
		}
		else if (nameOfT8 != null || !nameOfT8.equalsIgnoreCase("")) {
			textTbl8.setVisible(true);
			textTbl8.setText(nameOfT8);
			textTbl8.setCaretPosition(0);
		}
		
		textTbl9 = new JTextField();
		textTbl9.setBounds(80, 255, 178, 20);
		panelTblSelection.add(textTbl9);
		textTbl9.setColumns(10);
		if(nameOfT9 == null || nameOfT9.equals(""))
		{
		textTbl9.setVisible(false);
		}
		else if (nameOfT9 != null || !nameOfT9.equalsIgnoreCase("")) {
			textTbl9.setVisible(true);
			textTbl9.setText(nameOfT9);
			textTbl9.setCaretPosition(0);
		}
		
		textTbl10 = new JTextField();
		textTbl10.setBounds(80, 281, 178, 20);
		panelTblSelection.add(textTbl10);
		textTbl10.setColumns(10);
		if(nameOfT10 == null || nameOfT10.equals(""))
		{
		textTbl10.setVisible(false);
		}
		else if (nameOfT10 != null || !nameOfT10.equalsIgnoreCase("")) {
			textTbl10.setVisible(true);
			textTbl10.setText(nameOfT10);
			textTbl10.setCaretPosition(0);
		}
		
		textTbl11 = new JTextField();
		textTbl11.setBounds(80, 307, 178, 20);
		panelTblSelection.add(textTbl11);
		textTbl11.setColumns(10);
		if(nameOfT11 == null || nameOfT11.equals(""))
		{
		textTbl11.setVisible(false);
		}
		else if (nameOfT11 != null || !nameOfT11.equalsIgnoreCase("")) {
			textTbl11.setVisible(true);
			textTbl11.setText(nameOfT11);
			textTbl11.setCaretPosition(0);
		}
		
		textTbl12 = new JTextField();
		textTbl12.setBounds(80, 333, 178, 20);
		panelTblSelection.add(textTbl12);
		textTbl12.setColumns(10);
		if(nameOfT12 == null || nameOfT12.equals(""))
		{
		textTbl12.setVisible(false);
		}
		else if (nameOfT12 != null || !nameOfT12.equalsIgnoreCase("")) {
			textTbl12.setVisible(true);
			textTbl12.setText(nameOfT12);
			textTbl12.setCaretPosition(0);
		}
		
		textTbl13 = new JTextField();
		textTbl13.setBounds(345, 47, 178, 20);
		panelTblSelection.add(textTbl13);
		textTbl13.setColumns(10);
		if(nameOfT13 == null || nameOfT13.equals(""))
		{
		textTbl13.setVisible(false);
		}
		else if (nameOfT13 != null || !nameOfT13.equalsIgnoreCase("")) {
			textTbl13.setVisible(true);
			textTbl13.setText(nameOfT13);
			textTbl13.setCaretPosition(0);
		}
		
		textTbl14 = new JTextField();
		textTbl14.setBounds(345, 73, 178, 20);
		panelTblSelection.add(textTbl14);
		textTbl14.setColumns(10);
		if(nameOfT14 == null || nameOfT14.equals(""))
		{
		textTbl14.setVisible(false);
		}
		else if (nameOfT14 != null || !nameOfT14.equalsIgnoreCase("")) {
			textTbl14.setVisible(true);
			textTbl14.setText(nameOfT14);
			textTbl14.setCaretPosition(0);
		}
		
		textTbl15 = new JTextField();
		textTbl15.setBounds(345, 99, 178, 20);
		panelTblSelection.add(textTbl15);
		textTbl15.setColumns(10);
		if(nameOfT15 == null || nameOfT15.equals(""))
		{
		textTbl15.setVisible(false);
		}
		else if (nameOfT15 != null || !nameOfT15.equalsIgnoreCase("")) {
			textTbl15.setVisible(true);
			textTbl15.setText(nameOfT15);
			textTbl15.setCaretPosition(0);
		}
		
		textTbl16 = new JTextField();
		textTbl16.setBounds(345, 125, 178, 20);
		panelTblSelection.add(textTbl16);
		textTbl16.setColumns(10);
		if(nameOfT16 == null || nameOfT16.equals(""))
		{
		textTbl16.setVisible(false);
		}
		else if (nameOfT16 != null || !nameOfT16.equalsIgnoreCase("")) {
			textTbl16.setVisible(true);
			textTbl16.setText(nameOfT16);
			textTbl16.setCaretPosition(0);
		}
		
		textTbl17 = new JTextField();
		textTbl17.setBounds(345, 151, 178, 20);
		panelTblSelection.add(textTbl17);
		textTbl17.setColumns(10);
		if(nameOfT17 == null || nameOfT17.equals(""))
		{
		textTbl17.setVisible(false);
		}
		else if (nameOfT17 != null || !nameOfT17.equalsIgnoreCase("")) {
			textTbl17.setVisible(true);
			textTbl17.setText(nameOfT17);
			textTbl17.setCaretPosition(0);
		}
		
		textTbl18 = new JTextField();
		textTbl18.setBounds(345, 177, 178, 20);
		panelTblSelection.add(textTbl18);
		textTbl18.setColumns(10);
		if(nameOfT18 == null || nameOfT18.equals(""))
		{
		textTbl18.setVisible(false);
		}
		else if (nameOfT18 != null || !nameOfT18.equalsIgnoreCase("")) {
			textTbl18.setVisible(true);
			textTbl18.setText(nameOfT18);
			textTbl18.setCaretPosition(19);
		}
		
		textTbl19 = new JTextField();
		textTbl19.setBounds(345, 203, 178, 20);
		panelTblSelection.add(textTbl19);
		textTbl19.setColumns(10);
		if(nameOfT19 == null || nameOfT19.equals(""))
		{
		textTbl19.setVisible(false);
		}
		else if (nameOfT19 != null || !nameOfT19.equalsIgnoreCase("")) {
			textTbl19.setVisible(true);
			textTbl19.setText(nameOfT19);
			textTbl19.setCaretPosition(0);
		}
		
		textTbl20 = new JTextField();
		textTbl20.setBounds(345, 229, 178, 20);
		panelTblSelection.add(textTbl20);
		textTbl20.setColumns(10);
		if(nameOfT20 == null || nameOfT20.equals(""))
		{
		textTbl20.setVisible(false);
		}
		else if (nameOfT20 != null || !nameOfT20.equalsIgnoreCase("")) {
			textTbl20.setVisible(true);
			textTbl20.setText(nameOfT20);
			textTbl20.setCaretPosition(0);
		}
		
		textTbl21 = new JTextField();
		textTbl21.setBounds(345, 255, 178, 20);
		panelTblSelection.add(textTbl21);
		textTbl21.setColumns(10);
		if(nameOfT21 == null || nameOfT21.equals(""))
		{
		textTbl21.setVisible(false);
		}
		else if (nameOfT21 != null || !nameOfT21.equalsIgnoreCase("")) {
			textTbl21.setVisible(true);
			textTbl21.setText(nameOfT21);
			textTbl21.setCaretPosition(0);
		}
		
		textTbl22 = new JTextField();
		textTbl22.setBounds(345, 281, 178, 20);
		panelTblSelection.add(textTbl22);
		textTbl22.setColumns(10);
		if(nameOfT22 == null || nameOfT22.equals(""))
		{
		textTbl22.setVisible(false);
		}
		else if (nameOfT22 != null || !nameOfT22.equalsIgnoreCase("")) {
			textTbl22.setVisible(true);
			textTbl22.setText(nameOfT22);
			textTbl22.setCaretPosition(0);
		}
		
		textTbl23 = new JTextField();
		textTbl23.setBounds(345, 307, 178, 20);
		panelTblSelection.add(textTbl23);
		textTbl23.setColumns(10);
		if(nameOfT23 == null || nameOfT23.equals(""))
		{
		textTbl23.setVisible(false);
		}
		else if (nameOfT23 != null || !nameOfT23.equalsIgnoreCase("")) {
			textTbl23.setVisible(true);
			textTbl23.setText(nameOfT23);
			textTbl23.setCaretPosition(0);
		}
		
		textTbl24 = new JTextField();
		textTbl24.setBounds(345, 333, 178, 20);
		panelTblSelection.add(textTbl24);
		textTbl24.setColumns(10);
		if(nameOfT24 == null || nameOfT24.equals(""))
		{
			textTbl24.setVisible(false);
		}
		else if (nameOfT24 != null || !nameOfT24.equalsIgnoreCase("")) {
			textTbl24.setVisible(true);
			textTbl24.setText(nameOfT24);
			textTbl24.setCaretPosition(0);
		}
		
		btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ret = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? ");
				if(ret == JOptionPane.YES_OPTION)
				System.exit(0);
			}
		});
		btnClose.setBounds(575, 417, 89, 23);
		panelTblSelection.add(btnClose);
		
		btnBack = new JButton("Back ");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				new ControllerClass();
				dispose();
				
			}
		});
		btnBack.setBounds(0, 417, 89, 23);
		panelTblSelection.add(btnBack);

	}
public boolean newController() {
	boolean controlBoolean = true;	
	return controlBoolean;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Taking in the title[] and the document again this method creates the wikitables that were selected by the user (method called in Controller Class)
	
	public void finalMethod(String[] ttlArray, Document rm5) {
		
		
		ParseAndTitle prg = new ParseAndTitle(); // to get an Integer from the Program Class
		ContentClass content = new ContentClass(); //Object of ContentClass that uses methods to create the SOF from the given data
		StringWriter out = new StringWriter(); //to get the table String
		PrintWriter writer = new PrintWriter(out); //to write the table String
		String nameOfT1 = ttlArray[0]; //Title names used for citations and content of the String which is created as an output
		String nameOfT2 = ttlArray[1];
		String nameOfT3 = ttlArray[2];
		String nameOfT4 = ttlArray[3];
		String nameOfT5 = ttlArray[4];
		String nameOfT6 = ttlArray[5];
		String nameOfT7 = ttlArray[6];
		String nameOfT8 = ttlArray[7];
		String nameOfT9 = ttlArray[8];
		String nameOfT10 = ttlArray[9];
		String nameOfT11= ttlArray[10];
		String nameOfT12 = ttlArray[11];
		String nameOfT13 = ttlArray[12];
		String nameOfT14 = ttlArray[13];
		String nameOfT15 = ttlArray[14];
		String nameOfT16 = ttlArray[15];
		String nameOfT17 = ttlArray[16];
		String nameOfT18 = ttlArray[17];
		String nameOfT19 = ttlArray[18];
		String nameOfT20 = ttlArray[19];
		String nameOfT21 = ttlArray[20];
		String nameOfT22 = ttlArray[21];
		String nameOfT23 = ttlArray[22];
		String nameOfT24 = ttlArray[23];
		
		// Gets root node of parsed XML document
		NodeList rootNodes = rm5.getElementsByTagName("COCHRANE_REVIEW");
		Node rootNode = rootNodes.item(0);
				
		//Gets rootElement! 
		Element rootElement = (Element) rootNode;
		
		//Makes nodelist of elements with tagname "SOF_TABLE" that are contained in the rootElement and continues 
		//this game step by step to dive deeper into XML structure.
		NodeList firstList = rootElement.getElementsByTagName("SOF_TABLES");
		Node sofs = firstList.item(0);
		Element allSofElement = (Element) sofs;
		
		
		
		NodeList secondList = allSofElement.getElementsByTagName("SOF_TABLE");
			
boolean box1 = false;	
boolean box2 = false;
boolean box3 = false;
//calls the contentClass to write the selected table
if(chckbxTbl1.isSelected()){
		
		String t1 = content.getTable(secondList, rootElement, 0, prg.langInt, nameOfT1);
		writer.println(t1);
		box1 = true;
		
}
if(chckbxTbl2.isSelected()){
		String t2 = content.getTable(secondList, rootElement, 1, prg.langInt, nameOfT2);
		writer.println(t2);
		box2 = true;
		}
if(chckbxTbl3.isSelected()){
		String t3 = content.getTable(secondList, rootElement, 2, prg.langInt, nameOfT3);
		writer.println(t3);
		box3 = true;
}	
if(chckbxTbl4.isSelected()){
		String t4 = content.getTable(secondList, rootElement, 3, prg.langInt, nameOfT4);
		writer.println(t4);
}	
if(chckbxTbl5.isSelected()){
		String t5 = content.getTable(secondList, rootElement, 4, prg.langInt, nameOfT5);
		writer.println(t5);
}	
if(chckbxTbl6.isSelected()){
		String t6 = content.getTable(secondList, rootElement, 5, prg.langInt, nameOfT6);
		writer.println(t6);
}	
if(chckbxTbl7.isSelected()){
		String t7 = content.getTable(secondList, rootElement, 6, prg.langInt, nameOfT7);
		writer.println(t7);
}
if(chckbxTbl8.isSelected()){
		String t8 = content.getTable(secondList, rootElement, 7, prg.langInt, nameOfT8);
		writer.println(t8);
}
if(chckbxTbl9.isSelected()){
		String t9 = content.getTable(secondList, rootElement, 8 ,prg.langInt, nameOfT9);
		writer.println(t9);
}
if(chckbxTbl10.isSelected()){
		String t10 = content.getTable(secondList, rootElement, 9, prg.langInt, nameOfT10);
		writer.println(t10);
}
if(chckbxTbl11.isSelected()){
		String t11 = content.getTable(secondList, rootElement, 10, prg.langInt, nameOfT11);
		writer.println(t11);
}
if(chckbxTbl12.isSelected()){
		String t12 = content.getTable(secondList, rootElement, 11, prg.langInt, nameOfT12);
		writer.println(t12);
}
if(chckbxTbl13.isSelected()){
		String t13 = content.getTable(secondList, rootElement, 12, prg.langInt, nameOfT13);
		writer.println(t13);
}
if(chckbxTbl14.isSelected()){
		String t14 = content.getTable(secondList, rootElement, 13, prg.langInt, nameOfT14);
		writer.println(t14);
}
if(chckbxTbl15.isSelected()){
		String t15 = content.getTable(secondList, rootElement, 14, prg.langInt, nameOfT15);
		writer.println(t15);
}
if(chckbxTbl16.isSelected()){
		String t16 = content.getTable(secondList, rootElement, 15, prg.langInt, nameOfT16);
		writer.println(t16);
}
if(chckbxTbl17.isSelected()){
		String t17 = content.getTable(secondList, rootElement, 16, prg.langInt, nameOfT17);
		writer.println(t17);
}
if(chckbxTbl18.isSelected()){
		String t18 = content.getTable(secondList, rootElement, 17, prg.langInt, nameOfT18);
		writer.println(t18);
}
if(chckbxTbl19.isSelected()){
		String t19 = content.getTable(secondList, rootElement, 18, prg.langInt, nameOfT19);
		writer.println(t19);
}
if(chckbxTbl20.isSelected()){
		String t20 = content.getTable(secondList, rootElement, 19, prg.langInt, nameOfT20);
		writer.println(t20);
}
if(chckbxTbl21.isSelected()){
		String t21 = content.getTable(secondList, rootElement, 20, prg.langInt, nameOfT21);
		writer.println(t21);
}
if(chckbxTbl22.isSelected()){
		String t22 = content.getTable(secondList, rootElement, 21, prg.langInt, nameOfT22);
		writer.println(t22);
}
if(chckbxTbl23.isSelected()){
		String t23 = content.getTable(secondList, rootElement, 22, prg.langInt, nameOfT23);
		writer.println(t23);
}
if(chckbxTbl24.isSelected()){
		String t24 = content.getTable(secondList, rootElement, 23, prg.langInt, nameOfT24);
		writer.println(t24);
}
if (box1 == false && box2 == false && box3 == false){
	JOptionPane.showMessageDialog(null, "You did not choose any tables");
}

writer.flush(); 
String result = out.toString();
//writes the resulting string(s) to clipboard

StringSelection selection = new StringSelection(result);
Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
clipboard.setContents(selection, selection);
JOptionPane.showMessageDialog(null, "You copied the choosen tables");
	
	}
}