import java.util.Scanner;

public class TaskSix {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		int totalScore = 0;
		int score;
		int average = 0;
		int total = 0;
		
		for (int evenNumber = 1; evenNumber <= 10; evenNumber ++) {

			System.out.print(" Enter your 10 score: ");	
			score = input.nextInt();

			if ( score % 2 == 0 ) 
				totalScore += score;
			if (score % 2 == 0)
				average = score;		
				
				total = totalScore / average;
		}

			

      		System.out.printf(" Your Average value is : " + total);		

	}
}

