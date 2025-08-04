package week3.day1;

import java.util.*;

public class FindMissingElement {
	
	public static void main(String[] args) {
		
		
		//given
		int arr[] = {1,4,3,2,8,6,7};
		int size = arr.length;
		
		//sort an array
		Arrays.sort(arr);
		for(int i = 1; i<size; i++) {
			if(arr[i-1]!=i) {
			
		
				System.out.println("Missing number: " + i);
				break;
			}
		}
		
	}
}
		
		
	


