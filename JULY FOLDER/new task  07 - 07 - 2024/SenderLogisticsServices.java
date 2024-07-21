import java.util.Scanner;

public class SenderLogisticsServices {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Application for a Logistic Company ");
		System.out.println();

		int delivery;
		int amount = 160;
		int amount2 = 200;
		int amount3 = 250;
		int amount4 = 500;
		int commission = 0;
		int collectionRate = 0;
		int basePay = 5000;

		System.out.println(" Enter your number of delivery. ");
		int packages  = input.nextInt();

		for (delivery = 0; delivery <= packages; delivery++) {

			if (packages < 50) {
				 commission = packages *= amount;
				packages++;
			}

			else if (packages >= 50) {
				 if (packages <= 59){
					commission = packages *= amount2;
					packages++;
				}
			}

			else if (packages >= 60) {
				 if (packages <= 69) {
					commission = packages *= amount3;
					packages++;
				}
			}

			else if (packages >= 70) {
				commission = packages *= amount4;
				packages++;
					
			}

				collectionRate = commission + basePay;	
		}
			System.out.print( collectionRate );
	}

}

