import java.util.Scanner;

public class DisplayPyramidPattern {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

			int number = 0;
			int string;
			int column;
			int count;

    			for (count = 0; count <= 7; count++) {

        		for (column = 1; column <= 7 - count; column++) {
            			
				System.out.printf("%4s", string);
        		}

        		for (column = 0; column <= count; column++) {
            		number = (int) Math.pow(3, column);

            			System.out.printf("%4d", number);
        		}

        		for (column = count - 1; column >= 0; column--) {
            		number = (int) Math.pow(3, column);

            			System.out.printf("%4d", number);
        		}
        		
			System.out.println();
    			}


	}

}