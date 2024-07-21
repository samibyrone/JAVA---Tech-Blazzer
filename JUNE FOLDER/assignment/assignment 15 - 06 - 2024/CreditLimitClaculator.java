import java.util.Scanner;

public class CreditLimitClaculator {

	Scanner input = new Scanner(System.in);

	public static void main(String[] args){

		int account = 1;
		int balance;
		int charges;
		int credits;
		int creditLimit;
		int newBalance;

		while (account != 0) {	
			System.out.println("Enter your Account number: ");
			account = input.nextInt();

			System.out.println("Balance at the begining of the month: ");
			balance = input.nextInt();
	
			System.out.println("Total of all item charges this month: ");
			charges = input.nextInt();

			System.out.println("Credits applied to the customer account this month: ");
			credits = input.nextInt();

			System.out.println("Customer allowed credits limits: ");
			creditLimits = input.nextInt();
			
			newBalance = balance + charges -credits;
			System.out.println(" Equivalent new balance: " + newBalance);

		if ( newBalance > creditLimit ) {
			System.out.println("Credit limit Exceeded");
	
		}
		}
	}

}

// Declare a scanner 
// Create an int for account number
// Create an int for account balance
// Create an int for account charges
// Create an int for account credit limits
// Create an int for account new balance
// Display output result