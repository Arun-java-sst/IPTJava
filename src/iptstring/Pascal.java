package iptstring;



public class Pascal {
public static void main(String[] args) {
	
	// String pascal notation 
	String s = "smart skills technoligies";
	
	String res="";
	String[] words = s.split(" ");
	
	for (String word : words) {
		char fstChar = word.charAt(0);
		char upperCase = Character.toUpperCase(fstChar);   //S
		String remain = word.substring(1);     //kills
		res=res+upperCase+remain+" ";    //Smart Skills Technology
	}
	System.out.println(res);
}
}
