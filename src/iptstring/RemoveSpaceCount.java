package iptstring;

public class RemoveSpaceCount {

	
	    public static void main (String[] args) {
	        
	    
	String s = "Hello java one";
	//    int totalcount = s.length();
	    int totalspace= 0;
	    
	for(int i =0; i <s.length(); i++){
	    
	if(s.charAt(i) != ' '){
	    totalspace++;
	}
	}
	    System.out.println(totalspace);

	}
	}