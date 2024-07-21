import java.util.Scanner;

public class CollectTenScores {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Application to collect 10 scores : ");

		int score;
		int sum = 0;
		int evenNumber = 0;

		for (score = 1; score <= 10; score++) {

			System.out.print(" Enter your score: ");	
			score = input.nextInt();
			evenNumber = evenNumber + score;
			
			if (evenNumber % 2 == 0) {
				
		//		System.out.printf( " The sum of all even number is %d " ,  evenNumber );
			}
			

		}


	}

}