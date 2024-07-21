import java.util.Scanner;

public class areaAndPerimeterOfTriangle {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	double width;
	double height;
	float area,  width = 0, height = 0;
	float perimeter = 2*(width + height);

	

	System.out.printf("area is %.1f * %.1f = %.2f\n ", width, height, area);
	width = input.nextDouble();

	System.out.printf("perimeter is 2*(%.1f + %.1f) = %.2f\n ", height, width, perimeter);
    	height = input.nextDouble();


	}

}