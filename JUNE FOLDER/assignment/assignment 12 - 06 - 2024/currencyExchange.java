import java.util.Scanner;

public class currencyExchange {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double exchange = 0;
		double dollar = 0;
		int conversion;
		double yuan = 0;
		String Dollar = " ";
		int quarter = 0;

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		exchange = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa ");
		conversion = input.nextInt();

		if( conversion == 0) {
		System.out.print("Enter the dollar amount: ");
		dollar = input.nextDouble();
		yuan = dollar * exchange;

		System.out.println("$" + dollar + "is" + yuan + " yuan.");
		System.out.println();
		}

		if( conversion == 1) {
		System.out.print("Enter the yuan amount: ");
		yuan = input.nextDouble();
		dollar = yuan / exchange;

		System.out.printf(yuan + "yuan is%8.3f dollars", dollar );
		System.out.println();

		}
	}

}






// Import the scanner function
// Prompt the user to enter exchange rate from currency in USD to RMB
// Prompt user to enter zero to convert from USD to RMB
// Collect the input from user
// Prompt the sure to enter amount in USD
// 



