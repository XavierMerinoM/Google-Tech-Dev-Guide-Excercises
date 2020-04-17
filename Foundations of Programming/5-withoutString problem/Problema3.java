/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
*/
public class Problema3 {
	public static String withoutString(String base, String remove) {
		// Determine if a String contains an upper case
		if (!base.equals(base.toLowerCase())){
			String aux = base;
			String space = new String(new char[remove.length()]).replace("\0", " ");
			aux = aux.toLowerCase().replace(remove.toLowerCase(), space);

			// Manage strings as char arrays
			char[] auxChar = aux.toCharArray();
			char[] baseChar = base.toCharArray();
			int i = 0;
			boolean [] indexes = new boolean[base.length()];

			// Initialize boolean array
			for(i = 0; i < indexes.length; i++){
				indexes[i] = false;
			}
			
			i = 0;

			// Replace strings and check blank spaces
			for(char c : auxChar){
				if (c != baseChar[i])
					if (c == ' ')
						indexes[i] = true;
					else
						auxChar[i] = baseChar[i];
				i = i + 1;
			}

			// Replace blank spaces
			aux = String.valueOf(auxChar);
			for(i = indexes.length - 1; i > 0; i--){
				if (indexes[i]){
					aux = aux.substring(0,i) + aux.substring(i+1,aux.length());
				}
			}

			return aux.replaceAll("^\\s+", "");
		}			
		else
			return base.toLowerCase().replace(remove.toLowerCase(), "");
	}
	
	public static void main(String[] args){
		//String newStr = withoutString("Hello there", "llo");
		//String newStr = withoutString("Hello there", "e");
		//String newStr = withoutString("Hello there", "x");
		//String newStr = withoutString("xxx", "xx");
		String newStr = withoutString("MkjtMkx", "Mk");
		
		System.out.println(newStr);
	}
}