package iptArrays;


import java.util.*;

public class ArraylistTosecondHighest {
public static void main(String[] args) {
	int a[] = {10,20,49,60,29,20,100,100};
	List<Integer> li =new ArrayList<>();
	for(int num :a) {
		if(!li.contains(num)) {
			li.add(num);
		}
	}
	//CONVERT ARRAYLIST TO ARRAYS
	Integer ab[] = li.toArray(new Integer[0]);	
	//SORT
//	Arrays.sort(ab);
	for (int i = 0; i < ab.length; i++) {
		for (int j = i+1; j < ab.length; j++) {	
			if (ab[i] > ab[j]) {
				int temp=ab[i];
				ab[i]=ab[j];
				ab[j]=temp;
			}
		}
	}
	//Second max value
	System.out.println("Second highest:" +ab[ab.length-2]);
}
}
//System.out.println(a[a.length-2]);