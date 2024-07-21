import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
			
				int count;

			for (count = 1; count <= 5; count ++) {
				System.out.print(" First laps ");
				for (count = 1; count <= 5; count ++) {
					System.out.print(" real deal ");
				}

			}
	}
}