package iptnumber;

public class ProductOfDigit {

	//digit
	
	    public static void main(String[] args) {
	        int num = 1234; //1*2*3*4= 24
	        int product = 1;

	        while (num > 0) {
	            int digit = num % 10;
	            product = product * digit;
	            num = num / 10;
	        }

	        System.out.println("Product of digits: " + product);
	    }
	}
