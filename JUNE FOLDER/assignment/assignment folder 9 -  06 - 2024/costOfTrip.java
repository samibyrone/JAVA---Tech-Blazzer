import java.util.Scanner;

public class costOfTrip {

	public static void main( String[] args ) {

		Scanner input = new Scanner(System.in);
	
		System.out.print( "Enter the driving distance: ");
		int distance = input.nextInt();

		System.out.print( "Enter the miles per gallon: ");
		int miles = input.nextInt();

		System.out.print( "Enter the price per gallon: " );
		int price = input.nextInt();

		System.out.print( "Total fuel needed: " );
		int fuelNeeded = ( distance / miles );

		System.out.print( "Cost:" );
		int cost = ( fuelNeeded * price );

		System.out.println( "The cost of driving is: " + cost );

	}

}


// Create a scanner object
// Enter the value for driving distance
// Enter the value for miles per gallon
// Enter the value for price per gallon
// Divide the distance by the miles to get the total cost per gallon
// Multiply the cost to get the trip cost
