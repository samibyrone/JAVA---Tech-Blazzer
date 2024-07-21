import java.util.Scanner;

public class LetterGrade22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int studentScore = 0;
		
		System.out.println("Enter your score: ");
		studentScore = input.nextInt();

		if (studentScore >= 80 ) {
		System.out.println(" Your score grade is A ");
		}

		else if (studentScore >= 70 ) {
		System.out.println(" Your score grade is B ");
		}

		else if (studentScore >= 60 ) {
		System.out.println(" Your score grade is C ");
		}

		else if (studentScore >= 50) {
		System.out.println(" Your score grade is D ");
		}
		
		else {
		System.out.println(" Your score grade is F ");
		}



	}
}