import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseAndTitle {
	
int langInt = 0;
	
int nr = 0;						//gets choice from dropdown menu for SoF Table number

boolean softb1 = false;			//checks which SoF tables are present in the particular review
boolean softb2 = false;
boolean softb3 = false;
boolean softb4 = false;
boolean softb5 = false;
boolean softb6 = false;
boolean softb7 = false;
boolean softb8 = false;
boolean softb9 = false;			//checks which SoF tables are present in the particular review
boolean softb10 = false;
boolean softb11 = false;
boolean softb12 = false;
boolean softb13 = false;
boolean softb14 = false;
boolean softb15 = false;
boolean softb16 = false;
boolean softb17 = false;			//checks which SoF tables are present in the particular review
boolean softb18 = false;
boolean softb19 = false;
boolean softb20 = false;
boolean softb21 = false;
boolean softb22 = false;
boolean softb23 = false;
boolean softb24 = false;

String nameOfT1 = "";		//Sof table names for heading/ infomessage
String nameOfT2 = "";
String nameOfT3 = "";
String nameOfT4 = "";
String nameOfT5 = "";
String nameOfT6 = "";
String nameOfT7 = "";
String nameOfT8 = "";
String nameOfT9 = "";		//Sof table names for heading/ infomessage
String nameOfT10 = "";
String nameOfT11 = "";
String nameOfT12 = "";
String nameOfT13 = "";
String nameOfT14 = "";
String nameOfT15 = "";
String nameOfT16 = "";
String nameOfT17 = "";		//Sof table names for heading/ infomessage
String nameOfT18 = "";
String nameOfT19 = "";
String nameOfT20 = "";
String nameOfT21 = "";
String nameOfT22 = "";
String nameOfT23 = "";
String nameOfT24 = "";
	

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//This method uses JFilechooser to let the user select a .rm5-File. This file is parsed and becomes the document which is returned. (Used in controller Class)   
	
public Document parsing(){

		JFileChooser chooser = new JFileChooser();
		
		int returnCode = chooser.showOpenDialog(null);
		if(returnCode == JFileChooser.CANCEL_OPTION){// things to do when cancel
			return null;
		} 
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		File review = chooser.getSelectedFile().getAbsoluteFile();

		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		

			Document rm5 = null;
			try {
				DocumentBuilder dBuilder = builderFactory.newDocumentBuilder();
				rm5 = dBuilder.parse(review);
				rm5.normalize();
			} catch (ParserConfigurationException e) {
			} catch (SAXException e) {
			} catch (IOException e) {
			}
			return rm5;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//This method takes the document from .parsing() and returns a String[] with the titles of all Summary of Findings tables (used in Controller Class)
	
	public String[] getTitles(Document rm5){
		
		GetBody body = new GetBody(); //object of own GetBody classs
	try{
			// Gets root node
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
			
			// checks how many sof tables are available and gets their names. The boolean "softbX is true when the table with its number is available. "nameOfTX" contains the name of the SoF
			//"soX" first contains the ID the table should have if its avaiable and then checks whether the table has this ID 
			//!!!!!-> potential source of mistakes if ReviewManager decides to change the way they ID the tables!!!!!
			
				try {
					nameOfT1 = body.getTitles(secondList, 0);
				} catch (Exception esof2) {
				}
				//System.out.println(nameOfT1);
				
				try {
					nameOfT2 = body.getTitles(secondList, 1);
				} catch (Exception esof2) {
				}
				//System.out.println(nameOfT2);
				try {
					nameOfT3 = body.getTitles(secondList, 2);
				} catch (Exception esof2) {
				}
				//System.out.println(nameOfT3);
				try {
					nameOfT4 = body.getTitles(secondList, 3);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT5 = body.getTitles(secondList, 4);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT6 = body.getTitles(secondList, 5);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT7 = body.getTitles(secondList, 6);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT8 = body.getTitles(secondList, 7);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT9 = body.getTitles(secondList, 8);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT10 = body.getTitles(secondList, 9);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT11 = body.getTitles(secondList, 10);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT12 = body.getTitles(secondList, 11);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT13 = body.getTitles(secondList, 12);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT14 = body.getTitles(secondList, 13);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT15 = body.getTitles(secondList, 14);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT16 = body.getTitles(secondList, 15);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT17 = body.getTitles(secondList, 16);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT18 = body.getTitles(secondList, 17);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT19 = body.getTitles(secondList, 18);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT20 = body.getTitles(secondList, 19);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT21 = body.getTitles(secondList, 20);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT22 = body.getTitles(secondList, 21);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT23 = body.getTitles(secondList, 22);
				} catch (Exception esof2) {
				}
				
				try {
					nameOfT24 = body.getTitles(secondList, 23);
				} catch (Exception esof2) {
				}
				
		} catch (Exception excep) {
	}
	   return new String[] { nameOfT1, nameOfT2, nameOfT3, nameOfT4, nameOfT5, nameOfT6, nameOfT7, nameOfT8, nameOfT9, nameOfT10,
				 nameOfT11, nameOfT12, nameOfT13, nameOfT14, nameOfT15, nameOfT16, nameOfT17, nameOfT18, nameOfT19, nameOfT20,
				 nameOfT21, nameOfT22, nameOfT23, nameOfT24};
	
	}
	
}
