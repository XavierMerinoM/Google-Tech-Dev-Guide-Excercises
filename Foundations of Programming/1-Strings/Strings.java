public class Strings {
	public static void main(String[] args){
		// String no es un tipo primitivo, es un objeto
		String message = "Hello, World!";
		
		char[] characters = message.toCharArray();
		
		for(char c : characters){
			System.out.println(c);
		}
		
		/* message = message.replace('o', '0');
		message = message.replace('e', '3');
		message = message.replace('i', '1'); */
		
		message = message.concat(" Lovely day, isn't it?");
		
		message = message.toLowerCase(); //toUpperCase
		
		System.out.println(message);
	}
}
