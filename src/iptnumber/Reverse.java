package iptnumber;

public class Reverse {
public static void main(String[] args) {
	//reverse
	int num= 123;
	int rev=0;
	while(num>0) {
		int last =num%10;
		rev= (rev*10)+last;
		num=num/10;

	}
	System.out.println(rev);
}
}
