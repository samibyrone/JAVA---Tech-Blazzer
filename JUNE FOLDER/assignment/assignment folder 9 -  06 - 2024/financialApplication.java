import java.util.Scanner;

public class financialApplication {

	public static void main( String[] args ) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter balance and interest rate: ");
		
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();

		double interest = balance * ( annualInterestRate / 1200);
		System.out.print("The interest is " + interest);

	}
}