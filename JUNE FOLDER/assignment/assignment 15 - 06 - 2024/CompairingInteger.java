import java.util.Scanner;

public class CompairingInteger {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		int num = 100;
		double sqrt = Math.sqrt(num);
		double squareRoot = sqrt;

		System.out.println("Enter the first integer: ");
		num = input.nextInt();

		
		if (num >= squareRoot)
			System.out.printf("%d%n, SquareRoot of ", + num + "is larger than", num);

		if (num == squareRoot)
			System.out.printf("%d%n, SquareRoot of ", + num + "is equal to", num);

		if (num !=squareRoot)
			System.out.printf("%d%n, SquareRoot of ", + num + "is not equal to", num);

		if (num <= squareRoot)
			System.out.printf("("%d%n, SquareRoot of ", + num + "is less than", num);
	
	
	}
}