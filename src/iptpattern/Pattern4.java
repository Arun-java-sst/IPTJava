package iptpattern;

public class Pattern4 {
	
	    public static void main(String[] args) {

	        for (int i = 5; i >= 1; i--) {

	            // Spaces
	            for (int j = 1; j <= 5 - i; j++) {
	                System.out.print(" ");
	            }

	            // Stars
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	}
