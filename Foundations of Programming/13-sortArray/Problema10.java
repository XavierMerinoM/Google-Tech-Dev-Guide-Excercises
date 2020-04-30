import java.util.Arrays;

/*

Return an array that contains the sorted values from the input array 
with duplicates removed.


sort([]) → []
sort([1]) → [1]
sort([1, 1]) → [1]

*/

public class Problema10 {
    public static int[] sort(int[] a) {
        if (a.length == 0)
            return a;
        
        int rep = 0;
        
        int p, j;
        int aux;
        for (p = 1; p < a.length; p++){ // desde el segundo elemento hasta
            aux = a[p]; // el final, guardamos el elemento y
            j = p - 1; // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < a[j])){ // mientras queden posiciones y el
                                              // valor de aux sea menor que los
                a[j + 1] = a[j];       // de la izquierda, se desplaza a
                j--;                   // la derecha
            }

            if (aux == a[j])
                 rep += 1;

            a[j + 1] = aux; // colocamos aux en su sitio
        }

        int[] b = new int[a.length - rep];
        b[0] = a[0];
        j = 0;

        for (p = 1; p < a.length; p++){
            if (a[p] != a[p - 1]){
                j++;
                b[j] = a[p];
            }
        }

        return b;
    }

    public static void main(String[] args){
        //int[] nums = {};// → []
        //int[] nums = {1};// → [1]
        //int[] nums = {1, 1};// → [1]
        int[] nums = {1, 5, 7, 4, 7, 8, 5, 6, 1};// → [1]

		int[] res = sort(nums);
		
		System.out.println(Arrays.toString(res));
	}
}