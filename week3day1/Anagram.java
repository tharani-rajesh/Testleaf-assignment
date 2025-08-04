package week3day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//Defining two strings
		String str1 = "stops";
	    String str2 = "potss";
	    
	    str1=str1.toLowerCase();
	    str2=str2.toLowerCase();
	    //compare lengths
	    if(str1.length()!=str2.length())
	    { 
	    	System.out.println("Strings are not anagram");
	    }
	    else {
	    	
	    	//covert strings to character arrays
	    	char[] String1=str1.toCharArray();
	    	char[] String2=str2.toCharArray();
	    	Arrays.sort(String1);
	    	Arrays.sort(String2);
	    	if(Arrays.equals(String1, String2) == true)
	    	{
	    		System.out.println("Strings are Anagram");
	    	}
	    	else {
	    		System.out.println("Strings are not anagram");
	    	}
	    	
	    	
	    	
	    }
	}   
	   	
}
	

	
