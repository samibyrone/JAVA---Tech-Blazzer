import java.util.Scanner;

public class convertFeet {

	public static void main( String[] args ) {

		double feet;
		double meter;

		Scanner input = new Scanner(System.in);

		System.out.print( "Enter the value for feet: ");
		feet = input.nextDouble();

		meter = feet * 0.305;
	
		System.out.print( "feet is: " + meter  + " meters " );	

	}
}


// Declear the method variables
// Create a scanner object
// Enter the input value
// Compute meter into foot (one foot is 0.305 meter.)
// display output result
