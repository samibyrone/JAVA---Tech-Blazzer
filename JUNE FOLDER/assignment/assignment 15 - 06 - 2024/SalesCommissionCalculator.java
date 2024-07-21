import java.util.Scanner;

public class SalesCommissionCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int miles = 0;
		int gallons = 0;
		double milesPerGallons = 0;
		int totalMiles = 0;
		int totalGallons = 0;
		double totalMilesPerGallons = 0;
		int trips = 0;
		
		System.out.print("Enter trip milleage (-1 to quit): ");
		miles = input.nextInt();

		if ( miles != -1 ) {
			System.out.print("Enter trip gallons: ");
			gallons = input.nextInt();
			trips++;
		}

		while ( miles != -1 ) {
			totalMiles += miles;
			totalGallons += gallons;
			totalMilesPerGallons = (double) totalMiles / totalGallons;	

			milesPerGallons = (double) miles / gallons;

			System.out.printf(" Trips %d's miles_Per_Gallons this tankful: %.2f\n ", trips, milesPerGallons );

			if ( trips > 1 ) {
			System.out.printf(" \n Total miles  ");
			gallons = input.nextInt();
		}

			System.out.printf(" Total miles_Per_Gallon: %.2f\n ", totalMilesPerGallons );

			System.out.print("Enter miles (-1 to quit): ");
			miles = input.nextInt();

		}
	}

}


// Declare a scanner
// Prompt user to enter trip milleage
// Prompt user to enter trip gallons
// Prompt user to enter miles 
// Display output result for miles per gallons