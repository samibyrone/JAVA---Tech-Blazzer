import java.util.Scanner;

public class ValueOfOneNumber {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int result = 1;

     		System.out.print("enter the number: ");
     		number1 = input.nextInt();
  
     		System.out.print("enter the power: ");
     		number2 = input.nextInt();
 
     		 while (number2 <= 0) {
			result = result * number1;
				 number2 --;
		}
 

		System.out.print(number2 + " raised to power " + number1 + " is: ");
 		System.out.print( result );


	}

}