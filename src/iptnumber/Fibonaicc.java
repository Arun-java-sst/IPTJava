package iptnumber;

public class Fibonaicc {
public static void main(String[] args) {
	// to find fibbonacci Series Number
	
	int num=10; //0,1,1,2,3,5,8,13,21,34,55,89
	int a=0;
	int b=1;  //1
	System.out.println(a);   //0
	System.out.println(b);   //1
	for (int i = 1; i < num; i++) {
          int c=a+b;   //2
          System.out.println(c);  //2
          a=b;
          b=c;
	}
	//a=1
	//b=1
	//0,1,1,2,3
	
}
}
