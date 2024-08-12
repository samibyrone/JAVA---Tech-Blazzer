import java.util.Scanner;

public class PrivacyCryptography {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);	

		System.out.print("\n Enter your number: ");
		int digit = input.nextInt();

		int firstDigit = (digit / 1000) % 10; 
		int secondDigit = (digit / 100) % 10; 
		int thirdDigit = (digit / 10) % 10;
		int fourthDigit = (digit / 1) % 10;


		firstDigit = (thirdDigit + 7) % 10; 
		secondDigit = (fourthDigit + 7) % 10; 
		thirdDigit = (firstDigit + 7) % 10;
		fourthDigit = (secondDigit + 7) % 10;

		int encryptedNumber = thirdDigit * 1000 + fourthDigit * 100 + firstDigit * 10 + secondDigit;

		System.out.println("\n The encrypted number is: " + encryptedNumber);

	

		Scanner scanner = new Scanner(System.in);	

		System.out.print("\n Enter your number: ");
		int number = scanner.nextInt();

		int firstNumber = (number / 1000) % 10; 
		int secondNumber = (number / 100) % 10; 
		int thirdNumber = (number / 10) % 10;
		int fourthNumber = (number / 1) % 10;


		firstNumber = ((((number + 7) % 10) + 3) % 10); 
		secondNumber = ((((number + 7) % 10) + 3) % 10); 
		thirdNumber = ((((number + 7) % 10) + 3) % 10);
		fourthNumber = ((((number + 7) % 10) + 3) % 10);

		int decryptedNumber = thirdNumber * 1000 + fourthNumber * 100 + firstNumber * 10 + secondNumber;

		System.out.println("\n The decrypted number is: " + decryptedNumber);

	}


}