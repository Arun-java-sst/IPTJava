package constructor;

public class Sample {
	 public Sample(){
	        this(25);
	    System.out.println("the name is");
	    }
	    public Sample(int age){
	        this("praveen");
	        System.out.println("Sampleage:"+age);
	    }
	    public Sample(String name){
	        this(98764l);
	        System.out.println("name:"+name);
	    }
	    public Sample(long phonenumber){
	        System.out.println("phonenumber:"+phonenumber);
	    }

public static void main (String[]args){
    Sample s = new Sample();
}

}
