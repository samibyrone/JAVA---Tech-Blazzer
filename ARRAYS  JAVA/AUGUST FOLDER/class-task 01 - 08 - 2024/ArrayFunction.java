import java.util.Arrays;

public class ArrayFunction {

	public static void main(String... args ) {

		int[] number = {2, 28, 9, 5, -15, 35, -7, 45};

		int[] sorted = sammy(number);                                      

		System.out.println("sorted arrays in ascending order " +  Arrays.toString(sorted));	
	
	}


	static int [] sammy (int[] number) {

		for(int count = 0; count < number.length; count++) {

			for(int counter = count + 1; counter < number.length; counter++) {

				if (number[count] > number[counter]) {	
		
					number[count] = number[count] + number[counter];

					number[counter] = number[count] - number[counter];

					number[count] = number[count] - number[counter];

				}
				
			}
		}	

		return number;

	}

}

