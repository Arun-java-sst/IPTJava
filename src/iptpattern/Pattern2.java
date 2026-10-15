package iptpattern;

public class Pattern2 {
public static void main(String[] args) {
	int row=7;
	//PATERN
	for (int i = 1; i <=row; i++) { //row
		             //j=4
		for (int j = row-i; j >=1; j--) {    // space
			System.out.print(" ");
		}              //1<=1
		for (int j = 1; j <=i; j++) {  //star
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
