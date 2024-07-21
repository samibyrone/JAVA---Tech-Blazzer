import java.util.Scanner;


public class EvenScore {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		for (int evenNumber = 1; evenNumber <= 10; evenNumber ++)

			System.out.print(" Enter your score: ");	
			int score = input.nextInt();

			if ( evenNumber == 5) {
				continue;
			}
				System.out.println(" Your value numbers are: " + evenNumber );
	


	}


}