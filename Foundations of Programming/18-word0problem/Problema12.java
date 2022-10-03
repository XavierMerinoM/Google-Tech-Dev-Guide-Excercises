import java.util.*;

/*

Given an array of strings, return a Map<String, Integer> 
containing a key for every different string in the array, 
always with the value 0. For example the string "hello" 
makes the pair "hello":0. We'll do more complicated counting 
later, but for this problem the value is simply 0.

word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}

*/

// public Map<String, Integer> word0(String[] strings) {
//     Map<String, Integer> map = new HashMap();
//     for (String s:strings) {
//       map.put(s, 0);
//     }
//     return map;
//   }

public class Problema12 {
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int p = 0; p < strings.length; p++){
            if (!map.containsKey(strings[p]))
                map.put(strings[p], 0);
        }

        return map;
    }

    public static void main(String[] args){
        // String[] strings = {"a", "b", "a", "b"};
        // String[] strings = {"a", "b", "a", "c", "b"};
        String[] strings = {"c", "b", "a"};

		Map<String, Integer> res = word0(strings);
		
		System.out.println(res.toString());
	}
}