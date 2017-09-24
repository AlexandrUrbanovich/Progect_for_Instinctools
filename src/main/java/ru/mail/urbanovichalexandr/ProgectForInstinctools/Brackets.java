package ru.mail.urbanovichalexandr.ProgectForInstinctools;

public class Brackets {
	
	public static boolean parsing(String str) {
		int checkBracket = 0;
		for (int i = 0; i < str.length(); i++) {
			if (checkBracket < 0) {
				return false;
			}
			
			String oneSymbol = str.substring(i, i+1);
			if (oneSymbol.equals("(") || oneSymbol.equals("{")) {
				checkBracket++;
			}if(oneSymbol.equals(")") || oneSymbol.equals("}")) {
				checkBracket--;
			}
		}
		
		if(checkBracket == 0) {
			return true;
		}else {
			return false;
		}
	}
}
