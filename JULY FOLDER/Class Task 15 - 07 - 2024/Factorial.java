import java.util.Scanner;

public class Factorial {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		int factorial = 1;
		

		System.out.print("\n enter your number: ");
		int number = input.nextInt();

		for  (int sum = number; sum  > 1; sum--) {
			factorial *= sum;
		
		}
		
			System.out.println(factorial);

	}
}


