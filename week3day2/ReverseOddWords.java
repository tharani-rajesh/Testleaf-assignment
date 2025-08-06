package week3day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		
		//change to character array
		char[] arr = test.toCharArray();
		String reverse = " ";
		
		for (int i = arr.length - 1;i>=0; i--) {
			reverse = reverse + arr[i];
			
		}
		System.out.println(reverse);

	}

}
