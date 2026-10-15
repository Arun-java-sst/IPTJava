package iptnumber;

public class Armstrong {
public static void main(String[] args) {
	// to find given number is armstrong
	
	int num=153;  //(1*1*1)+(5*5*5)+(3*3*3)=1+125+27=153
	int temp=num;   //153
	int ams=0;     //121
	while(num>0) {
		int last=num%10;
		ams=ams+(last*last*last);
		num=num/10;
	}
	System.out.println(ams);

	//while(num>0)      last=num%10;         ams=ams+(last*last*last)         num=num/10
	//while(153>0)-t    last=153%10=3        ams=0+(3*3*3)=27                 num=153/10=15
	//while(15>0)-t     last=15%10=5         ams=27+(5*5*5)=152               num=15/10=1
	//while(1>0)-t      last=1%10=1          ams=152+(1*1*1)=153              num=1/10=0
	//while(0>0)-f----------------------------------------------------------------
	
	if (temp==ams) {
		System.out.println("Given Number is Amstrong");
	} else {
        System.out.println("Given Number is Not Armstrong");
	}
}
}
