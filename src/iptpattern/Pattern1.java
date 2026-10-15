package iptpattern;

public class Pattern1 {
//pattern
	public static void main(String[] args) {
		for (int i = 1; i<=6; i++) {             //Rows   --  6 rows
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();   // next line 	
		}
	}
}
