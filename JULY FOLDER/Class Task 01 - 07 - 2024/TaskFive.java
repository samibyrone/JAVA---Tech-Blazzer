import java.util.Scanner;

public class TaskFive {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		int totalScore = 0;
		int score;
		
		for (int evenNumber = 1; evenNumber <= 10; evenNumber ++) {

			System.out.print(" Enter your 10 score: ");	
			score = input.nextInt();

			if ( score % 2 == 0 ) 
				totalScore += score;
		}
      		System.out.println(" Your value evenNumber are: " + totalScore);		

	}
}

