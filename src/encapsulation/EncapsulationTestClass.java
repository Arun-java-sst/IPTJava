package encapsulation;

public class EncapsulationTestClass extends PojoClass{
	 public static void main (String []args){
		 EncapsulationTestClass S = new EncapsulationTestClass();
		    S.setage(25);
		    S.setname("praveen");
		    S.setpNumber(1234578922l);
		   
		   System.out.println("Age:"+S.getage());
		   System.out.println("Name:"+S.getname());
		   System.out.println("phoneNumber:"+S.getpNumber());
		    }
}
