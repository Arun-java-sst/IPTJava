package singletonnnnn;

public class Singletonnnnnn {
	

	    // 1. Create static variable
	    private static Singletonnnnnn obj;

	    // 2. Make constructor private
	    private Singletonnnnnn() {
	        System.out.println("Constructor called");
	    }

	    // 3. Provide static method to get object
	    public static Singletonnnnnn getInstance() {

	        if (obj == null) {
	            obj = new Singletonnnnnn();
	        }

	        return obj;
	    }
	

}
