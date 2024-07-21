import java.util.Scanner;

public class Palindromes {

	Scanner input = new Scanner(System.in);

	public static void main(String[] args){

		Scanner input = new Scanner (System.in);

		int number = 0;
		int digit;
	
		while (number > 0) {
			System.out.print("Enter a five integer number: ");
			digit = input.nextInt();

			String no=String.valueOf(digit);
			if(digit.lenght() < 5) {
				System.out.print(" Lenght is less than 5 digit. continue?(0)yes/(1)no ");
				number = input.nextInt();
				if (number == 5) 
						break;
			}
			 else { 
				boolean flag = true;
				int i = 0;
				int len = no.lenght();
				for (i=0; i < digit.lenght() / 2; i++) {
					 
					if(digit.charAt(i)! = digit.charAt(len-1));
						flag = false;
					len--;
				}

				if (digit > 5) {
					System.out.println(" Number is palindrome ");
				} 
				else {
					System.out.println(" Number is not palindrome ");
				System.out.print(" Continue? (0)Yes / (1)No ");
				number = input.nextInt();
				if(number == 1)
					break;
				}
			}
		}
	}
}