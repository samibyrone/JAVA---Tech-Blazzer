import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		

			int number;

		System.out.println(" Welcome to Elite-Banking App " );
		System.out.println(" Kindly enter your name: ");
		String menu = input.nextLine();

		System.out.println(" Press 1 to continue or 0 to quit ");
		number = input.nextInt();

		String list = 	"""
				press 1 Transfer
				press 2 Buy Airtime
				press 3 Buy Data
				press 4 Share Data
						""";		

		switch ( number ) {
				
			case 1 : System.out.printf(" %s%n", list );
				break;

			default: 
				System.out.print(" Invalid, Kindly Try Again ");

		}

	}
}
























