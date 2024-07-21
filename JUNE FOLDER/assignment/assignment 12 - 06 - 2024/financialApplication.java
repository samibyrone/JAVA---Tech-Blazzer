import java.util.Scanner;

public class financialApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final double monthly_intrest_value = 0.0375;

		System.out.print("Enter monthly saving amount: ");
		double savings = input.nextDouble();
		double total = 100 *(1 + monthly_intrest_value);

		System.out.print("After the first month, the account value is " + " (1 + monthly_intrest_rate)" );
		System.out.print("After the second month, the account value is " + " (1 + monthly_intrest_rate)" );
		System.out.print("After the third month, the account value is " + " (1 + monthly_intrest_rate)" );
		System.out.print("After the fourth month, the account value is " + " (1 + monthly_intrest_rate)" );
		System.out.print("After the fifth month, the account value is " + " (1 + monthly_intrest_rate)" );
		System.out.print("After the sixth month, the account value is " + total);
		
		
	}
}







// Create a new scanner object
// Initialize constant value
// Prompt the user to enter a monthly saving amount
// Compute first month value
// Compute second month value
// Compute third month value
// Compute fourth month value
// Compute fifth month value
// Compute sixth month value
// Display output result