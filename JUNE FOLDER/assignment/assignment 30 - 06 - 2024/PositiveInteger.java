import java.util.Scanner;

public class PositiveInteger {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter any positive integer number: ");
		int number = scan.nextInt();
		scan.close();

		if(isPrime(number)) {

			System.out.println( number + " is a prime number. ");
		
		} else {

			System.out.println(number + " is not a prime number. ");
		}

	}

		  static boolean isPrime(int n) {
        		
			if (num <= 1) {
            		
				return false;
        		
			}
        	
			for (int sum = 2; sum <= Math.sqrt(n); sum++) {
            		
				if (n % sum == 0) {
                	
					return false;
            		
				}
        
			}
        
			return true;
    
		}
	

}