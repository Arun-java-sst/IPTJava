package map;
import java.util.*;
import java.util.Map.Entry;
public class Arun {
	 public static void main (String[] args) {
	        Map<Integer,String> mp=new HashMap<Integer,String>();
	        mp.put(2, "veera");
	        mp.put(3, "rama");
	        mp.put(4, "raghu");
	        mp.put(90, "lara");

	    Set<Entry<Integer,String>> al =  mp.entrySet();

	    for(Entry<Integer,String> i : al) {
	    System.out.println(i.getKey());
	    }
	    }
}
