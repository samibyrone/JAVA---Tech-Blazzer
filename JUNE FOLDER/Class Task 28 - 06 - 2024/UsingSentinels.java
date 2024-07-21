import java.util.Scanner;

public class UsingSentinels {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
			int sum = 0;
			int flagValue = -1;
			int countScore = 0;
	
			System.out.println(" Enter Score or -1 to end : ");
			int score = input.nextInt();

			while (score != flagValue) {

			sum = sum + score;

			countScore = countScore + 1;

			System.out.println(" Enter Score or -1 to end : ");
			score = input.nextInt();
			}
			
			if (countScore != 0) {
				double counting = (double) sum / countScore; 
				System.out.printf("%n The Total of the %d score entered is %d%n" ,countScore, sum );
				System.out.printf(" Total score %.2f%n", counting );
			}
			else {
				System.out.println(" No score were entered ");
			}				

	}

}

