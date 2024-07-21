import java.util.Scanner;

public class AreaOfCircle {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		double radius = 3.14159;
		double diameter = radius;
		double pi = Math.PI;
		double circumference;
		double area;

		System.out.print("Please enter an integer: ");
		radius = input.nextDouble();

		diameter = 2*radius;
		circumference = 2 * pi * radius;
		area = pi * Math.pow(radius, 2);

		System.out.println("The diameter is " + diameter);
		System.out.println("The circumference is " + circumference);
		System.out.println("The area is " + area);
		
	}
		
}



// Create a class scanner object
// Declear your double variables
// Prompt the user to enter a number for the radius
// Read number from user
// display output for diameter, circumference and area of a circle.