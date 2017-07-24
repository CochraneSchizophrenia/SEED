import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MDClass {
	public String regexChecker(String Pflichtstring, String vollText)
	{
	try {
		StringWriter out1 = new StringWriter();			//creates new string- and printWriters to flush output into the return-statement and therefore into the String used somewhere else
		PrintWriter writer1 = new PrintWriter(out1);
		Pattern checkRegex = Pattern.compile(Pflichtstring);

		Matcher regexMatcher = checkRegex.matcher(vollText);
		
		while(regexMatcher.find())
		{

			
		writer1.println(regexMatcher.group().trim());
		writer1.flush(); 
	    //writes the writer.-lines into the string used 
		}
		return out1.toString();
	} catch (Exception e) {
		return vollText.toString();
	} 
	}
	
	
	
	public String regexChecker2(String Pflichtstring, String vollText)
	{
	try {
		StringWriter out1 = new StringWriter();			//creates new string- and printWriters to flush output into the return-statement and therefore into the String used somewhere else
		PrintWriter writer1 = new PrintWriter(out1);
		Pattern checkRegex2 = Pattern.compile(Pflichtstring);

		Matcher regexMatcher2 = checkRegex2.matcher(vollText);
		while(regexMatcher2.find())
		{


		writer1.println(regexMatcher2.group().trim());
		}
		writer1.flush(); 
	    //writes the writer.-lines into the string used
		return out1.toString();
	} catch (Exception e) {
		return vollText.toString();
	} 
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////for acupuncture example
	public String regexChecker3Acup(String Pflichtstring, String vollText) {
	try {
		StringWriter out1 = new StringWriter();			//creates new string- and printWriters to flush output into the return-statement and therefore into the String used somewhere else
		PrintWriter writer1 = new PrintWriter(out1);
		Pattern checkRegex3 = Pattern.compile(Pflichtstring);

		Matcher regexMatcher3 = checkRegex3.matcher(vollText);
		while(regexMatcher3.find())
		{

		writer1.println(regexMatcher3.group().trim());
		}
		writer1.flush(); 
		return out1.toString();
	} catch (Exception e) {
		return vollText.toString();
	} 
	
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////also for acupuncture
	public String regexCheckerAcup(String Pflichtstring, String vollText)
	{
	try {
		StringWriter out1 = new StringWriter();			//creates new string- and printWriters to flush output into the return-statement and therefore into the String used somewhere else
		PrintWriter writer1 = new PrintWriter(out1);
		Pattern checkRegex = Pattern.compile(Pflichtstring);

		Matcher regexMatcher = checkRegex.matcher(vollText);
		while(regexMatcher.find())
		{


			writer1.println(regexMatcher.group().trim());
		}
		writer1.flush();
		return out1.toString();
	} catch (Exception e) {
		return vollText.toString();
	} 
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////for scales
	
	public String scaleMD(String d1r1c2a, String d1words) {
	
	MDClass mdRegex = new MDClass();
	try {
		try {
			String mdScore = "";
			d1r1c2a = mdRegex.regexChecker2("(\\d+.\\d+\\s\\w+\\sto\\s\\d+.\\d+\\s\\w+)", d1words);
			mdScore = mdRegex.regexChecker("(\\d+.\\d+\\s(higher|lower)\\()", d1words);
			mdScore = mdScore.replace("\n", "");
			mdScore = mdScore.trim();
			System.out.println("md" + mdScore);
			d1r1c2a = mdScore + d1r1c2a;
			d1r1c2a = d1r1c2a.trim();
			d1r1c2a = d1r1c2a.replace("\n", "");
			d1r1c2a = "[[Mean absolute difference|MD]] " + d1r1c2a + ")";
		} catch (Exception e) {
			String mdScore = "";
			d1r1c2a = mdRegex.regexChecker("(\\d+.\\d+\\s\\w+\\s\\d+.\\d+\\s\\w+)", d1words);
			mdScore = mdRegex.regexChecker2("(\\d+\\d+\\slower\\()", d1words);
			mdScore = mdScore.replace("\n", "");
			mdScore = mdScore.trim();

			d1r1c2a = mdScore + d1r1c2a;
			d1r1c2a = d1r1c2a.trim();
			d1r1c2a = d1r1c2a.replace("\n", "");
			d1r1c2a = "[[Mean absolute difference|MD]] " + d1r1c2a + ")";
		}
		
		
		
		return d1r1c2a.toString();
		
		
	} catch (Exception e) {
		return d1r1c2a.toString();
	}
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////for scales

public String scaleMDacup(String d1r1c2a, String d1words) {

MDClass mdRegex = new MDClass();
try {
String mdScore = "";
d1r1c2a = mdRegex.regexChecker("(\\d+.\\d+\\s\\w+\\s\\d+.\\d+\\s\\w+)", d1words);
mdScore = mdRegex.regexChecker2("(\\d+\\d+\\slower\\()", d1words);
mdScore = mdScore.replace("\n", "");
mdScore = mdScore.trim();

d1r1c2a = mdScore + d1r1c2a;
d1r1c2a = d1r1c2a.trim();
d1r1c2a = d1r1c2a.replace("\n", "");
d1r1c2a = "[[Mean absolute difference|MD]] " + d1r1c2a + ")";



	try {
		int z = d1r1c2a.length();
		for(int y = 0; y < z; y++){
		 if(Character.isLowerCase(d1r1c2a.charAt(y)) && Character.isMirrored(d1r1c2a.charAt(y + 1))) {
			 d1r1c2a = new StringBuffer(d1r1c2a).insert(y + 1, " ").toString();
			 
		 }
		 }
	} catch (Exception e) {
		
	}
	
return d1r1c2a.toString();

} catch (Exception e) {
return d1r1c2a.toString();
}
}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////for fixing lowercase letter that is directly followed by number
	public String forLowercase(String x1words) {
		
		try {
			int z = x1words.length();
			for(int y = 0; y < z; y++){
			 if(Character.isLowerCase(x1words.charAt(y)) && Character.isDigit(x1words.charAt(y + 1))) {
				   x1words = new StringBuffer(x1words).insert(y + 1, " ").toString();
			 }
			 }
			return x1words.toString();
		} catch (Exception e) {
			return x1words.toString();
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//for findings in words and using the fellow methods of this class
	public String[] makeMD(String a1words, String a1r1c2a, String a1r1c3, boolean aVeryLow, 
			String b1words, String b1r1c2a, String b1r1c3, boolean bVeryLow, 
			String c1words, String c1r1c2a, String c1r1c3, boolean cVeryLow, 
			String d1words, String d1r1c2a, String d1r1c3, boolean dVeryLow, 
			String e1words, String e1r1c2a, String e1r1c3, boolean eVeryLow, 
			String f1words, String f1r1c2a, String f1r1c3, boolean fVeryLow, 
			String g1words, String g1r1c2a, String g1r1c3, boolean gVeryLow, String intervention) {
		
		MDClass mdRegex = new MDClass();
		
		try {
			if (a1words.contains("SWN") || a1words.contains("PANSS") || a1words.contains("QLS") || a1words.contains("BPRS") || a1words.contains("PercQol") || a1words.contains("SANS") || a1words.contains("LUNSERS") || a1words.contains("HAMD") || a1words.contains("scale") || a1words.contains("Scale") || a1words.contains("score") || a1words.contains("GAF")) {
				a1r1c2a = mdRegex.scaleMD(a1r1c2a, a1words);
				a1r1c3 = mdRegex.scaleMD(a1r1c3, a1words);

				

				}

				if (b1words.contains("SWN") || b1words.contains("PANSS") || b1words.contains("QLS") || b1words.contains("BPRS") || b1words.contains("PercQol") || b1words.contains("SANS") || b1words.contains("LUNSERS") || b1words.contains("HAMD") || b1words.contains("scale") || b1words.contains("Scale") || b1words.contains("score") || b1words.contains("GAF")) {

				b1r1c2a = mdRegex.scaleMD(b1r1c2a, b1words);
				b1r1c3 = mdRegex.scaleMD(b1r1c3, b1words);

				

				}

				if (c1words.contains("SWN") || c1words.contains("PANSS") || c1words.contains("QLS") || c1words.contains("BPRS") || c1words.contains("PercQol") || c1words.contains("SANS") || c1words.contains("LUNSERS") || c1words.contains("HAMD") || c1words.contains("scale") || c1words.contains("Scale") || c1words.contains("score") || c1words.contains("GAF")) {

				c1r1c2a = mdRegex.scaleMD(c1r1c2a, c1words);
				c1r1c3 = mdRegex.scaleMD(c1r1c3, c1words);

				

				}

				if (d1words.contains("SWN") || d1words.contains("PANSS") || d1words.contains("QLS") || d1words.contains("BPRS") || d1words.contains("PercQol") || d1words.contains("SANS") || d1words.contains("LUNSERS") || d1words.contains("HAMD") || d1words.contains("scale") || d1words.contains("Scale") || d1words.contains("score") || d1words.contains("GAF")) {

				d1r1c2a = mdRegex.scaleMD(d1r1c2a, d1words);
				d1r1c3 = mdRegex.scaleMD(d1r1c3, d1words);

				

				}

				if (e1words.contains("SWN") || e1words.contains("PANSS") || e1words.contains("QLS") || e1words.contains("BPRS") || e1words.contains("PercQol") || e1words.contains("SANS") || e1words.contains("LUNSERS") || e1words.contains("HAMD") || e1words.contains("scale") || e1words.contains("Scale") || e1words.contains("score") || e1words.contains("GAF")) {

				e1r1c2a = mdRegex.scaleMD(e1r1c2a, e1words);
				e1r1c3 = mdRegex.scaleMD(e1r1c3, e1words);

				

				}

				if (f1words.contains("SWN") || f1words.contains("PANSS") || f1words.contains("QLS") || f1words.contains("BPRS") || f1words.contains("PercQol") || f1words.contains("SANS") || f1words.contains("LUNSERS") || f1words.contains("HAMD") || f1words.contains("scale") || f1words.contains("Scale") || f1words.contains("score") || f1words.contains("GAF")) {

				f1r1c2a = mdRegex.scaleMD(f1r1c2a, f1words);
				f1r1c3 = mdRegex.scaleMD(f1r1c3, f1words);

				

				}

				if (g1words.contains("SWN") || g1words.contains("PANSS")|| g1words.contains("QLS") || g1words.contains("BPRS") || g1words.contains("PercQol") || g1words.contains("SANS") || g1words.contains("LUNSERS") || g1words.contains("HAMD") || g1words.contains("scale") || g1words.contains("Scale") || g1words.contains("score") || g1words.contains("GAF")) {

				g1r1c2a = mdRegex.scaleMD(g1r1c2a, g1words);
				g1r1c3 = mdRegex.scaleMD(g1r1c3, g1words);
				

				}
			return new String[] {a1words, b1words, c1words, d1words, e1words, f1words, g1words, a1r1c2a, b1r1c2a, c1r1c2a, d1r1c2a, e1r1c2a, f1r1c2a, g1r1c2a, a1r1c3, b1r1c3, c1r1c3, d1r1c3, e1r1c3, f1r1c3, g1r1c3};
		} catch (Exception e) {
			return new String[] {a1words, b1words, c1words, d1words, e1words, f1words, g1words, a1r1c2a, b1r1c2a, c1r1c2a, d1r1c2a, e1r1c2a, f1r1c2a, g1r1c2a, a1r1c3, b1r1c3, c1r1c3, d1r1c3, e1r1c3, f1r1c3, g1r1c3};
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//creates new findings in words in case a scale is encountered
	
	public String newMDwords(String d1words, String d1r1c3, String intervention, String control) {
		
		boolean signif = false;
		
			try {
				if (d1words.contains("In day-to-day care the meaning of this is not clear.") || d1words.contains("score")) {
					//takes away unnecessary information 
					d1r1c3 = d1r1c3.replace(" lower", "-");
					d1r1c3 = d1r1c3.replaceAll("[^0-9\\s-?!\\.]", " ");
					d1r1c3 = d1r1c3.replaceAll("\\s{2,}", " ").trim();
					String[] mDnumbers = d1r1c3.split("\\s");
					//String is fed into method that returns doubles to work with. in case the original string said x lower it becomes -x.
					String MD = mDnumbers[0];
					MDClass mdObject = new MDClass();
					double mdDouble = mdObject.parseDoubles(MD);
					String CI1 = mDnumbers[1];
					double ciLowerDouble = mdObject.parseDoubles(CI1);
					String CI2 = mDnumbers[2];
					//statistical significance is tested
					double ciHigherDouble = mdObject.parseDoubles(CI2);
					if (ciLowerDouble < 0 && ciHigherDouble < 0 || ciLowerDouble > 0 && ciHigherDouble > 0) {
						signif = true;
					}
					//Takes minus away so that the MD value can be used in the resulting string. 
					MD = MD.replace("-", "");
					
					//The findings in words string is filled with proper content
					if (mdDouble > 0 && signif == true) {
						d1words = "On average, people receiving " + intervention + " scored " + MD
								+ " higher than people treated with " + control
								+ ". There was a clear difference between the groups, but, at present the meaning of this in day-to-day care is unclear.";
					} else if (mdDouble < 0 && signif == true) {
						d1words = "On average, people receiving " + intervention + " scored " + MD
								+ " lower than people treated with " + control
								+ ". There was a clear difference between the groups, but, at present the meaning of this in day-to-day care is unclear.";
					} else if (mdDouble < 0 && signif == false) {
						d1words = "On average, people receiving " + intervention + " scored " + MD
								+ " lower than people treated with " + control
								+ ". There was no clear difference between the groups. The meaning of this in day-to-day care is unclear.";
					} else if (mdDouble > 0 && signif == false) {
						d1words =  "On average, people receiving " + intervention + " scored " + MD
								+ " higher than people treated with " + control
								+ ". There was no clear difference between the groups, and, at present the meaning of this in day-to-day care is unclear.";
					} else if (mdDouble == 0 && signif == false) {
						d1words = "On average, people receiving " + intervention + " scored the same as people treated with " + control
								+ ". There was no clear difference between the groups. The meaning of this in day-to-day care is unclear.";
					} else if (mdDouble == 0 && signif == true) {
						d1words = "On average, people receiving " + intervention + " scored the same as people treated with " + control
								+ ". Findings are statistically significant. The meaning of this in day-to-day care is unclear.";
					} 
				}
				
				return d1words.toString();
			} catch (Exception e) {
				d1r1c3 = d1r1c3.replace("In day-to-day care the meaning of this is not clear.", "");
				return d1words.toString();
			}
		
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////to parse doubles and if needed it puts the mins in the right place
	public double parseDoubles(String CIString){
		if (CIString.contains("-")){
			CIString = CIString.replace("-", "");
			CIString = "-" + CIString;
		}
		double doub = Double.parseDouble(CIString);
		return doub;
	}
}
