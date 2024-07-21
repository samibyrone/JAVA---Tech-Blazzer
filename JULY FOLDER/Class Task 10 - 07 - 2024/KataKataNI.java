import java.util.Scanner;

public class KataKataNI{

	public static void main(String... args) {

		Scanner scanner = new Scanner(System.in);
		String numbers = "";

		for(int count = 0; count < 10; count ++) {
			System.out.println("Enter number " +(count + 1));
			int number = scanner.nextInt();
			numbers = (numbers + number);
			if(count < 9) numbers += ", ";
		}

		System.out.println(numbers);		// "1, 2, 3, 4, 5, 6, 7, 8...."
		
		String[] bytes = numbers.split(", ");    //[49, 44, 50, 44, 51, 44....]
		int sum = 0;
		for (int counter = 0; counter < bytes.length; counter++) {
			String num = bytes[counter];
			sum += Integer.parseInt(num);
		}
		System.out.println("Sum of number is: " + sum );
	}
		
}


