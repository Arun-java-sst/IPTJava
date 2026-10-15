package userdefined;




	// Main class
public class AgeException extends Exception{

	    public static void main(String[] args) {

	        int age = 16;

	        try {
	            if (age < 18) {
	                throw new AgeException();
	            }

	            System.out.println("Eligible to vote");

	        } catch (AgeException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
	

