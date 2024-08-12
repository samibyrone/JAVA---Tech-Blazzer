import java.util.Arrays;

public class ArrayAscendingOrder {

	public static void main(String... args) {

        	int[] numbers = { -8, 95, -35, 8, 12, 72, 1, -3, 45};
		int length = numbers.length;

        	Arrays.sort(numbers);

        	System.out.println(" Array sorting in ascending order: " + Arrays.toString(numbers));

	}
}
