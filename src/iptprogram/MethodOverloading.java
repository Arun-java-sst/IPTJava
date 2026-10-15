package iptprogram;

public class MethodOverloading {
	private void test(){
		System.out.println("Test 1 called");
	}

	private void test(int a){
		System.out.println("Test 2 called "+a);
	}

	private void test(int b ,String c ){
		System.out.println("Test 3 called "+c+b);
	}

	public static void main (String[] args){

		MethodOverloading s = new MethodOverloading();
		s.test();
		s.test(1234);
		s.test(876,"abc");
	}


}
