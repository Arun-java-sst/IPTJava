package singletonnnnn;

public class Singleton1 {
	public static void main(String[] args) {

        Singletonnnnnn s1 = Singletonnnnnn.getInstance();
        Singletonnnnnn s2 = Singletonnnnnn.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);
    }
}

