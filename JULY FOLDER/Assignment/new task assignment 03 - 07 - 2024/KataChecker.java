import java.util.Scanner;

public class KataChecker {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);

		Kata kata = new Kata();

		System.out.println();
		System.out.println(" Function that takes integer and returns TRUE if it's an EVEN NUMBER.. ");
		System.out.println();
		System.out.println(" Enter a number: ");
		int number = input.nextInt();

		System.out.println(kata.isEven(number) + " Hurray it's an Even number " );
		System.out.println();

		
	
		System.out.println();
		System.out.println(" Function that takes integer an returns TRUE if the number is a PRIME NUMBER.. ");
		System.out.println();	
		System.out.println(" Enter your number: ");
		int primeNumber = input.nextInt();

		System.out.println();
		System.out.println(kata.isPrime(primeNumber) + " Hurray it's a Prime Number. " );
		System.out.println();



		System.out.println();
		System.out.println(" Function that takes 2 INTEGERS an returns POSITIVE DIFFRENCE Irrespective of the Parameter Order... ");
		System.out.println();

		System.out.println(" Enter Your First Number: ");
		int subtract1 = input.nextInt();

		System.out.println(" Enter Your Second Number: ");
		int subtract2 = input.nextInt();

		System.out.println();
		System.out.println(kata.isSubtract(subtract1, subtract2) + " Have a GoodLuck Always..... ");
		System.out.println();
	



		System.out.println();
		System.out.println("Function that takes 2 INTEGERS and return the QUOTIENT APPROXIMATED to 2 DECIMAL Place..... ");


		System.out.println(" Enter Your First Number: ");
		int numberDiv1 = input.nextInt();

		System.out.println(" Enter Your Second Number: ");
		int numberDiv2 = input.nextInt();

		System.out.println(kata.isDivision(numberDiv1, numberDiv2) + " Have a GoodLuck Always..... s");
		System.out.println();
	



		System.out.println();
		System.out.println(" Function that takes an INTEGER and return the NUMBER OF FACTOR for the integer ");
		System.out.print(" Enter your number: ");
		int isFactorial = input.nextInt();

		System.out.println(kata.isFactorialOf(isFactorial));		
		System.out.println();




		
		System.out.println(" Function that takes an INTEGER and returns TRUE if the INTEGER is a SQUARE NUMBER ");


		System.out.println(" Enter your number: ");
		int rootNumber = input.nextInt();

		System.out.println(kata.squareRoot(rootNumber) + " Hurray It's a Lucky Day..... ");
		System.out.println();
	




		System.out.println(" Function that takes an 5 INTEGER and returns TRUE if it's a PALINDROME ");

		System.out.println(" Enter your number: ");
		number = input.nextInt();

		System.out.println(kata.isPalindrome(number) + " is a Palindrome. ");
		System.out.println();
	}

}
