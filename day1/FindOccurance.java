package week3.day1;

public class FindOccurance {
	public static void main(String[] args) {
		
		String inputStr = "Testleaf";
		char ch = 'e';
		int count = 0;
		
		for (int i = 0; i <= inputStr.length()-1; i++) {
			
			if(inputStr.charAt(i) == ch) {
				count++;
				
			}
			
		}
		System.out.println("Count character:" + count);
	}

}
