import java.util.Scanner;

public class EBankingApp11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		

		int number;

		System.out.println(" Welcome to E-Banking App. ");
		System.out.println(" Press any number to get Started: ");
		number = input.nextInt();
		

		switch ( number ) {

			case 1: System.out.println(" Transfer ");
				System.out.println(" Buy Airtime ");
				System.out.println(" Buy Data ");
				System.out.println(" Share Data ");
				System.out.println(" Go Back ");
				break;

			case 2: System.out.print(" Go Back to Menu ");
				break;

			case 3: System.out.println( " Monday " );
				System.out.println( " Tuesday " );
				System.out.println( " Wednesday " );
	  			System.out.println( " Thursday " );
  				System.out.println( " Friday " );	
				break;

			case 4:
				break;

			case 99: 
				break;

		}

	}
}

