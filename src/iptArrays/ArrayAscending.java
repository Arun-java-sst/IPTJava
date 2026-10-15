package iptArrays;

public class ArrayAscending {
public static void main(String[] args) {
	// ARRAY ASCENDING ORDER
	int [] a = {10,20,90,86,9,49,98,11};
	
	for (int i = 0; i < a.length; i++) {
		
		for (int j = i+1; j < a.length; j++) {
			
			if(a[i] > a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	 for (int i : a) {
         System.out.print(i + " ");
}
}
}