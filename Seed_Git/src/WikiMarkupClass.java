import java.io.PrintWriter;
import java.io.StringWriter;

import org.omg.CORBA.PUBLIC_MEMBER;

public class WikiMarkupClass {
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//This method is called from contentClass and wraps the evidence grade contained in the String into wiki mark-up that links to an explanation of evidence grades.
	public String wikiLinkEvidence(String x1r1cx) {
		
		try {
			x1r1cx = x1r1cx
					.replace("Very low", "[[The Grading of Recommendations Assessment, Development and Evaluation (GRADE) approach|Very low]]")
					.replace("Moderate", "[[The Grading of Recommendations Assessment, Development and Evaluation (GRADE) approach|Moderate]]")
					.replace("High", "[[The Grading of Recommendations Assessment, Development and Evaluation (GRADE) approach|High]]");
					if (x1r1cx.equals("Low")) 
					{
						x1r1cx = "[[The Grading of Recommendations Assessment, Development and Evaluation (GRADE) approach|Low]]";
					}
			return x1r1cx.toString();
		} catch (Exception e) {
			return x1r1cx.toString();
		}
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//This method is called from contentClass and wraps the RR contained in the String into wiki mark-up that links to an explanation of RR.
	public String wikiLinkRR(String x1r1cx) {
		
		try {
			x1r1cx = x1r1cx.replace("RR", "[[Relative risk|RR]]");
			return x1r1cx.toString();
		} catch (Exception e) {
			return x1r1cx.toString();
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//this method is called from calcWords and reformats the field with results that are MDs
	public String mdFormat(String x1r1c2) {
		//The mean service outcomes: time in hospital (days) in the intervention groups was16 lower(19.54 to 12.46 lower)
		try {
			double CIlowDb;
			double CIhighDb;
			double points;
			boolean signif = false;
			
			x1r1c2 = x1r1c2.replace(")", ";");
			x1r1c2 = x1r1c2.replace("(", ";") ; 				// Creates ":" regex for splitting
			String[] parts = x1r1c2.split(";");
			//splits lower and higher end of CI so that these can be analysed for statistical significance. 
			String CIlow;
			String CIhigh;
			String description;
			try {
				description = parts[0];
				String MD = parts[1];
				String[] CI = MD.split(" to ");
				CIlow = CI[0];
				CIhigh = CI[1];
				CIlowDb = Double.parseDouble(CIlow);
				CIhighDb = Double.parseDouble(CIhigh);
				if (CIlowDb < 0 && CIhighDb < 0 || CIlowDb > 0 && CIhighDb > 0) {
					signif = true;
				}
				points = Double.parseDouble(parts[0]);
			} catch (Exception e) {
				description = parts[2];
				String MD = parts[3];
				String[] CI = MD.split(" to ");
				CIlow = CI[0];
				CIhigh = CI[1];
				CIlowDb = Double.parseDouble(CIlow);
				CIhighDb = Double.parseDouble(CIhigh);
				if (CIlowDb < 0 && CIhighDb < 0 || CIlowDb > 0 && CIhighDb > 0) {
					signif = true;
				}
				points = Double.parseDouble(parts[2]);
			}
			
			
			
			return x1r1c2.toString();
		} catch (Exception e) {
			return x1r1c2.toString();
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//This method wraps some outcomes with wiki mark-up that is linked with an explanatory wiki page
public String wikiLinkOutcome(String outcome) {
		
		try {
			String x = "";
			x = "Mental state"; 						if (x.equals(outcome)) {outcome = outcome.replace("Mental state", "[[Mental health|Mental state]]");}
			x = "Quality of life"; 						if (x.equals(outcome)) {outcome = outcome.replace("Quality of life", "[[Quality of life|Quality of life]]");}
			x = "Well-being and quality of life"; 		if (x.equals(outcome)) {outcome = outcome.replace("Well-being and quality of life", "[[Quality of life|Well-being and quality of life]]");}
			x = "Adverse event"; 						if (x.equals(outcome)) {outcome = outcome.replace("Adverse event", "[[Adverse event|Adverse event]]");}
			x = "Adverse events"; 						if (x.equals(outcome)) {outcome = outcome.replace("Adverse events", "[[Adverse event|Adverse events]]");}
			x = "Adverse effect"; 						if (x.equals(outcome)) {outcome = outcome.replace("Adverse effect", "[[Adverse event|Adverse effect]]");}
			x = "Adverse effects"; 						if (x.equals(outcome)) {outcome = outcome.replace("Adverse effects", "[[Adverse event|Adverse effects]]");}
			x = "Social outcomes"; 						if (x.equals(outcome)) {outcome = outcome.replace("Social skills", "[[Social skills|Social outcomes]]");}
			x = "Social functioning"; 					if (x.equals(outcome)) {outcome = outcome.replace("Social functioning", "[[Social skills|Social functioning]]");}
			x = "Satisfaction with care"; 				if (x.equals(outcome)) {outcome = outcome.replace("Satisfaction with care", "[[Patient satisfaction|Satisfaction with care]]");}
			x = "Satisfaction with treatment"; 			if (x.equals(outcome)) {outcome = outcome.replace("Satisfaction with treatment", "[[Patient satisfaction|Satisfaction with treatment]]");}
			x = "Satisfaction with mental health"; 		if (x.equals(outcome)) {outcome = outcome.replace("Satisfaction with mental health", "[[Patient satisfaction|Satisfaction with mental health]]");}
			x = "Patient level outcomes"; 				if (x.equals(outcome)) {outcome = outcome.replace("Patient level outcomes", "[[Patient satisfaction|Patient level outcomes]]");}
			x = "Patient satisfaction"; 				if (x.equals(outcome)) {outcome = outcome.replace("Patient satisfaction", "[[Patient satisfaction|Patient satisfaction]]");}
			x = "Economic outcomes"; 					if (x.equals(outcome)) {outcome = outcome.replace("Economic outcomes", "[[Cost-effectiveness analysis|Economic outcomes]]");}
			x = "Cost of care"; 						if (x.equals(outcome)) {outcome = outcome.replace("Cost of care", "[[Cost-effectiveness analysis|Cost of care]]");}
			x = "Positive symptoms"; 					if (x.equals(outcome)) {outcome = outcome.replace("Positive symptoms", "[[Schizophrenia#Positive and negative|Positive symptoms]]");}
			x = "Negative symptoms"; 					if (x.equals(outcome)) {outcome = outcome.replace("Negative symptoms", "[[Schizophrenia#Positive and negative|Negative symptoms]]");}
			x = "Relapse"; 								if (x.equals(outcome)) {outcome = outcome.replace("Relapse", "[[Relapse|Relapse]]");}
			x = "Desired Sedation"; 					if (x.equals(outcome)) {outcome = outcome.replace("Desired Sedation", "[[Sedation|Desired Sedation]]");}
			x = "Sedation"; 							if (x.equals(outcome)) {outcome = outcome.replace("Sedation", "[[Sedation|Sedation]]");}
			x = "Compliance with treatment"; 			if (x.equals(outcome)) {outcome = outcome.replace("Compliance with treatment", "[[Adherence (medicine)|Compliance with treatment]]");}
			x = "Compliance"; 							if (x.equals(outcome)) {outcome = outcome.replace("Compliance", "[[Adherence (medicine)|Compliance]]");}
			x = "Sexual function"; 						if (x.equals(outcome)) {outcome = outcome.replace("Sexual function", "[[Sexual function|Sexual function]]");}
			x = "Life skills"; 							if (x.equals(outcome)) {outcome = outcome.replace("Life skills", "[[Life skills|Life skills]]");}
			x = "General functioning"; 					if (x.equals(outcome)) {outcome = outcome.replace("General functioning", "[[Life skills|General functioning]]");}
			x = "General Functioning"; 					if (x.equals(outcome)) {outcome = outcome.replace("General Functioning", "[[Life skills|General Functioning]]");}
			x = "Cognitive function"; 					if (x.equals(outcome)) {outcome = outcome.replace("Cognitive function", "[[Cognition|Cognitive function]]");}
			x = "Cognitive state"; 						if (x.equals(outcome)) {outcome = outcome.replace("Cognitive state", "[[Cognition|Cognitive state]]");}
			
			return outcome.toString();
		} catch (Exception e) {
			return outcome.toString();
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//this method changes the x1words to add info about the outcome

public String wikiChangeAutoGeneration(String x1a, String x1words) {
	
	try {
		String x = "";
		x = "Global state"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state outcome");}
		x = "Global impression"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state outcome");}
		x = "Global"; 									if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state outcome");}
		x = "Clinical improvement in global state"; 	if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (clinical improvement) outcome");}
		x = "Clinical significant response"; 			if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (significant response) outcome");}
		x = "Clinical global response"; 				if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (significant response) outcome");}
		x = "Clinical efficacy"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (significant response) outcome");}
		x = "General clinical impression"; 				if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (significant response) outcome");}
		x = "No clinically important change"; 			if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (significant response) outcome");}
		x = "No clinically important"; 					if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (significant response) outcome");}
		x = "No clinical response"; 					if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (no clinical response) outcome");}
		x = "Response to treatment"; 					if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (Response to treatment) outcome");}
		x = "Acceptability of treatment"; 				if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (acceptability of treatment) outcome");}
		x = "Overall improvement"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (overall improvement) outcome");}
		x = "Mental state"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the mental state outcome");}
		x = "General mental state"; 					if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the mental state outcome");}
		x = "Leaving the study early"; 					if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the treatment outcome");}
		x = "Lost to treatment"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the treatment outcome");}
		x = "Quality of life"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the quality of life outcome");}
		x = "Well-being and quality of life"; 			if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the well-being and quality of life outcome");}
		x = "Adverse event"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the adverse effect or event outcome");}
		x = "Adverse events"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the adverse effect or event outcome");}
		x = "Adverse effect"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the adverse effect or event outcome");}
		x = "Adverse effects"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the adverse effect or event outcome");}
		x = "Service use and hospitalisation"; 			if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the outcomes to do with how much hospital/community care is used");}
		x = "Service utillsation"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the outcomes to do with how much hospital/community care is used");}
		x = "Service use"; 								if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the outcomes to do with how much hospital/community care is used");}
		x = "Service outcome"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the outcomes to do with how much hospital/community care is used");}
		x = "Health service"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the outcomes to do with how much hospital/community care is used");}
		x = "Hospital use"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the outcomes to do with how much hospital/community care is used");}
		x = "Hospital and service outcome"; 			if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the outcomes to do with how much hospital/community care is used");}
		x = "Not discharged from hospital"; 			if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the outcomes to do with how much hospital/community care is used");}
		x = "Social outcomes"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "functioning (in day-to-day life) outcome");}
		x = "Social functioning"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "functioning (in day-to-day life) outcome");}
		x = "Global assessment of functioning"; 		if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "functioning (global) outcome");}
		x = "Satisfaction with care"; 					if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the satisfaction with care outcome");}
		x = "Satisfaction with treatment"; 				if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the satisfaction with treatment outcome");}
		x = "Satisfaction with mental health"; 			if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the satisfaction with health outcome");}
		x = "Patient level outcomes"; 					if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the satisfaction outcome");}
		x = "Patient satisfaction"; 					if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the satisfaction outcome");}
		x = "Economic x1wordss"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the cost of care outcome");}
		x = "Cost of care"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the cost of care outcome");}
		x = "Positive symptoms"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the mental state (e.g. delusions, hallucinations) outcome");}
		x = "Negative symptoms"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the mental state (e.g. apathy, poor volition) outcome");}
		x = "Death"; 									if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the adverse event or effect (death) outcome");}
		x = "Relapse"; 									if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the global state (relapse) outcome");}
		x = "Behaviour"; 								if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the behaviour outcome");}
		x = "Desired Sedation"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the sedation outcome");}
		x = "Sedation"; 								if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the sedation");}
		x = "Compliance with treatment"; 				if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the adherence with treatment outcome");}
		x = "Compliance"; 								if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the adherence with treatment outcome");}
		x = "Attitudes to treatment"; 					if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the attitudes to treatment outcome");}
		x = "Days in community till 1st admission"; 	if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the time before admission outcome");}
		x = "Tranquillisation or asleep"; 				if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the tranquilisation or asleep outcome");}
		x = "Knowledge"; 								if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the knowledge outcome");}
		x = "Sexual function"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the functioning (sexual) outcome");}
		x = "Life skills"; 								if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the functioning (in day-to-day life) outcome");}
		x = "General functioning"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the functioning (in day-to-day life) outcome");}
		x = "General Functioning"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the functioning (in day-to-day life) outcome");}
		x = "Cognitive function"; 						if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the functioning (cognitive) outcome");}
		x = "Cognitive state"; 							if (x.equals(x1a)) {x1words = x1words.replace("the outcome", "the functioning (cognitive) outcome");}
		
		return x1words.toString();
	} catch (Exception e) {
		return x1words.toString();
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//This method creates the wikitable with the given Strings, it gets variables surrounded with wikimarkup and later flushes them into the string "results" using stringwriter and printwriter.

public String createTable(String tblName, String Author0, String Creator0, String Author1, String Creator1, String Creator2, String Author2, String title, String pubdate, String issue, String CDNo, 
		 String DIO, boolean endA, boolean endB, boolean endC, boolean endD, boolean endE, boolean endF, boolean endG,
		 String a1, String b1, String c1, String d1, String e1, String f1, String g1,
		 String a1a, String b1a, String c1a, String d1a, String e1a, String f1a, String g1a, 
		 String a1b, String b1b, String c1b, String d1b, String e1b, String f1b, String g1b,
		 String a1words, String b1words, String c1words, String d1words, String e1words, String f1words, String g1words, 
		 String a1r1c2a, String a1r1c4a, String b1r1c2a, String b1r1c4a, String c1r1c2a, String c1r1c4a, String d1r1c2a, String d1r1c4a, String e1r1c2a, String e1r1c4a, String f1r1c2a, String f1r1c4a, String g1r1c2a, String g1r1c4a, 
		 String a1r1c3, String a1r1c5, String b1r1c3, String b1r1c5, String c1r1c3, String c1r1c5, String d1r1c3, String d1r1c5, String e1r1c3, String e1r1c5, String f1r1c3, String f1r1c5, String g1r1c3, String g1r1c5, 
		 boolean one6, boolean one4, boolean one2, boolean two6, boolean two4, boolean two2, boolean three6, boolean three4, boolean three2, boolean four6, boolean four4, boolean four2, 
		 boolean five6, boolean five4, boolean five2, boolean five3, boolean six6, boolean six4, boolean six2, boolean seven6, boolean seven4, boolean seven2,
		 boolean bSkip, boolean cSkip, boolean dSkip, boolean eSkip, boolean fSkip, boolean gSkip, String result, String conclusions, String authorReference) {
	try {
		
		StringWriter out = new StringWriter();
		PrintWriter writer = new PrintWriter(out);

		//This is the citation. predefined wiki markup is combined with Strings SEED extracted from the review
		writer.println("{| class=\"wikitable\"");
		writer.println("|+ "+ tblName + "<ref name="+ authorReference + pubdate + ">{{cite journal|last1=" + Author0 + "| first1=" + Creator0 + "| last2=" + Author1 + 
					"|first2=" + Creator1 + "| first3=" + Creator2 + "| last3=" + Author2 + "|title=" + title + 
					"|journal=Cochrane Database of Systematic Reviews|date=" + pubdate + "|volume=" + issue + "|pages=" + CDNo + " |" + 
					"DOI=" + DIO + "}}</ref>");
		writer.println("|-");
		//the authors' conclusions as element of the table
		writer.println("! Summary");
		writer.println("|-");
		writer.println("| " + conclusions + "<ref name="+ authorReference + pubdate + "/>");
		writer.println("|-");
		writer.println("| style=\"padding:0;\" |");
		writer.println("{| class=\"wikitable collapsible collapsed\" style=\"width:100%;\"");
		writer.println("|-");
				
		//headings of columns
		writer.println("! scope=\"col\" style=\"text-align: left; | Outcome");
		writer.println("! scope=\"col\" style=\"text-align: left; | Findings in words");
		writer.println("! scope=\"col\" style=\"text-align: left; | Findings in numbers");
		writer.println("! scope=\"col\" style=\"text-align: left; | Quality of evidence");
		writer.println("|-");

		//The following blocks are the content. First SEED always checks if the footnotes are reached, this is represented by the endX booleans. If a true endX boolean is encountered the table will be ended.
		//Next the headings are inserted.    
				if (endA == false) {
					if (a1a == "") {
						writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + a1);
					} else {
						writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + a1a);
					}
					writer.println("|-");
					
		//Then it is checked whether there was a layout with more lines in the SoF(absolute numbers as 2,4 or 6 lines), in this case different Strings are used to fill the markup						
					if (one6 == true || one4 == true || one2 == true) {
						writer.println("| " + a1b + " || " + a1words + " || " + a1r1c2a + " || " + a1r1c4a + "");
						writer.println("|-");
					} else {
						writer.println("| " + a1b + " || " + a1words + " || " + a1r1c3 + " || " + a1r1c5 + "");
						writer.println("|-");
					}
				}
				
		//Same game as above with the next rows of outcomes.		
		if (endA == false && endB == false) {
				if (b1a == "") {
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + b1);
					writer.println("|-");
				} else if (bSkip == false) {
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + b1a);
					writer.println("|-");
				} 
				writer.println("|-");
				
				if (two6 == true || two4 == true || two2 == true) {
					writer.println("| " + b1b + " || " + b1words + " || " + b1r1c2a + " || " + b1r1c4a + "");
					writer.println("|-");
				} else {
					writer.println("| " + b1b + " || " + b1words + " || " + b1r1c3 + " || " + b1r1c5 + "");
					writer.println("|-");
				} 
		}


		if (endA == false && endB == false && endC == false) {
				if (c1a == "") {
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + c1);
					writer.println("|-");
				} else if (cSkip == false) {
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + c1a);
					writer.println("|-");
				}
				
				
				if (three6 == true || three4 == true || three2 == true) {
					writer.println("| " + c1b + " || " + c1words + " || " + c1r1c2a + " || " + c1r1c4a + "");
					writer.println("|-");
				} else {
					writer.println("| " + c1b + " || " + c1words + " || " + c1r1c3 + " || " + c1r1c5 + "");
					writer.println("|-");
				} 
				
		}


		if (endA == false && endB == false && endC == false && endD == false) {
				if (d1a == "") {
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + d1);
					writer.println("|-");
				} else if (dSkip == false){
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + d1a);
					writer.println("|-");
				}
				
				
				if (four6 == true || four4 == true || four2 == true) {
					writer.println("| " + d1b + " || " + d1words + " || " + d1r1c2a + " || " + d1r1c4a + "");
					writer.println("|-");
				} else {
					writer.println("| " + d1b + " || " + d1words + " || " + d1r1c3 + " || " + d1r1c5 + "");
					writer.println("|-");
				} 
		}


		if (endA == false && endB == false && endC == false && endD == false && endE == false) {
				if (e1a == "") {
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + e1);
					writer.println("|-");
				} else if (eSkip == false) {
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + e1a);
					writer.println("|-");
				}
				
				
				if (five6 == true || five4 == true || five2 == true || five3 == true) {
					writer.println("| " + e1b + " || " + e1words + " || " + e1r1c2a + " || " + e1r1c4a + "");
					writer.println("|-");
				} else {
					writer.println("| " + e1b + " || " + e1words + " || " + e1r1c3 + " || " + e1r1c5 + "");
					writer.println("|-");
				} 
		}


		if (endA == false && endB == false && endC == false && endD == false && endE == false && endF == false) {
				if (f1a == "") {
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + f1);
					writer.println("|-");
				} else if (fSkip == false) {
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + f1a);
					writer.println("|-");
				}
				
				
				if (six6 == true || six4 == true || six2 == true) {
					writer.println("| " + f1b + " || " + f1words + " || " + f1r1c2a + " || " + f1r1c4a + "");
					writer.println("|-");
				} else {
					writer.println("| " + f1b + " || " + f1words + " || " + f1r1c3 + " || " + f1r1c5 + "");
					writer.println("|-");
				} 
		}


		if (endA == false && endB == false && endC == false && endD == false && endE == false && endF == false && endG == false) {
				if (g1a == "") {
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + g1);
					writer.println("|-");
				} else if (gSkip == false){
					writer.println("! colspan=\"4\" style=\"text-align: left; \" | " + g1a);
					writer.println("|-");
				}
				
				
				if (seven6 == true || seven4 == true || seven2 == true) {
					writer.println("| " + g1b + " || " + g1words + " || " + g1r1c2a + " || " + g1r1c4a + "");
					writer.println("|-");
				} else {
					writer.println("| " + g1b + " || " + g1words + " || " + g1r1c3 + " || " + g1r1c5 + "");
					writer.println("|-");
				} 
		}
		
			
		//these are the lines which end the tables 				
		writer.println("|}");
		writer.println("|}");
		

		//writes the writer.-lines into the string called result. 
		writer.flush(); 
		result = out.toString();
		
				
		return result.toString();
	} catch (Exception e) {
		return result.toString();
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///
public String writeX1b(String x1b) {
	
	try {
		
		if (x1b.contains("BPRS")) {
			x1b = x1b.replace("BPRS", "[[Brief Psychiatric Rating Scale|BPRS]]");
		}
		if (x1b.contains("PANSS")) {
			x1b = x1b.replace("PANSS", "[[Positive and Negative Syndrome Scale|PANSS]]");
		}
		if (x1b.contains("SAPS")) {
			x1b = x1b.replace("SAPS", "[[Scale for the Assessment of Positive Symptoms|SAPS]]");
		}
		if (x1b.contains("SANS")) {
			x1b = x1b.replace("SANS", "[[Scale for the Assessment of Negative Symptoms|SANS]]");
		}
		if (x1b.contains("QOL")) {
			x1b = x1b.replace("QOL", "[[Quality of life|QOL]]");} else
				if (x1b.contains("Qol")) {
					x1b = x1b.replace("Qol", "[[Quality of life|QOL]]");}
		
		
		return x1b.toString();
	} catch (Exception e) {
		return x1b.toString();
	}
}
//
//
//Scale for the Assessment of Positive Symptoms
//Scale for the Assessment of Negative Symptoms

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//makes authors conclusions more understandable
public String conclLink(String conclusions) {
	
	try {
		if (conclusions.contains("second generation antipsychotic")) 		{conclusions = conclusions.replace("second generation antipsychotic", "[[Atypical antipsychotic|second generation antipsychotic]]");} else
		if (conclusions.contains("second generation antipsychotics")) 		{conclusions = conclusions.replace("second generation antipsychotics", "[[Atypical antipsychotic|second generation antipsychotics]]");} else
		if (conclusions.contains("Second generation antipsychotic")) 		{conclusions = conclusions.replace("Second generation antipsychotic", "[[Atypical antipsychotic|Second generation antipsychotic]]");} else
		if (conclusions.contains("Second generation antipsychotics")) 		{conclusions = conclusions.replace("Second generation antipsychotics", "[[Atypical antipsychotic|Second generation antipsychotics]]");} else
		if (conclusions.contains("atypical antipsychotic")) 		{conclusions = conclusions.replace("atypical antipsychotic", "[[Atypical antipsychotic|atypical antipsychotic]]");} else
		if (conclusions.contains("atypical antipsychotics")) 		{conclusions = conclusions.replace("atypical antipsychotic", "[[Atypical antipsychotic|atypical antipsychotics]]");} else
		if (conclusions.contains("Atypical antipsychotic")) 		{conclusions = conclusions.replace("Atypical antipsychotic", "[[Atypical antipsychotic|Atypical antipsychotic]]");} else
		if (conclusions.contains("Atypical antipsychotics")) 		{conclusions = conclusions.replace("Atypical antipsychotics", "[[Atypical antipsychotic|Atypical antipsychotics]]");} else
			
		if (conclusions.contains("antipsychotic")) 		{conclusions = conclusions.replace("antipsychotic", "[[Antipsychotic|antipsychotic]]");} else
		if (conclusions.contains("antipsychotics")) 	{conclusions = conclusions.replace("antipsychotics", "[[Antipsychotic|antipsychotics]]");} else
		if (conclusions.contains("Antipsychotic")) 		{conclusions = conclusions.replace("Antipsychotic", "[[Antipsychotic|Antipsychotic]]");} else
		if (conclusions.contains("Antipsychotics"))		{conclusions = conclusions.replace("Antipsychotics", "[[Antipsychotic|Antipsychotics]]");} 
		if (conclusions.contains("antidepressant")) 	{conclusions = conclusions.replace("antidepressant", "[[Antidepressant|antidepressant]]");} else
		if (conclusions.contains("antidepressants")) 	{conclusions = conclusions.replace("antidepressants", "[[Antidepressant|antidepressants]]");} else
		if (conclusions.contains("Antidepressants")) 	{conclusions = conclusions.replace("Antidepressants", "[[Antidepressant|Antidepressants]]");}
		if (conclusions.contains("efficacious")) 		{conclusions = conclusions.replace("efficacious", "[[Efficacy|effective]]");} else
		if (conclusions.contains("efficacy")) 			{conclusions = conclusions.replace("efficacy", "[[Efficacy|effectiveness]]");} else
		if (conclusions.contains("Efficacy")) 			{conclusions = conclusions.replace("Efficacy", "[[Efficacy|Effectifeness]]");}
		if (conclusions.contains("clinical trial")) 		{conclusions = conclusions.replace("clinical trial", "[[Clinical trial|clinical trial]]");} else
		if (conclusions.contains("Clinical trial")) 		{conclusions = conclusions.replace("Clinical trial", "[[Clinical trial|Clinical trial]]");} else
		if (conclusions.contains("clinical trials")) 		{conclusions = conclusions.replace("clinical trials", "[[Clinical trial|clinical trials]]");} else
		if (conclusions.contains("Clinical trials")) 		{conclusions = conclusions.replace("Clinical trials", "[[Clinical trial|Clinical trials]]");} 
		if (conclusions.contains("methodological")) 		{conclusions = conclusions.replace("methodological", "[[Methodology|methodological]]");} else
		if (conclusions.contains("Methodological")) 		{conclusions = conclusions.replace("Methodological", "[[Methodology|Methodological]]");} else
		if (conclusions.contains("methodology")) 			{conclusions = conclusions.replace("methodology", "[[Methodology|methodology]]");} 
		
		if (conclusions.contains("randomised trials")) 		{conclusions = conclusions.replace("randomised trials", "[[Randomized controlled trial|randomized trials]]");} else
		if (conclusions.contains("randomised trial")) 		{conclusions = conclusions.replace("randomised trial", "[[Randomized controlled trial|randomized trial]]");} else
		if (conclusions.contains("Randomised trial")) 		{conclusions = conclusions.replace("Randomised trial", "[[Randomized controlled trial|Randomized trial]]");} else
		if (conclusions.contains("Randomised trials")) 		{conclusions = conclusions.replace("randomised trials", "[[Randomized controlled trial|Randomized trials]]");} else
		if (conclusions.contains("randomised studies")) 		{conclusions = conclusions.replace("randomised studies", "[[Randomized controlled trial|randomized studies]]");} else
		if (conclusions.contains("randomised study")) 		{conclusions = conclusions.replace("randomised study", "[[Randomized controlled trial|randomized study]]");} else
		if (conclusions.contains("Randomised study")) 		{conclusions = conclusions.replace("Randomised study", "[[Randomized controlled trial|Randomized study]]");} else
		if (conclusions.contains("Randomised studies")) 		{conclusions = conclusions.replace("randomised studies", "[[Randomized controlled trial|Randomised studies]]");} else
		if (conclusions.contains("randomised controlled trials")) 		{conclusions = conclusions.replace("randomised controlled trials", "[[Randomized controlled trial|randomized controlled trials]]");} else
		if (conclusions.contains("randomised controlled trial")) 		{conclusions = conclusions.replace("randomised controlled trial", "[[Randomized controlled trial|randomized controlled trial]]");} else
		if (conclusions.contains("Randomised controlled trial")) 		{conclusions = conclusions.replace("Randomised controlled trial", "[[Randomized controlled trial|Randomized controlled trial]]");} else
		if (conclusions.contains("Randomised controlled trials")) 		{conclusions = conclusions.replace("randomised controlled trials", "[[Randomized controlled trial|Randomized controlled trials]]");} else
		if (conclusions.contains("randomized controlled trials")) 		{conclusions = conclusions.replace("randomized controlled trials", "[[Randomized controlled trial|randomized controlled trials]]");} else
		if (conclusions.contains("randomized controlled trial")) 		{conclusions = conclusions.replace("randomized controlled trial", "[[Randomized controlled trial|randomized controlled trial]]");} else
		if (conclusions.contains("Randomized controlled trial")) 		{conclusions = conclusions.replace("Randomized controlled trial", "[[Randomized controlled trial|Randomized controlled trial]]");} else
		if (conclusions.contains("Randomized controlled trials")) 		{conclusions = conclusions.replace("randomized controlled trials", "[[Randomized controlled trial|Randomized controlled trials]]");} else			
		if (conclusions.contains("randomized trials")) 		{conclusions = conclusions.replace("randomized trials", "[[Randomized controlled trial|randomized trials]]");} else
		if (conclusions.contains("randomized trial")) 		{conclusions = conclusions.replace("randomized trial", "[[Randomized controlled trial|randomized trial]]");} else
		if (conclusions.contains("Randomized trial")) 		{conclusions = conclusions.replace("Randomized trial", "[[Randomized controlled trial|Randomized trial]]");} else
		if (conclusions.contains("Randomized trials")) 		{conclusions = conclusions.replace("randomized trials", "[[Randomized controlled trial|Randomized trials]]");} else
		if (conclusions.contains("randomized studies")) 	{conclusions = conclusions.replace("randomized studies", "[[Randomized controlled trial|randomized studies]]");} else
		if (conclusions.contains("randomized study")) 		{conclusions = conclusions.replace("randomized study", "[[Randomized controlled trial|randomized study]]");} else
		if (conclusions.contains("Randomized study")) 		{conclusions = conclusions.replace("Randomized study", "[[Randomized controlled trial|Randomized study]]");} else
		if (conclusions.contains("Randomized studies")) 	{conclusions = conclusions.replace("randomized studies", "[[Randomized controlled trial|Randomized studies]]");} 	
			
		if (conclusions.contains("Validity")) 	{conclusions = conclusions.replace("Validity", "[[Validity|Validity]]");} else	
		if (conclusions.contains("validity")) 	{conclusions = conclusions.replace("validity", "[[Validity|validity]]");}
		if (conclusions.contains("extrapyramidal symptoms")) 	{conclusions = conclusions.replace("extrapyramidal symptoms", "[[Extrapyramidal symptoms|extrapyramidal symptoms]]");} else
		if (conclusions.contains("Extrapyramidal symptoms")) 	{conclusions = conclusions.replace("Extrapyramidal symptoms", "[[Extrapyramidal symptoms|Extrapyramidal symptoms]]");} else
		if (conclusions.contains("extrapyramidal side")) 	{conclusions = conclusions.replace("extrapyramidal side", "[[Extrapyramidal symptoms|extrapyramidal side]]");} else
		if (conclusions.contains("Extrapyramidal side")) 	{conclusions = conclusions.replace("Extrapyramidal side", "[[Extrapyramidal symptoms|Extrapyramidal side]]");} 
		if (conclusions.contains("placebo")) 	{conclusions = conclusions.replace("placebo", "[[Placebo|placebo]]");} else
		if (conclusions.contains("Placebo")) 	{conclusions = conclusions.replace("Placebo", "[[Placebo|Placebo]]");} 
		if (conclusions.contains("quality of life")) 	{conclusions = conclusions.replace("quality of life", "[[Quality of life|quality of life]]");} else
		if (conclusions.contains("Quality of life")) 	{conclusions = conclusions.replace("Quality of life", "[[Quality of life|Quality of life]]");} 
		
		return conclusions.toString();
	} catch (Exception e) {
		return conclusions.toString();
	} 
	
		
}
}
