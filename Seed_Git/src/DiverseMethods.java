

public class DiverseMethods {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//this method inserts spaces if these are needed

public String getBreak(String d1r1c2a) {

	d1r1c2a = d1r1c2a.trim();
	
		try {
			boolean endIt = false;
			int z = d1r1c2a.length() - 2;
				for(int y = 0; y < z; y++){
					if (endIt == false) {	
						if(Character.isLowerCase(d1r1c2a.charAt(y)) && Character.isMirrored(d1r1c2a.charAt(y + 1))) {
						d1r1c2a = new StringBuffer(d1r1c2a).insert(y + 1, " ").toString();
						endIt = true;
					}
				} if (endIt == false){
					if(Character.isDigit(d1r1c2a.charAt(y)) && Character.isMirrored(d1r1c2a.charAt(y + 1)) && y >= 15) {
						d1r1c2a = new StringBuffer(d1r1c2a).insert(y + 1, " ").toString();
						endIt = true;
					}
				} 
			}
		return d1r1c2a.toString();
	} catch (Exception e) {
		return d1r1c2a.toString();
		
		}
	}

}
