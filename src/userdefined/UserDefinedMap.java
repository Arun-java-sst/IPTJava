package userdefined;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class UserDefinedMap {
public static void main(String[] args) {
	PojoForList p = new PojoForList();
	p.setage(22);
	p.setName("arun");
	p.setphNum(432675889l);
	PojoForList pfl = new PojoForList();
	pfl.setage(66);
	pfl.setName("kumar");
	pfl.setphNum(4566789767l);
	//user define set
		Map<Integer,PojoForList>li=new HashMap<Integer,PojoForList>();
		li.put(1, p);
		li.put(2, pfl);
		li.put(3, p);
		li.put(4, pfl);
		Set<Entry<Integer, PojoForList>> map = li.entrySet();
		for (Entry<Integer, PojoForList> pam : map) {
		System.out.println(pam.getKey());
		System.out.println(pam.getValue().getAge());
		System.out.println(pam.getValue().getName());
		System.out.println(pam.getValue().getphNum());
		}
}
}
