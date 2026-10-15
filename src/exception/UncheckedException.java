package exception;

public class UncheckedException {
	 public static void main(String[] args) {
	        try {
	            String text = null;
	            text.toUpperCase();
	         
	        } catch (Exception e) {
	            System.out.println("Unchecked Exception");

	        } finally {
	            System.out.println("Finally block executed.");
	        }
	    }
}
