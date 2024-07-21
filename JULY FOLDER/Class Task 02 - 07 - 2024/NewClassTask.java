import java.util.Scanner;

public class NewClassTask {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print(" Application to Display number One - Ten Alphabetically.....  ");
		System.out.println();

		System.out.println("Enter your number: ");
		int Score = input.nextInt();
	
		switch ( Score ) { 
		 case 1:
			System.out.println(" One ");
			break;

 		case 2: 
			System.out.print(" Two ");
			break;
 
		 case 3: 
		 	System.out.print(" Three ");
			break; 

		 case 4:
			System.out.print(" Four ");
			break; 

		 case 5:
			System.out.print(" Five ");
 			break;

		case 6:
			System.out.print(" Six ");
			break;

		case 7: 
			System.out.print(" Seven ");
			break;

		case 8:
			System.out.print(" Eight ");
			break;

		case 9: 
			System.out.print(" Nine ");
			break;

		case 10: 
			System.out.print(" Ten ");
			break;
		default:
			System.out.print(" Invalid Input, Try again! ");

		}	


	}
}