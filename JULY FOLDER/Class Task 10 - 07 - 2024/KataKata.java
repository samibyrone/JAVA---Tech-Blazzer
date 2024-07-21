import java.util.Scanner;

public class KataKata{

	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter your number: ");
		int number = input.nextInt();

		int counter = 1;
		while ( counter <= 12 ) {
			System.out.println(number + "*" + counter + " = ");
			int product = counter * number;
			System.out.print(product);
		//	System.out.println("%d, %d , &d&n");
				counter ++;
		}
	System.out.println();


		for(counter = 0; counter <= 10; counter = counter + 1) {
			System.out.println("Loop running "+ (counter +1)+ "times");
		}

		for(counter = 0; counter < 10; counter = counter + 1) {

			boolean isCounterOdd = counter % 2 != 0;
	
			if(isCounterOdd) {

				System.out.println("Skipped: " + counter);
					continue;
			}
				System.out.println(counter);
		}	
	System.out.println();


		for(counter = 0; counter < 10; counter = counter + 1) {

			boolean isCounterOdd = counter % 2 != 0;
	
			if(isCounterOdd) {

				System.out.println("Skipped: " + counter);
					break;
			}
				System.out.println(counter);
		}		
	System.out.println();


		a : for(int counters = 0; counters < 10; counters = counters + 1) {

			for(int count = 0; count < 10; count = count + 1) {

				if (count < 3) {

					System.out.println("inner Loop " + count );
				}else {
					 break a;
					}
			}

			System.out.println();
			System.out.println("Outter Loop " + counters);
		}

	}

}