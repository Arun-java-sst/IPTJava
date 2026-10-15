package map;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		Map<String, Character> kl = new HashMap<String, Character>();
		kl.put("kumar", 'a');
		kl.put("ajith", '@');
		kl.put("raghu", 'r');
		kl.put("lina", 'a');
		kl.put("java", 'j');
		kl.put("fish", 'f');
		// 1) using entry set method creation format for iteration
		Set<Entry<String, Character>> mapvalue = kl.entrySet();
		for (Entry<String, Character> newmapvalue : mapvalue ) {
			System.out.println(newmapvalue.getKey());
		System.out.println(newmapvalue.getValue());
		
		// 2) 
		
		}
	}
	}


