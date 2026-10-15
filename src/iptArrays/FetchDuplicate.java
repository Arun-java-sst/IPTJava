package iptArrays;

public class FetchDuplicate {
	//to Fetch Duplicate
		public static void main(String[] args) {
			int [] a = {10,40,20,20,60,30,70,50};
			
			for (int i = 0; i < a.length; i++) {
				
				for (int j = i+1; j < a.length; j++) {
					
					if (a[i] == a[j]) {
						System.out.println(a[i]);
					}
				}
			}
			
		}
		}


