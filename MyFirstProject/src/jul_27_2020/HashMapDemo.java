package jul_27_2020;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//adding elements into a map
		map.put(1, "Apple");
		map.put(2, "Mango");
		map.put(3, "Strawberry");
		
		System.out.println("Length of map: " + map.size());
		
		//traverse the Map
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " +
					e.getValue());
		}
		
		if(map.containsKey(2)) {
			String val = map.get(2);
			System.out.println(val);
		}
			
		
	}

}
