public class Arrays {
	public static void main(String[] args){
		int[] ages = {21, 32, 43, 56};
		
		boolean [] students = new boolean[4];
		
		students[0] = true;
		students[1] = false;
		students[2] = true;
		students[3] = false;
		
		for(int i = 0; i < ages.length; i++){
			System.out.println(ages[i]);
		}
	}
}