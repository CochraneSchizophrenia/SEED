
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.w3c.dom.Document;

public class ControllerClass 
{
	private GUIClass ui; 
	private ParseAndTitle prog;
	
	public ControllerClass()
	{
		
		//Creates objects of classes that are used to parse/ extract/ create the table in wiki mark-up
		ui = new GUIClass();
		ui.setVisible(true);
		prog = new ParseAndTitle();
		
		ui.btnOpenFile.addActionListener(new ActionListener() 
				
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
			
				Document rm5 = prog.parsing(); //parse
				String[] ttlArray = prog.getTitles(rm5); //extract
				ui.tblSelect(ttlArray); //choice of user which tables they want
				ui.btnOk.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						ui.finalMethod(ttlArray, rm5); //creation of new tables
					}
							
				});
				ui.panelStart.setVisible(false);
				ui.panelTblSelection.setVisible(true);
				
				
			}
			});
		
		
		
		//
		
		
	}
	
	public static void main(String[] args) 
	{
		new ControllerClass();	
		
	}
	
	
}


