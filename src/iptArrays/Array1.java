package iptArrays;

public class Array1 {
public static void main(String[] args) {
	//ARRAY
	int[] a1 = {1,2,3,4,5};
	int[] a2 = {4,5,6,7,8};
	
	for(int i = 0; i< a1.length; i++) {
		for(int j=0; j< a2.length; j++) {
			if(a1[i] == a2[j]) {
				System.out.println(a1[i]);
			}
		}
	}
	
}
}
