package day27;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,3,4,5,5,6,7,7,7};
		
		HashSet<Integer> hs = new HashSet<>();
		//HashSet can store unique values
		
		for(int i=0;i<arr.length;i++) {
			
			if(!hs.add(arr[i])) {
				System.out.println(arr[i]+" Duplicate value");
			}
		}
		
	}

}
