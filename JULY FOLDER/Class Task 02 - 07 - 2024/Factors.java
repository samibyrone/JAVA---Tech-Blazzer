import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print(" Enter a number ");
		int number = input.nextInt();

		for (int count = 0; count <= number; count ++) {
			if( number % number == 0)
				number++;
		}
			System.out.println(number);
	}


}