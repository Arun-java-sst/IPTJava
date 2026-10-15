package list;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main (String[] args){
    List<Integer> li = new ArrayList<Integer>();
    li.add(23);
    li.add(45);
    li.add(89);
    li.add(90);
    for(int i=0; i<li.size(); i++){
        System.out.println(li.get(i));
    }
    }
}
