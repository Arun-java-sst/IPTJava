package iptArrays;

public class MoveZerosfromRight {


	    public static void main(String[] args) {

	        int[] a = {1, 0, 1, 1, 0, 0, 1, 0, 1, 0};

	        int index = 0;

	        // Move all 1s to the left
	        for (int i = 0; i < a.length; i++) {

	            if (a[i] == 1) {
	                a[index] = 1;
	                index++;
	            }
	        }

	        // Fill remaining positions with 0
	        while (index < a.length) {
	            a[index] = 0;
	            index++;
	        }

	        // Print array
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	    }
	}

