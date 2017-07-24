import java.io.PrintWriter;
import java.io.StringWriter;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//// This gives an homogeneous look to the evidence levels. The first letter is capitalised.
public class GetLang {
	
	public String changeEv(String x1r1cx) {
		try {
			x1r1cx = x1r1cx.toLowerCase();
			x1r1cx = x1r1cx.substring(0, 1).toUpperCase() + x1r1cx.substring(1);
			if (x1r1cx.contentEquals("Verylow")){
				x1r1cx = "Very low";
			}
			return x1r1cx.toString();
		} catch (Exception e) {
			return x1r1cx.toString();
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////checks boolean to see which string has to be used to extract the quality of evidence of this finding. Shortens the process by representing all other boolean that were given as input
	
	public String writeEv(boolean x6, boolean x4, boolean x3, boolean x2, String x1r1c5, String x1r1c4a, String language) {
		
		boolean x = false; 
		if (x6 == true || x4 == true || x2 == true || x3 == true) {
			x = true;
		}
		
		try {
			
			StringWriter out1 = new StringWriter();					//creates new string- and printWriters to flush output into the return-statement and therefore into the String used in main
			PrintWriter writer1 = new PrintWriter(out1);
			
			x1r1c5 = x1r1c5.toLowerCase();
			x1r1c4a = x1r1c4a.toLowerCase();
			if (language == "eng" && x == true) {
				
				if (x1r1c4a.contains("very low")) {
				
					writer1.print("is based on data of very low certainty.");
				
				} else if (x1r1c4a.contains("verylow")) {
				
					writer1.print("is based on data of very certainty.");
				
				} else if (x1r1c4a.contains("low")) {
				
					writer1.print("is based on data of low certainty.");
				
				} else if (x1r1c4a.contains("moderate")) {
				
					writer1.print("is based on data of moderate certainty.");
			
				} else if (x1r1c4a.contains("high")) {
				
					writer1.print("is based on data of high certainty.");
			
				} else {
				
					writer1.print("is based on data of " + x1r1c4a + x1r1c5 + " certainty.");
			
				}
				
				
			} else if (language == "eng") {
				
				if (x1r1c5.contains("very low")) {
				
					writer1.print("is based on data of very low certainty.");
				
				} else if (x1r1c5.contains("verylow")) {
				
					writer1.print("is based on data of very low certainty.");
				
				} else if (x1r1c5.contains("low")) {
				
					writer1.print("is based on data of low certainty.");
				
				} else if (x1r1c5.contains("moderate")) {
				
					writer1.print("is based on data of moderate certainty.");
			
				} else if (x1r1c5.contains("high")) {
				
					writer1.print("is based on data of high certainty.");
			
				} else {
				
					writer1.print("is based on data of " + x1r1c5 + " certainty.");
			
				}
			}
			
			if (language == "ger") { //ADD BOOLEAN STUFF FOR TRANSLATION plus the x1r1c4 field-if statement
				
				if (x1r1c5.contains("very low")) {
				
					writer1.print("Dieses Ergebnis basiert auf Daten mit sehr niedriger Evidenz. ");
				
				} else if (x1r1c5.contains("low")) {
				
					writer1.print("Dieses Ergebnis basiert auf Daten mit niedriger Evidenz. ");
				
				} else if (x1r1c5.contains("moderate")) {
				
					writer1.print("Dieses Ergebnis basiert auf Daten mit moderater Evidenz. ");
			
				} else if (x1r1c5.contains("high")) {
				
					writer1.print("Dieses Ergebnis basiert auf Daten mit hoher Evidenz. ");
			
				} else {
				
					writer1.print("Dieses Ergebnis basiert auf daten mit " + x1r1c5 + " Evidenz.");
			
				}
			}
			
			writer1.flush();
			
			return out1.toString();
		} catch (Exception ev) {
			return "";
		}
	
	
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//to get evidence level to work with
public boolean[] getBoolean(String x1r1c4a, String x1r1c5) {
	
	boolean xVeryLow = false;
	boolean xLow = false;
	boolean xModerate = false;
	boolean xHigh = false;
	boolean xNA = false;
	
	try {
		
		
		if (x1r1c4a.contains("Very low") || x1r1c5.contains("Very low")) {
			xVeryLow = true;
		} else if (x1r1c4a.contains("Low") || x1r1c5.contains("Low")) {
			xLow = true;
		} else if (x1r1c4a.contains("Moderate") || x1r1c5.contains("Moderate")) {
			xModerate = true;
		} else if (x1r1c4a.contains("High") || x1r1c5.contains("High")) {
			xHigh = true;
		} else {
			xNA = true;
		}
		
		return new boolean[] { xVeryLow, xLow, xModerate, xHigh, xNA }; 
	} catch (Exception e) {
		xNA = true;
		return new boolean[] { xVeryLow, xLow, xModerate, xHigh, xNA };
	}
}

}
