package week4day1;

import java.util.*;

public class SortingUsingCollection {
    public static void main(String[] args) {
    	
        //Declare & initialize a String array
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        //Convert array to a List
        List<String> orgList = new ArrayList<>(Arrays.asList(companies));

        //Sort the list in ascending order
        Collections.sort(orgList);  
        
        // Now list is [Aspire Systems, CTS, HCL, Wipro]

        // Reverse the sorted list
        Collections.reverse(orgList); 
        // [Wipro, HCL, CTS, Aspire Systems]

        //Iterate in reverse and print each element
        System.out.println("Reversed Output:");
        
        for (int i = orgList.size() - 1; i >= 0; i--) {
        	
          System.out.print(orgList.get(i));
            
           if (i != 0) {
            	
               System.out.print(", ");
            }
        
        }
    }
}

