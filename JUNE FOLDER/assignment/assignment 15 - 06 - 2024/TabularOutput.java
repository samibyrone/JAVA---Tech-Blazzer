import java.util.Scanner;

public class TabularOutput {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);

		int N;
		int N2;
		int N3;
		int N4;
		
		System.out.println("\n N \t N2 \t N3 \t N4 \n");

		N = 1;
		System.out.printf("%d \t %d \t %d \t %d\n", (N), (N * N), (N * N * N), (N * N * N * N));
		
		N = 2;
		System.out.printf("%d \t %d \t %d \t %d\n", (N), (N * N), (N * N * N), (N * N * N * N));

		N = 3;
		System.out.printf("%d \t %d \t %d \t %d\n", (N), (N * N), (N * N * N), (N * N * N * N));

		N = 4;
		System.out.printf("%d \t %d \t %d \t %d\n", (N), (N * N), (N * N * N), (N * N * N * N));

		N = 5;
		System.out.printf("%d \t %d \t %d \t %d\n", (N), (N * N), (N * N * N), (N * N * N * N));


	}
}
