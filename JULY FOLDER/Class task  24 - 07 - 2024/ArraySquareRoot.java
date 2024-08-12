import java.util.Arrays;

public class ArraySquareRoot {

	public static void main(String... args) {

		int[] number = {8, 3, 9, 6, 5};
		int square = 0;

		for(int count = 0; count < number.length; count++) {

			number[count] = number[count] * number[count];
			
		}	

		for(int index = 0; index < number.length -1; index ++) {

			if (number[index] > number[index + 1]) {	
	
				square = number[index];

				number[index] = number[index + 1];

				number[index + 1] = square;
			}
		}
		
		System.out.println("\n number in ascending order with the squared:" + Arrays.toString(number));

	}

}