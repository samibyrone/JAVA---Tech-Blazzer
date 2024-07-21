import java.util.Scanner;

public class NaturalNumbers {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

		int i;
		int sum = 0;
		int number;

		System.out.print("Enter the natural numbers: ");
		number = input.nextInt();

		for (i = 1; i <= number; i ++) {
			sum = sum + i;
		}
		
		
		System.out.println("The sum of 10 natural numbers is " + sum);

	}
}



// Declare a scanner
// Declare the number variable
// Declare the sum variable
// Calculate the sum
// display the output value