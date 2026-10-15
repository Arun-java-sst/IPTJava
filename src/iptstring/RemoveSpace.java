package iptstring;

public class RemoveSpace {

	
	    public static void main(String[] args) {
	        String s = "Hello java one";
	        String result = "";
	        // Loop through each character of the string
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            
	            // Check if the character is not a space
	            if (ch != ' ') {
	                result=result+ch;
	            }
	        }

	        // Output the final result
	        System.out.println(result);
	    }
	}
                                                                                                                                                                                                                                                                                                                                                                                                                            