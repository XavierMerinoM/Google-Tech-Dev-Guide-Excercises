/*

Modify and return the given map as follows: if the key "a" 
has a value, set the key "b" to have that same value. 
In all cases remove the key "c", leaving the rest 
of the map unchanged.


mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

*/

import java.util.HashMap;
import java.util.Map;

public class Problema9 {
    public static Map<String, String> mapShare(Map<String, String> map) {
        String valueA = "";

        if (map.containsKey("a")){
            valueA = map.get("a");
            map.put("b", valueA);
        }

        map.remove("c");

        return map;
    }

    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();
        
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        
        // map.put("b", "xyz");
        // map.put("c", "ccc");

        // map.put("a", "aaa");
        // map.put("d", "hi");
        // map.put("c", "meh");

		Map<String, String> res = mapShare(map);
		
		System.out.println(res);
	}
}