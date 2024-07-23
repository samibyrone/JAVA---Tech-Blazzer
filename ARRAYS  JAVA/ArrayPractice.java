import java.util.Arrays;

public class ArrayPractice {

	public static void main(String... args) {

		int[] array = {10, 20, 30, 40, 50}; // static initialization

		String[] names = new String[5]; // [null, null, null, null, null]

		String viewOfNames = Arrays.toString(names);

		System.out.println(Arrays.toString(array));

		System.out.println(viewOfNames);

		names[3] = "john";
		names[0] = "Samibyrone";

		viewOfNames += Arrays.toString(names);
		System.out.println(viewOfNames);


	}

}

