import java.util.Scanner;

public class threeCountries {

	public static void main(String[] args) {

	Scanner input;
	input = new Scanner(System.in);

	System.out.print("Enter the first country: ");
	String country1 = input.nextLine();

	
	System.out.print("Enter the second country: ");
	String country2 = input.nextLine();


	System.out.print("Enter the third country: ");
	String country3 = input.nextLine();
	
	String x = "switzerland";
	String y = "germany";
	String z = "france";
	
	System.out.print("The three countries in alphabethical order are " + country1 + " " + country2 + " " + country3);

	}
	
}



// Declear your scanner variable
// Prompt the user to enter three cities
// Display city in ascending order






































//		String temp;
// if ((country2.compareTo(country1) < 0) && (country2.compareTo(country3) < 0))
//	{
//
//		temp = country1;
//		country1 = country2;
//		country2 = temp;
//	}
//
//	else if ((country3.compareTo(country1) < 0) && (country3.compareTo(country2) < 0 ))
//	{
//
//		temp = country1;
//		country1 = country3;
//		country3 = temp;
//	}
//
//	if (country3.compareTo(country2) < 0)
//	{
//		temp = country2;
//		country2 = country3;
//		country3 = temp;
//	}
//
//	System.out.print("The three countries in alphabethical order are " + country1 + " " + country2 + " " + country3);