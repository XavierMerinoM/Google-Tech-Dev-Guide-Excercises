/*
Write a simple interpreter which understands "+", "-", and "*" 
operations. Apply the operations in order using command/arg 
pairs starting with the initial value of `value`. 
If you encounter an unknown command, return -1.

interpret(1, ["+"], [1]) → 2
interpret(4, ["-"], [2]) → 2
interpret(1, ["+", "*"], [1, 3]) → 6
*/
public class Problema11 {
    public static int interpret(int value, String[] commands, int[] args) {         
        if (commands.length != args.length)
            return -1;

        int result = value;
        
        for (int i=0; i< commands.length; i++) {
            if (!commands[i].equals("+") && 
                !commands[i].equals("-") &&
                !commands[i].equals("*"))
                return -1;
            
            switch(commands[i]) 
            { 
                case "+": 
                    result = result + args[i];
                    break; 
                case "-": 
                    result = result - args[i]; 
                    break; 
                case "*": 
                    result = result * args[i];
                    break; 
                default: 
                    return -1; 
            }
        }
        
        return result;
    }

    public static void main(String[] args){       
        // int value = 1;
        // String[] commands = {"+"};
        // int[] arg = {1};

        // int value = 4;
        // String[] commands = {"-"};
        // int[] arg = {2};

        int value = 1;
        String[] commands = {"+", "*"};
        int[] arg = {1, 3};

		int res = interpret(value, commands, arg);
		
		System.out.println(res);
	}
}