package iptprogram;

public class Varargs {
	public static void display(int... numbers) {
	   	 for (int num : numbers) {
	        	System.out.println(num);
	   	 }
	}
	public static void main (String[]args){
	           display(10,20,30,40,50);
	          display(10);
		}

}
