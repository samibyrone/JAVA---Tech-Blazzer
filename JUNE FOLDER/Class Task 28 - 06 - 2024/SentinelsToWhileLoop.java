import java.util.Scanner;

public class SentinelsToWhileLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
			int sum = 0;
			int countScore = 0;
			int score;
	
			do { 
				System.out.println(" Enter Score or -1 to end : ");
				score = input.nextInt();

					sum = sum + score;

					countScore = countScore + 1;

			} while (score <= 10);

				System.out.println(Test);
   		
	}

}

