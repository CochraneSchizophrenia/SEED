
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GetBody {
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//gets the titles of the Summary of findings table by walking through the XML using Integer j as index. If SOF is empty this method fails and an empty String is 
	//returned as a catch. These empty Strings are then used for identification later rather than using boolean.
	public String getTitles(NodeList secondList, int j){
		String tX;
	try {
		Node sof1 = secondList.item(j);
		Element sof1Element = (Element) sof1;
		NodeList s1List = sof1Element.getElementsByTagName("TITLE");
		Node s1Node = s1List.item(0);
		Element s1Element = (Element) s1Node;
		tX = s1Element.getTextContent();
		return tX.toString();
	} catch (Exception esof2) {
		return "";
	}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Method to work with regexChecker, it searches for special phrases and single words 
		public String regexChecker(String theRegex, String str2Check){
			
			try {
				
				StringWriter out1 = new StringWriter();			//creates new string- and printWriters to flush output into the return-statement and therefore into the String used somewhere else
				PrintWriter writer1 = new PrintWriter(out1);
				Pattern checkRegex = Pattern.compile(theRegex);

				Matcher regexMatcher = checkRegex.matcher(str2Check);

				while(regexMatcher.find()){
					if(regexMatcher.group().length() != 0){
						writer1.print(regexMatcher.group().trim());
					}

				
}
				writer1.flush(); 
			    //writes the writer.-lines into the string used 
			return out1.toString();
			} catch (Exception e) {
				return str2Check;
			}

			
		}
	
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Gets the first cell from each line that contains an outcome. This cell contains a description of the outcome which has to be split in two parts 
		//to look nicer in the Wikitable. x1 is the complete cell, x1a becomes a heading and x1b becomes the actual description.
	public String[] writeHeading(Element rowXe0Element) {
		try {
			String x1 = "";
			String x1a = "";	
			String x1b = "Outcome: ";
			GetBody body = new GetBody();
			int substr = 0;
			//gets text content by tag B and puts it into String x1
			rowXe0Element.getElementsByTagName("B");
			x1 = rowXe0Element.getTextContent();
			x1 = x1.replace("\n", "");
			
			//Inside of the regexChecker brackets are all the terms that are to be checked (blue writing) 
			//after that it specifies where the terms are to be searched for
			//if you want to implement a search for new words notice that everything is sorted by number of words. It starts with 6 words and ends with
			//1 word. If you add something make sure you add it to the right place!
			//[A-Za-z] at the beginning of every word allows to ignore case(GrossKleinschreibung)
			
			//in case the regexchecker fails the more general splitting method from the GetBody class is called. If the second splitting method can't split the String either we are defeated and the string is taken whole.
			
			x1a = body.regexChecker("(^([A-Za-z]ays [A-Za-z]n [A-Za-z]ommunitiy [A-Za-z]ill 1st [A-Za-z]dmission|[A-Za-z]o [A-Za-z]linically [A-Za-z]mportant [A-Za-z]esponse [A-Za-z]o [A-Za-z]reatment|[A-Za-z]linical [A-Za-z]mprovement [A-Za-z]n [A-Za-z]lobal [A-Za-z]tate|[A-Za-z]ell-being [A-Za-z]nd [A-Za-z]uality [A-Za-z]f [A-Za-z]ife|[A-Za-z]lobal [A-Za-z]ssessment of [A-Za-z]unctioning|[A-Za-z]eaving [A-Za-z]he [A-Za-z]tudy [A-Za-z]arly|[A-Za-z]ervice [A-Za-z]se [A-Za-z]nd [A-Za-z]ospitalisation|[A-Za-z]ental [A-Za-z]tate [A-Za-z]nd [A-Za-z]ehavior|[A-Za-z]atisfaction [A-Za-z]ith [A-Za-z]ental [A-Za-z]ealth|[A-Za-z]ospital [A-Za-z]nd [A-Za-z]ervice [A-Za-z]utcomes|[A-Za-z]ospital [A-Za-z]nd [A-Za-z]ervice [A-Za-z]utcome|[A-Za-z]o [A-Za-z]linically [A-Za-z]mportant [A-Za-z]hange|[A-Za-z]ot [A-Za-z]ischarged [A-Za-z]rom [A-Za-z]ospital|[A-Za-z]uality [A-Za-z]f [A-Za-z]ife|[A-Za-z]atisfaction [A-Za-z]ith [A-Za-z]are|[A-Za-z]atisfaction [A-Za-z]ith [A-Za-z]reatment|[A-Za-z]linical [A-Za-z]ignificant [A-Za-z]esponse|[A-Za-z]linical [A-Za-z]lobal [A-Za-z]esponse|[A-Za-z]urden [A-Za-z]n [A-Za-z]amily|[A-Za-z]atient [A-Za-z]evel [A-Za-z]utcomes|[A-Za-z]ost [A-Za-z]f [A-Za-z]are|[A-Za-z]eneral [A-Za-z]ental [A-Za-z]tate|[A-Za-z]eneral [A-Za-z]linical [A-Za-z]mpression|[A-Za-z]o clinically [A-Za-z]mportant|[A-Za-z]o [A-Za-z]linicial [A-Za-z]esponse|[A-Za-z]ttitudes [A-Za-z]o [A-Za-z]reatment|[A-Za-z]ranquillisation [A-Za-z]r [A-Za-z]sleep|[A-Za-z]ompliance [A-Za-z]ith [A-Za-z]reatment|[A-Za-z]esponse [A-Za-z]o [A-Za-z]reatment|[A-Za-z]cceptability [A-Za-z]f [A-Za-z]reatment|[A-Za-z]ost [A-Za-z]o [A-Za-z]reatment|[A-Za-z]lobal [A-Za-z]tate|[A-Za-z]lobal [A-Za-z]mpression|[A-Za-z]lobal [A-Za-z]utcome|[A-Za-z]eneral [A-Za-z]unctioning|[A-Za-z]ental [A-Za-z]tate|[A-Za-z]dverse [A-Za-z]ffect/event|[A-Za-z]dverse [A-Za-z]ffects|[A-Za-z]dverse [A-Za-z]vents|[A-Za-z]ervice [A-Za-z]tillsation|[A-Za-z]ervice use|[A-Za-z]ervice [A-Za-z]utcomes|[A-Za-z]ehavioral [A-Za-z]utcomes|[A-Za-z]ervice [A-Za-z]utcome|[A-Za-z]ocial [A-Za-z]utcomes|[A-Za-z]ocial [A-Za-z]unctioning|[A-Za-z]linical [A-Za-z]fficacy|[A-Za-z]ealth [A-Za-z]ervice|[A-Za-z]atient [A-Za-z]atisfaction|[A-Za-z]conomic [A-Za-z]utcomes|[A-Za-z]ospital [A-Za-z]se|[A-Za-z]esired [A-Za-z]edation|[A-Za-z]exual [A-Za-z]unction|[A-Za-z]ife [A-Za-z]kills|[A-Za-z]verall [A-Za-z]mprovement|[A-Za-z]ognitive [A-Za-z]unction|[A-Za-z]ognitive state|[A-Za-z]ositive [A-Za-z]ymptoms|[A-Za-z]egative [A-Za-z]ymptoms|[A-Za-z]lobal|[A-Za-z]conomic|[A-Za-z]eath|[A-Za-z]elapse|[A-Za-z]ehaviour|[A-Za-z]edation|[A-Za-z]ompliance|[A-Za-z]nowledge))", x1);
			if (x1a==null || x1a.isEmpty()) {
			//gets heading and splits it conveniently if possible using GetBody class. If this class is not used it goes back to the regex version and creates the
			// a1b String by subtracting a1a from the original.	
				
				String[] xArray = body.writeHead(x1, rowXe0Element, x1a, x1b);
				x1 =	 xArray[0];
				x1a =	 xArray[1];
				x1b =	 xArray[2];
			} else {
				try {
					//creates x1b by subtracting x1a from the whole original String. Then it checks whether x1b starts off with spare characters and if found, eliminates these.
					//The String is then trimmed and in case the first letter is not capitalised this is fixed.
					x1b = x1.replaceFirst(x1a, "");
					x1b = x1b.trim();
					if (x1b.startsWith(":") || x1b.startsWith("-") || x1b.startsWith(",")) {
						substr = 1;
					} else {
						substr = 0;
					}
					x1b = x1b.substring(substr);
					x1b = x1b.trim();
					x1b = x1b.substring(0, 1).toUpperCase() + x1b.substring(1);
					
				} catch (Exception e2) {
				}
			}
			
			try {
				//as linebreaks were removed at the beginning to ensure the Strings are filled correctly this part of SEED finds places where a lower case char is directly followed by an upper case char. 
				//If this is the case there is a linebreak missing. This linebreak gets a surrogate ". " instead.
				int z = x1b.length();
			      for(int y = 0; y < z; y++){
			         if(Character.isLowerCase(x1b.charAt(y)) && Character.isUpperCase(x1b.charAt(y + 1))) {
			            x1b = new StringBuffer(x1b).insert(y + 1, ". ").toString();
			         }
			         }
			} catch (Exception e2) {
			}
			//if the Strings stay empty because of a non-anticipated reason they are filled as following:
			if (x1a==null || x1a.isEmpty()) {
				x1a = x1;
			}
			if (x1b==null || x1b.isEmpty()) {
				x1b = "Outcome: ";
			}
			return new String[] { x1, x1a, x1b };
		} catch (DOMException e) {
			return new String[] {"" + "" + ""};
		}
	}
		
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Method used in writeHeading method above in case the regex does not recognise any pattern. 
	public String[] writeHead(String x1, Element rowXe0Element, String x1a, String x1b) {
		
		String x1bx = "";
		try {
			
			x1 = rowXe0Element.getTextContent();
			x1 = x1.replace("\n", "");
			//the next String needs to be split at first occurrence of any of the next delimiters and used in different areas 
			//of the final table. 
			if (x1.contains("- ")) {
			String[] splitx1 = x1.split("- ");
			x1a = splitx1[0]; 
			try {
				x1bx = splitx1[1] + "- " + splitx1[2] + "- " + splitx1[3];
			} catch (Exception eb) {
			}
			try {
				x1bx = splitx1[1] + "- " + splitx1[2];
			} catch (Exception eb) {
				
				x1bx = splitx1[1];
			}
			x1b = x1bx.substring(0, 1).toUpperCase() + x1bx.substring(1); 
			} else {
			    if (x1.contains(": ")) {
			    	String[] splitx1 = x1.split(": ");
			    	x1a = splitx1[0]; 
			    	try {
						x1bx = splitx1[1] + "- " + splitx1[2] + "- " + splitx1[3];
					} catch (Exception eb) {
					}
					try {
						x1bx = splitx1[1] + "- " + splitx1[2];
					} catch (Exception eb) {
						
						x1bx = splitx1[1];
					}
					x1b = x1bx.substring(0, 1).toUpperCase() + x1bx.substring(1);
				} else {
			        if (x1.contains(", ")) {
			        	String[] splitx1 = x1.split(", ");
			        	x1a = splitx1[0]; 
			        	try {
							x1bx = splitx1[1] + ", " + splitx1[2] + ", " + splitx1[3];
						} catch (Exception eb) {
						}
						try {
							x1bx = splitx1[1] + ", " + splitx1[2];
						} catch (Exception eb) {
							
							x1bx = splitx1[1];
						}
						x1b = x1bx.substring(0, 1).toUpperCase() + x1bx.substring(1);
					} else {
				        if (x1.contains("(")) {
				        	String[] splitx1 = x1.split("\\(");
				        	x1a = splitx1[0]; 
							x1bx = splitx1[1];
							String[] splitx1b = x1bx.split("\\)");
							try {
								x1bx = splitx1b[0] + "- " + splitx1b[1];
							} catch (Exception eg) {
								x1bx = splitx1b[0];
							}
							x1b = x1bx.substring(0, 1).toUpperCase() + x1bx.substring(1); 
						}
					}
				}
			}
			return new String[] { x1, x1a, x1b };
		} catch (DOMException e) {
			return new String[] { "" + "" + "" };
		}
	 }
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//method used to extract content of XML-File if special structure: Absolute numbers in two rows is encountered. Returns a String[] 
	public String[] writeTwo(NodeList rowXe0List, Element row1Element, Element tbl1Element, Integer i, String x1r1c1a, String x1r1c2a, String x1r1c4a, String x1r2c1, String x1r2c2, String x1r1c6) {
	

	try {
		try {
			try {
				row1Element.getElementsByTagName("TD");
				Node rowa1 = rowXe0List.item(1);
				Element row1e4Element = (Element) rowa1;
				//@get evidence level
					NodeList row1e4a1List = row1e4Element.getElementsByTagName("B");
					Node atag1 = row1e4a1List.item(0);
					x1r1c1a = atag1.getTextContent();
					x1r1c1a = x1r1c1a.replace("\n", "");
				
				
			} catch (Exception exc3) {
				row1Element.getElementsByTagName("TD");
				Node rowa1 = rowXe0List.item(1);
				//altered content: says low medium or high most times, since ReviewManager decided to 
				//include some numbers in the main text rather than using a seperate tag these have to be replaced.
				x1r1c1a = rowa1.getTextContent();
				x1r1c1a = x1r1c1a.replace("\n", "");
				x1r1c1a = x1r1c1a.replace("Lowd", "Low").replace("1", "").replace("2", "").replace("3", "").replace("4", "").replace("5", "").replace("6", "").replace("7", "").replace("8", "").replace("9", "").replace("10", "");
				
}
		} catch (Exception e2) {
		}
		
		
// gets 6 rows this is confusing but it shows RR and CI since cells have been merged		
		try {
		row1Element.getElementsByTagName("TD");
		Node rowx2 = rowXe0List.item(2); 
		//@3rd cell of 1st supposed-to-be relevant line without linebreak
		x1r1c2a = rowx2.getTextContent();
		x1r1c2a = x1r1c2a.replace("\n", "");
} catch (Exception exc3) {
}	
		try {
			try {
				row1Element.getElementsByTagName("TD");
				Node rowx4 = rowXe0List.item(4);
				Element rowxe4Element = (Element) rowx4;
				//@get evidence level
					NodeList row1e4a1List = rowxe4Element.getElementsByTagName("B");
					Node xtag1 = row1e4a1List.item(0);
					x1r1c4a = xtag1.getTextContent();
					x1r1c4a = x1r1c4a.replace("\n", "");
			} catch (Exception exc3) {
				
				row1Element.getElementsByTagName("TD");
				Node rowx4 = rowXe0List.item(4);
				Element rowxe4Element = (Element) rowx4;
				//@get evidence level
					NodeList rowxe4a1List = rowxe4Element.getElementsByTagName("P");
					Node xtag1 = rowxe4a1List.item(0);
					x1r1c4a = xtag1.getTextContent();
					x1r1c4a = x1r1c4a.replace("\n", "").replaceAll("[0-9]", "").replaceAll("[10-20]", "").replace(" ", "");
					x1r1c4a = x1r1c4a.substring(4);
			}
		} catch (Exception e1) {
		}
		
		try {
			row1Element.getElementsByTagName("TD");
			Node row5e6 = rowXe0List.item(5);
			x1r1c6 = row5e6.getTextContent();
			x1r1c6 = x1r1c6.replace("\n", "");
		} catch (Exception exc3) {
		}
		
		NodeList row2List = tbl1Element.getElementsByTagName("TR");
		Node row2 = row2List.item(i);
		i = new Integer(i.intValue() + 1);
		Element row2Element = (Element) row2;
		
				NodeList row2e0List = null;
				//
				try {
					try {
						
						row2e0List = row2Element.getElementsByTagName("TD");
						Node row2e0 = row2e0List.item(0);
						Element row2e4Element = (Element) row2e0;
						//@get evidence level
							NodeList row1e4a1List = row2e4Element.getElementsByTagName("B");
							Node atag1 = row1e4a1List.item(0);
							
						x1r2c1 = atag1.getTextContent();
						x1r2c1 = x1r2c1.replace("\n", "");
					} catch (Exception eu) {
						row2e0List = row2Element.getElementsByTagName("TD");
						Node row2e0 = row2e0List.item(0);
						x1r2c1 = row2e0.getTextContent();
						x1r2c1 = x1r2c1.replace("\n", "");
					}
				} catch (Exception e) {
					x1r2c1 = "0 per 1000";
				}
				
				try {
					try {
						row2e0List = row2Element.getElementsByTagName("TD");
						Node row2e1 = row2e0List.item(1);
						Element row2e4Element = (Element) row2e1;
						//@get evidence level
							NodeList row1e4a1List = row2e4Element.getElementsByTagName("B");
							Node atag1 = row1e4a1List.item(0);
						x1r2c2 = atag1.getTextContent();
						x1r2c2 = x1r2c2.replace("\n", "");
					} catch (Exception eu) {
						Node row2e1 = row2e0List.item(1);
						x1r2c2 = row2e1.getTextContent();
						x1r2c2 = x1r2c2.replace("\n", "");
					}
				} catch (Exception e) {
					x1r2c2 = "0 per 1000";
				}
				
				
					
					return new String[] { x1r1c1a, x1r1c2a, x1r1c4a, x1r2c1, x1r2c2, x1r1c6 };
					
	} catch (DOMException e) {
		return new String[] { "" + "" + "" + "" + ""+ ""};
	}
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//method used to extract content of XML-File if special structure: Absolute numbers in four rows is encountered. Returns a String[]
	
	public String[] writeFour(NodeList rowXe0List, Element row1Element, Element tbl1Element, Integer i, 
			String x1r1c1a, String x1r1c2a, String x1r1c3, String x1r2c1, String x1r2c2, 
			String x1r3c1b, String x1r4c1, String x1r4c2, String x1r1c6) {
	
	try {
		
		try {
			try {
				row1Element.getElementsByTagName("TD");
				Node rowa1 = rowXe0List.item(1);
				Element row1e4Element = (Element) rowa1;
				//@get evidence level
					NodeList row1e4a1List = row1e4Element.getElementsByTagName("B");
					Node atag1 = row1e4a1List.item(0);
					x1r1c1a = atag1.getTextContent();
					x1r1c1a = x1r1c1a.replace("\n", "");
				
				
			} catch (Exception exc3) {
				row1Element.getElementsByTagName("TD");
				Node rowa1 = rowXe0List.item(1);
				//altered content: says low medium or high most times, since ReviewManager decided to 
				//include some numbers in the main text rather than using a seperate tag these have to be replaced.
				x1r1c1a = rowa1.getTextContent();
				x1r1c1a = x1r1c1a.replace("\n", "");
				x1r1c1a = x1r1c1a.replace("Lowd", "Low").replace("1", "").replace("2", "").replace("3", "").replace("4", "").replace("5", "").replace("6", "").replace("7", "").replace("8", "").replace("9", "").replace("10", "");
				
}
		} catch (Exception e) {
			
		}
		
//gets 6 rows this is confusing but it shows RR and CI since cells have been merged		
		try {
		row1Element.getElementsByTagName("TD");
		Node rowa2 = rowXe0List.item(2); 
		//@3rd cell of 1st supposed-to-be relevant line without linebreak
		x1r1c2a = rowa2.getTextContent();
		x1r1c2a = x1r1c2a.replace("\n", "");
} catch (Exception exc3) {
}					
		try {
			try {
				row1Element.getElementsByTagName("TD");
				Node rowa4 = rowXe0List.item(4);
				Element row1e4Element = (Element) rowa4;
				//@get evidence level
					NodeList row1e4a1List = row1e4Element.getElementsByTagName("B");
					Node atag1 = row1e4a1List.item(0);
					x1r1c3 = atag1.getTextContent();
					x1r1c3 = x1r1c3.replace("\n", "");
			} catch (Exception exc3) {
				
				row1Element.getElementsByTagName("TD");
				Node rowa4 = rowXe0List.item(4);
				Element row1e4Element = (Element) rowa4;
				//@get evidence level
					NodeList row1e4a1List = row1e4Element.getElementsByTagName("P");
					Node atag1 = row1e4a1List.item(0);
					x1r1c3 = atag1.getTextContent();
					x1r1c3 = x1r1c3.replace("\n", "").replaceAll("[0-9]", "").replaceAll("[10-20]", "").replace(" ", "");
					x1r1c3 = x1r1c3.substring(4);
			}
		} catch (Exception e) {
		}
		try {
			row1Element.getElementsByTagName("TD");
			Node row5e6 = rowXe0List.item(5);
			x1r1c6 = row5e6.getTextContent();
			x1r1c6 = x1r1c6.replace("\n", "");
		} catch (Exception exc3) {
		}
		
		NodeList row2List = tbl1Element.getElementsByTagName("TR");
		Node row2 = row2List.item(i);
		i = new Integer(i.intValue() + 1);
		Element row2Element = (Element) row2;
		
				NodeList row2e0List = null;
				//
				
				
					
						try {
							try {
								
								row2e0List = row2Element.getElementsByTagName("TD");
								Node row2e0 = row2e0List.item(0);
								Element row2e4Element = (Element) row2e0;
								//@get evidence level
									NodeList row1e4a1List = row2e4Element.getElementsByTagName("B");
									Node atag1 = row1e4a1List.item(0);
									
								x1r2c1 = atag1.getTextContent();
								x1r2c1 = x1r2c1.replace("\n", "");
							} catch (Exception eu) {
								row2e0List = row2Element.getElementsByTagName("TD");
								Node row2e0 = row2e0List.item(0);
								x1r2c1 = row2e0.getTextContent();
								x1r2c1 = x1r2c1.replace("\n", "");
							}
						} catch (Exception e) {
							
						}
						
						try {
							try {
								row2e0List = row2Element.getElementsByTagName("TD");
								Node row2e1 = row2e0List.item(1);
								Element row2e4Element = (Element) row2e1;
								//@get evidence level
									NodeList row1e4a1List = row2e4Element.getElementsByTagName("B");
									Node atag1 = row1e4a1List.item(0);
								x1r2c2 = atag1.getTextContent();
								x1r2c2 = x1r2c2.replace("\n", "");
							} catch (Exception eu) {
								Node row2e1 = row2e0List.item(1);
								x1r2c2 = row2e1.getTextContent();
								x1r2c2 = x1r2c2.replace("\n", "");
							}
						} catch (Exception e) {
							
						}
						
					
					
					NodeList row3List = tbl1Element.getElementsByTagName("TR");
					Node row3 = row3List.item(i);
					i = new Integer(i.intValue() + 1);
					Element row3Element = (Element) row3;
					
							NodeList row3e0List = null;
							//for grabbing second merged cell, row "3"
							try {
								try {
									row3e0List = row3Element.getElementsByTagName("TD");
									Node row3e1 = row3e0List.item(0);
									
									Element row3e4Element = (Element) row3e1;
									//@get evidence level
										NodeList row3e4a1List = row3e4Element.getElementsByTagName("B");
										Node atag1 = row3e4a1List.item(0);
										x1r3c1b = atag1.getTextContent();
										x1r3c1b = x1r3c1b.replace("\n", "");
									
									} catch (Exception exc3) {
										
										row3e0List = row3Element.getElementsByTagName("TD");
										Node row3e1 = row3e0List.item(0);
										x1r3c1b = row3e1.getTextContent();
										x1r3c1b = x1r3c1b.replace("\n", "");
										x1r3c1b = x1r3c1b.replace("Moderated", "Moderate").replace("1", "").replace("2", "").replace("3", "").replace("4", "").replace("5", "").replace("6", "").replace("7", "").replace("8", "").replace("9", "").replace("10", "");
									
								}
							} catch (Exception e) {
							}

					
					NodeList row4List = tbl1Element.getElementsByTagName("TR");
					Node row4 = row4List.item(i);
					i = new Integer(i.intValue() + 1);
					Element row4Element = (Element) row4;
					
							NodeList row4e0List = null;
							//contents of 4th row
								
							try {
								try {
									
									row4e0List = row4Element.getElementsByTagName("TD");
									Node row4e0 = row4e0List.item(0);
									Element row4e4Element = (Element) row4e0;
									//@get evidence level
										NodeList row1e4a1List = row4e4Element.getElementsByTagName("B");
										Node atag1 = row1e4a1List.item(0);
										
									x1r4c1 = atag1.getTextContent();
									x1r4c1 = x1r4c1.replace("\n", "");
								} catch (Exception eu) {
									row4e0List = row4Element.getElementsByTagName("TD");
									Node row4e0 = row4e0List.item(0);
									x1r4c1 = row4e0.getTextContent();
									x1r4c1 = x1r4c1.replace("\n", "");
								}
							} catch (Exception e) {
							}
							
							try {
								try {
									row4e0List = row4Element.getElementsByTagName("TD");
									Node row4e1 = row4e0List.item(1);
									Element row4e4Element = (Element) row4e1;
									//@get evidence level
										NodeList row1e4a1List = row4e4Element.getElementsByTagName("B");
										Node atag1 = row1e4a1List.item(0);
									x1r4c2 = atag1.getTextContent();
									x1r4c2 = x1r4c2.replace("\n", "");
								} catch (Exception eu) {
									Node row4e1 = row4e0List.item(1);
									x1r4c2 = row4e1.getTextContent();
									x1r4c2 = x1r4c2.replace("\n", "");
								}
							} catch (Exception e) {
							}
							
							
								
											
											return new String[] { x1r1c1a, x1r1c2a, x1r1c3, x1r2c1, x1r2c2,  x1r3c1b, x1r4c1, x1r4c2, x1r1c6 };
											
		} catch (DOMException e) {
			return new String[] { "" + "" + "" + "" + "" + "" + "" + ""+ ""};
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//method used to extract content of XML-File if special structure: Absolute numbers in six rows is encountered. Returns a String[]
	
	public String[] writeSix(NodeList rowXe0List, Element row1Element, Element tbl1Element, Integer i, 
			String x1r1c1a, String x1r1c2a, String x1r1c4a, String x1r2c1, String x1r2c2, 
			String x1r3c1b, String x1r4c1, String x1r4c2, 
			String x1r5c1c, String x1r6c1, String x1r6c2, String x1r1c6) {
	
	try {
		try {
			try {
				row1Element.getElementsByTagName("TD");
				Node rowa1 = rowXe0List.item(1);
				Element row1e4Element = (Element) rowa1;
				//@get evidence level
					NodeList row1e4a1List = row1e4Element.getElementsByTagName("B");
					Node atag1 = row1e4a1List.item(0);
					x1r1c1a = atag1.getTextContent();
					x1r1c1a = x1r1c1a.replace("\n", "");
				
				
			} catch (Exception exc3) {
				row1Element.getElementsByTagName("TD");
				Node rowa1 = rowXe0List.item(1);
				//altered content: says low medium or high most times, since ReviewManager decided to 
				//include some numbers in the main text rather than using a seperate tag these have to be replaced.
				x1r1c1a = rowa1.getTextContent();
				x1r1c1a = x1r1c1a.replace("\n", "");
				x1r1c1a = x1r1c1a.replace("Lowd", "Low").replace("1", "").replace("2", "").replace("3", "").replace("4", "").replace("5", "").replace("6", "").replace("7", "").replace("8", "").replace("9", "").replace("10", "");
				
}
		} catch (Exception e) {
		}
		
//gets 6 rows this is confusing but it shows RR and CI since cells have been merged		
		try {
		row1Element.getElementsByTagName("TD");
		Node rowa2 = rowXe0List.item(2); 
		//@3rd cell of 1st supposed-to-be relevant line without linebreak
		x1r1c2a = rowa2.getTextContent();
		x1r1c2a = x1r1c2a.replace("\n", "");
} catch (Exception exc3) {
}					
		try {
			try {
				row1Element.getElementsByTagName("TD");
				Node rowa4 = rowXe0List.item(4);
				Element row1e4Element = (Element) rowa4;
				//@get evidence level
					NodeList row1e4a1List = row1e4Element.getElementsByTagName("B");
					Node atag1 = row1e4a1List.item(0);
					x1r1c4a = atag1.getTextContent();
					x1r1c4a = x1r1c4a.replace("\n", "");
			} catch (Exception exc3) {
				
				row1Element.getElementsByTagName("TD");
				Node rowa4 = rowXe0List.item(4);
				Element row1e4Element = (Element) rowa4;
				//@get evidence level
					NodeList row1e4a1List = row1e4Element.getElementsByTagName("P");
					Node atag1 = row1e4a1List.item(0);
					x1r1c4a = atag1.getTextContent();
					x1r1c4a = x1r1c4a.replace("\n", "").replaceAll("[0-9]", "").replaceAll("[10-20]", "").replace(" ", "");
					x1r1c4a = x1r1c4a.substring(4);
			}
		} catch (Exception e) {
		}	
		try {
			row1Element.getElementsByTagName("TD");
			Node row5e6 = rowXe0List.item(5);
			x1r1c6 = row5e6.getTextContent();
			x1r1c6 = x1r1c6.replace("\n", "");
		} catch (Exception exc3) {
		}
		
		NodeList row2List = tbl1Element.getElementsByTagName("TR");
		Node row2 = row2List.item(i);
		i = new Integer(i.intValue() + 1);
		Element row2Element = (Element) row2;
		
				NodeList row2e0List = null;
				//
				
				try {
					try {
						
						row2e0List = row2Element.getElementsByTagName("TD");
						Node row2e0 = row2e0List.item(0);
						Element row2e4Element = (Element) row2e0;
						//@get evidence level
							NodeList row1e4a1List = row2e4Element.getElementsByTagName("B");
							Node atag1 = row1e4a1List.item(0);
							
						x1r2c1 = atag1.getTextContent();
						x1r2c1 = x1r2c1.replace("\n", "");
					} catch (Exception eu) {
						row2e0List = row2Element.getElementsByTagName("TD");
						Node row2e0 = row2e0List.item(0);
						x1r2c1 = row2e0.getTextContent();
						x1r2c1 = x1r2c1.replace("\n", "");
					}
				} catch (Exception e) {
				}
				
				try {
					try {
						row2e0List = row2Element.getElementsByTagName("TD");
						Node row2e1 = row2e0List.item(1);
						Element row2e4Element = (Element) row2e1;
						//@get evidence level
							NodeList row1e4a1List = row2e4Element.getElementsByTagName("B");
							Node atag1 = row1e4a1List.item(0);
						x1r2c2 = atag1.getTextContent();
						x1r2c2 = x1r2c2.replace("\n", "");
					} catch (Exception eu) {
						Node row2e1 = row2e0List.item(1);
						x1r2c2 = row2e1.getTextContent();
						x1r2c2 = x1r2c2.replace("\n", "");
					}
				} catch (Exception e) {
				}
				
					
					NodeList row3List = tbl1Element.getElementsByTagName("TR");
					Node row3 = row3List.item(i);
					i = new Integer(i.intValue() + 1);
					Element row3Element = (Element) row3;
					
							NodeList row3e0List = null;
							//for grabbing second merged cell, row "3"
							try {
								try {
									row3e0List = row3Element.getElementsByTagName("TD");
									Node row3e1 = row3e0List.item(0);
									
									Element row3e4Element = (Element) row3e1;
									//@get evidence level
										NodeList row3e4a1List = row3e4Element.getElementsByTagName("B");
										Node atag1 = row3e4a1List.item(0);
										x1r3c1b = atag1.getTextContent();
										x1r3c1b = x1r3c1b.replace("\n", "");
									
									} catch (Exception exc3) {
										
										row3e0List = row3Element.getElementsByTagName("TD");
										Node row3e1 = row3e0List.item(0);
										x1r3c1b = row3e1.getTextContent();
										x1r3c1b = x1r3c1b.replace("\n", "");
										x1r3c1b = x1r3c1b.replace("Moderated", "Moderate").replace("1", "").replace("2", "").replace("3", "").replace("4", "").replace("5", "").replace("6", "").replace("7", "").replace("8", "").replace("9", "").replace("10", "");
									
								}
							} catch (Exception e) {
							}

					
					NodeList row4List = tbl1Element.getElementsByTagName("TR");
					Node row4 = row4List.item(i);
					i = new Integer(i.intValue() + 1);
					Element row4Element = (Element) row4;
					
							NodeList row4e0List = null;
							//contents of 4th row
							
							try {
								try {
									
									row4e0List = row4Element.getElementsByTagName("TD");
									Node row4e0 = row4e0List.item(0);
									Element row4e4Element = (Element) row4e0;
									//@get evidence level
										NodeList row1e4a1List = row4e4Element.getElementsByTagName("B");
										Node atag1 = row1e4a1List.item(0);
										
									x1r4c1 = atag1.getTextContent();
									x1r4c1 = x1r4c1.replace("\n", "");
								} catch (Exception eu) {
									row4e0List = row4Element.getElementsByTagName("TD");
									Node row4e0 = row4e0List.item(0);
									x1r4c1 = row4e0.getTextContent();
									x1r4c1 = x1r4c1.replace("\n", "");
								}
							} catch (Exception e) {
							}
							
							try {
								try {
									row4e0List = row4Element.getElementsByTagName("TD");
									Node row4e1 = row4e0List.item(1);
									Element row4e4Element = (Element) row4e1;
									//@get evidence level
										NodeList row1e4a1List = row4e4Element.getElementsByTagName("B");
										Node atag1 = row1e4a1List.item(0);
									x1r4c2 = atag1.getTextContent();
									x1r4c2 = x1r4c2.replace("\n", "");
								} catch (Exception eu) {
									Node row4e1 = row4e0List.item(1);
									x1r4c2 = row4e1.getTextContent();
									x1r4c2 = x1r4c2.replace("\n", "");
								}
							} catch (Exception e) {
							}
								
								NodeList row5List = tbl1Element.getElementsByTagName("TR");
								Node row5 = row5List.item(i);
								i = new Integer(i.intValue() + 1);
								Element row5Element = (Element) row5;
								
										NodeList row5e0List = null;
										//for grabbing second merged cell, row "3"
										try {
											try {
												row5e0List = row5Element.getElementsByTagName("TD");
												Node row5e1 = row5e0List.item(0);
												
												Element row5e4Element = (Element) row5e1;
												//@get evidence level
													NodeList row5e4a1List = row5e4Element.getElementsByTagName("B");
													Node atag1 = row5e4a1List.item(0);
													x1r5c1c = atag1.getTextContent();
													x1r5c1c = x1r5c1c.replace("\n", "");
											} catch (Exception exc3) {
												row5e0List = row5Element.getElementsByTagName("TD");
												Node row5e1 = row5e0List.item(0);
												
												x1r5c1c = row5e1.getTextContent();
												x1r5c1c = x1r5c1c.replace("\n", "");
												x1r5c1c = x1r5c1c.replace("Highd", "High").replace("1", "").replace("2", "").replace("3", "").replace("4", "").replace("5", "").replace("6", "").replace("7", "").replace("8", "").replace("9", "").replace("10", "");
											
											}
										} catch (Exception e) {
										}

								
								NodeList row6List = tbl1Element.getElementsByTagName("TR");
								Node row6 = row6List.item(i);
								i = new Integer(i.intValue() + 1);
								Element row6Element = (Element) row6;
								
										NodeList row6e0List = null;
										//contents of 4th row
										
										try {
											try {
												
												row6e0List = row6Element.getElementsByTagName("TD");
												Node row6e0 = row6e0List.item(0);
												Element row6e4Element = (Element) row6e0;
												//@get evidence level
													NodeList row6e4a1List = row6e4Element.getElementsByTagName("B");
													Node atag1 = row6e4a1List.item(0);
													
												x1r6c1 = atag1.getTextContent();
												x1r6c1 = x1r6c1.replace("\n", "");
											} catch (Exception eu) {
												row6e0List = row6Element.getElementsByTagName("TD");
												Node row6e0 = row6e0List.item(0);
												x1r6c1 = row6e0.getTextContent();
												x1r6c1 = x1r6c1.replace("\n", "");
											}
										} catch (Exception e) {
										}
										
										try {
											try {
												row6e0List = row6Element.getElementsByTagName("TD");
												Node row6e1 = row6e0List.item(1);
												Element row6e4Element = (Element) row6e1;
												//@get evidence level
													NodeList row6e4a1List = row6e4Element.getElementsByTagName("B");
													Node atag1 = row6e4a1List.item(0);
												x1r6c2 = atag1.getTextContent();
												x1r6c2 = x1r6c2.replace("\n", "");
											} catch (Exception eu) {
												Node row6e1 = row6e0List.item(1);
												x1r6c2 = row6e1.getTextContent();
												x1r6c2 = x1r6c2.replace("\n", "");
											}
										} catch (Exception e) {
										}
											
											
											return new String[] { x1r1c1a, x1r1c2a, x1r1c4a, x1r2c1, x1r2c2,  x1r3c1b, x1r4c1, x1r4c2,
																x1r5c1c, x1r6c1, x1r6c2, x1r1c6 };
											
	} catch (DOMException e) {
		return new String[] { "" + "" + "" + "" + "" + "" + "" + "" + "" + ""+ ""+ ""};
	}
  }
	}

