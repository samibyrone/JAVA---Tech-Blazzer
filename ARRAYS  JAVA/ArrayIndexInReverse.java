import java.util.Arrays;

public class ArrayIndexInReverse {

	public static void main(String... args) {

	
	int[] counts = new int[10];
	 
	for(int counter = 0; counter < counts.length; counter ++)

		counts[counter] = counts.length - counter;

	System.out.println(Arrays.toString(counts));

	System.out.println();
	

	}

}