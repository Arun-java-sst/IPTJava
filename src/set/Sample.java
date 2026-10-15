package set;


import java.util.*;

public class Sample {
    public static void main(String[]args){
        Set<Integer> lh=new HashSet<Integer>();
          lh.add(10);
          lh.add(20);
          lh.add(30);
          
          for(int i:lh){
              System.out.println(i);
          }
      }
}
