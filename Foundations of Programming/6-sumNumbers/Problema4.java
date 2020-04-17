/*
Given a string, return the sum of the numbers appearing in the string, 
ignoring all other characters. A number is a series of 1 or more 
digit chars in a row. 
(Note: Character.isDigit(char) tests if a char is one of the chars 
'0', '1', .. '9'. Integer.parseInt(string) converts a string to an 
int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/
public class Problema4 {
	public static int sumNumbers(String str) {
        str = str + " ";
        char[] strChar = str.toCharArray();
        String auxStr = "";
        int total = 0;

        for(char c : strChar){
            if (Character.isDigit(c)){
                auxStr = auxStr + String.valueOf(c);
            } 
            else if (auxStr != ""){
                total = total + Integer.parseInt(auxStr);
                auxStr = "";
            }    
        }
        
        return total;
	}
	
	public static void main(String[] args){
		//int num = sumNumbers("abc123xyz"); // → 123
        //int num = sumNumbers("aa11b33");// → 44
        int num = sumNumbers("7 11");// → 18
		
		System.out.println(num);
	}
}