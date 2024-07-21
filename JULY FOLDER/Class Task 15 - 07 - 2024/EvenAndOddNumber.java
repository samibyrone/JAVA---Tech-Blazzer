import java.util.Scanner;

public class EvenAndOddNumber {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		int number = input.nextInt();


		for (int count = 10; count >= number 	; count ++) {
			
			if (number % 2 == 0)
				System.out.println(" This is an Even Number. " + number);
			
			else 
				System.out.println(" This is an Odd Number. " + number);
		}
	}

}