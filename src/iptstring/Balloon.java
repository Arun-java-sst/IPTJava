package iptstring;

public class Balloon {
public static void main(String[] args) {


	        String str = "Balllllllloon";
	        int count = 0;
// FIRST METHOD
//	        String result = "";
//	        for (int i = 0; i < str.length(); i++) {
//	            if (str.charAt(i) == 'o') {
//	                count++;
//	                if (count == 2) {
//	                    result = result + '@';
//	                } else {
//	                    result = result + str.charAt(i);
//	                }
//	            } else {
//	                result = result + str.charAt(i);
//	            }
//	        }	        
//	SECOND METHOD        
	        int second = str.indexOf('o', str.indexOf('o')+1);
	        String result = str.substring(0, second) + "@" + str.substring(second+1);       
	        System.out.println(result);
	    }
	}