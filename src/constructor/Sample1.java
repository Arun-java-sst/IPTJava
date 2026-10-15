package constructor;
//super
public class Sample1 extends Sample{
	 public Sample1(){
	        super(30);
	        System.out.println("child class");
	    }
	    public Sample1(int age){
	        System.out.println("age:"+age);
	    }
	    public static void main(String[]args){
	        Sample1 s = new Sample1();
	    }
}
