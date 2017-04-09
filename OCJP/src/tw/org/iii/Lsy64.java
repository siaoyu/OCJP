package tw.org.iii;

import java.util.HashMap;
import java.util.Set;

public class Lsy64 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "Lsy");
		map.put("weight", 80.5);
		map.put("gender", true);
		
		Set<String> keys = map.keySet();
		for (String key : keys){
			System.out.println(key+" : "+map.get(key));
		}
	}

}
