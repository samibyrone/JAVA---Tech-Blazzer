import java.util.Scanner;

public class Divisible {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		int number;

		System.out.print("Enter number: ");
		number = input.nextInt();

		if (number % 3 == 0) {
		
			System.out.print(number + " is divisible by 3 " );
		
		} else {
		
			System.out.print(number  + " not divisible by 3 ");
		
		}

	}
}



 
// Declear your main
// Declear your scanner
// Prompt user to input number
// Check if number is divisible by 3
// Display out result
