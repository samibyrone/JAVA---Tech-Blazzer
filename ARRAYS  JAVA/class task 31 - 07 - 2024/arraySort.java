import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySorting {

	private static void check(int[] arr, int toCheckValue) {

		boolean test = false;

		for (int element : arr) {

			if (element == toCheckValue) {

				test = true;

				break;
			}
		}

		System.out.println("Is " + toCheckValue + " present in the array: " + test);
	}



	public static void main(String[] args) {

		int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };

		int toCheckValue = 7;

		System.out.println("Array: " + Arrays.toString(arr));
		check(arr, toCheckValue);
	}
}






import java.util.Arrays;
import java.util.stream.IntStream;

class GFG {

	private static void check(int[] arr, int toCheckValue) {
		
		Arrays.sort(arr);

		int res = Arrays.binarySearch(arr, toCheckValue);

		boolean test = res >= 0 ? true : false;

		System.out.println("Is " + toCheckValue	+ " present in the array: " + test);
	}



	public static void main(String[] args) {

		int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };

		int toCheckValue = 7;

		System.out.println("Array: " + Arrays.toString(arr));
		
		check(arr, toCheckValue);
	}
}
