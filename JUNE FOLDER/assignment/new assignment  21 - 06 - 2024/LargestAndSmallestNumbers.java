import java.util.Scanner;

public class LargestAndSmallestNumbers {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

		int i;
		int number = 0;
		int largest = 0;
		int smallest= 0;

		for (i = 0; i <= 10; i ++) {
			System.out.print("Enter your number (enter 0 to end) : ");
			number = input.nextInt();	
		}

		if (number > largest) {
			largest = number;
		}
		else if (number < smallest) {
			smallest = number;
		}

		System.out.println("\nLargest Numbers: " + largest );
      		System.out.println("Smallest Numbers: " + smallest );


	}

}