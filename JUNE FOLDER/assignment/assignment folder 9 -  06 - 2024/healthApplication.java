import java.util.Scanner;

public class healthApplication {

	public static void main( String[] args ) {

		Scanner input = new Scanner(System.in);

		System.out.print( "Enter the weight in pounds: " );
		double weight = input.nextDouble();

		System.out.print( "Enter the height in inches: " );
		double height = input.nextDouble();
		
		double kilo_per_pound = 0.45359237;
		double meters_per_inch = 0.0254;
		double weight_in_kilo = weight * kilo_per_pound;
		double height_in_meters = height * meters_per_inch;
		
		double bmi = weight_in_kilo / ( height_in_meters * height_in_meters );
		System.out.print( " BMI is: " + bmi );

	}
}


// Create a scanner object by passing in the (System.in)
// Prompt user to enter a weight in pounds
// Read and store weight as double value
// Prompt user to enter a height in inches
// Read and store height as double value
// Compute BMI using the formula: BMI = ( weight / ( height * height ))
// Display the calculated BMI
// 