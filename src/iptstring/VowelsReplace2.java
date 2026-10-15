package iptstring;

public class VowelsReplace2 {
	    public static void main(String[] args) {
       //WITHOUT REPLACE METHOD
	        String s = " Smart Skill Technologies";
	        String result = "";

	        for (int i = 0; i < s.length(); i++) {

	            char ch = s.charAt(i);

	            if (ch == 'a' || ch == 'e' || ch == 'i' ||
	                ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' ||
	                ch == 'O' || ch == 'U') {

	                result = result + '@';
	            } else {
	                result = result + ch;
	            }
	        }

	        System.out.println(result);
	    }
	}
