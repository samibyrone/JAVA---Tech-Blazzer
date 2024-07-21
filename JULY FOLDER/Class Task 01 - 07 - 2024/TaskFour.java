import java.util.Scanner;

public class TaskFour {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		int sum = 0;
		int total = 0;


			System.out.print(" Enter your score: ");	
			int score = input.nextInt();

			System.out.print(" Enter your score: ");	
			int score2 = input.nextInt();

			System.out.print(" Enter your score: ");	
			int score3 = input.nextInt();

			System.out.print(" Enter your score: ");	
			int score4 = input.nextInt();

			System.out.print(" Enter your score: ");	
			int core5 = input.nextInt();

			System.out.print(" Enter your score: ");	
			int score6 = input.nextInt();

			System.out.print(" Enter your score: ");	
			int score7 = input.nextInt();

			System.out.print(" Enter your score: ");	
			int score8 = input.nextInt();

			System.out.print(" Enter your score: ");	
			int score9 = input.nextInt();

			System.out.print(" Enter your score: ");	
			int score10 = input.nextInt();

			sum = sum + score2 + score4 + score6 + score8 + score10;

			total = total + sum;

			System.out.printf(" Total score for all even indexes is %d", total);
	}
}