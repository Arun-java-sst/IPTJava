package iptstring;

public class LevelPalindrome {
	 public static void main(String[] args) {
	//String Reverse
	String s = "level";
	String temp =s;
	String rev="";
	for(int i = s.length()-1; i>=0; i--) {
		char ch = s.charAt(i);
		rev=rev+ch;		
	}
	System.out.println(rev);
	

	if (rev.equals(temp)) {
		System.out.println("Given String is Palindrome");
		
	} else {
		System.out.println("Given String is Not Palindrome");
	}
	   //METHOD 2
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