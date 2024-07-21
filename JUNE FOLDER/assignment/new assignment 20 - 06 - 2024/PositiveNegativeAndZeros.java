import java.util.Scanner;

public class PositiveNegativeAndZeros {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

		int number;
		int positive = 0;
		int negative = 0;
		int zeros = 0;

		System.out.print(" Enter a number (Program ends if enter -1): ");
		number = input.nextInt();  
  
    		while (number != -1) {
    		System.out.print(" Enter a number (Program ends if enter -1): ");
    		number = input.nextInt();

    			if (number < 0) {
    				negative ++;

    			} else if (number > 0) {
    				positive ++;
    			
			} else if (number <= 0) {
     				zeros ++;
			}
			
		}

		System.out.println("\nTotal Positive Numbers: " + positive );
      		System.out.println("Total Negative Numbers: " + negative );
      		System.out.println("Total Zeros: " + zeros );

	}

}