import java.util.Scanner;

public class digitInteger {

	public static void main( String[] args ) {

		Scanner input = new Scanner(System.in);

		System.out.print( "Enter a number between 0 and 1000: " );
		int num = input.nextInt();

		int firstDigit = num % 10;
		int leftOverNumber = num / 10;
		int SecondDigit = leftOverNumber % 10;
		leftOverNumber = leftOverNumber / 10;
		int thirdDigit = leftOverNumber % 10;
		leftOverNumber = leftOverNumber / 10;
		int fourthDigit = leftOverNumber % 10;
		leftOverNumber = leftOverNumber /10;
		int fifthDigit = leftOverNumber % 10;
		int sum = fourthDigit + thirdDigit + SecondDigit + firstDigit + fifthDigit;

		System.out.println( "The sum of all digits is: " + num );

	}
}


// Create a scanner object
// Prompt user to enter a number between 0 - 1000
// Create an integer in a variable
// Receive input from keyboard
// Use % operator to extract digits
// Use / operator to remove extracted digits
// Display output result as sum of the digit.