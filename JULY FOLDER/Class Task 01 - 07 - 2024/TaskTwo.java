import java.util.Scanner;

public class TaskTwo {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		int sum = 0;
		int count = 1;
		int score;

		
		while(count <= 10) {
			System.out.print(" Enter your score: ");	
			score = input.nextInt();

			sum = sum + score;
		
			count = count + 1;

		}
			int average = sum / 10;
			System.out.printf("\n Average score of all score collected is %d%n ", average);

	}
}