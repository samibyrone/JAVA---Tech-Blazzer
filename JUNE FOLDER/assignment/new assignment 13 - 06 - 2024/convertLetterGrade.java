import java.util.Scanner;

public class convertLetterGrade {

	public static void main(String[] args) {

		Scanner input;
		input = new Scanner(System.in);

		System.out.print("Enter the letter grade: ");

		String sunny = input.nextLine();
		char chadd = sunny.charAt(0);
		chadd = Character.toUpperCase(chadd);
		
		if (chadd >= 'A' && chadd <= 'F' && chadd != 'E') {
 
			System.out.print("The numeric value for grade " + chadd + " is ");
			switch(chadd)
		
			{
				case 'A': System.out.println(4); break;
				case 'B': System.out.println(3); break;
				case 'C': System.out.println(2); break;
				case 'D': System.out.println(1); break;
				case 'F': System.out.println(0); break;  
				case 'E': System.out.println(5);
			}
		}

		else 
			System.out.println( chadd + " is an invalid grade ");
	}

}





// declear your scanner input
// Prompt the user to enter a letter grade A, B, C, D, E
// Display output