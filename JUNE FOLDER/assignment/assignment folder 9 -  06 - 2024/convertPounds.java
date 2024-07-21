import java.util.Scanner;

public class convertPounds {

	public static void main( String[] args ) {

		Scanner input = new Scanner(System.in);
		
		double pounds;
		double kilograms;

		System.out.print( " Enter the number in pounds: " );
		pounds = input.nextDouble();

		kilograms = pounds * 0.454;

		System.out.print( pounds + " is " + kilograms + " kilograms " );


	}
}


// Create a scanner object
// Declear method variables
// Prompt the user to enter number in pounds
// Receive input from keyboard
// Compute to kilograms, one pound is 0.454
// Display output result
