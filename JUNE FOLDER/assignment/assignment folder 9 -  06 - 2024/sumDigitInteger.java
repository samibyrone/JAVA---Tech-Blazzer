import java.util.Scanner;

public class sumDigitInteger {

	public static void main( String[] args ) {

		Scanner input = new Scanner(System.in);


		System.out.print( "Enter a number between 0 and 1000: " );
		int num = input.nextInt();

		int firstDigit = num % 0;
		int number = num / 10;
		int secondDigit = number % 10;
		number = number / 10;
		int thirdDigit = number % 10;
		number = number / 10;
		int fourthDigit = number % 10;
		number = number /10;
		int fifthDigit = number % 10;
		int sum = fifthDigit + fourthDigit + thirdDigit + secondDigit + firstDigit;

		System.out.println( "The sum of all digits in: " + num + " is " + num );

	}
}