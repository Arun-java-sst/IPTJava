package iptnumber;

public class Palindrome {
public static void main(String[] args) {
	// to check given number is palindrome or not
	int num = 121;
//	int temp=num;   //121
	int rev = 0;   //121
	while (num >0) {
		int last= num%10; //to get the last digit
		rev=(rev*10)+last;   // to add the one digit 
		num=num/10;  //to remove the last digit
	}
	System.out.println(rev);
	
	
	if (rev==num) {
		System.out.println("Given Number is Palindrome");
		
	} else {
		System.out.println("Given Number is Not Palindrome");
	}
	        String text = "level";
	        boolean isPalindrome = true;

	        for (int i = 0; i < text.length() / 2; i++) {
	            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");
	    }
	}


