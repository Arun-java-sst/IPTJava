package userdefined;
import java.util.HashSet;
import java.util.Set;
public class UserDefinedSet {
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
		Set<PojoForList>li=new HashSet<PojoForList>();
		li.add(p);  //0index
		li.add(pfl);//1index
		li.add(p);  //2index
		li.add(pfl);//3index
		//using enhance for loop
		for (PojoForList datas : li) {
			System.out.println(datas.getAge());
			System.out.println(datas.getName());
			System.out.println(datas.getphNum());
		}
	}
}

