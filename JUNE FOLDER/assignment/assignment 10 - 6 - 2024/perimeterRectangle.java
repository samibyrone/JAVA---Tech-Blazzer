import java.util.Scanner;

public class perimeterRectangle {

	public static void main (String[] args) {

		float width = 5.3;
		float height = 8.6;
		
		float perimeter = 2*(width + height);
		float area = width * height;

		System.out.print("perimeter is 2*(%.1f + %.1f)=%.2f\n ", height, width, perimeter);
		System.out.print("area is %.1f*%.1f=%.2f\n ", width, height, area);
		
	}

}