package scanner;

import java.util.Scanner;

public class Example {
	 public static void main(String[]args){
	        Scanner s = new Scanner(System.in);
	        System.out.println("ENTER STUDENT NAME");
	             String name= s.next();
	                 System.out.println("NAME:"+name);
	        System.out.println("ENTER STUDENT ID");
	                int id = s.nextInt();
	                System.out.println("ID:"+id);
	        System.out.println("ENTER STUDENT INITAL");
	                char inital = s.next().charAt(0);
	                System.out.println("INITAL:"+inital);
	        System.out.println("ENTER STUDENT ADDRESS");
	         String address = s.next();
	               System.out.println("ADDRESS:"+address);
	        System.out.println("ENTER FEES");
	                float fee = s.nextFloat();
	                System.out.println("FEES:"+fee);
	    }
	}

