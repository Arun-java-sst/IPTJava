package iptstring;

public class FetchRepeatingAnotherMethod {
		public static void main(String[] args) {

		    String s = "programmig";

		    System.out.println("Repeating characters:");

		    for (int i = 0; i < s.length(); i++) {
		        for (int j = i + 1; j < s.length(); j++) {

		            if (s.charAt(i) == s.charAt(j)) {

		                // Check whether the character was already printed
		                boolean alreadyPrinted = false;

		                for (int k = 0; k < i; k++) {
		                    if (s.charAt(i) == s.charAt(k)) {
		                        alreadyPrinted = true;
		                        break;
		                    }
		                }

		                if (!alreadyPrinted) {
		                    System.out.println(s.charAt(i));
		                }

		                break;
		            }
		        }
		    }
		}
		

		}

