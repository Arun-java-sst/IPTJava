package iptstring;

public class VowelsReplace1 {


	    public static void main(String[] args) {
	    	
	    	//WITH REPLACE METHOD

	        String s = " Smart Skill Technologies";

	        String result = s.replaceAll("[AEIOUaeiou]", "@");

	        System.out.println(result);
	    }
	}
