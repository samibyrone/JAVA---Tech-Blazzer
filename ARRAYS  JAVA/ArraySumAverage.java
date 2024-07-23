import java.util.Arrays;

public class ArraySumAverage {

	public static void main(String... args) {

		int[] Array = new int[10];
	
		int sum = 0;
		int average = 0;
	//	int counting;
		
		for(int counting = 0; counting < Array.length; counting ++) {
			Array[counting] = counting + 1;
			sum += Array[counting];
			average = sum / Array.length;
		}

		System.out.println(Arrays.toString(Array));
		System.out.println("\n Total sum of all numbers are: "+ sum);
		System.out.println("\n Average sum of all numbers are: "+ average);
		System.out.println();

	}

}