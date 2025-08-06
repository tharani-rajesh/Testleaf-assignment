package week3.day2;

public class RemoveDuplicateWordsInString {


	    public static void main(String[] args) {
	        String text = "We learn Java basics as part of java sessions in java week1";
	        
	        // Split the string into words
	        String[] words = text.split(" ");
	        int count = 0;

	        // Compare each word with every other word
	        for (int i = 0; i < words.length; i++) {
	            for (int j = i + 1; j < words.length; j++) {
	            	
	                // Check for duplicates (case-insensitive)
	                if (words[i].equalsIgnoreCase(words[j])) {
	                	
	                	// Replace duplicate with empty string	
	                    words[j] = "";  
	                    count++;
	                }
	            }
	        }

	        // Print the final string without empty strings
	        if (count > 0) {
	            System.out.print("Output: ");
	            for (String word : words) {
	                if (!word.equals("   ")) {
	                    System.out.print(word + " ");
	                }
	            }
	        } else {
	            System.out.println("No duplicate words found.");
	        }
	    }
	}


