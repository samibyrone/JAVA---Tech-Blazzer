import java.util.Scanner;

public class StudentAnalysis {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in); 
		
		int passes = 0; 
		int failures = 0; 
		int studentCounter = 1; 
		int result = studentCounter;

		while (studentCounter <= 10) {
		System.out.print("Enter result (1 = pass, 2 = fail): ");
		result = input.nextInt(); 

		studentCounter = studentCounter + 1; 
		}
		
		if (passes >= 8) { 
 			System.out.println("Bonus to instructor!"); 
		}  

		if (result == 1) { 
 			passes = passes + 1; 
		} 
		else { 
 			failures = failures + 1; 
		}
 
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
	}
}



// class uses class Scanner
// create Scanner to obtain input from command window
// process 10 students using counter-controlled loop
// prompt user for input and obtain value from user
// increment studentCounter so loop eventually terminates
// termination phase; prepare and display results
// initializing variables in declarations
// if...else is nested in the while statement
// determine whether more than 8 students passed

