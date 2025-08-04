package week3day1;



public class FindIntersecions {
	
	public static void main(String[] args) {
		
	//compare 2 arrays
	int arr1[] = {3,2,11,4,6,7};
	int arr2[]= {1,2,8,4,9,7};
	
	System.out.println("Matching Elements are");
	
	//iterate through each element in arr1
	for (int i = 0; i < arr1.length; i++) {
		
	//iterate through each element in arr2
	for (int j = 0; j < arr2.length; j++) {
		
	//compare 2 arrays
		if (arr1[i] == arr2[j]) {
			
			System.out.println(arr1[i]);
		}
	}	
		
	}
	
	
	}
}	
	
	
	
	


