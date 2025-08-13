package week4day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		//declare an arrays
		int [] array1 = {3, 2, 11, 4, 6, 7};
		int [] array2 = {1, 2, 8, 4, 9, 7};
		
		//Convert arrays to Lists
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : array1) {
            list1.add(num);
        }

        for (int num : array2) {
            list2.add(num);
        }
        
        System.out.println("Common numbers:");
        for (Integer num : list1) {
            if (list2.contains(num)) {
                System.out.println(num);
            }
        }
	}
}

            
        
    
