package iptprogram;

public class ReverseaNumber {
	 public static void main(String[] args) {
		 
			// to reverse the given number 
			int num = 123;
			int rev = 0;   //123
			while (num >0) {
				int last= num%10; //to get the last digit
				rev=(rev*10)+last;   // to add the one digit 
				num=num/10;  //to remove the last digit
			}
			System.out.println(rev);
			
			//while(num>0)      last=num%10;         rev=(rev*10)+last         num=num/10
			//while(123>0)-t    last=123%10=3        rev=(0*10)+3=3            num=123/10=12
			//while(12>0)-t     last=12%10=2         rev=(3*10)+2=32           num=12/10=1
			//while(1>0)-t      last=1%10=1          rev=(32*10)+1=321         num=1/10=0
			//while(0>0)-f----------------------------------------------------------------
			 
	 }
}	 
//		 
//		 
//		
//	        int num = 12345;
//	        int reverse = 0;
//	        while (num != 1) {
//	            int digit = num % 10;
//	            reverse = reverse * 10 + digit;
//	            num = num / 10;
//	        }
//	        System.out.println(reverse); 
//}
//}


//num % 10
//12345 % 10 = 1234.5

//reverse = reverse * 10 + digit;
//reverse = 0 * 10 + 1234.5

//num = num/10;
//num = 12345/10= 1234.5;

//IterationInitial numdigit (num % 10)reverse (reverse * 10 + digit)Remaining num (num / 10)Start12345—0—1st1234550 * 10 + 5 = 512342nd123445 * 10 + 4 = 541233rd123354 * 10 + 3 = 543124th122543 * 10 + 2 = 543215th115432 * 10 + 1 = 543210