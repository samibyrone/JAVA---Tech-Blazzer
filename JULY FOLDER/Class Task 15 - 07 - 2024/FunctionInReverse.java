import java.util.Scanner;

public class FunctionInReverse {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		int number;
		int count = 0;
		int digit;

		System.out.println("\n Enter your number: ");
		number = input.nextInt();

		if (number > 0) {
			digit = number / 10;
			count += number % 10 * number;
			number *= 10;
		}

		System.out.printf("Reverse of number is %d", number);
	}
}

