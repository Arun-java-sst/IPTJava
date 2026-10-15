package userdefined;
import java.util.*;
public class UserDefinedList {
public static void main(String[] args) {
	PojoForList p = new PojoForList();
	p.setage(22);
	p.setName("arun");
	p.setphNum(432675889l);
	PojoForList pfl = new PojoForList();
	pfl.setage(66);
	pfl.setName("kumar");
	pfl.setphNum(4566789767l);
	//user define list converting set into list
	List<PojoForList>li=new ArrayList<PojoForList>();
	li.add(p);  //0index
	li.add(pfl);//1index
	li.add(p);  //2index
	li.add(pfl);//3index
	//using for loop
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i).getAge());
		System.out.println(li.get(i).getName());
		System.out.println(li.get(i).getphNum());
	}
}
}
