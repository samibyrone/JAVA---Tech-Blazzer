import java.util.Scanner;

public class Interest {
	
	public static void main(String[] args) {

		double principal = 1000.0;		
		double rate = 0.05;			
		System.out.printf("%s %n", "Year", "Amount on deposit");

 							
		for (int year = 1; year <= 10; ++year) { 
							
		double amount = principal * Math.pow(1.0 + rate, year);
							
		System.out.printf("%4d%,20.2f%n", year, amount);
		}
	} 
} 


// initial amount before interest
// interest rate
// display headers
// calculate amount on deposit for each of ten years
// calculate new amount on deposit for specified year 
// display the year and the amount 





// A person invests $1,000 in a savings account yielding 5% interest. Assuming that all the interest is left on deposit, 
// calculate and print the amount of money in the account at the end of each year for 10 years. Use the following formula to determine the amounts:

		// a = p (1 + r)n
		// where
	// p is the original amount invested (i.e., the principal)
	// r is the annual interest rate (e.g., use 0.05 for 5%)
	// n is the number of years
	// a is the amount on deposit at the end of the nth year.


// The solution to this problem (Fig. 5.6) involves a loop that performs the indicated calculation for each of the 10 years the money remains on deposit. 
// Lines 6, 7 and 15 in main declare double variables principal, rate and amount. 
// Lines 6–7 initialize principal to 1000.0 and rate to 0.05. Line 15 initializes amount to the result of the compound interest calculation. 
// Java treats floating-point constants like 1000.0 and 0.05 as type double. Similarly, Java treats whole-number constants like 7 and -22 as type int.
// We use the format specifier %20s to output the String "Amount on Deposit".
//  The integer 20 between the % and the conversion character s indicates that the value should be displayed with a field width of 20—that is, printf displays the value with at least 20 character positions.
// 

		// Compound-interest calculations with for.
		// Year Amount on deposit
		// 1 1,050.00
		// 2 1,102.50
		// 3 1,157.63
		// 4 1,215.51
		// 5 1,276.28
		// 6 1,340.10
		// 7 1,407.10
		// 8 1,477.46
		// 9 1,551.33
		// 10 1,628.89
		// Fig. 5.6 | Compound-interest calculations with for. (Part 2 of 2.)
