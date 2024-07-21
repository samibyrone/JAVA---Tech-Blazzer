import java.util.Scanner;

public class maxNumber {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter numbers: ");

	int max = input.nextInt();
	int count = 9;
	int number = 0;
	
	while (number > 0) {
		number = input.nextInt();
		if ( number > max ) {
			max = number;
			count = 1;
		} 

		if (number == max)
			count ++;
		}

	System.out.println("The largest number is " + max);
	System.out.println("The occurence count of the largest number is " + count);

	}

}


// Prompt the user to enter number
// Assign the first number to max
// Assign the second variable to number
// Assign 1 to count
// Colect input from user
// Display the output result