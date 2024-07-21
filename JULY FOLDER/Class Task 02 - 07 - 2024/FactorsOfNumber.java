import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
	
		int counter = 0;
		int sum;

			System.out.println(" Enter your number ");
			int number = input.nextInt();
	
			for  (sum = 2; sum <= number; sum++) {
				if (number % sum == 0)
				counter++;
			}
	
			System.out.print(counter);

	}

}





// write a program that prompt user to enter input
// Scanner inputCollector = new Scanner(System.in);
// int numberOfFactors = 1;
// for ( int counter = 2; counter <= userInput/2; counter++)
// if (userInput % i == 0) numberOfFactors++;
// display the factorial that divide the input with reminder
// display the ouput of how many count of number divide the input






