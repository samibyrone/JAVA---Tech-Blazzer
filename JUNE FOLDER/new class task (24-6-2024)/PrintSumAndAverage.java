import java.util.Scanner;

public class PrintSumAndAverage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int total = 0;
		int totalScore = 0;

		System.out.print("Enter your score 1: ");
		int score = input.nextInt();
		
		
		System.out.print("Enter your score 2: ");
		int score1 = input.nextInt();

		
		System.out.print("Enter your score 3: ");
		int score2 = input.nextInt();

		
		System.out.print("Enter your score 4: ");
		int score3 = input.nextInt();

		
		System.out.print("Enter your score 5: ");
		int score4 = input.nextInt();

		
		System.out.print("Enter your score 6: ");
		int score5 = input.nextInt();

		
		System.out.print("Enter your score 7: ");
		int score6 = input.nextInt();

		
		System.out.print("Enter your score 8: ");
		int score7 = input.nextInt();

		
		System.out.print("Enter your score 9: ");
		int score8 = input.nextInt();

		
		System.out.print("Enter your score 10: ");
		int score9 = input.nextInt();

		total = total + score + score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9;
		int average = total / 10;
		System.out.printf(" %n The total sum is: %d%n" , total);
		System.out.printf(" %n The average sum is: %d%n" , average);

	}

}





// collect 10 score and print the sum average