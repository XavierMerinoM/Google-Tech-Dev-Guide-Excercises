/*

Given a non-empty array, return true if there is a place to split 
the array so that the sum of the numbers on one side is equal 
to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1])// → true
canBalance([2, 1, 1, 2, 1])// → false
canBalance([10, 10])// → true

*/

public class Problema5 {
    public static boolean canBalance(int[] nums) {
        int valueL = 0;
        int valueR = 0;
        int j = 0;

        for(int i = 0; i < nums.length - 1; i++){
            for(j = i; j >= 0; j--){
                valueL = valueL + nums[j];
            }

            for(j = i + 1; j < nums.length; j++){
                valueR = valueR + nums[j];
            }
            
            // System.out.println(String.valueOf(i) + "-" + String.valueOf(valueL) + "-" + String.valueOf(valueR));

            if (valueL == valueR)
                return true;

            valueL = 0;
            valueR = 0;
        }

        return false;
    }

    public static void main(String[] args){
        //int[] nums = {1, 1, 1, 2, 1};// → true
        //int[] nums = {2, 1, 1, 2, 1};// → false
        int[] nums = {10, 10};// → true

		boolean res = canBalance(nums);
		
		System.out.println(res);
	}
}