import java.util.Scanner;

public class TaskSeven {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		int totalScore = 0;
		int score;
		int average = 0;
		int total = 0;
		int sum = 0;
		
		for (int number = 1; number <= 10; number ++) {

			System.out.print(" Enter your 10 score: ");	
			score = input.nextInt();
		//	sum = sum + score;
				
			if ( score % 2 == 0 ) 
				totalScore += score;
			if (score % 2 == 0)
				average = score;		
		
				total = totalScore / average;
		}

			
		System.out.printf("\n The Total sum is: %d%n" + totalScore );
      		System.out.printf("\n Your Average value is : " + total);		

	}
}

