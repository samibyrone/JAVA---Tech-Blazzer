import java.util.Scanner;

public class palindromeInteger {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int number;
	int integer;

	System.out.printf("Enter a three-digit integer: ");
	number = input.nextInt(); 
	System.out.println((" number ") + " is a palindrome" );
	
	System.out.printf("Enter a three-digit integer: ");
	integer = input.nextInt();
	System.out.println((" integer ") + " is not a palindrome");

	}
}