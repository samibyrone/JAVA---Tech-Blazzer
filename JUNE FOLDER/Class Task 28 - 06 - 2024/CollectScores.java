import java.util.Scanner;

public class CollectScores {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
			int sum = 0;
			int scoreCounter = 1;

			while (scoreCounter <= 10) {
			System.out.println(" Enter Score: ");
			int score = input.nextInt();
			sum = sum + score;
			scoreCounter = scoreCounter + 1;
			}
	
			int counting = sum / 10; 	
			System.out.printf("%n The total score %d%n" , sum );
			System.out.printf("%n Total average score is: %d%n", counting );		

	}

}

