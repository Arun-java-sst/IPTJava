package exception;

import java.io.FileReader;

public class CheckedException {
	 public static void main (String[] args){
		    try {
		      FileReader f = new FileReader("select.text");
		        }
		     catch(Exception e) {
		      System.out.println("Catched Checked Exception");
		      }
		      finally{
		      System.out.println("Finally Block Executed");
		    }
		  }
}
