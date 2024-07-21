import java.util.Scanner;

public class SentinelsToForLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
			int sum = 0;
			int countScore = 0;

			for (int score = 1; score <= 10; score ++) {
				
				System.out.println(" Enter Score or -1 to end : ");
				score = input.nextInt();

					sum = sum + score;
					countScore = countScore + 1;
			}

				System.out.println();
	}

}

