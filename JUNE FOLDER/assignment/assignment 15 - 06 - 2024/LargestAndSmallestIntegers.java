import java.util.Scanner;

public class LargestAndSmallestIntegers {

	public static void main (String[] args) {
		
	Scanner input = new Scanner(System.in);
	
		int count1;
		int count2;
		int count3;
		int count4;
		int count5;
		int largest;
		int smallest;
	
		System.out.print("Enter first number: ");
		count1 = input.nextInt();
		System.out.print("Enter second number: ");
		count2 = input.nextInt();
		System.out.print("Enter third number: ");
		count3 = input.nextInt();
		System.out.print("Enter fourth number: ");
		count4 = input.nextInt();
		System.out.print("Enter fiveth number: ");
		count5 = input.nextInt();

		largest = count1;
		smallest = count1;

		if (count2 > largest)
			largest = count2;
		if (count3 > largest)
			largest = count3;
		if (count4 > largest)
			largest = count4; 
		if (count5 > largest)
			largest = count5;

		System.out.printf(" The largest number is %d%n " , largest );

		if (count2 < smallest)
			smallest = count2;
		if (count3 < smallest)
			smallest = count3;
		if (count4 < smallest)
			smallest = count4; 
		if (count5 < smallest)
			smallest = count5;

		System.out.printf(" The smallest number is %d%n " , smallest );
		
	}
}


// Declear your main
// Declear your scanner
// Prompt user to input first number
// Prompt user to input second number
// Prompt user to input third number
// Prompt user to input fourth number
// Prompt user to input fiveth number
// Compare the largest in count1 to count5
// Compare the smallest in count1 to count5
// Display output result for largest number
// Display output result for smallest number