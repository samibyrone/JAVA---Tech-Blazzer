import java.util.Arrays;

public class ArrayIndexDisplayEvenOdd {

	public static void main(String... args) {


	int[] number = new int[10]; 	
	number[0] = 1;
	number[2] = 2;
	number[4] = 3;
	number[6] = 4;
	number[8] = 5;

	System.out.println(Arrays.toString(number));
	System.out.println();


	int[] index = new int[10];
	index[1] = 1;
	index[3] = 3;
	index[5] = 5;
	index[7] = 7;
	index[9] = 9;

	System.out.println(Arrays.toString(index));


	}

}