package week2.day1;

public class CheckPalindrome {
	public static void main(String[] args) {
		int input = 545;
		int originalvalue = input;
		int output = 0;
		
		
		for(int i = input; i > 0; i = i / 10);{

			int remainder = originalvalue % 10;
			output = (output * 10) + remainder;
			
		}
		
		if (originalvalue == output) {
			System.out.println("palindrome");
		}else  {
			System.out.println("not a palindrome");
		}
			
	}

}
