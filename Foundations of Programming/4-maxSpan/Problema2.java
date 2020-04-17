/* 
Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */
public class Problema2 {
	public static int maxSpan(int[] nums) {
		int ms = nums.length;
		if (ms == 0 || ms == 1) return ms;
		
		int value1 = 0;
		int value2 = 1;
		int aux = 1;
		ms = 1;
		
		for(int i = 0; i < nums.length; i++){
			value1 = nums[i];
			for(int j = i + 1; j < nums.length; j++){
				aux++;
				if (value1 == nums[j])
					value2 = aux;
			}
			
			aux = 1;
			if (value2 > ms)
				ms = value2;
				value2 = 1;
		}
		
		return ms;
	}
	
	// Suggested solution
	
	public static void main(String[] args){
		//int[] nums = {1, 2, 1, 1, 3};
		//int[] nums = {1, 4, 2, 1, 4, 1, 4};
		//int[] nums = {1, 4, 2, 1, 4, 4, 4};
		int[] nums = {3, 9};
		
		int value = maxSpan(nums);
		System.out.println(value);
	}
}