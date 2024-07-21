import java.util.Scanner;

public class StudentGrade {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
	
		int score = 0;
		int sum = 0;
		int passes = 0;
		int failure = 0;
		int counting = 0;
		int total = 0;
		int scoreCounter = 0;

			System.out.println(" How many Student do you have? ");
			int scoring = input.nextInt();

			System.out.println(" How many Subject do they offer Student? ");
			int subject = input.nextInt();

			System.out.println(" Saving  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
			System.out.println(" Saved Successfully. ");
			
			for( int count = 1; count <= score; count++ ) {
				System.out.println(" Entering Score for Student 1 ");
				scoreCounter = input.nextInt();
					if (scoreCounter >= 80 ) {
						passes = passes + 1;
						System.out.println(" Saving  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
						System.out.println(" Saved Successfully. ");
					}
					else {
						failure = failure + 1;
					}

				System.out.println(" Entering Score for Student 2 ");
				scoreCounter = input.nextInt();
					if (scoreCounter <= 79 ) {
						if (scoreCounter >= 70 );
						passes = passes + 1;
						System.out.println(" Saving  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
						System.out.println(" Saved Successfully. ");
					}
					else {
						failure = failure + 1;
					}

				System.out.println(" Entering Score for Student 3 ");
				scoreCounter = input.nextInt();
					if (scoreCounter <= 69 ) {
						if (scoreCounter >= 60 );
						passes = passes + 1;
						System.out.println(" Saving  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
						System.out.println(" Saved Successfully. ");
					}
					else {
						failure = failure + 1;
					}

				System.out.println(" Entering Score for Student 4 ");
				scoreCounter = input.nextInt();
					if (scoreCounter <= 50) {
						if (scoreCounter == 50);
						passes = passes + 1;
						System.out.println(" Saving  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
						System.out.println(" Saved Successfully. ");
					}
					else {
						failure = failure + 1;
					}
		
	
				scoreCounter = scoreCounter + score;		
				counting = scoreCounter / 10;
				total = total + scoreCounter;
		}	

		System.out.println();
		System.out.println(" CLASS SUMMARY..... ");
		System.out.println("=================================================================");
		System.out.printf(" Best Graduating Student is: Student %d Scoring %d%n", score, scoreCounter);
		System.out.println("=================================================================");
		System.out.println();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.printf(" Worst Graduating Student is: Student %d Scoring %d%n", score, scoreCounter );
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		System.out.print("=================================================================");
		System.out.printf("%n Class Total Score is: %d ", total);
		System.out.printf("%n Class Average Score is: %d ", counting);
		System.out.println();
		System.out.print("=================================================================");

	
	}

}