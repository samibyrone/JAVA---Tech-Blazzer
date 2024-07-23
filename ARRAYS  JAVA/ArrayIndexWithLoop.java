import java.util.Arrays;

public class ArrayIndexWithLoop {

	public static void main(String... args) {

	
	int[] count = new int[10];
	 
	for(int counting = 0; counting < count.length; counting ++)

		count[counting] = counting +1;

	System.out.println(Arrays.toString(count));

	System.out.println();


	}

}