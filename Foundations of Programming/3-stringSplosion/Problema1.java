
/* 
Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab" 
*/

public class Problema1 {
	public static String stringSplosion(String str) {
		char[] characters = str.toCharArray();
		String cadena = "";
		String aux = "";
		
		for(char c : characters){
			aux = aux + c;
			cadena = cadena + aux;
		}
		
		return cadena;
	}
	
	// Suggested solution
/* 	public String stringSplosion(String str) {
	  String result = "";
	  // On each iteration, add the substring of the chars 0..i
	  for (int i=0; i<str.length(); i++) {
		result = result + str.substring(0, i+1);
	  }
	  return result;
	} */
	
	public static void main(String[] args){
		String cadena = stringSplosion("ab");
		System.out.println(cadena);
	}
}