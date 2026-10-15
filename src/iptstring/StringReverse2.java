package iptstring;

public class StringReverse2 {
	public static void main(String[] args) {
		
	
// STRING REVERSE WITHOUT CHANGING POSITION
	String s ="Smart Skills Technoligies";
//o/p=---	//tranS  skillS seigolonhceT
	String[] words = s.split(" ");
	String res="";
	for(String word : words) {
		String rev="";
	     for (int i = word.length()-1; i >=0; i--) {
		char ch = word.charAt(i);
		rev=rev+ch;
	}
	res=res+rev+" ";   //tramS sllikS  seigolonhceT
}
	System.out.println(res);
}
}