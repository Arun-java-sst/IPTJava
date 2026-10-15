package iptArrays;

public class SecondMaxValue {
public static void main(String[] args) {
	//TO FETCH 2nd Max value
	//int [] a = {10,40,20,20,60,30,70,50};
	int [] a ={90,23,45,1000,99,888};
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {	
			if (a[i] > a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(a[a.length-2]);
	
}
}