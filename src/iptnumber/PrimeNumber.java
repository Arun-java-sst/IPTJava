package iptnumber;

public class PrimeNumber {
public static void main(String[] args) {
	
	// to check given number is prime or not
	
	int num=25;
	boolean prime=true;
	for (int i = 2; i < num; i++) {
		// 9%3==0 -t
		if (num % i==0) {
			prime=false;
			break;
		}
	}
	if (prime) {
		System.out.println("Given Number is Prime");
	}else {
		System.out.println("Given Number is Not Prime");
	}
	
}
}
