package iptprogram;

public class SumOf {
public static void main(String[] args) {
	// to find sum of the given number
	int num=123;    //1+2+3=6;
	int temp=num;   //121
	int sum=0;      //121
	while (num >0)  {
		int last=num%10;   //to get the last digit
		sum=sum+last;      //to add the  one digit
		num=num/10;        //to remove the last digit
	}
	
	System.out.println(sum);
	

	//while(num>0)      last=num%10;         sum=sum+last              num=num/10
	//while(123>0)-t    last=123%10=3        sum=0+3=3                 num=123/10=12
	//while(12>0)-t     last=12%10=2         sum=3+2=5                 num=12/10=1
	//while(1>0)-t      last=1%10=1          sum=5+1=6                 num=1/10=0
	//while(0>0)-f----------------------------------------------------------------
	
}
}
