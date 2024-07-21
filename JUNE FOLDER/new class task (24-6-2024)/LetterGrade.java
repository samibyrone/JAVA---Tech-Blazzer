import java.util.Scanner;

public class LetterGrade {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int studentScore = 0;
		
		System.out.println("Enter your score: ");
		studentScore = input.nextInt();

		if (studentScore >= 80 ) {
		System.out.println(" Your score grade is A ");
		}

		if (studentScore <= 79 ) {
			if (studentScore >= 70 );
		System.out.println(" Your score grade is B ");
		}

		if (studentScore <= 69 ) {
			if (studentScore >= 60 );
		System.out.println(" Your score grade is C ");
		}

		if (studentScore <= 50) {
			if (studentScore = 50);
		System.out.println(" Your score grade is D ");
		}


	}
}