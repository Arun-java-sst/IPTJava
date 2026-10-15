package iptpattern;

public class Pattern3   {
public static void main(String[] args) {
	//pattern
	int row =5;
	for (int i = 1; i <=row; i++) {  //row
		//j=4
		for (int j = row-i; j >=1 ; j--) {// space
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) { //star
		System.out.print("*");	
		}
		System.out.println();
	}
}
}
