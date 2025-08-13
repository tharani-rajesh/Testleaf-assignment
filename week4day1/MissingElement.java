package week4day1;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class MissingElement {

	    public static void main(String[] args) {
	    	
	        //Declare and initialize the array
	        int[] numbers = {1, 2, 3, 4, 10, 6, 8};

	        //Convert array to List
	        List<Integer> orderList = new ArrayList<>();
	        for (int num : numbers) {
	            orderList.add(num);
	        }

	        //Sort the list
	        Collections.sort(orderList);

	        System.out.println("Sorted List: " + orderList);

	        //Find missing numbers
	        System.out.println("Missing numbers:");
	        
	        
	        for (int i = 0; i < orderList.size() - 1; i++) {
	            int current = orderList.get(i);
	            int next = orderList.get(i + 1);

	            // Check if there is a gap
	            if (next != current + 1) {
	            	
	                
	                for (int missing = current + 1; missing < next; missing++) {
	                    System.out.println(missing);
	                }
	            }
	        }
	    }
	}



