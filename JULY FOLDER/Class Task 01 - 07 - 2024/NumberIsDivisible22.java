import java.util.Scanner;

public class NumberIsDivisible22 {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Applocation the check and confirm if any of the number input can be divisible with either number 5 AND number 3 respectfully..... ");
		System.out.println();

		System.out.println(" It's a beautiful day, you just have to feel good, kindly proceed!!!!! ");


		int sum = 0;
		System.out.println();
		System.out.print(" Enter number ");
		sum = input.nextInt();

		if ( sum % 5 == 0 && sum % 3 == 0 )
			System.out.println(" number can be divided with 5 and 3. ");
		else 
			System.out.println(" number can not be  divided with 5 and 3. ");
	}
}