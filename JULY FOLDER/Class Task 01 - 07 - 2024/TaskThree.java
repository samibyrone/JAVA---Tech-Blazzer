import java.util.Scanner;

public class TaskThree {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		int sum = 0;
		int counter = 0;
		int score;

		
		for (counter = 1; counter <= 10; counter ++) {

			System.out.print(" Enter your score: ");	
			score = input.nextInt();
			sum = sum + score;

			counter = counter + 1;
		}
			int average = sum / 10;
			System.out.printf("\n Total of all sum is %d%n ", sum);
			System.out.printf("\n Average score of all score collected is %d%n ", average);
	}
}