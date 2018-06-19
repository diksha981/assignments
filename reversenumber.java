import java.util.Scanner;

public class reversenumber {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a no. to reverse : ");
		
		
		int original = scanner.nextInt();
		int reverse = 0;
		int remainder;
		 
		while(original != 0) {
			remainder = original%10;
			reverse = reverse*10+remainder;
			original = original/10;
			
	
		}
	System.out.println("reverse of number is : " + reverse);
	
	
	}
	
	
	
}
