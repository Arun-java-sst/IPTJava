package iptstring;
public class MoveDuplicateWordsFirst {
public static void main(String[] args) {
		    String[] s = {"milk", "bread", "eggs", "milk", "cheese"};
			// output {"milk","milk", "bread", "eggs", "cheese"};
		    String[] result = new String[s.length];
		    int index = 0;
		    // First, store duplicate elements
		    for (int i = 0; i < s.length; i++) {
		        for (int j = i + 1; j < s.length; j++) {
		            if (s[i].equals(s[j])) {
		                result[index++] = s[i];
		                break;
		            }
		        }
		    }
		    // Store remaining elements in original order
		    for (int i = 0; i < s.length; i++) {
		        boolean duplicate = false;
		        for (int j = 0; j < i; j++) {
		            if (s[i].equals(s[j])) {
		                duplicate = true;
		                break;
		            }
		        }
		        if (!duplicate) {
		            result[index++] = s[i];
		        }
		    }
		    System.out.print("{");
		    for (int i = 0; i < result.length; i++) {
		        System.out.print("\"" + result[i] + "\"");
		        if (i < result.length - 1) {
		            System.out.print(", ");
		        }
		    }
		    System.out.println("}");
		}
}

