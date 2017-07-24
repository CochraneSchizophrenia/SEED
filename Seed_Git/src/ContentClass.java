import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ContentClass {
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Biggest method of SEED, it calls the methods from GetLang, CalcWords etc to get all Strings used in the Wikitable to create normal and auto-generated content and to 
	//finally arrange them in wiki-markup to be put into a single resulting String. This method is called from within the GUIClass
	
	public String getTable(NodeList secondList, Element rootElement,  int nr, int langInt, String tblName) {
try {
		String a1 = "";			//variable used for extracting first column first cell string of each row 
		String a1a = "";			//variables that result from splitting a1 
		String a1b = "Outcome: ";
		String a1r1c1 = "";		//variables for string-content of each cell in the "a" row
		String a1r1c2 = "";
		String a1r1c3 = "";
		String a1r1c4 = "";
		String a1r1c5 = "";
		String a1r1c6 = "";
		String a1r1c1a = "";
		String a1r3c1b = "";
		String a1r5c1c = "";
		String a1r2c1 = "";		//extra content of one
		String a1r2c2 = "";
		String a1r4c1 = "";		//extra content of two
		String a1r4c2 = "";
		String a1r6c1 = "";		//extra content of three
		String a1r6c2 = "";
		String a1r1c2a = "";
		String a1r1c4a = "";
		String b1 = "";
		String b1a = "";
		String b1b = "Outcome: ";
		String b1r1c1 = "";
		String b1r1c2 = "";
		String b1r1c3 = "";
		String b1r1c4 = "";
		String b1r1c5 = "";
		String b1r1c6 = "";
		String b1r1c1a = "";
		String b1r3c1b = "";
		String b1r5c1c = "";
		String b1r2c1 = "";		//extra content of one
		String b1r2c2 = "";
		String b1r4c1 = "";		//extra content of two
		String b1r4c2 = "";
		String b1r6c1 = "";		//extra content of three
		String b1r6c2 = "";
		String b1r1c2a = "";
		String b1r1c4a = "";
		String c1 = "";
		String c1a = "";
		String c1b = "Outcome: ";
		String c1r1c1 = "";
		String c1r1c1a = ""; 		// first irregular one-liner in c1
		String c1r3c1b = "";      // second irregular one-liner in c1
		String c1r1c2 = "";
		String c1r1c2a = "";		//shows RR and CI one cell early because of merging
		String c1r1c3 = "";
		String c1r1c4 = "";
		String c1r1c4a = "";
		String c1r1c5 = "";
		String c1r1c6 = "";
		String c1r2c1 = "";		//extra content of one
		String c1r2c2 = "";
		String c1r4c1 = "";		//extra content of two
		String c1r4c2 = "";
		String c1r5c1c = ""; 		//third irregular one liner
		String c1r6c1 = "";		//extra content of three
		String c1r6c2 = "";
		String d1 = "";
		String d1a = "";
		String d1b = "Outcome: ";
		String d1r1c1 = "";
		String d1r1c2 = "";
		String d1r1c3 = "";
		String d1r1c4 = "";
		String d1r1c5 = "";
		String d1r1c6 = "";
		String d1r1c1a = "";
		String d1r3c1b = "";
		String d1r5c1c = "";
		String d1r2c1 = "";		//extra content of one
		String d1r2c2 = "";
		String d1r4c1 = "";		//extra content of two
		String d1r4c2 = "";
		String d1r6c1 = "";		//extra content of three
		String d1r6c2 = "";
		String d1r1c2a = "";
		String d1r1c4a = "";
		String e1 = "";
		String e1a = "";
		String e1b = "Outcome: ";
		String e1r1c1 = "";
		String e1r1c2 = "";
		String e1r1c3 = "";
		String e1r1c4 = "";
		String e1r1c5 = "";
		String e1r1c6 = "";
		String e1r1c1a = "";
		String e1r3c1b = "";
		String e1r5c1c = "";
		String e1r2c1 = "";		//extra content of one
		String e1r2c2 = "";
		String e1r4c1 = "";		//extra content of two
		String e1r4c2 = "";
		String e1r6c1 = "";		//extra content of three
		String e1r6c2 = "";
		String e1r1c2a = "";
		String e1r1c4a = "";
		String f1 = "";
		String f1a = "";
		String f1b = "Outcome: ";
		String f1r1c1 = "";
		String f1r1c2 = "";
		String f1r1c3 = "";
		String f1r1c4 = "";
		String f1r1c5 = "";
		String f1r1c6 = "";
		String f1r1c1a = "";
		String f1r3c1b = "";
		String f1r5c1c = "";
		String f1r2c1 = "";		//extra content of one
		String f1r2c2 = "";
		String f1r4c1 = "";		//extra content of two
		String f1r4c2 = "";
		String f1r6c1 = "";		//extra content of three
		String f1r6c2 = "";
		String f1r1c2a = "";
		String f1r1c4a = "";
		String g1 = "";
		String g1a = "";
		String g1b = "Outcome: ";
		String g1r1c1 = "";
		String g1r1c2 = "";
		String g1r1c3 = "";
		String g1r1c4 = "";
		String g1r1c5 = "";
		String g1r1c6 = "";
		String g1r1c1a = "";
		String g1r3c1b = "";
		String g1r5c1c = "";
		String g1r2c1 = "";		//extra content of one
		String g1r2c2 = "";
		String g1r4c1 = "";		//extra content of two
		String g1r4c2 = "";
		String g1r6c1 = "";		//extra content of three
		String g1r6c2 = "";
		String g1r1c2a = "";
		String g1r1c4a = "";
		
		//String tblName = "";			//to name used table in citation/ infomessage
		
		String result = "";
		
		String aa = null;			//used for comparisons with following strings and boolean
		String bb = null;
		String cc = null;
		String dd = null;
		String ee = null;
		String ff = null;
		String gg = null;
		
		
		String rs2 = "2"; 			//contains "ROWSPAN" value for alternative table structuring
		String rs3 = "3";
		String rs4 = "4";
		String rs6 = "6";
		
		String cs2 = "2";
		String cs3 = "3";			 //contains "Colspan" value for alternative table structuring
		String cs4 = "4";
		//String cs5 = "5";
		//String cs6 = "6";
		
		
		String testHeading = "Risk";
		
		String title = ""; //title of the review
		String pubdate = ""; //Date of publishment
		String issue = ""; //issue of the review
		String DIO = ""; //DIO of the review
		String CDNo = ""; //CD number of the review
		String Creator0 = ""; //First letter of the first name of the first author
		String Author0 = ""; //Surname of the first author
		String Author0f = ""; //First name of the first author
		String Creator1 = ""; //First letter of of the first name of the second author
		String Author1 = (""); //Surname of the second author
		String Author1f = (""); //First name of the second author
		String Creator2 = ""; //first letter of the first name of the third author
		String Author2 = ""; //Sir name of the third author
		String Author2f = ""; //first name of the third author
		
		String language = "eng";
		
		String a1words = "Findings in words";
		String b1words = "Findings in words";
		String c1words = "Findings in words";
		String d1words = "Findings in words";
		String e1words = "Findings in words";
		String f1words = "Findings in words";
		String g1words = "Findings in words";
		
		
		String evA = "";			//for new string that contains evidence level
		String evB = "";
		String evC = "";
		String evD = "";
		String evE = "";
		String evF = "";
		String evG = "";
		
		
		
		boolean one6 = false;		 //boolean for evaluating "ROWSPAN" values and their impact on the finished table structure
		boolean one4 = false;
		boolean one2 = false;
		//boolean one3 = false;
		boolean two6 = false;
		boolean two4 = false;
		boolean two2 = false;
		//boolean two3 = false;
		boolean three6 = false;
		boolean three4 = false;
		boolean three2 = false;
		//boolean three3 = false;
		boolean four6 = false;
		boolean four4 = false;
		boolean four2 = false;
		//boolean four3 = false;
		boolean five6 = false;
		boolean five4 = false;
		boolean five3 = false;
		boolean five2 = false;
		boolean six6 = false;
		boolean six4 = false;
		boolean six2 = false;
		//boolean six3 = false;
		boolean seven6 = false;
		boolean seven4 = false;
		boolean seven2 = false;
		//boolean seven3 = false;
		
		boolean aCS2 = false;		//to check COLSPAN values for alternative table structuring
		boolean aCS3 = false;
		boolean aCS4 = false;
		boolean bCS2 = false;
		boolean bCS3 = false;
		boolean bCS4 = false;
		boolean cCS2 = false;
		boolean cCS3 = false;
		boolean cCS4 = false;
		boolean dCS2 = false;
		boolean dCS3 = false;
		boolean dCS4 = false;
		boolean eCS2 = false;
		boolean eCS3 = false;
		boolean eCS4 = false;
		boolean fCS2 = false;
		boolean fCS3 = false;
		boolean fCS4 = false;
		boolean gCS2 = false;
		boolean gCS3 = false;
		boolean gCS4 = false;
		
		boolean endA = false; //to determine the tables end
		boolean endB = false;
		boolean endC = false;
		boolean endD = false;
		boolean endE = false;
		boolean endF = false;
		boolean endG = false;
		
		boolean bSkip = false;		//boolean to check if an outcome occurs twice and therefore can be skipped
		boolean cSkip = false;
		boolean dSkip = false;
		boolean eSkip = false;
		boolean fSkip = false;
		boolean gSkip = false;

		boolean aHigh = false;		//to contain info whether the evidence level hinted at in the name is true
		boolean aModerate = false;
		boolean aLow = false;
		boolean aVeryLow = false;

		boolean bHigh = false;
		boolean bModerate = false;
		boolean bLow = false;
		boolean bVeryLow = false;

		boolean cHigh = false;
		boolean cModerate = false;
		boolean cLow = false;
		boolean cVeryLow = false;

		boolean dHigh = false;
		boolean dModerate = false;
		boolean dLow = false;
		boolean dVeryLow = false;

		boolean eHigh = false;
		boolean eModerate = false;
		boolean eLow = false;
		boolean eVeryLow = false;

		boolean fHigh = false;
		boolean fModerate = false;
		boolean fLow = false;
		boolean fVeryLow = false;

		boolean gHigh = false;
		boolean gModerate = false;
		boolean gLow = false;
		boolean gVeryLow = false;

		boolean aNA = false;
		boolean bNA = false;
		boolean cNA = false;
		boolean dNA = false;
		boolean eNA = false;
		boolean fNA = false;
		boolean gNA = false;
		
		
		Integer i = 5;			//counts up rows 
		
		Integer a = 3;			//ints used to count up items when special table structuring of fused columns applies
		Integer b = 3;
		Integer c = 3;
		Integer d = 3;
		Integer ei = 3;
		Integer f = 3;
		Integer g = 3;
		
		Element tbl1Element = null;
		Node sof0 = null;
		Element sof0Element = null;
		NodeList tblList = null;
		Node tbl1 = null;

sof0 = secondList.item(nr);
sof0Element = (Element) sof0;
		
tblList = sof0Element.getElementsByTagName("TABLE");
tbl1 = tblList.item(0);
tbl1Element = (Element) tbl1;

GetBody body = new GetBody();
		//sof identification stuff
		

		
		
		
		//Citation stuff: 
		
		//Get the title of the review out of the XML
		try {
			NodeList CoverSheetXML = rootElement.getElementsByTagName("COVER_SHEET");
			Node CoverSheet = CoverSheetXML.item(0);
			Element CoverSheetElement = (Element) CoverSheet; 

			NodeList titleXML = CoverSheetElement.getElementsByTagName("TITLE");
			Node headingNode = titleXML.item(0);
			Element headingElement = (Element) headingNode; 
			title = headingElement.getTextContent(); 

			//Get number of Issue of the review

			NodeList datesheetXML = CoverSheetElement.getElementsByTagName("DATES");
			Node Datehead = datesheetXML.item(0);
			Element DateheadElement = (Element) Datehead;

			NodeList lCitationXML = DateheadElement.getElementsByTagName("LAST_CITATION_ISSUE");
			Node lCitation = lCitationXML.item(0);
			Element lastissueElement = (Element) lCitation;
			issue = lastissueElement.getAttribute("ISSUE");


			//Get the date of publishment of the review
			NodeList PublishdateXML = DateheadElement.getElementsByTagName("LAST_CITATION_ISSUE");
			Node Publishdate = PublishdateXML.item(0);
			Element DateElement = (Element)Publishdate; 
			pubdate = DateElement.getAttribute("YEAR");

			DIO = rootElement.getAttribute("DOI");
			

			//Get the CD-number of the review
			CDNo = DIO.substring(17);
			

			//Get all the Authors of the review
			NodeList CreatorXML = CoverSheetElement.getElementsByTagName("CREATORS");
			Node Creator = CreatorXML.item(0);
			Element AuthorElement = (Element) Creator;

			//Author 1
			NodeList PersonXML = AuthorElement.getElementsByTagName("PERSON");;
			try {
				
				Node Person0 = PersonXML.item(0);
				Element PersonElement0 = (Element) Person0;


				NodeList LastNameXML = PersonElement0.getElementsByTagName("LAST_NAME");
				Node LastName = LastNameXML.item(0);
				Element LastNameElement = (Element) LastName;
				Author0 = LastNameElement.getTextContent();


				NodeList FirstNameXML = PersonElement0.getElementsByTagName("FIRST_NAME");
				Node FirstName = FirstNameXML.item(0);
				Element FirstNameElement = (Element) FirstName;
				Author0f = FirstNameElement.getTextContent();
				Creator0 = Author0f.substring(0, 1);
			} catch (Exception e4) {
				
			}
			
			try {
				//Author 2 
				Node Person1 = PersonXML.item(1);
				Element PersonElement1 = (Element) Person1;

				NodeList LastNameXML1 = PersonElement1.getElementsByTagName("LAST_NAME");
				Node LastName1 = LastNameXML1.item(0);
				Element LastNameElement1 = (Element) LastName1;
				Author1 = LastNameElement1.getTextContent();

				NodeList FirstNameXML1 = PersonElement1.getElementsByTagName("FIRST_NAME");
				Node FirstName1 = FirstNameXML1.item(0);
				Element FirstNameElement1 = (Element) FirstName1;
				Author1f = FirstNameElement1.getTextContent();
				Creator1 = Author1f.substring(0, 1);
			} catch (Exception e3) {
				
			}

			try {
				//Author 3 
				Node Person2 = PersonXML.item(2);
				Element PersonElement2 = (Element) Person2;

				NodeList LastNameXML2 = PersonElement2.getElementsByTagName("LAST_NAME");
				Node LastName2 = LastNameXML2.item(0);
				Element LastNameElement2 = (Element) LastName2;
				Author2 = LastNameElement2.getTextContent();

				NodeList FirstNameXML2 = PersonElement2.getElementsByTagName("FIRST_NAME");
				Node FirstName2 = FirstNameXML2.item(0);
				Element FirstNameElement2 = (Element) FirstName2;
				Author2f = FirstNameElement2.getTextContent();
				Creator2 = Author2f.substring(0, 1);
			} catch (Exception e2) {
				
			}
		
		} catch (Exception e2) {
			
		}
		
//checks if new table structuring with less rows in the heading is encountered and adapts 	
NodeList altList = tbl1Element.getElementsByTagName("TR");
Node altNode = altList.item(3);
Element altElement = (Element)altNode;

testHeading = altElement.getTextContent();
testHeading = testHeading.replace("\n", "");
if (testHeading.startsWith("Risk") ) {
		i = new Integer(i.intValue() - 1);
		}


		
//item5 of "TR" node represents the first line which, in most rm5-files, contains valuable content for extraction. 
//Therefore, String variables a1 as "header" and a1c(1-5) for "content" are extracted. //TODO 
		

		
		NodeList row1List = tbl1Element.getElementsByTagName("TR");
		Node row1 = row1List.item(i);
		i = new Integer(i.intValue() + 1);
		Element row1Element = (Element) row1;
		
			NodeList row1e0List = null;
			
			try {
				row1e0List = row1Element.getElementsByTagName("TD");
				Node rowa0 = row1e0List.item(0);
				Element row1e0Element = (Element) rowa0;
				//extracts the Strings for the heading of the row and the outcome measure( splits these because originally they are 1 field in the SoF)
				String[] aArray = body.writeHeading(row1e0Element);
				a1 = 	aArray[0];
				a1a = 	aArray[1];
				a1b = 	aArray[2];
				
				//gets rowspan value to check how many rows are needed to be analysed for content
					aa = row1e0Element.getAttribute("ROWSPAN");
				
				one6 = aa.equals( rs6 );
//If rowspan 6 is true the first if happens. If rowspan 4 is true second if. If rowspan 2 is true third if. Otherwise the last option
				if ( one6 == true) {
					
					String[] a6Array = body.writeSix(row1e0List, row1Element, tbl1Element, i, 
							a1r1c1a, a1r1c2a, a1r1c4a, a1r2c1, a1r2c2, 
							a1r3c1b, a1r4c1, a1r4c2, 
							a1r5c1c, a1r6c1, a1r6c2, a1r1c6);
					
					a1r1c1a =	a6Array[0];
					a1r1c2a =	a6Array[1];
					a1r1c4a =	a6Array[2];
					a1r2c1 =	a6Array[3];
					a1r2c2 =	a6Array[4];
					a1r3c1b =  	a6Array[5];
					a1r4c1 =	a6Array[6];
					a1r4c2 =	a6Array[7];
					a1r5c1c =	a6Array[8];
					a1r6c1 =	a6Array[9];
					a1r6c2 =	a6Array[10];
					a1r1c6 = 	a6Array[11];
					i = new Integer(i.intValue() + 5);
					
				} else {
					one4 = aa.equals( rs4 );
					if (one4 == true) {
						
						String[] a4Array = body.writeFour(row1e0List, row1Element, tbl1Element, i, a1r1c1a, a1r1c2a, a1r1c4a, a1r2c1, a1r2c2, a1r3c1b, a1r4c1, a1r4c2, a1r1c6);
						
						a1r1c1a =	a4Array[0];
						a1r1c2a =	a4Array[1];
						a1r1c4a =	a4Array[2];
						a1r2c1 =	a4Array[3];
						a1r2c2 =	a4Array[4];
						a1r3c1b =  	a4Array[5];
						a1r4c1 =	a4Array[6];
						a1r4c2 =	a4Array[7];
						a1r1c6 = 	a4Array[8];
						i = new Integer(i.intValue() + 3);
						
					} 
					else {
						one2 = aa.equals( rs2 );
						if (one2 == true) {
							
							String[] a2Array = body.writeTwo(row1e0List, row1Element, tbl1Element, i, a1r1c1a, a1r1c2a, a1r1c4a, a1r2c1, a1r2c2, a1r1c6);
							a1r1c1a =	 a2Array[0];
							a1r1c2a =	 a2Array[1];
							a1r1c4a =	 a2Array[2];
							a1r2c1 =	 a2Array[3];
							a1r2c2 =	 a2Array[4];
							a1r1c6 = 	 a2Array[5];
							i = new Integer(i.intValue() + 1);
						}
					}
				}
					
				
				
				
			
			
				
			try {
				row1Element.getElementsByTagName("TD");
				Node row5e1 = row1e0List.item(1);
				Element row1RsElement = (Element) row5e1; 
				aa = row1RsElement.getAttribute("ROWSPAN");
				
				
					//@2nd cell of 1st supposed-to-be relevant line without linebreak
					a1r1c1 = row5e1.getTextContent();
					a1r1c1 = a1r1c1.replace("\n", "");
					
					try {
						row1Element.getElementsByTagName("TD");
						Node row5e2 = row1e0List.item(2); 
						//@3rd cell of 1st supposed-to-be relevant line without linebreak
						a1r1c2 = row5e2.getTextContent();
						a1r1c2 = a1r1c2.replace("\n", "");
					} catch (Exception exc3) {
}
					
					
					row1Element.getElementsByTagName("TD");
					Element row1CsElement = (Element) row5e1; 
					aa = row1CsElement.getAttribute("COLSPAN");
					
					//checks if an unusual table layout is encountered in the next cell
					aCS2 = aa.equals( cs2 );
					aCS3 = aa.equals( cs3 );
					aCS4 = aa.equals( cs4 );
					
					if (aCS2 == true && one2 == false && one4 == false && one6 == false) {
						a = new Integer(a.intValue() - 1);
					}
					
					if (aCS3 == true && one2 == false && one4 == false && one6 == false) {
						a = new Integer(a.intValue() - 2);
					}
					
					if (aCS4 == true && one2 == false && one4 == false && one6 == false) {
						a = new Integer(a.intValue() - 3);
					}
					
					
					
					try {
						row1Element.getElementsByTagName("TD");
						Node row5e3 = row1e0List.item(a);
						a = new Integer(a.intValue() + 1);
						a1r1c3 = row5e3.getTextContent();
						a1r1c3 = a1r1c3.replace("\n", "");
						} catch (Exception exc3) {
						}
					
					
					try {
						row1Element.getElementsByTagName("TD");
						Node row5e4 = row1e0List.item(a);
						a = new Integer(a.intValue() + 1);
						//@5th cell of 1st supposed-to-be relevant line without linebreak
						a1r1c4 = row5e4.getTextContent();
						a1r1c4 = a1r1c4.replace("\n", "");
					} catch (Exception exc3) {
					}
					
					
					try {
						try {
							row1Element.getElementsByTagName("TD");
							Node row5e5 = row1e0List.item(a);
							
							Element row5e5Element = (Element) row5e5;
							//@6th cell of 1st supposed-to-be relevant line here we need just the <B> tag one element further into the structure
								NodeList row5e5B1List = row5e5Element.getElementsByTagName("B");
								Node atag1 = row5e5B1List.item(0);
								a1r1c5 = atag1.getTextContent();
								a1r1c5 = a1r1c5.replace("\n", "");
								a = new Integer(a.intValue() + 1);
						} catch (Exception exc3) {
							
							row1Element.getElementsByTagName("TD");
							Node rowa4 = row1e0List.item(a);
							Element row1e4Element = (Element) rowa4;
							//@get evidence level
								NodeList row1e4a1List = row1e4Element.getElementsByTagName("P");
								Node atag1 = row1e4a1List.item(0);
								a1r1c5 = atag1.getTextContent();
								a1r1c5 = a1r1c5.replace("\n", "").replaceAll("[0-9]", "").replaceAll("[10-20]", "").replace(" ", "");
								a1r1c5 = a1r1c5.substring(4);
								if (a1r1c5.contains("ent")){
									a1r1c5 = "";
								}
								a = new Integer(a.intValue() + 1);
						}
					} catch (Exception e) {
						a = new Integer(a.intValue() + 1);
					}
					
					try {
						row1Element.getElementsByTagName("TD");
						Node row5e6 = row1e0List.item(a);
						a = new Integer(a.intValue() + 1);
						//@7th cell of 1st supposed-to-be relevant line without linebreak
						a1r1c6 = row5e6.getTextContent();
						a1r1c6 = a1r1c6.replace("\n", "");
					} catch (Exception exc3) {
					}
										
				
			} catch (Exception exc3) {
			}
																				
} catch (Exception exc3) {
			}
			
			//following lines check if end of the table is reached. if the boolean becomes a true value programme runs anyway but 
			//stops writings lines at the right point in the final string down below
			
			if (a1a.startsWith("*The") ) {
				endA = true;
				} else { 
					if (a1.startsWith("*The") ) {
						endA = true;
					}
				}
			
		//item6 of "TR" node represents the second line which, in most rm5-files, contains valuable content for extraction. 
		//Therefore, String variables b1 as "header" and b1r(1-x)c(1-6) for "content" are extracted.  TODO
NodeList row7List = tbl1Element.getElementsByTagName("TR");
Node row7 = row7List.item(i);
i = new Integer(i.intValue() + 1);
Element row7Element = (Element) row7;
			
		NodeList row7e0List = null;
		//@1st cell of 1st supposed-to-be relevant line without linebreak
		
		try {
			row7e0List = row7Element.getElementsByTagName("TD");
			Node row7e0 = row7e0List.item(0);
			Element row7e0Element = (Element) row7e0;
			
			String[] bArray = body.writeHeading(row7e0Element);
			b1 = 	bArray[0];
			b1a = 	bArray[1];
			b1b = 	bArray[2];
			
			bb = row7e0Element.getAttribute("ROWSPAN");
			
			two6 = bb.equals( rs6 );
//if its a 6-Liner	
			if ( two6 == true) {
				
				String[] b6Array = body.writeSix(row7e0List, row7Element, tbl1Element, i, 
						b1r1c1a, b1r1c2a, b1r1c4a, b1r2c1, b1r2c2, 
						b1r3c1b, b1r4c1, b1r4c2, 
						b1r5c1c, b1r6c1, b1r6c2, b1r1c6);
				
				b1r1c1a =	b6Array[0];
				b1r1c2a =	b6Array[1];
				b1r1c4a =	b6Array[2];
				b1r2c1 =	b6Array[3];
				b1r2c2 =	b6Array[4];
				b1r3c1b =  	b6Array[5];
				b1r4c1 =	b6Array[6];
				b1r4c2 =	b6Array[7];
				b1r5c1c =	b6Array[8];
				b1r6c1 =	b6Array[9];
				b1r6c2 =	b6Array[10];
				b1r1c6 = 	b6Array[11];
				i = new Integer(i.intValue() + 5);
				
			} else {
				two4 = bb.equals( rs4 );
				if (two4 == true) {
					
					String[] b4Array = body.writeFour(row7e0List, row7Element, tbl1Element, i, b1r1c1a, b1r1c2a, b1r1c4a,
							b1r2c1, b1r2c2,
							b1r3c1b, b1r4c1, b1r4c2, b1r1c6);
					
					b1r1c1a =	b4Array[0];
					b1r1c2a =	b4Array[1];
					b1r1c4a =	b4Array[2];
					b1r2c1 =	b4Array[3];
					b1r2c2 =	b4Array[4];
					b1r3c1b =  	b4Array[5];
					b1r4c1 =	b4Array[6];
					b1r4c2 =	b4Array[7];
					b1r1c6 = 	b4Array[8];
					i = new Integer(i.intValue() + 3);
					
				} else {
					two2 = bb.equals( rs2 );
					if (two2 == true) {
						
						String[] b2Array = body.writeTwo(row7e0List, row7Element, tbl1Element, i, b1r1c1a, b1r1c2a, b1r1c4a, b1r2c1, b1r2c2, b1r1c6);
						b1r1c1a =	 b2Array[0];
						b1r1c2a =	 b2Array[1];
						b1r1c4a =	 b2Array[2];
						b1r2c1 =	 b2Array[3];
						b1r2c2 =	 b2Array[4];
						b1r1c6 =	 b2Array[5];
						i = new Integer(i.intValue() + 1);
						
				}
			}
		}	
			      
} catch (Exception exc3) {
}
			
		try {
			row7Element.getElementsByTagName("TD");
			Node row7e1 = row7e0List.item(1);
			Element row7RsElement = (Element) row7e1;
			bb = row7RsElement.getAttribute("ROWSPAN");
			
				
				try {
					row7Element.getElementsByTagName("TD");
					row7e1 = row7e0List.item(1);
					//@2nd cell of 1st supposed-to-be relevant line without linebreak
					b1r1c1 = row7e1.getTextContent();
					b1r1c1 = b1r1c1.replace("\n", "");
				} catch (Exception e2) {
					
				}
				
				try {
					row7Element.getElementsByTagName("TD");
					Node row7e2 = row7e0List.item(2); 
					//@3rd cell of 1st supposed-to-be relevant line without linebreak
					b1r1c2 = row7e2.getTextContent();
					b1r1c2 = b1r1c2.replace("\n", "");
				} catch (Exception exc3) {
				}
				
				row7Element.getElementsByTagName("TD");
				
				Element row7CsElement = (Element) row7e1;
				bb = row7CsElement.getAttribute("COLSPAN");
				//checks if an unusual table layout is encountered in the next cell
				bCS2 = bb.equals( cs2 );
				bCS3 = bb.equals( cs3 );
				bCS4 = bb.equals( cs4 );
				
				if (bCS2 == true && two2 == false && two4 == false && two6 == false) {
					b = new Integer(b.intValue() - 1);
				}
				
				if (bCS3 == true && two2 == false && two4 == false && two6 == false) {
					b = new Integer(b.intValue() - 2);
				}
				
				if (bCS4 == true && two2 == false && two4 == false && two6 == false) {
					b = new Integer(b.intValue() - 3);
				}
				//@4th cell of 1st supposed-to-be-relevant line without linebreak
				
				try {
					row7Element.getElementsByTagName("TD");
					Node row7e3 = row7e0List.item(b);
					b = new Integer(b.intValue() + 1);
					b1r1c3 = row7e3.getTextContent();
					b1r1c3 = b1r1c3.replace("\n", "");
				} catch (Exception exc3) {
				}
				try {
					row7Element.getElementsByTagName("TD");
					Node row7e4 = row7e0List.item(b);
					b = new Integer(b.intValue() + 1);
					//@5th cell of 1st supposed-to-be relevant line without linebreak
					b1r1c4 = row7e4.getTextContent();
					b1r1c4 = b1r1c4.replace("\n", "");
				} catch (Exception exc3) {
				}
						
				
				try {
					row7Element.getElementsByTagName("TD");
					Node row7e5 = row7e0List.item(b);
					
					Element row7e5Element = (Element) row7e5;
					
					//@6th cell of 1st supposed-to-be relevant line here we need just the <B> tag one element further into the structure
						NodeList row7e5B1List = row7e5Element.getElementsByTagName("B");
						Node btag1 = row7e5B1List.item(0);
						
						b1r1c5 = btag1.getTextContent();
						b1r1c5 = b1r1c5.replace("\n", "");
						b = new Integer(b.intValue() + 1);
						
				} catch (Exception exc3) {
					
					row7Element.getElementsByTagName("TD");
					Node row7e5 = row7e0List.item(b);
					Element row7e5Element = (Element) row7e5;
					
					
					//@6th cell of 1st supposed-to-be relevant line here we need just the <B> tag one element further into the structure
						NodeList row7e5B1List = row7e5Element.getElementsByTagName("P");
						Node btag1 = row7e5B1List.item(0);
						
						b1r1c5 = btag1.getTextContent();
						b1r1c5 = b1r1c5.replace("\n", "").replaceAll("[0-9]", "").replaceAll("[10-20]", "").replace(" ", "");
						b1r1c5 = b1r1c5.substring(4);
						if (b1r1c5.contains("ent")){
							b1r1c5 = "";
						}
						b = new Integer(b.intValue() + 1);
				}
						
				try {
					row7Element.getElementsByTagName("TD");
					Node row7e6 = row7e0List.item(b);
					b = new Integer(b.intValue() + 1);
					//@7th cell of 1st supposed-to-be relevant line without linebreak
					b1r1c6 = row7e6.getTextContent();
					b1r1c6 = b1r1c6.replace("\n", "");
				} catch (Exception exc3) {
				}	
				
		} catch (Exception exc3) {
		}
																					
		if (b1a.startsWith("*The") ) {
			endB = true;
			} else { 
				if (b1.startsWith("*The") ) {
					endB = true;
				}
			}

		
		
		
//item7 of "TR" node represents the next line which, in most rm5-files, contains valuable content for extraction. 
//Therefore, String variables c1 as "header" and c1r(1-x)c(1-6) for "content" are extracted.  //TODO
		
		NodeList row13List = tbl1Element.getElementsByTagName("TR");
		Node row13 = row13List.item(i);
		i = new Integer(i.intValue() + 1);
		Element row13Element = (Element) row13;
		
				NodeList row13e0List = null;
				//@1st cell of 1st supposed-to-be relevant line without linebreak
				
				
				try {
					row13e0List = row13Element.getElementsByTagName("TD");
					Node row13e0 = row13e0List.item(0);
					Element row13e0Element = (Element) row13e0;
					
					String[] cArray = body.writeHeading(row13e0Element);
					c1 = 	cArray[0];
					c1a = 	cArray[1];
					c1b = 	cArray[2];
					
					cc = row13e0Element.getAttribute("ROWSPAN");
					
					three6 = cc.equals( rs6 );
					if ( three6 == true) {	
						
						String[] c6Array = body.writeSix(row13e0List, row13Element, tbl1Element, i, 
								c1r1c1a, c1r1c2a, c1r1c4a, c1r2c1, c1r2c2, 
								c1r3c1b, c1r4c1, c1r4c2, 
								c1r5c1c, c1r6c1, c1r6c2, c1r1c6);
						
						c1r1c1a =	c6Array[0];
						c1r1c2a =	c6Array[1];
						c1r1c4a =	c6Array[2];
						c1r2c1 =	c6Array[3];
						c1r2c2 =	c6Array[4];
						c1r3c1b =  	c6Array[5];
						c1r4c1 =	c6Array[6];
						c1r4c2 =	c6Array[7];
						c1r5c1c =	c6Array[8];
						c1r6c1 =	c6Array[9];
						c1r6c2 =	c6Array[10];
						c1r1c6 = 	c6Array[11];
						i = new Integer(i.intValue() + 5);

														} else {
															three4 = cc.equals( rs4 );
															if (three4 == true) {
																
																String[] c4Array = body.writeFour(row13e0List, row13Element, tbl1Element, i, c1r1c1a, c1r1c2a, c1r1c4a,
																		c1r2c1, c1r2c2,
																		c1r3c1b, c1r4c1, c1r4c2, c1r1c6);
																
																c1r1c1a =	c4Array[0];
																c1r1c2a =	c4Array[1];
																c1r1c4a =	c4Array[2];
																c1r2c1 =	c4Array[3];
																c1r2c2 =	c4Array[4];
																c1r3c1b =  	c4Array[5];
																c1r4c1 =	c4Array[6];
																c1r4c2 =	c4Array[7];
																c1r1c6 = 	c4Array[8];
																i = new Integer(i.intValue() + 3);
																
															} else {
																three2 = cc.equals( rs2 );
																if (three2 == true) {	
																	
																	String[] c2Array = body.writeTwo(row13e0List, row13Element, tbl1Element, i, c1r1c1a, c1r1c2a, c1r1c4a, c1r2c1, c1r2c2, c1r1c6);
																	c1r1c1a =	 c2Array[0];
																	c1r1c2a =	 c2Array[1];
																	c1r1c4a =	 c2Array[2];
																	c1r2c1 =	 c2Array[3];
																	c1r2c2 =	 c2Array[4];
																	c1r1c6 =	 c2Array[5];
																	i = new Integer(i.intValue() + 1);
																	
																}
															} 
														}
					
					
					
				}
				
				catch (Exception exec3) {
				}
								
				try {
					row13Element.getElementsByTagName("TD");
					Node row13e1 = row13e0List.item(1);
					Element row13RsElement = (Element) row13e1;
					cc = row13RsElement.getAttribute("ROWSPAN");
					
					//@2nd cell of 1st supposed-to-be relevant line without linebreak
					c1r1c1 = row13e1.getTextContent();
					c1r1c1 = c1r1c1.replace("\n", "");
				
																					
				try {
					row13Element.getElementsByTagName("TD");
					Node row13e2 = row13e0List.item(2); 
					//@3rd cell of 1st supposed-to-be relevant line without linebreak
					c1r1c2 = row13e2.getTextContent();
					c1r1c2 = c1r1c2.replace("\n", "");
				} catch (Exception exc3) {
				}
				
				//@4th cell of 1st supposed-to-be-relevant line without linebreak
				
				
				
				row13Element.getElementsByTagName("TD");
				
				Element row13CsElement = (Element) row13e1;
				cc = row13CsElement.getAttribute("COLSPAN");
				//checks if an unusual table layout is encountered in the next cell
				cCS2 = cc.equals( cs2 );
				cCS3 = cc.equals( cs3 );
				cCS4 = cc.equals( cs4 );
				
				if (cCS2 == true && three2 == false && three4 == false && three6 == false) {
					c = new Integer(c.intValue() - 1);
				}
				
				if (cCS3 == true && three2 == false && three4 == false && three6 == false) {
					c = new Integer(c.intValue() - 2);
				}
				
				if (cCS4 == true && three2 == false && three4 == false && three6 == false) {
					c = new Integer(c.intValue() - 3);
				}
					
					try {
						row13Element.getElementsByTagName("TD");
						Node row13e3 = row13e0List.item(c);
						c = new Integer(c.intValue() + 1);
						c1r1c3 = row13e3.getTextContent();
						c1r1c3 = c1r1c3.replace("\n", "");
					} catch (Exception exc3) {
					}
					
					try {
						row13Element.getElementsByTagName("TD");
						Node row13e4 = row13e0List.item(c);
						c = new Integer(c.intValue() + 1);
						//@5th cell of 1st supposed-to-be relevant line without linebreak
						c1r1c4 = row13e4.getTextContent();
						c1r1c4 = c1r1c4.replace("\n", "");
					} catch (Exception exc3) {
					}
					try {
						row13Element.getElementsByTagName("TD");
						Node row13e5 = row13e0List.item(c);
						Element row13e5Element = (Element) row13e5;
						//@6th cell of 1st supposed-to-be relevant line here we need just the <b> tag one element further into the structure
							NodeList row13e5C1List = row13e5Element.getElementsByTagName("B");
							Node ctag1 = row13e5C1List.item(0);
							c1r1c5 = ctag1.getTextContent();
							c1r1c5 = c1r1c5.replace("\n", "");
							c = new Integer(c.intValue() + 1);
							
					} catch (Exception exc3) {
					
						row13Element.getElementsByTagName("TD");
						Node row13e4 = row13e0List.item(c);
						Element row13e4Element = (Element) row13e4;
						//@get evidence level
							NodeList row13e4C1List = row13e4Element.getElementsByTagName("P");
							Node ctag1 = row13e4C1List.item(0);
							c1r1c5 = ctag1.getTextContent();
						c1r1c5 = c1r1c5.replace("\n", "").replaceAll("[0-9]", "").replaceAll("[10-20]", "").replace(" ", "");
						c1r1c5 = c1r1c5.substring(4);
						if (c1r1c5.contains("ent")){
							c1r1c5 = "";
						}
						c = new Integer(c.intValue() + 1);
						
					}
					try {
						row13Element.getElementsByTagName("TD");
						Node row13e6 = row13e0List.item(c);
						c = new Integer(c.intValue() + 1);
						//@7th cell of 1st supposed-to-be relevant line without linebreak
						c1r1c6 = row13e6.getTextContent();
						c1r1c6 = c1r1c6.replace("\n", "");
					} catch (Exception exc3) {
					}

				} catch (Exception exc3) {
}
				if (c1a.startsWith("*The") ) {
					endC = true;
					} else { 
						if (c1.startsWith("*The") ) {
							endC = true;
						}
					}
				
			//item8 of "TR" node represents the next line which, in most rm5-files, contains valuable content for extraction. 
			//Therefore, String variables d1 as "header" and d1r(1-x)c(1-6) for "content" are extracted.  TODO
				
				NodeList row19List = tbl1Element.getElementsByTagName("TR");
				Node row19 = row19List.item(i);
				i = new Integer(i.intValue() + 1);
				Element row19Element = (Element) row19;
				
						NodeList row19e0List = null;
						try {
							row19e0List = row19Element.getElementsByTagName("TD");
							Node row19e0 = row19e0List.item(0);
							Element row19e0Element = (Element) row19e0;
							
							String[] dArray = body.writeHeading(row19e0Element);
							d1 = 	dArray[0];
							d1a = 	dArray[1];
							d1b = 	dArray[2];
							
							dd = row19e0Element.getAttribute("ROWSPAN");
							four6 = dd.equals( rs6 );
							if ( four6 == true) {	
							
								String[] d6Array = body.writeSix(row19e0List, row19Element, tbl1Element, i, 
										d1r1c1a, d1r1c2a, d1r1c4a, d1r2c1, d1r2c2, 
										d1r3c1b, d1r4c1, d1r4c2, 
										d1r5c1c, d1r6c1, d1r6c2, d1r1c6);
								
								d1r1c1a =	d6Array[0];
								d1r1c2a =	d6Array[1];
								d1r1c4a =	d6Array[2];
								d1r2c1 =	d6Array[3];
								d1r2c2 =	d6Array[4];
								d1r3c1b =  	d6Array[5];
								d1r4c1 =	d6Array[6];
								d1r4c2 =	d6Array[7];
								d1r5c1c =	d6Array[8];
								d1r6c1 =	d6Array[9];
								d1r6c2 =	d6Array[10];
								d1r1c6 = 	d6Array[11];
								i = new Integer(i.intValue() + 5);
																
							} else {
								four4 = dd.equals( rs4 );
								if (four4 == true) {
									
									String[] d4Array = body.writeFour(row19e0List, row19Element, tbl1Element, i, d1r1c1a, d1r1c2a, d1r1c4a,
											d1r2c1, d1r2c2,
											d1r3c1b, d1r4c1, d1r4c2, d1r1c6);
									
									d1r1c1a =	d4Array[0];
									d1r1c2a =	d4Array[1];
									d1r1c4a =	d4Array[2];
									d1r2c1 =	d4Array[3];
									d1r2c2 =	d4Array[4];
									d1r3c1b =  	d4Array[5];
									d1r4c1 =	d4Array[6];
									d1r4c2 =	d4Array[7];
									d1r1c6 = 	d4Array[8];
									i = new Integer(i.intValue() + 3);
									
								} else {
									four2 = dd.equals( rs2 );
									if (four2 == true) {
											
											String[] d2Array = body.writeTwo(row19e0List, row19Element, tbl1Element, i, d1r1c1a, d1r1c2a, d1r1c4a, d1r2c1, d1r2c2, d1r1c6);
											d1r1c1a =	 d2Array[0];
											d1r1c2a =	 d2Array[1];
											d1r1c4a =	 d2Array[2];
											d1r2c1 =	 d2Array[3];
											d1r2c2 =	 d2Array[4];
											d1r1c6 =	 d2Array[5];
											i = new Integer(i.intValue() + 1);
										
									}
								}
							}
							
							
					}catch (Exception exc3) {
					}
					
						try {
							row19Element.getElementsByTagName("TD");
							Node row19e1 = row19e0List.item(1);
							Element row19RsElement = (Element) row19e1;
							dd = row19RsElement.getAttribute("ROWSPAN");
							
							//@2nd cell of 1st supposed-to-be relevant line without linebreak
							d1r1c1 = row19e1.getTextContent();
							d1r1c1 = d1r1c1.replace("\n", "");
						
																							
						//@3rd cell of 1st supposed-to-be relevant line without linebreak
						
						try {
							row19Element.getElementsByTagName("TD");
							Node row19e2 = row19e0List.item(2); 
							d1r1c2 = row19e2.getTextContent();
							d1r1c2 = d1r1c2.replace("\n", "");
						} catch (Exception exc3) {
						}
						
						row19Element.getElementsByTagName("TD");
					
						Element row19CsElement = (Element) row19e1;
						dd = row19CsElement.getAttribute("COLSPAN");
						//checks if an unusual table layout is encountered in the next cell
						dCS2 = dd.equals( cs2 );
						dCS3 = dd.equals( cs3 );
						dCS4 = dd.equals( cs4 );
						
						if (dCS2 == true && four2 == false && four4 == false && four6 == false) {
							d = new Integer(d.intValue() - 1);
						}
						
						if (dCS3 == true && four2 == false && four4 == false && four6 == false) {
							d = new Integer(d.intValue() - 2);
						}
						
						if (dCS4 == true && four2 == false && four4 == false && four6 == false) {
							d = new Integer(d.intValue() - 3);
						}
						
						try {
							row19Element.getElementsByTagName("TD");
							Node row19e3 = row19e0List.item(d);
							d = new Integer(d.intValue() + 1);
							//@4th cell of 1st supposed-to-be-relevant line without linebreak
							d1r1c3 = row19e3.getTextContent();
							d1r1c3 = d1r1c3.replace("\n", "");
						} catch (Exception exc3) {
						}
						
						try {
							row19Element.getElementsByTagName("TD");
							Node row19e4 = row19e0List.item(d);
							d = new Integer(d.intValue() + 1);
							//@5th cell of 1st supposed-to-be relevant line without linebreak
							d1r1c4 = row19e4.getTextContent();
							d1r1c4 = d1r1c4.replace("\n", "");
						} catch (Exception exc3) {
						}
						
						
						
						try {
							row19Element.getElementsByTagName("TD");
							Node row19e5 = row19e0List.item(d);
							Element row19e5Element = (Element) row19e5;
							//@6th cell of 1st supposed-to-be relevant line here we need just the <b> tag one element further into the structure
								NodeList row19e5D1List = row19e5Element.getElementsByTagName("B");
								Node dtag1 = row19e5D1List.item(0);
								d1r1c5 = dtag1.getTextContent();
								d1r1c5 = d1r1c5.replace("\n", "");
								d = new Integer(d.intValue() + 1);
								
						} catch (Exception exc3) {
						
							row19Element.getElementsByTagName("TD");
							Node row19e4 = row19e0List.item(d);
							Element row19e4Element = (Element) row19e4;
							//@get evidence level
								NodeList row19e4C1List = row19e4Element.getElementsByTagName("P");
								Node dtag1 = row19e4C1List.item(0);
								d1r1c5 = dtag1.getTextContent();
							d1r1c5 = d1r1c5.replace("\n", "").replaceAll("[0-9]", "").replaceAll("[10-20]", "").replace(" ", "");
							d1r1c5 = d1r1c5.substring(4);
							if (d1r1c5.contains("ent")){
								d1r1c5 = "";
							}
							d = new Integer(d.intValue() + 1);
							
						}
							
						try {
							row19Element.getElementsByTagName("TD");
							Node row19e6 = row19e0List.item(d);
							d = new Integer(d.intValue() + 1);
							//@19th cell of 1st supposed-to-be relevant line without linebreak
							d1r1c6 = row19e6.getTextContent();
							d1r1c6 = d1r1c6.replace("\n", "");
						} catch (Exception exc3) {
						}
						
						} catch (Exception exc3) {
						}
						
						if (d1a.startsWith("*The") ) {
							endD = true;
							} else { 
								if (d1.startsWith("*The") ) {
									endD = true;
								}
							}
						
						
					//item9 of "TR" Node represents the next line which, in most rm5-files, contains valuable content for extraction. 
					//Therefore, String variables e1 as "header" and e1r(1-x)c(1-6) for "content" are extracted.  //TODO
						
						NodeList row25List = tbl1Element.getElementsByTagName("TR");
						Node row25 = row25List.item(i);
						i = new Integer(i.intValue() + 1);
						Element row25Element = (Element) row25;
						
								NodeList row25e0List = null;
								//@1st cell of 1st supposed-to-be relevant line without linebreak
								
								try {
									row25e0List = row25Element.getElementsByTagName("TD");
									Node row25e0 = row25e0List.item(0);
									Element row25e0Element = (Element) row25e0;
									
									String[] eArray = body.writeHeading(row25e0Element);
									e1 = 	eArray[0];
									e1a = 	eArray[1];
									e1b = 	eArray[2];
								
									ee = row25e0Element.getAttribute("ROWSPAN");
									
									five6 = ee.equals( rs6 );
					//if its a 3-Liner	
									if ( five6 == true) {
										
										String[] e6Array = body.writeSix(row25e0List, row25Element, tbl1Element, i, 
												e1r1c1a, e1r1c2a, e1r1c4a, e1r2c1, e1r2c2, 
												e1r3c1b, e1r4c1, e1r4c2, 
												e1r5c1c, e1r6c1, e1r6c2, e1r1c6);
										
										e1r1c1a =	e6Array[0];
										e1r1c2a =	e6Array[1];
										e1r1c4a =	e6Array[2];
										e1r2c1 =	e6Array[3];
										e1r2c2 =	e6Array[4];
										e1r3c1b =  	e6Array[5];
										e1r4c1 =	e6Array[6];
										e1r4c2 =	e6Array[7];
										e1r5c1c =	e6Array[8];
										e1r6c1 =	e6Array[9];
										e1r6c2 =	e6Array[10];
										e1r1c6 = 	e6Array[11];
										i = new Integer(i.intValue() + 5);
										
									} else {
										five3 = ee.equals( rs3 );
										if ( five3 == true) {
											
											try {
												row25e0List = row25Element.getElementsByTagName("TD");
												Node row25e00 = row25e0List.item(1);
												e1r2c1 = row25e00.getTextContent();
												e1r2c1 = e1r2c1.replace("\n", "");
												
												Node row25e1 = row25e0List.item(2);
												e1r2c2 = row25e1.getTextContent();
												e1r2c2 = e1r2c2.replace("\n", "");
												
											} catch (Exception excep) {
											}
								
							//TODO gets 6 rows this is confusing but it shows RR and CI since cells have been merged		
								try {
								row25Element.getElementsByTagName("TD");
								Node row25e2 = row25e0List.item(3); 
								//@3rd cell of 1st supposed-to-be relevant line without linebreak
								e1r1c2a = row25e2.getTextContent();
								e1r1c2a = e1r1c2a.replace("\n", "");
							} catch (Exception exc3) {
							}					
								try {
									row25Element.getElementsByTagName("TD");
									Node row25e4 = row25e0List.item(5);
									Element row25e4Element = (Element) row25e4;
									//@get evidence level
										NodeList row25e4C1List = row25e4Element.getElementsByTagName("B");
										Node etag1 = row25e4C1List.item(0);
										e1r1c4a = etag1.getTextContent();
										e1r1c4a = e1r1c4a.replace("\n", "");
								} catch (Exception exc3) {
									
									row25Element.getElementsByTagName("TD");
									Node row25e4 = row25e0List.item(5);
									Element row25e4Element = (Element) row25e4;
									//@get evidence level
										NodeList row25e4C1List = row25e4Element.getElementsByTagName("P");
										Node etag1 = row25e4C1List.item(0);
										e1r1c4a = etag1.getTextContent();
										e1r1c4a = e1r1c4a.replace("\n", "").replaceAll("[0-9]", "").replaceAll("[10-20]", "").replace(" ", "");
										e1r1c4a = e1r1c4a.substring(4);
								}	
								
								NodeList row26List = tbl1Element.getElementsByTagName("TR");
								Node row26 = row26List.item(i);
								i = new Integer(i.intValue() + 1);
								Element row26Element = (Element) row26;
								
										NodeList row26e0List = null;
										//
										
										
											try {
												row26e0List = row26Element.getElementsByTagName("TD");
												Node row26e0 = row26e0List.item(0);
												e1r4c1 = row26e0.getTextContent();
												e1r4c1 = e1r4c1.replace("\n", "");
												
												Node row26e1 = row26e0List.item(1);
												e1r4c2 = row26e1.getTextContent();
												e1r4c2 = e1r4c2.replace("\n", "");
												
											} catch (Exception excep) {
											}
											
											NodeList row27List = tbl1Element.getElementsByTagName("TR");
											Node row27 = row27List.item(i);
											i = new Integer(i.intValue() + 1);
											Element row27Element = (Element) row27;
											
													NodeList row27e0List = null;
													//
													
													
														try {
															row27e0List = row27Element.getElementsByTagName("TD");
															Node row27e0 = row27e0List.item(0);
															e1r6c1 = row27e0.getTextContent();
															e1r6c1 = e1r6c1.replace("\n", "");
															
															Node row27e1 = row27e0List.item(1);
															e1r6c2 = row27e1.getTextContent();
															e1r6c2 = e1r6c2.replace("\n", "");
															
														} catch (Exception excep) {
														}
											
								
							
											
									} else {
										five4 = ee.equals( rs4 );
										if (five4 == true) {
											
											String[] e4Array = body.writeFour(row25e0List, row25Element, tbl1Element, i, e1r1c1a, e1r1c2a, e1r1c4a,
													e1r2c1, e1r2c2,
													e1r3c1b, e1r4c1, e1r4c2, e1r1c6);
											
											e1r1c1a =	e4Array[0];
											e1r1c2a =	e4Array[1];
											e1r1c4a =	e4Array[2];
											e1r2c1 =	e4Array[3];
											e1r2c2 =	e4Array[4];
											e1r3c1b =  	e4Array[5];
											e1r4c1 =	e4Array[6];
											e1r4c2 =	e4Array[7];
											e1r1c6 = 	e4Array[8];
											i = new Integer(i.intValue() + 3);
											
										} else {
											five2 = ee.equals( rs2 );
											if (five2 == true) {
												
												String[] e2Array = body.writeTwo(row25e0List, row25Element, tbl1Element, i, e1r1c1a, e1r1c2a, e1r1c4a, e1r2c1, e1r2c2, e1r1c6);
												e1r1c1a =	 e2Array[0];
												e1r1c2a =	 e2Array[1];
												e1r1c4a =	 e2Array[2];
												e1r2c1 =	 e2Array[3];
												e1r2c2 =	 e2Array[4];
												e1r1c6 =	 e2Array[5];
												i = new Integer(i.intValue() + 1);
												
											}
										}
									}
									
									
									}		} catch (Exception exc3) {
								}
							
								
								try {
									row25Element.getElementsByTagName("TD");
									Node row25e1 = row25e0List.item(1);
									Element row25RsElement = (Element) row25e1;
									ee = row25RsElement.getAttribute("ROWSPAN");
									
									//@2ne cell of 1st supposed-to-be relevant line without linebreak
									e1r1c1 = row25e1.getTextContent();
									e1r1c1 = e1r1c1.replace("\n", "");
								
																									
								
								try {
									row25Element.getElementsByTagName("TD");
									Node row25e2 = row25e0List.item(2); 
									//@3re cell of 1st supposed-to-be relevant line without linebreak
									e1r1c2 = row25e2.getTextContent();
									e1r1c2 = e1r1c2.replace("\n", "");
								} catch (Exception exc3) {
							}
								
								row25Element.getElementsByTagName("TD");
							
								Element row25CsElement = (Element) row25e1;
								ee = row25CsElement.getAttribute("COLSPAN");
								//checks if an unusual table layout is encountered in the next cell
								eCS2 = ee.equals( cs2 );
								eCS3 = ee.equals( cs3 );
								eCS4 = ee.equals( cs4 );
								
								if (eCS2 == true && five2 == false && five4 == false && five6 == false) {
									ei = new Integer(ei.intValue() - 1);
								}
								
								if (eCS3 == true && five2 == false && five4 == false && five6 == false) {
									ei = new Integer(ei.intValue() - 2);
								}
								
								if (eCS4 == true && five2 == false && five4 == false && five6 == false) {
									ei = new Integer(ei.intValue() - 3);
								}
								
								try {
									row25Element.getElementsByTagName("TD");
									Node row25e3 = row25e0List.item(ei);
									ei = new Integer(ei.intValue() + 1);
									e1r1c3 = row25e3.getTextContent();
									e1r1c3 = e1r1c3.replace("\n", "");
								} catch (Exception exc3) {
							}
								
								try {
									row25Element.getElementsByTagName("TD");
									Node row25e4 = row25e0List.item(ei);
									ei = new Integer(ei.intValue() + 1);
									//@5th cell of 1st supposed-to-be relevant line without linebreak
									e1r1c4 = row25e4.getTextContent();
									e1r1c4 = e1r1c4.replace("\n", "");
								} catch (Exception exc3) {
								}
								
								
								
								try {
									row25Element.getElementsByTagName("TD");					
									Node row25e5 = row25e0List.item(ei);
									Element row25e5Element = (Element) row25e5;
									//@6th cell 
										NodeList row25e5E1List = row25e5Element.getElementsByTagName("B");
										Node etag1 = row25e5E1List.item(0);
										e1r1c5 = etag1.getTextContent();
										e1r1c5 = e1r1c5.replace("\n", "");
										ei = new Integer(ei.intValue() + 1);
										
								} catch (Exception exc2) {
						
									row25Element.getElementsByTagName("TD");
									Node row25e4 = row25e0List.item(ei);
									Element row25e4Element = (Element) row25e4;
									//@get evidence level
										NodeList row25e4C1List = row25e4Element.getElementsByTagName("P");
										Node etag1 = row25e4C1List.item(0);
										e1r1c5 = etag1.getTextContent();
									e1r1c5 = e1r1c5.replace("\n", "").replaceAll("[0-9]", "").replaceAll("[10-20]", "").replace(" ", "");
									e1r1c5 = e1r1c5.substring(4);
									if (e1r1c5.contains("ent")){
										e1r1c5 = "";
									}
									ei = new Integer(ei.intValue() + 1);
								}
									
								try {
									row25Element.getElementsByTagName("TD");
									Node row25e6 = row25e0List.item(ei);
									ei = new Integer(ei.intValue() + 1);
									//@25th cell of 1st supposed-to-be relevant line without linebreak
									e1r1c6 = row25e6.getTextContent();
									e1r1c6 = e1r1c6.replace("\n", "");
								} catch (Exception exc2) {
							}
								
								} catch (Exception exc3) {
								}
								
								if (e1a.startsWith("*The") ) {
									endE = true;
									} else { 
										if (e1.startsWith("*The") ) {
											endE = true;
										}
									}
								
								
								//item10 of "TR" Node represents the next line which, in most rm5-files, contains valuable content for extraction. 
								//Therefore, String variables e1 as "header" and f1r(1-x)c(1-6) for "content" are extracted.  TODO
									
									NodeList row31List = tbl1Element.getElementsByTagName("TR");
									Node row31 = row31List.item(i);
									i = new Integer(i.intValue() + 1);
									Element row31Element = (Element) row31;
									
											NodeList row31e0List = null;
											//@1st cell of 1st supposed-to-be relevant line without linebreak
											
											try {
												row31e0List = row31Element.getElementsByTagName("TD");
												Node row31e0 = row31e0List.item(0);
												Element row31e0Element = (Element) row31e0;
												
												String[] fArray = body.writeHeading(row31e0Element);
												f1 = 	fArray[0];
												f1a = 	fArray[1];
												f1b = 	fArray[2];
						//if 3liner						
												ff = row31e0Element.getAttribute("ROWSPAN");
												six6 = ff.equals( rs6 );
												if ( six6 == true) {	
											
													String[] f6Array = body.writeSix(row31e0List, row31Element, tbl1Element, i, 
															f1r1c1a, f1r1c2a, f1r1c4a, f1r2c1, f1r2c2, 
															f1r3c1b, f1r4c1, f1r4c2, 
															f1r5c1c, f1r6c1, f1r6c2, f1r1c6);
													
													f1r1c1a =	f6Array[0];
													f1r1c2a =	f6Array[1];
													f1r1c4a =	f6Array[2];
													f1r2c1 =	f6Array[3];
													f1r2c2 =	f6Array[4];
													f1r3c1b =  	f6Array[5];
													f1r4c1 =	f6Array[6];
													f1r4c2 =	f6Array[7];
													f1r5c1c =	f6Array[8];
													f1r6c1 =	f6Array[9];
													f1r6c2 =	f6Array[10];
													f1r1c6 = 	f6Array[11];
													i = new Integer(i.intValue() + 5);
													
											} else {
												six4 = ff.equals( rs4 );
												if (six4 == true) {
													
													String[] f4Array = body.writeFour(row31e0List, row31Element, tbl1Element, i, f1r1c1a, f1r1c2a, f1r1c4a,
															f1r2c1, f1r2c2,
															f1r3c1b, f1r4c1, f1r4c2, f1r1c6);
													
													f1r1c1a =	f4Array[0];
													f1r1c2a =	f4Array[1];
													f1r1c4a =	f4Array[2];
													f1r2c1 =	f4Array[3];
													f1r2c2 =	f4Array[4];
													f1r3c1b =  	f4Array[5];
													f1r4c1 =	f4Array[6];
													f1r4c2 =	f4Array[7];
													f1r1c6 = 	f4Array[8];
													i = new Integer(i.intValue() + 3);
													
												} else {
													six2 = ff.equals( rs2 );
													if (six2 == true) {
														
														String[] f2Array = body.writeTwo(row31e0List, row31Element, tbl1Element, i, f1r1c1a, f1r1c2a, f1r1c4a, f1r2c1, f1r2c2, f1r1c6);
														f1r1c1a =	 f2Array[0];
														f1r1c2a =	 f2Array[1];
														f1r1c4a =	 f2Array[2];
														f1r2c1 =	 f2Array[3];
														f1r2c2 =	 f2Array[4];
														f1r1c6 =	 f2Array[5];
														i = new Integer(i.intValue() + 1);	
														
													}
												} 
												
												
										}		
												
												}
												catch (Exception exc2) {
											}
											
											
										
											try {
												row31Element.getElementsByTagName("TD");
												Node row31e1 = row31e0List.item(1);
												Element row31RsElement = (Element) row31e1;
												ff = row31RsElement.getAttribute("ROWSPAN");
												
												//@2ne cell of 1st supposed-to-be relevant line without linebreak
												f1r1c1 = row31e1.getTextContent();
												f1r1c1 = f1r1c1.replace("\n", "");
											
																												
											try {
												row31Element.getElementsByTagName("TD");
												Node row31e2 = row31e0List.item(2); 
												//@3re cell of 1st supposed-to-be relevant line without linebreak
												f1r1c2 = row31e2.getTextContent();
												f1r1c2 = f1r1c2.replace("\n", "");
											} catch (Exception exc2) {
										}
											
											row31Element.getElementsByTagName("TD");
											
											Element row31CsElement = (Element) row31e1;
											ff = row31CsElement.getAttribute("COLSPAN");
											//checks if an unusual table layout is encountered in the next cell
											fCS2 = ff.equals( cs2 );
											fCS3 = ff.equals( cs3 );
											fCS4 = ff.equals( cs4 );
											
											if (fCS2 == true && six2 == false && six4 == false && six6 == false) {
												f = new Integer(f.intValue() - 1);
											}
											
											if (fCS3 == true && six2 == false && six4 == false && six6 == false) {
												f = new Integer(f.intValue() - 2);
											}
											
											if (fCS4 == true && six2 == false && six4 == false && six6 == false) {
												f = new Integer(f.intValue() - 3);
											}
											
											try {
												row31Element.getElementsByTagName("TD");
												Node row31e3 = row31e0List.item(f);
												f = new Integer(f.intValue() + 1);
												f1r1c3 = row31e3.getTextContent();
												f1r1c3 = f1r1c3.replace("\n", "");
											} catch (Exception exc2) {
											}
											
											try {
												row31Element.getElementsByTagName("TD");
												Node row31e4 = row31e0List.item(f);
												f = new Integer(f.intValue() + 1);
												//@5th cell of 1st supposed-to-be relevant line without linebreak
												f1r1c4 = row31e4.getTextContent();
												f1r1c4 = f1r1c4.replace("\n", "");
											} catch (Exception exc2) {
											}
										
											try {
												row31Element.getElementsByTagName("TD");					
												Node row31e5 = row31e0List.item(f);
												Element row31e5Element = (Element) row31e5;
												//@6th cell 
													NodeList row31e5E1List = row31e5Element.getElementsByTagName("B");
													Node ftag1 = row31e5E1List.item(0);
													f1r1c5 = ftag1.getTextContent();
													f1r1c5 = f1r1c5.replace("\n", "");
													
														f = new Integer(f.intValue() + 1);	
													
													
													
											} catch (Exception excep) {
												row31Element.getElementsByTagName("TD");
												Node row31e4 = row31e0List.item(f);
												Element row31e4Element = (Element) row31e4;
												//@get evidence level
													NodeList row31e4C1List = row31e4Element.getElementsByTagName("P");
													Node ftag1 = row31e4C1List.item(0);
													f1r1c5 = ftag1.getTextContent();
												f1r1c5 = f1r1c5.replace("\n", "").replaceAll("[0-9]", "").replaceAll("[10-20]", "").replace(" ", "");
												f1r1c5 = f1r1c5.substring(4);
												if (f1r1c5.contains("ent")){
													f1r1c5 = "";
												}
													
												f = new Integer(f.intValue() + 1);
												
											}
												
															
											try {
												row31Element.getElementsByTagName("TD");
												Node row31e6 = row31e0List.item(6);
												//@9th cell of 1st supposed-to-be relevant line without linebreak
												f1r1c6 = row31e6.getTextContent();
												f1r1c6 = f1r1c6.replace("\n", "");
											} catch (Exception excep) {
											}
											
											} catch (Exception exc2) {
											}
											
											if (f1a.startsWith("*The") ) {
												endF = true;
												} else { 
													if (f1.startsWith("*The") ) {
														endF = true;
													}
												}
											
											//item11 of "TR" Node represents the next line which, in most rm5-files, contains valuable content for extraction. 
											//Therefore, String variables g1 as "header" and g1r(1-x)c(1-6) for "content" are extracted. //TODO 
												
												NodeList row37List = tbl1Element.getElementsByTagName("TR");
												Node row37 = row37List.item(i);
												i = new Integer(i.intValue() + 1);
												Element row37Element = (Element) row37;
												
														NodeList row37e0List = null;
														//@1st cell of 1st supposed-to-be relevant line without linebreak
														
														try {
															row37e0List = row37Element.getElementsByTagName("TD");
															Node row37e0 = row37e0List.item(0);
															Element row37e0Element = (Element) row37e0;
															
															String[] gArray = body.writeHeading(row37e0Element);
															g1 = 	gArray[0];
															g1a = 	gArray[1];
															g1b = 	gArray[2];
															
															gg = row37e0Element.getAttribute("ROWSPAN");
															
															seven6 = gg.equals( rs6 );
											//if its a 3-Liner	
															if ( seven6 == true) {
																
																String[] g6Array = body.writeSix(row37e0List, row37Element, tbl1Element, i, 
																		g1r1c1a, g1r1c2a, g1r1c4a, g1r2c1, g1r2c2, 
																		g1r3c1b, g1r4c1, g1r4c2, 
																		g1r5c1c, g1r6c1, g1r6c2, g1r1c6);
																
																g1r1c1a =	g6Array[0];
																g1r1c2a =	g6Array[1];
																g1r1c4a =	g6Array[2];
																g1r2c1 =	g6Array[3];
																g1r2c2 =	g6Array[4];
																g1r3c1b =  	g6Array[5];
																g1r4c1 =	g6Array[6];
																g1r4c2 =	g6Array[7];
																g1r5c1c =	g6Array[8];
																g1r6c1 =	g6Array[9];
																g1r6c2 =	g6Array[10];
																g1r1c6 = 	g6Array[11];
																i = new Integer(i.intValue() + 5);
																
															} else {
																seven4 = gg.equals( rs4 );
																if (seven4 == true) {
																	
																	String[] g4Array = body.writeFour(row37e0List, row37Element, tbl1Element, i, g1r1c1a, g1r1c2a, g1r1c4a,
																			g1r2c1, g1r2c2,
																			g1r3c1b, g1r4c1, g1r4c2, g1r1c6);
																	
																	g1r1c1a =	g4Array[0];
																	g1r1c2a =	g4Array[1];
																	g1r1c4a =	g4Array[2];
																	g1r2c1 =	g4Array[3];
																	g1r2c2 =	g4Array[4];
																	g1r3c1b =  	g4Array[5];
																	g1r4c1 =	g4Array[6];
																	g1r4c2 =	g4Array[7];
																	g1r1c6 = 	g4Array[8];
																	i = new Integer(i.intValue() + 3);
																	
																} else {
																	seven2 = gg.equals( rs2 );
																	if (seven2 == true) {
																		String[] g2Array = body.writeTwo(row37e0List, row37Element, tbl1Element, i, g1r1c1a, g1r1c2a, g1r1c4a, g1r2c1, g1r2c2, g1r1c6);
																		g1r1c1a =	 g2Array[0];
																		g1r1c2a =	 g2Array[1];
																		g1r1c4a =	 g2Array[2];
																		g1r2c1 =	 g2Array[3];
																		g1r2c2 =	 g2Array[4];
																		g1r1c6 =	 g2Array[5];
																		i = new Integer(i.intValue() + 1);	
																	}
																}
															}

															
																} catch (Exception exc2) {
														}
													
														try {
															row37Element.getElementsByTagName("TD");
															Node row37e1 = row37e0List.item(1);
															Element row37RsElement = (Element) row37e1;
															gg = row37RsElement.getAttribute("ROWSPAN");
															
															
															//@2ne cell of 1st supposed-to-be relevant line without linebreak
															g1r1c1 = row37e1.getTextContent();
															g1r1c1 = g1r1c1.replace("\n", "");
														
																															
														try {
															row37Element.getElementsByTagName("TD");
															Node row37e2 = row37e0List.item(2); 
															//@3re cell of 1st supposed-to-be relevant line without linebreak
															g1r1c2 = row37e2.getTextContent();
															g1r1c2 = g1r1c2.replace("\n", "");
														} catch (Exception exc2) {
													}
														
														row37Element.getElementsByTagName("TD");
														
														Element row37CsElement = (Element) row37e1;
														gg = row37CsElement.getAttribute("COLSPAN");
														//checks if an unusual table layout is encountered in the next cell
														gCS2 = gg.equals( cs2 );
														gCS3 = gg.equals( cs3 );
														gCS4 = gg.equals( cs4 );
														
														if (gCS2 == true && seven2 == false && seven4 == false && seven6 == false) {
															g = new Integer(g.intValue() - 1);
														}
														
														if (gCS3 == true && seven2 == false && seven4 == false && seven6 == false) {
															g = new Integer(g.intValue() - 2);
														}
														
														if (gCS4 == true && six2 == false && six4 == false && six6 == false) {
															g = new Integer(g.intValue() - 3);
														}
														
														
														//@4th cell of 1st supposed-to-be-relevant line without linebreak
														
														try {
															row37Element.getElementsByTagName("TD");
															Node row37e3 = row37e0List.item(g);
															g = new Integer(g.intValue() + 1);
															g1r1c3 = row37e3.getTextContent();
															g1r1c3 = g1r1c3.replace("\n", "");
														} catch (Exception exc2) {
														}
														
														try {
															row37Element.getElementsByTagName("TD");
															Node row37e4 = row37e0List.item(g);
															g = new Integer(g.intValue() + 1);
															//@5th cell of 1st supposed-to-be relevant line without linebreak
															g1r1c4 = row37e4.getTextContent();
															g1r1c4 = g1r1c4.replace("\n", "");
														} catch (Exception exc2) {
														}
													
														try {
															row37Element.getElementsByTagName("TD");					
															Node row37e5 = row37e0List.item(g);
															Element row37e5Element = (Element) row37e5;
															//@6th cell 
																NodeList row37e5E1List = row37e5Element.getElementsByTagName("B");
																Node gtag1 = row37e5E1List.item(0);
																g1r1c5 = gtag1.getTextContent();
																g1r1c5 = g1r1c5.replace("\n", "");
																g = new Integer(g.intValue() + 1);
																
														} catch (Exception excep) {
														
															row37Element.getElementsByTagName("TD");
															Node rowg4 = row37e0List.item(g);
															Element row37e4Element = (Element) rowg4;
															//@get evidence level
																NodeList row37e4a1List = row37e4Element.getElementsByTagName("P");
																Node gtag1 = row37e4a1List.item(0);
																g1r1c5 = gtag1.getTextContent();
															g1r1c5 = g1r1c5.replace("\n", "").replaceAll("[0-9]", "").replaceAll("[10-20]", "").replace(" ", "");
															g1r1c5 = g1r1c5.substring(4);
															if (g1r1c5.contains("ent")){
																g1r1c5 = "";
															}
															g = new Integer(g.intValue() + 1);
															
														}
															
																		
														try {
															row37Element.getElementsByTagName("TD");
															Node row37e6 = row37e0List.item(g);
															g = new Integer(g.intValue() + 1);
															//@9th cell of 1st supposed-to-be relevant line without linebreak
															g1r1c6 = row37e6.getTextContent();
															g1r1c6 = g1r1c6.replace("\n", "");
														} catch (Exception excep) {
														}
														} catch (Exception exc2) {
														}
														
														if (g1a.startsWith("*The") ) {
															endG = true;
															} else { 
																if (g1.startsWith("*The") ) {
																	endG = true;
																}
															}
		




//	gets the input from language combobox to use in following methods

switch (langInt) {
case 0:  language = "eng";
		     break;
case 1:  language = "ger";
		     break;
}

CalcWords calc = new CalcWords();
GetLang lang = new GetLang();

String intervention = "";
String control = "";

// index: 0 for intervention, 1 for control

intervention = calc.writeInt(tblName, 0, tbl1Element);
control = calc.writeInt(tblName, 1, tbl1Element);

//for good-looking evidence level with first letter capitalised.
a1r1c4a = lang.changeEv(a1r1c4a);
a1r1c5 = lang.changeEv(a1r1c5);
b1r1c4a = lang.changeEv(b1r1c4a);
b1r1c5 = lang.changeEv(b1r1c5);
c1r1c4a = lang.changeEv(c1r1c4a);
c1r1c5 = lang.changeEv(c1r1c5);
d1r1c4a = lang.changeEv(d1r1c4a);
d1r1c5 = lang.changeEv(d1r1c5);
e1r1c4a = lang.changeEv(e1r1c4a);
e1r1c5 = lang.changeEv(e1r1c5);
f1r1c4a = lang.changeEv(f1r1c4a);
f1r1c5 = lang.changeEv(f1r1c5);
g1r1c4a = lang.changeEv(g1r1c4a);
g1r1c5 = lang.changeEv(g1r1c5);

//the following boolean will be true if they match the evidence level hinted at in their names. 
boolean[] aBoolean = lang.getBoolean(a1r1c4a, a1r1c5);
aVeryLow = aBoolean[0];
aLow = aBoolean[1];
aModerate = aBoolean[2];
aHigh = aBoolean[3];
aNA = aBoolean[4];
boolean[] bBoolean = lang.getBoolean(b1r1c4a, b1r1c5);
bVeryLow = bBoolean[0];
bLow = bBoolean[1];
bModerate = bBoolean[2];
bHigh = bBoolean[3];
bNA = bBoolean[4];
boolean[] cBoolean = lang.getBoolean(c1r1c4a, c1r1c5);
cVeryLow = cBoolean[0];
cLow = cBoolean[1];
cModerate = cBoolean[2];
cHigh = cBoolean[3];
cNA = cBoolean[4];
boolean[] dBoolean = lang.getBoolean(d1r1c4a, d1r1c5);
dVeryLow = dBoolean[0];
dLow = dBoolean[1];
dModerate = dBoolean[2];
dHigh = dBoolean[3];
dNA = dBoolean[4];
boolean[] eBoolean = lang.getBoolean(e1r1c4a, e1r1c5);
eVeryLow = eBoolean[0];
eLow = eBoolean[1];
eModerate = eBoolean[2];
eHigh = eBoolean[3];
eNA = eBoolean[4];
boolean[] fBoolean = lang.getBoolean(f1r1c4a, f1r1c5);
fVeryLow = fBoolean[0];
fLow = fBoolean[1];
fModerate = fBoolean[2];
fHigh = fBoolean[3];
fNA = fBoolean[4];
boolean[] gBoolean = lang.getBoolean(g1r1c4a, g1r1c5);
gVeryLow = gBoolean[0];
gLow = gBoolean[1];
gModerate = gBoolean[2];
gHigh = gBoolean[3];
gNA = gBoolean[4];

//Creates String for evidence level in selected language, takes c5 for normal lines and c4a for extended lines	


evA = lang.writeEv(one6, one4, one2, five3, a1r1c5, a1r1c4a, language);
evB = lang.writeEv(two6, two4, two2, five3, b1r1c5, b1r1c4a, language);
evC = lang.writeEv(three6, three4, three2, five3, c1r1c5, c1r1c4a, language);
evD = lang.writeEv(four6, four4, four2, five3, d1r1c5, d1r1c4a, language);
evE = lang.writeEv(five6, five4, five2, five3, e1r1c5, e1r1c4a, language);
evF = lang.writeEv(six6, six4, six2, five3, f1r1c5, f1r1c4a, language);
evG = lang.writeEv(seven6, seven4, seven2, five3, g1r1c5, g1r1c4a, language);

//Fuses all parts of generated text and adds numbers for normal one-liners and if there are more lines it chooses the right line and info to use (
// medium/moderate risk groups were chosen in general. See CalcWords class for more info), boolean xHigh, boolean xModerate, boolean xLow, boolean xVeryLow
a1words = calc.writeFindings(one6, one4, one2, five3, a1r1c3, a1r1c1, a1r1c2, a1r1c1a, a1r3c1b, a1r5c1c, a1r1c2a, a1r2c1, a1r2c2, a1r4c1, a1r4c2, a1r6c1, a1r6c2, a1r1c6, language, evA, intervention, control, aHigh, aModerate, aLow, aVeryLow);
b1words = calc.writeFindings(two6, two4, two2, five3, b1r1c3, b1r1c1, b1r1c2, b1r1c1a, b1r3c1b, b1r5c1c, b1r1c2a, b1r2c1, b1r2c2, b1r4c1, b1r4c2, b1r6c1, b1r6c2, b1r1c6, language, evB, intervention, control, bHigh, bModerate, bLow, bVeryLow);
c1words = calc.writeFindings(three6, three4, three2, five3, c1r1c3, c1r1c1, c1r1c2, c1r1c1a, c1r3c1b, c1r5c1c, c1r1c2a, c1r2c1, c1r2c2, c1r4c1, c1r4c2, c1r6c1, c1r6c2, c1r1c6, language, evC, intervention, control, cHigh, cModerate, cLow, cVeryLow);
d1words = calc.writeFindings(four6, four4, four2, five3, d1r1c3, d1r1c1, d1r1c2, d1r1c1a, d1r3c1b, d1r5c1c, d1r1c2a, d1r2c1, d1r2c2, d1r4c1, d1r4c2, d1r6c1, d1r6c2, d1r1c6, language, evD, intervention, control, dHigh, dModerate, dLow, dVeryLow);
e1words = calc.writeFindings(five6, five4, five2, five3, e1r1c3, e1r1c1, e1r1c2, e1r1c1a, e1r3c1b, e1r5c1c, e1r1c2a, e1r2c1, e1r2c2, e1r4c1, e1r4c2, e1r6c1, e1r6c2, e1r1c6, language, evE, intervention, control, eHigh, eModerate, eLow, eVeryLow);
f1words = calc.writeFindings(six6, six4, six2, five3, f1r1c3, f1r1c1, f1r1c2, f1r1c1a, f1r3c1b, f1r5c1c, f1r1c2a, f1r2c1, f1r2c2, f1r4c1, f1r4c2, f1r6c1, f1r6c2, f1r1c6, language, evF, intervention, control, fHigh, fModerate, fLow, fVeryLow);
g1words = calc.writeFindings(seven6, seven4, seven2, five3, g1r1c3, g1r1c1, g1r1c2, g1r1c1a, g1r3c1b, g1r5c1c, g1r1c2a, g1r2c1, g1r2c2, g1r4c1, g1r4c2, g1r6c1, g1r6c2, g1r1c6, language, evG, intervention, control, gHigh, gModerate, gLow, gVeryLow);



//if the review states that the RR is not estimable an empty field should appear in the wikitable
a1r1c2a = a1r1c2a.replace("Not estimable", "");
a1r1c3 = a1r1c3.replace("Not estimable", "");
b1r1c2a = b1r1c2a.replace("Not estimable", "");
b1r1c3 = b1r1c3.replace("Not estimable", "");
c1r1c2a = c1r1c2a.replace("Not estimable", "");
c1r1c3 = c1r1c3.replace("Not estimable", "");
d1r1c2a = d1r1c2a.replace("Not estimable", "");
d1r1c3 = d1r1c3.replace("Not estimable", "");
e1r1c2a = e1r1c2a.replace("Not estimable", "");
e1r1c3 = e1r1c3.replace("Not estimable", "");
f1r1c2a = f1r1c2a.replace("Not estimable", "");
f1r1c3 = f1r1c3.replace("Not estimable", "");
g1r1c2a = g1r1c2a.replace("Not estimable", "");
g1r1c3 = g1r1c3.replace("Not estimable", "");
a1r1c2a = a1r1c2a.replace("not estimable", "");
a1r1c3 = a1r1c3.replace("not estimable", "");
b1r1c2a = b1r1c2a.replace("not estimable", "");
b1r1c3 = b1r1c3.replace("not estimable", "");
c1r1c2a = c1r1c2a.replace("not estimable", "");
c1r1c3 = c1r1c3.replace("not estimable", "");
d1r1c2a = d1r1c2a.replace("not estimable", "");
d1r1c3 = d1r1c3.replace("not estimable", "");
e1r1c2a = e1r1c2a.replace("not estimable", "");
e1r1c3 = e1r1c3.replace("not estimable", "");
f1r1c2a = f1r1c2a.replace("not estimable", "");
f1r1c3 = f1r1c3.replace("not estimable", "");
g1r1c2a = g1r1c2a.replace("not estimable", "");
g1r1c3 = g1r1c3.replace("not estimable", "");



//RR explanation code
WikiMarkupClass reformat = new WikiMarkupClass();
a1r1c4a = reformat.wikiLinkEvidence(a1r1c4a);
b1r1c4a = reformat.wikiLinkEvidence(b1r1c4a);
c1r1c4a = reformat.wikiLinkEvidence(c1r1c4a);
d1r1c4a = reformat.wikiLinkEvidence(d1r1c4a);
e1r1c4a = reformat.wikiLinkEvidence(e1r1c4a);
f1r1c4a = reformat.wikiLinkEvidence(f1r1c4a);
g1r1c4a = reformat.wikiLinkEvidence(g1r1c4a);
a1r1c5 = reformat.wikiLinkEvidence(a1r1c5);
b1r1c5 = reformat.wikiLinkEvidence(b1r1c5);
c1r1c5 = reformat.wikiLinkEvidence(c1r1c5);
d1r1c5 = reformat.wikiLinkEvidence(d1r1c5);
e1r1c5 = reformat.wikiLinkEvidence(e1r1c5);
f1r1c5 = reformat.wikiLinkEvidence(f1r1c5);
g1r1c5 = reformat.wikiLinkEvidence(g1r1c5);
a1r1c2a = reformat.wikiLinkRR(a1r1c2a);
b1r1c2a = reformat.wikiLinkRR(b1r1c2a);
c1r1c2a = reformat.wikiLinkRR(c1r1c2a);
d1r1c2a = reformat.wikiLinkRR(d1r1c2a);
e1r1c2a = reformat.wikiLinkRR(e1r1c2a);
f1r1c2a = reformat.wikiLinkRR(f1r1c2a);
g1r1c2a = reformat.wikiLinkRR(g1r1c2a);
a1r1c3 = reformat.wikiLinkRR(a1r1c3);
b1r1c3 = reformat.wikiLinkRR(b1r1c3);
c1r1c3 = reformat.wikiLinkRR(c1r1c3);
d1r1c3 = reformat.wikiLinkRR(d1r1c3);
e1r1c3 = reformat.wikiLinkRR(e1r1c3);
f1r1c3 = reformat.wikiLinkRR(f1r1c3);
g1r1c3 = reformat.wikiLinkRR(g1r1c3);

//to describe the outcome in the auto-generated text
a1words = reformat.wikiChangeAutoGeneration(a1a, a1words);
b1words = reformat.wikiChangeAutoGeneration(b1a, b1words);
c1words = reformat.wikiChangeAutoGeneration(c1a, c1words);
d1words = reformat.wikiChangeAutoGeneration(d1a, d1words);
e1words = reformat.wikiChangeAutoGeneration(e1a, e1words);
f1words = reformat.wikiChangeAutoGeneration(f1a, f1words);
g1words = reformat.wikiChangeAutoGeneration(g1a, g1words);

//to wrap an explanatory wiki link around the String if it fits the topic
a1 = reformat.wikiLinkOutcome(a1); 
a1a = reformat.wikiLinkOutcome(a1a);
b1 = reformat.wikiLinkOutcome(b1);
b1a = reformat.wikiLinkOutcome(b1a);
c1 = reformat.wikiLinkOutcome(c1);
c1a = reformat.wikiLinkOutcome(c1a);
d1 = reformat.wikiLinkOutcome(d1);
d1a = reformat.wikiLinkOutcome(d1a);
e1 = reformat.wikiLinkOutcome(e1);
e1a = reformat.wikiLinkOutcome(e1a);
f1 = reformat.wikiLinkOutcome(f1);
f1a = reformat.wikiLinkOutcome(f1a);
g1= reformat.wikiLinkOutcome(g1);
g1a = reformat.wikiLinkOutcome(g1a);





//if one of the following boolean is true the line with the letter specified by the boolean gets no heading when table is printed below
//since it is a duplicate of predeceding line
if (a1a.equals(b1a)) {
	bSkip = true;
}
if (b1a.equals(c1a)) {
	cSkip = true;
}
if (c1a.equals(d1a)) {
	dSkip = true;
}
if (d1a.equals(e1a)) {
	eSkip = true;
}
if (e1a.equals(f1a)) {
	fSkip = true;
}
if (f1a.equals(g1a)) {
	gSkip = true;
}

//Special case acupuncture review
MDClass mdRegex = new MDClass();
if (d1words.contains("hospital (days)")) {
	d1r1c2a = mdRegex.scaleMDacup(d1r1c2a, d1words);
	d1r1c3 = mdRegex.scaleMDacup(d1r1c3, d1words);
	d1words = "On average, people receiving acupuncture added to standard dose antipsychotics spent 16 days less in hospital than people treated with standard dose antipsychotics. There was no clear difference between the groups. The meaning of this in day-to-day care is unclear.";
	}
//dealing with MD: formulates the findings in words and fills the findings in numbers Strings


String[] mdArray = mdRegex.makeMD(a1words, a1r1c2a, a1r1c3, aVeryLow, b1words, b1r1c2a, b1r1c3, bVeryLow, c1words, c1r1c2a, c1r1c3, cVeryLow, d1words, d1r1c2a, d1r1c3, dVeryLow, e1words, e1r1c2a, e1r1c3, eVeryLow, f1words, f1r1c2a, f1r1c3, fVeryLow, g1words, g1r1c2a, g1r1c3, gVeryLow, intervention);
a1words = mdArray[0];
b1words = mdArray[1];
c1words = mdArray[2];
d1words = mdArray[3];
e1words = mdArray[4];
f1words = mdArray[5];
g1words = mdArray[6];
a1r1c2a = mdArray[7];
b1r1c2a = mdArray[8];
c1r1c2a = mdArray[9];
d1r1c2a = mdArray[10];
e1r1c2a = mdArray[11];
f1r1c2a = mdArray[12];
g1r1c2a = mdArray[13];
a1r1c3 = mdArray[14];
b1r1c3 = mdArray[15];
c1r1c3 = mdArray[16];
d1r1c3 = mdArray[17];
e1r1c3 = mdArray[18];
f1r1c3 = mdArray[19];
g1r1c3 = mdArray[20];



//String parts[] = d1words.split(".\\d+.\\d+\\s\\w+\\sto\\s\\d+.\\d+\\s\\w+.");
//for(int iReg = 0; iReg<parts.length; iReg++){
	//d1words = (parts[iReg]);

//if a lower case letter is followed by a digit because of formatting errors this is reverted using the following method
a1words = mdRegex.forLowercase(a1words);
b1words = mdRegex.forLowercase(b1words);
c1words = mdRegex.forLowercase(c1words);
d1words = mdRegex.forLowercase(d1words);
e1words = mdRegex.forLowercase(e1words);
f1words = mdRegex.forLowercase(f1words);
g1words = mdRegex.forLowercase(g1words);

//if there are spaces missing they are inserted below
DiverseMethods diverse = new DiverseMethods();
a1r1c2a = diverse.getBreak(a1r1c2a);
b1r1c2a = diverse.getBreak(b1r1c2a);
c1r1c2a = diverse.getBreak(c1r1c2a);
d1r1c2a = diverse.getBreak(d1r1c2a);
e1r1c2a = diverse.getBreak(e1r1c2a);
f1r1c2a = diverse.getBreak(f1r1c2a);
g1r1c2a = diverse.getBreak(g1r1c2a);
a1r1c3 = diverse.getBreak(a1r1c3);
b1r1c3 = diverse.getBreak(b1r1c3);
c1r1c3 = diverse.getBreak(c1r1c3);
d1r1c3 = diverse.getBreak(d1r1c3);
e1r1c3 = diverse.getBreak(e1r1c3);
f1r1c3 = diverse.getBreak(f1r1c3);
g1r1c3 = diverse.getBreak(g1r1c3);
	//}

String conclusions = "Conclusions not available";
///extracts the authors conclusion because they are added to the top of the table
try {
	NodeList MainTextList = rootElement.getElementsByTagName("MAIN_TEXT");
	Node MainTextNode = MainTextList.item(0);
	Element MainTextElement = (Element) MainTextNode;
	
	NodeList AbstractList = MainTextElement.getElementsByTagName("ABSTRACT");
	Node AbstractNode = AbstractList.item(0);
	Element AbstractElement = (Element) AbstractNode;
	
	NodeList ConclusionsList = AbstractElement.getElementsByTagName("ABS_CONCLUSIONS");
	Node ConclusionsNode = ConclusionsList.item(0);
	Element ConclusionElement = (Element) ConclusionsNode;
	
	conclusions = ConclusionElement.getTextContent();
	conclusions = conclusions.replace("/n", "");

} catch (Exception e) {
	
}
a1b = reformat.writeX1b(a1b);
b1b = reformat.writeX1b(b1b);
c1b = reformat.writeX1b(c1b);
d1b = reformat.writeX1b(d1b);
e1b = reformat.writeX1b(e1b);
f1b = reformat.writeX1b(f1b);
g1b = reformat.writeX1b(g1b);

a1words = mdRegex.newMDwords(a1words, a1r1c3, intervention, control);
b1words = mdRegex.newMDwords(b1words, b1r1c3, intervention, control);
c1words = mdRegex.newMDwords(c1words, c1r1c3, intervention, control);
d1words = mdRegex.newMDwords(d1words, d1r1c3, intervention, control);
e1words = mdRegex.newMDwords(e1words, e1r1c3, intervention, control);
f1words = mdRegex.newMDwords(f1words, f1r1c3, intervention, control);
g1words = mdRegex.newMDwords(g1words, g1r1c3, intervention, control);

conclusions = reformat.conclLink(conclusions);

//to comply with wikipedias conventions of naming tables we need to get rid of the all-caps words
tblName = tblName.toLowerCase();
tblName = tblName.substring(0, 1).toUpperCase() + tblName.substring(1);

//the first three letters of the surname of 1st author are needed for referencing
String authorReference = Author0.substring(0, 3);


//the createTable method is called to create a wikitable with the given strings and wiki-markup
result = reformat.createTable(tblName, Author0, Creator0, Author1, Creator1, Creator2, Author2, title, pubdate, issue, CDNo, DIO, endA, endB, endC, endD, endE, endF, endG, a1, b1, c1, d1, e1, f1, g1, a1a, b1a, c1a, d1a, e1a, f1a, g1a, a1b, b1b, c1b, d1b, e1b, f1b, g1b, a1words, b1words, c1words, d1words, e1words, f1words, g1words, a1r1c2a, a1r1c4a, b1r1c2a, b1r1c4a, c1r1c2a, c1r1c4a, d1r1c2a, d1r1c4a, e1r1c2a, e1r1c4a, f1r1c2a, f1r1c4a, g1r1c2a, g1r1c4a, a1r1c3, a1r1c5, b1r1c3, b1r1c5, c1r1c3, c1r1c5, d1r1c3, d1r1c5, e1r1c3, e1r1c5, f1r1c3, f1r1c5, g1r1c3, g1r1c5, one6, one4, one2, two6, two4, two2, three6, three4, three2, four6, four4, four2, five6, five4, five2, five3, six6, six4, six2, seven6, seven4, seven2, bSkip, cSkip, dSkip, eSkip, fSkip, gSkip, result, conclusions, authorReference);
		
		return result.toString();
	} catch (DOMException e) {
		return "Table was not created successfully ";
	}
	}
}
