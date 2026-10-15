package iptnumber;

public class Countof {
	public static void main(String[] args) {
		
// to find the count of even number
	int count=0;
	for(int i=1; i<=10; i++) {
		if(i % 2==0) {
			count++;  //0+1 =1
			System.out.println(i);
		}
	}
	System.out.println("Count of Even Number :"+count);
}
}
