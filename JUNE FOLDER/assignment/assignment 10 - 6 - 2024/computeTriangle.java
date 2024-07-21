import java.util.Scanner;

public class computeTriangle {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		double area;
		System.out.print("Enter lenght of the sides and height of the equilateral triangle: ");
		double lenghtOfSides = input.nextDouble();
		double lenght = input.nextDouble();
		

		area = (Math.sqrt(3)/4*Math.pow(lenghtOfSides, 2));
		double volume = area * lenght;

		System.out.println("The area is: " + area);
		System.out.print("The volume of the Triangular prism is " + volume);
	}

}


// Create a scanner
// Declear a variable
// Receive the lenght of sides of an equilateral triangle
// Area and volume of triangle
// Display output result