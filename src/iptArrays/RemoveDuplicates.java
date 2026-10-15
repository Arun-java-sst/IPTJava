package iptArrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
public static void main(String[] args) {
	int[] a = {10, 2, 30, 999, 10, 2, 87,19,19};
	List<Integer> l= new ArrayList<>();
	for(int num :a) {
		if(!l.contains(num)) {
			l.add(num);
		}
	}
	System.out.println(l);
}
}
