import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CalcWords { 

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//this method takes in: already finished Strings language, intervention, control and evX. Furthermore it takes the Strings of the "Per 1000" numbers 
			//in the Sof. these numbers plus the "RR and CI" String (placeholder x1r1c3, in multiple-lines SOF outcomes x1r1c2a) are used to "calculate" the words)
				//Calculations are done with Relative Risk and absolute numbers. It is called by the method writeFindings() of the same Class and by doing this automatically
	//the right Strings are inserted because table layout is taken care of.
			
	public String writeRR(String x1r1c3, String language, String evX, String Tbl1Per, String Tbl2Per, String intervention, String control, boolean xHigh, boolean xModerate, boolean xLow, boolean xVeryLow) {
		
		
		try {
			String resultingVal = "";
			double divisor; 										// divisor is used for following calculation
			double result1;
			double result2;
			double resSubstraction;
			String resSubstractionString;
			String r1String = "";
			String r2String = "";
			String tmAString = "";
			String tmBString = "";
			int ZahlWort1;
			int ZahlWort2;
			
			DecimalFormat df = new DecimalFormat("#");
			df.setRoundingMode(RoundingMode.HALF_UP);
			
			boolean signif = false;
			//calculates percentages from RR
			double tma = 0;
			double CIlowDb;
			double CIhighDb;
			double tmB;
			double tmA;
			double points;
			
			if (x1r1c3.contains("RR")) {
					//gets data into proper format -> can't calculate with a String
					Tbl1Per = Tbl1Per.replace("1,000", "1000");
					Tbl1Per = Tbl1Per.split(" per 1000")[0];
					Tbl2Per = Tbl2Per.replace("1,000", "1000");
					Tbl2Per = Tbl2Per.split(" per 1000")[0];
					ZahlWort1 = Integer.parseInt(Tbl1Per); 				//converts String to int
					ZahlWort2 = Integer.parseInt(Tbl2Per);
					//calc per1000 numbers
					divisor = 10;
					result1 = ZahlWort1 / divisor;
					result2 = ZahlWort2 / divisor;
					
					//substraction for difference
					resSubstraction = result2 - result1;
				
					
					//puts them in String
					r1String = df.format(result1);
					r2String = df.format(result2);
					resSubstractionString = df.format(resSubstraction);
					//calcRR
					//extracts data which is needed
					x1r1c3 = x1r1c3.replace("RR ", "");
					x1r1c3 = x1r1c3.replace(")", ":");
					x1r1c3 = x1r1c3.replace("(", ":") ; 				// Creates ":" regex for splitting
					String[] parts = x1r1c3.split(":");
					
					
					//splits lower and higher end of CI so that these can be analysed for statistical significance. 
					String RR = parts[1];
					String[] CI = RR.split(" to ");
					String CIlow = CI[0];
					String CIhigh = CI[1];
					CIlowDb = Double.parseDouble(CIlow);
					CIhighDb = Double.parseDouble(CIhigh);
					if (CIlowDb < 1 && CIhighDb < 1 || CIlowDb > 1 && CIhighDb > 1) {
						signif = true;
					}
					tma = Double.parseDouble(parts[0]); 	//tma is the RR (index 0 of array from above0
					tmB = (1-tma)*100;						// Percent of RR
					if (tmB < 0) {									
						tmB = tmB * (-1);
					}
					tmA = tma*100; 							// Percent rate of opponent of RR
					
					tmAString = df.format(tmA);
					tmBString = df.format(tmB);
					
					StringWriter out1 = new StringWriter();			//creates new string- and printWriters to flush output into the return-statement and therefore into the String used in main
					PrintWriter writer1 = new PrintWriter(out1);
					
					
					
					//english version
					
					String interventionLowercase = intervention;
					intervention = intervention.substring(0, 1).toUpperCase() + intervention.substring(1);
					
					
					
					if (signif == true) {
						
					if (xVeryLow == true && resSubstraction > 0) {
						writer1.println(intervention + " may increase the chance of experiencing the outcome when compared with "+ control + ", but, at present there are only very limited data "
								+ "supporting this finding.");
					} else if (xVeryLow == true && resSubstraction < 0){
						writer1.println(intervention + " may reduce the chance of experiencing the outcome when compared with "+ control + ", but, at present there are only very limited data "
								+ "supporting this finding.");
					} else if (xVeryLow == true && resSubstraction == 0 ){
						writer1.println(intervention + " makes no difference to the outcome, but, at present there are only very limited data supporting this finding.");
					} 
						
						
					else if (xHigh == true && resSubstraction <= (-10)) {
						writer1.println(intervention + " reduces the chance of experiencing the outcome when compared with "+ control + ". Data are based on high quality evidence.");
					} else if (xHigh == true && resSubstraction >= 10) {
						writer1.println(intervention + " increases the chance of experiencing the outcome when compared with "+ control + ". Data are based on high quality evidence.");
					} else if (xLow == true && resSubstraction <= (-10)) {
						writer1.println(intervention + " may reduce the chance of experiencing the outcome when compared with "+ control + ". Data are based on low quality evidence.");
					} else if (xLow == true && resSubstraction >= 10) {
						writer1.println(intervention + " may increase the chance of experiencing the outcome when compared with "+ control + ". Data are based on low quality evidence.");
					} else if (xModerate == true && resSubstraction <= (-10)) {
						writer1.println(intervention + " probably reduces the chance of experiencing the outcome when compared with "+ control + ". Data are based on moderate quality evidence.");
					} else if (xModerate == true && resSubstraction >= 10) {
						writer1.println(intervention + " probably increases the chance of experiencing the outcome when compared with "+ control + ". Data are based on moderate quality evidence.");
					}
					
					else if (xHigh == true && resSubstraction <= (-5)) {
						writer1.println(intervention + " slightly reduces the chance of experiencing the outcome when compared with "+ control + ". Data are based on high quality evidence.");
					} else if (xHigh == true && resSubstraction >= 5) {
						writer1.println(intervention + " slightly increases the chance of experiencing the outcome when compared with "+ control + ". Data are based on high quality evidence.");
					} else if (xLow == true && resSubstraction <= (-5)) {
						writer1.println(intervention + " may slightly reduce the chance of experiencing the outcome when compared with "+ control + ". Data are based on low quality evidence.");
					} else if (xLow == true && resSubstraction >= 5) {
						writer1.println(intervention + " may slightly increase the chance of experiencing the outcome when compared with "+ control + ". Data are based on low quality evidence.");
					} else if (xModerate == true && resSubstraction <= (-5)) {
						writer1.println(intervention + " probably slightly reduces the chance of experiencing the outcome when compared with "+ control + ". Data are based on moderate quality evidence.");
					} else if (xModerate == true && resSubstraction >= 5) {
						writer1.println(intervention + " probably slightly increases the chance of experiencing the outcome when compared with "+ control + ". Data are based on moderate quality evidence.");
					} 
					
					else if (xHigh == true && resSubstraction <= 5 && resSubstraction >= 0) {
						writer1.println(intervention + " causes very little or no increase to the chance of experiencing the outcome when compared with "+ control + ". Data are based on high quality evidence.");
					}else if (xHigh == true && resSubstraction >= (-5)) {
						writer1.println(intervention + " causes little or no reduction to the chance of experiencing the outcome when compared with "+ control + ". Data are based on high quality evidence.");
					} else if (xLow == true && resSubstraction <= 5 && resSubstraction >= 0) {
						writer1.println(intervention + " may cause very little or no increase to the chance of experiencing the outcome when compared with "+ control + ". Data are based on low quality evidence.");
					} else if (xLow == true && resSubstraction >= (-5)) {
						writer1.println(intervention + " may cause little or no reduction to the chance of experiencing the outcome when compared with "+ control + ". Data are based on low quality evidence.");
					} else if (xModerate == true && resSubstraction <= 5 && resSubstraction >= 0) {
						writer1.println(intervention + " probably causes very little or no increase to the chance of experiencing the outcome when compared with "+ control + ". Data are based on moderate quality evidence.");
					} else if (xModerate == true && resSubstraction >= (-5)) {
						writer1.println(intervention + " probably causes little or no reduction to the chance of experiencing in the outcome when compared with "+ control + ". Data are based on moderate quality evidence. ");
					} 
					
					else {
						writer1.println("Can't find evidence level");
					}
					}
					
					if (signif == false) {
						
						if (xHigh == true && resSubstraction <= (-10)) {
							writer1.println(intervention + " reduces the chance of experiencing the outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear. Data are based on high quality evidence.");
						} else if (resSubstraction == 0 ){
							writer1.println(intervention + " makes no difference to the outcome, but, at present it is not possible to be confident about the difference between people given " + interventionLowercase + " and those receiving " + control+ ".");
						} else if (xVeryLow == true && resSubstraction > 0) {
							writer1.println(intervention + " may increase the chance of experiencing the outcome, but, at present it is not possible to be confident about the difference between people given " + interventionLowercase + " and those receiving " + control+ " and data supporting this finding are very limited.");
						} else if (xVeryLow == true && resSubstraction < 0){
							writer1.println(intervention + " may reduce the chance of experiencing the outcome, but, at present it is not possible to be confident about the difference between people given " + interventionLowercase + " and those receiving " + control+ " and data supporting this finding are very limited.");
						} else if (xHigh == true && resSubstraction >= 10) {
							writer1.println(intervention + " increases the chance of experiencing the outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear. Data supporting this finding are based on high quality evidence.");
						} else if (xLow == true && resSubstraction <= (-10)) {
							writer1.println(intervention + " may reduce the chance of experiencing the outcome but there is no clear difference between people given " + interventionLowercase + " and those receiving " + control+ ". These findings are based on data of low quality.");
						} else if (xLow == true && resSubstraction >= 10) {
							writer1.println(intervention + " may increase the chance of experiencing the outcome but there is no clear difference between people given " + interventionLowercase + " and those receiving " + control+ ". These findings are based on data of low quality. ");
						} else if (xModerate == true && resSubstraction <= (-10)) {
							writer1.println(intervention + " probably reduces the chance of experiencing the outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear. Data supporting this finding are based on moderate quality evidence.");
						} else if (xModerate == true && resSubstraction >= 10) {
							writer1.println(intervention + " probably increases the the chance of experiencing outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear. Data supporting this finding are based on moderate quality evidence.");
						}
						
						else if (xHigh == true && resSubstraction <= (-5)) {
							writer1.println(intervention + " slightly reduces the chance of experiencing the outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear.");
						} else if (xHigh == true && resSubstraction >= 5) {
							writer1.println(intervention + " slightly increases the chance of experiencing the outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear.");
						} else if (xLow == true && resSubstraction <= (-5)) {
							writer1.println(intervention + " may slightly reduce the chance of experiencing the outcome but there is no clear difference between people given " + interventionLowercase + " and those receiving " + control+ ". These findings are based on data of low quality.");
						} else if (xLow == true && resSubstraction >= 5) {
							writer1.println(intervention + " may slightly increase the chance of experiencing the outcome but there is no clear difference between people given " + interventionLowercase + " and those receiving " + control+ ". These findings are based on data of low quality.");
						} else if (xModerate == true && resSubstraction <= (-5)) {
							writer1.println(intervention + " probably slightly reduces the chance of experiencing the outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear. Data supporting this finding are based on moderate quality evidence.");
						} else if (xModerate == true && resSubstraction >= 5) {
							writer1.println(intervention + " probably slightly increases the chance of experiencing the outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear. Data supporting this finding are based on moderate quality evidence.");
						} 
						
						else if (xHigh == true && resSubstraction <= 5 && resSubstraction >= 0) {
							writer1.println(intervention + " causes little or no increase to the the chance of experiencing outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear.");
						}else if (xHigh == true && resSubstraction >= (-5)) {
							writer1.println(intervention + " causes little or no reduction to the chance of experiencing the outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear.");
						} else if (xLow == true && resSubstraction <= 5 && resSubstraction >= 0) {
							writer1.println(intervention + " may very slightly increase the chance of experiencing  the outcome, but, there is no clear difference between people given " + interventionLowercase + " and those receiving " + control+ ". These findings are based on data of low quality.");
						} else if (xLow == true && resSubstraction >= (-5)) {
							writer1.println(intervention + " may very slightly reduce the chance of experiencing the outcome but there is no clear difference between people given " + interventionLowercase + " and those receiving " + control + ". These findings are based on data of low quality.");
						} else if (xModerate == true && resSubstraction <= 5 && resSubstraction >= 0) {
							writer1.println(intervention + " probably causes little or no increase to the chance of experiencing the outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear. Data supporting this finding are based on moderate quality evidence.");
						} else if (xModerate == true && resSubstraction >= (-5)) {
							writer1.println(intervention + " probably causes little or no reduction to the chance of experiencing the outcome, but the difference between people given " + interventionLowercase + " and those receiving " + control+ " is not clear. Data supporting this finding are based on moderate quality evidence.");
						} 
						
						else {
							writer1.println("Can't find evidence level");
						}
						}
					
					
					/*if (tma < 1 && language =="eng" && signif == true) {
						
						writer1.print("Studies investigating this topic found  "+ r2String + "%  of those given " 
								+ intervention +  " experienced the outcome compared with " + r1String + "% receiving " + control + ". This clear difference " + evX); 
					
					} else if (tma < 1 && language =="eng" && signif == false) {
						
						writer1.print("Studies investigating this topic found  "+ r2String + "%  of those given " 
								+ intervention +  " experienced the outcome compared with " + r1String + "% receiving " + control + ". This  unclear difference " + evX); 
					
					} else if (tma > 1 && language =="eng" && signif == true) {
						
						writer1.print("Studies investigating this topic found  "+ r2String + "%  of those given " 
								+ intervention +  " experienced the outcome compared with " + r1String + "% receiving " + control + ". This clear difference " + evX);  
					
					} else if (tma > 1 && language =="eng" && signif == false) {
						
						writer1.print("Studies investigating this topic found  "+ r2String + "%  of those given " 
								+ intervention +  " experienced the outcome compared with " + r1String + "% receiving " + control + ". This  unclear difference " + evX);
					
					} else if (tma == 1 && language =="eng" && signif == true) {
						
						writer1.print("Studies investigating this topic found  "+ r2String + "%  of those given " 
								+ intervention +  " experienced the outcome compared with " + r1String + "% receiving " + control + ". This clear difference " + evX); 
					
					} else if (tma == 1 && language =="eng" && signif == false) {
						
						writer1.print("Studies investigating this topic found  "+ r2String + "%  of those given " 
								+ intervention +  " experienced the outcome compared with " + r1String + "% receiving " + control + ". This  unclear difference " + evX);
					
					} else if (tma < 1 && language =="ger") {
					writer1.print(tmAString + "% der Patienten erlebten das gemessene Outcome. " + evX); 
					} else if (tma > 1 && language =="ger") {
					writer1.print("Das relative Risiko das gemessene Outcome zu erleben war  " + tmBString + "% geringer in der Interventionsgruppe. " + evX);
					}*/
					 
					writer1.flush(); 
					    //writes the writer.-lines into the string used in Main function 
					resultingVal = out1.toString();
				 
			} else {
				//calcMD
				//extracts data which is needed
				x1r1c3 = x1r1c3.replace("MD ", "");
				x1r1c3 = x1r1c3.replace("higher", "");
				x1r1c3 = x1r1c3.replace("lower", "");
				x1r1c3 = x1r1c3.replace(")", ":");
				x1r1c3 = x1r1c3.replace("(", ":") ; 				// Creates ":" regex for splitting
				String[] parts = x1r1c3.split(":");
				//splits lower and higher end of CI so that these can be analysed for statistical significance. 
				String MD = parts[1];
				String[] CI = MD.split(" to ");
				String CIlow = CI[0];
				String CIhigh = CI[1];
				CIlowDb = Double.parseDouble(CIlow);
				CIhighDb = Double.parseDouble(CIhigh);
				if (CIlowDb < 0 && CIhighDb < 0 || CIlowDb > 0 && CIhighDb > 0) {
					signif = true;
				}
				points = Double.parseDouble(parts[0]);
				
				StringWriter out1 = new StringWriter();			//creates new string- and printWriters to flush output into the return-statement and therefore into the String used in main
				PrintWriter writer1 = new PrintWriter(out1);
				
				
				//english version
				if (language =="eng" && signif == true) {
					
					writer1.print("For people given " + intervention + " the outcome was " + points + " compared to those given " 
					+ control + ". There was a clear difference between the two groups " + evX);
					
				} else if (language =="eng" && signif == false) {
					
					writer1.print("For people given " + intervention + " the outcome was " + points + " compared to those given " 
					+ control + ". There was no clear difference between the two groups " + evX);
					
				//} else if (tma > 1 && language =="eng" && signif == true) {
					
					//writer1.print(r1String + "% of people given " + control + " experienced the measured outcome, compared with " + r2String + "%  of those given " 
					//+ intervention + ". The relative risk of experiencing the measured outcome was found to be " + tmBString + "% less in intervention group. There was a clear difference between the two groups " + evX);
				
				//} else if (tma > 1 && language =="eng" && signif == false) {
					
					//writer1.print(r1String + "% of people given " + control + " experienced the measured outcome, compared with " + r2String + "%  of those given " 
					//+ intervention + ". The relative risk of experiencing the measured outcome was found to be " + tmBString + "% less in intervention group. There was no clear difference between the two groups " + evX);
				
				//} else if (tma == 1 && language =="eng" && signif == true) {
					
					//writer1.print(r1String + "% of people given " + control + " experienced the measured outcome, compared with " + r2String + "%  of those given " 
					//+ intervention + ". The relative risk of experiencing the measured outcome was found to be the same in both groups. There was a clear difference between the two groups " + evX);
				
				//} else if (tma == 1 && language =="eng" && signif == false) {
					
					//writer1.print(r1String + "% of people given " + control + " experienced the measured outcome, compared with " + r2String + "%  of those given " 
					//+ intervention + ". The relative risk of experiencing the measured outcome was found to be the same in both groups. " + evX);
				
				//} else if (tma < 1 && language =="ger") {
				//writer1.print(tmAString + "% der Patienten erlebten das gemessene Outcome. " + evX); 
				//} else if (tma > 1 && language =="ger") {
			//	writer1.print("Das relative Risiko das gemessene Outcome zu erleben war  " + tmBString + "% geringer in der Interventionsgruppe. " + evX);
				}
				 
				writer1.flush(); 
				    //writes the writer.-lines into the string used in Main function 
				resultingVal = out1.toString();
			}
			
			return resultingVal.toString();
			
		} catch (NumberFormatException e) {
			return "Findings in words not available";
	}
}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//this method uses the title of the SOF to extract the description of the intervention and of the control
	public String writeInt(String tblName, int ind, Element tbl1Element) {
		
		//gets names of intervention and control measures that are compared in the SoF, splits them apart by using keywords and crops control measure (if control measure is wanted by main function)
		// in the first if-blocks the sequence"Summary of findings" is removed to create a focus on the remaining description of control/intervention. However sometimes control and intervention
		//are not defined in the title, this is handled by first trying to get them from a different path and secondly by just filling the s String with general words. 
			try {
				String s = "";

				try {
					if (tblName.contains("versus")) {
						String[] tblNameArray = tblName.split(" versus ");
						s = tblNameArray[ind];
						try {
							s = s.replaceAll("[0-9]", "");
							//in some rare cases the name of the table contains the String " Summary of findings" and even some numbers. In this case the following solution is approached. 
							String[] splitArray = s.split("Summary of findings");
							s = splitArray[1];
							s= s.replace(".", "");
						} catch (Exception e) {
						}
					} else if (tblName.contains("compared to")) {
						String[] tblNameArray = tblName.split(" compared to ");
						s = tblNameArray[ind];
						try {
							s = s.replaceAll("[0-9]", "");
							String[] splitArray = s.split("Summary of findings");
							s = splitArray[1];
							s= s.replace(".", "");
						} catch (Exception e) {
						}
					} else if (tblName.contains("compared with")) {
						String[] tblNameArray = tblName.split(" compared with ");
						s = tblNameArray[ind];
						try {
							s = s.replaceAll("[0-9]", "");
							String[] splitArray = s.split("Summary of findings");
							s = splitArray[1];
							s= s.replace(".", "");
						} catch (Exception e) {
						}
						
					} else {
							NodeList altList = tbl1Element.getElementsByTagName("TR");
							Node altNode = altList.item(1);
							Element altElement = (Element) altNode;
							
							NodeList pList = altElement.getElementsByTagName("P");
							Node pNode = pList.item(2);
							Element intervElement = (Element) pNode;
							
						//	NodeList bList = intervElement.getElementsByTagName("B");
						//	Node bNode = bList.item(0);
						//	Element textElement = (Element) bNode;
							
							String intervention = intervElement.getTextContent();
							intervention = intervention.replace("\n", "");
							String[] intArray = intervention.split(":");
							intervention = intArray[1];
							if (ind == 0) {
								s = intervention;
							} else if (ind == 1) {
								s = " the control ";
							}
						}
					
				} catch (Exception eInt) {
				
						if (ind == 0) {
							s = " the intervention ";
						} else {
							s = " the control ";
						}
				} 

				

				s = s.toLowerCase();

				if (ind == 1) { //when main calls string for control the String can be too long, so frequent keywords are split away. POTENTIAL SOURCE OF ERRORS
					s = s.toLowerCase();

					if (s.contains("for schizophrenia")) {
						String[] controlArray = s.split(" for schizophrenia");
						s = controlArray[0];
					} else if (s.contains("(")) {
						String[] controlArray = tblName.split("\\(");
						s = controlArray[0];
					} else if (s.contains("for psychosis")) {
						String[] controlArray = s.split(" for psychosis");
						s = controlArray[0];
					} else if (s.contains("for chronic")) {
						String[] controlArray = s.split(" for chronic ");
						s = controlArray[0];
					}

				}
				s = s.toLowerCase();
				return s.toString();
				
			} catch (Exception e) {
				return "";
			}
	
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//This method is used to decide which Strings are used for the writeRR() depending on table Layout. If the calculations fail 
	// because of any reason this method deals with it in the catch brackets. Thats the case if an MD is encountered. In this case it tries to fill the findings in words when no data are encountered. This method is called in ContentClass 
	public String writeFindings(boolean x6, boolean x4, boolean x2, boolean x3,  
		   String x1r1c3, String x1r1c1, String x1r1c2, 
		   String x1r1c1a, String x1r3c1b, String x1r5c1c, String x1r1c2a, 
		   String x1r2c1, String x1r2c2, String x1r4c1, String x1r4c2, String x1r6c1, String x1r6c2,
		   String x1r1c6, 
		   String language, String evX, String intervention, String control, boolean xHigh, boolean xModerate, boolean xLow, boolean xVeryLow) {
		
		CalcWords calc = new CalcWords();
		String x1words = "x1words";
		try {
			if (x6 == true ){
				if (x1r3c1b.contains("Medium") || x1r3c1b.contains("medium") || x1r3c1b.contains("Moderate") || x1r3c1b.contains("moderate")) {
					x1words = calc.writeRR(x1r1c2a, language, evX, x1r4c1, x1r4c2, intervention, control, xHigh, xModerate, xLow, xVeryLow);
				} else if (x1r1c1a.contains("Medium") || x1r1c1a.contains("medium") || x1r1c1a.contains("Moderate") || x1r1c1a.contains("moderate")) {
					x1words = calc.writeRR(x1r1c2a, language, evX, x1r2c1, x1r2c2, intervention, control, xHigh, xModerate, xLow, xVeryLow);
				} else if (x1r5c1c.contains("Medium") || x1r5c1c.contains("medium") || x1r5c1c.contains("Moderate") || x1r5c1c.contains("moderate")) {
					x1words = calc.writeRR(x1r1c2a, language, evX, x1r6c1, x1r6c2, intervention, control, xHigh, xModerate, xLow, xVeryLow);
				} else {
					x1words = calc.writeRR(x1r1c2a, language, evX, x1r4c1, x1r4c2, intervention, control, xHigh, xModerate, xLow, xVeryLow);
				}
					
			} else if (x4 == true) {
				if (x1r3c1b.contains("Medium") || x1r3c1b.contains("medium") || x1r3c1b.contains("Moderate") || x1r3c1b.contains("moderate")) {
					x1words = calc.writeRR(x1r1c2a, language, evX, x1r4c1, x1r4c2, intervention, control, xHigh, xModerate, xLow, xVeryLow);
				} else if (x1r1c1a.contains("Medium") || x1r1c1a.contains("medium") || x1r1c1a.contains("Moderate") || x1r1c1a.contains("moderate")) {
					x1words = calc.writeRR(x1r1c2a, language, evX, x1r2c1, x1r2c2, intervention, control, xHigh, xModerate, xLow, xVeryLow);
				} else {
					x1words = calc.writeRR(x1r1c2a, language, evX, x1r4c1, x1r4c2, intervention, control, xHigh, xModerate, xLow, xVeryLow);
				}
				
			} else if (x2 == true) {
				x1words = calc.writeRR(x1r1c2a, language, evX, x1r2c1, x1r2c2, intervention, control, xHigh, xModerate, xLow, xVeryLow);
			} else if (x3 == true && x1r1c3.contains("RR")) {
				x1words = calc.writeRR(x1r1c2a, language, evX, x1r4c1, x1r4c2, intervention, control, xHigh, xModerate, xLow, xVeryLow);
			} else {
				x1words = calc.writeRR(x1r1c3, language, evX, x1r1c1, x1r1c2, intervention, control, xHigh, xModerate, xLow, xVeryLow);
			}
			
			return x1words.toString();
		} catch (Exception e) {
			try {
				
				if (x1r1c1.contains("omment") || (x1r1c2.contains("omment"))) {
					//x1words ="Comment: " + x1r1c6;
					//x1words = "For this outcome there is no evidence based data suggesting that " + intervention + " is better than " + control + ".";
					x1words = "the outcome was not measured/reported in the included studies.";
					x1words = x1words.substring(0, 1).toUpperCase() + x1words.substring(1);
					
				} else if (x1r1c1.contains("omment") || (x1r1c2.contains("omment"))) {
					//x1words ="Comment: " + x1r1c6 + " (Intervention: " + x1r1c2 + "; Control: " + x1r1c1 + ")";
				}
				else if (x1r1c1==null || x1r1c1.isEmpty()) {
					x1words = x1r1c2;
					
					
				} else if (x1r1c2==null || x1r1c2.isEmpty()) {
					x1words =  x1r1c1;
				} else {
					intervention = intervention.substring(0, 1).toUpperCase() + intervention.substring(1);
					control = control.substring(0, 1).toUpperCase() + control.substring(1);
					if (x1r1c1.contentEquals("Study population")) {
						x1r1c1 = x1r1c1.trim();
						//x1r1c1 = "See comment";
						x1words =  "This outcome was not measured/ reported in the included studies"; //+ ". Comment: " + x1r1c6;
						
					} else {
						x1r1c1 = x1r1c1.trim();
						//x1words = "Intervention: " + x1r1c2 + ". Control: " + x1r1c1 + ".";
						x1words = intervention + ": " + x1r1c2 + ". " + control + ": " + x1r1c1 + ". In day-to-day care the meaning of this is not clear."; //+ ". Comment: " + x1r1c6;
						
					}
					
				}
				
				
			} catch (Exception e2) {
				x1words = "Not generated successfully";
			}
			
			return x1words.toString();
		}
	}
	
}
