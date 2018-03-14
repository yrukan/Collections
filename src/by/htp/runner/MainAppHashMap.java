package by.htp.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainAppHashMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Two");
		
		/*System.out.println(map.values());
				
		for(String s: map.values()){
			System.out.println(s);
		}*/
		
		System.out.println();
		
		for(Entry<Integer, String> entry: map.entrySet()){
			System.out.println(entry);
		}
		
		
		
	}

}
