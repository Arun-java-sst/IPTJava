package iptstring;
public class StringAscendingDescending {
	    public static void main(String[] args) {
	    //Ascending	
	    	String names = "arunkumar";
	    	char[] a = names.toCharArray();
	        for (int i = 0; i < names.length(); i++) {
	            for (int j = i + 1; j < names.length(); j++) {
	                if (a[i]>a[j]) {
	                    char temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	            System.out.println(a);
	            
//Descending
String name = "arunkumar";
char[] b = name.toCharArray();
for (int i = 0; i < name.length(); i++) {
    for (int j = i + 1; j < name.length(); j++) {
        if (b[i]<b[j]) {
            char temp = b[i];
            b[i] = b[j];
            b[j] = temp;
        }
    }
}
    System.out.println(b);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}




