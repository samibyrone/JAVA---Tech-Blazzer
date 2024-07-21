import java.util.Scanner;

public class NumberIsDivisible {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Applocation the check and confirm if any of the number input can be divisible with either number 5 OR number 3 respectfully..... ");
		System.out.println();

		System.out.println(" It's a beautiful day, you just have to feel good, kindly proceed!!!!! ");
			
		int num = 0;
		
		System.out.println();
		System.out.print(" Enter number ");
		num = input.nextInt();

		if ( num % 5 == 0 || num % 3 == 0 )
			System.out.println(" number is divisible with 5 OR 3. ");
		else 
			System.out.println(" number is not divisible with 5 OR 3. ");
	}
}