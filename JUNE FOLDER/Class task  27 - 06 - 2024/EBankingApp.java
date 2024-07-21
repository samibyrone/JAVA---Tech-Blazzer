import java.util.Scanner;

public class EBankingApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		

		int number;

		System.out.println(" Welcome to E-Banking. ");
		System.out.print(" Press any number to get Started: ");
		number = input.nextInt();

		System.out.println();
		System.out.print(" Enter first number: ");
		number = input.nextInt();

		switch ( number ) {

			case 1: System.out.print(" Transfer ");
				break;

			case 2: System.out.print(" Buy Airtime ");
				break;

			case 3: System.out.print(" Buy Data ");
				break;

			case 4: System.out.print(" Share Data ");
				break;

			case 99: System.out.print(" Go Back ");
				break;

		}


	}
}