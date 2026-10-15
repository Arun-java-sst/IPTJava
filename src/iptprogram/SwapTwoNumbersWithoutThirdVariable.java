package iptprogram;

public class SwapTwoNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		
	
	int a = 15;
	int b = 25;

	a = a ^ b;
	b = a ^ b;
	a = a ^ b;

	System.out.println("a = " + a + ", b = " + b);

}
}