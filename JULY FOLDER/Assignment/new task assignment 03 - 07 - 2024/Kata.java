public class Kata {

	public static boolean isEven(int number) {
  			if(number % 2 == 0) return true;
			return false;
	}		



	public static boolean isPrime(int primeNumber) {
		
			if( primeNumber % 2 != 0 && primeNumber % 3 != 0 ) 
				return true;
			else if 
				( primeNumber % 2 != 0 && primeNumber % 3 != 0 && primeNumber % 5 != 0  && primeNumber % 7 != 0);
					return false; 
	}



	
	public static int isSubtract(int subtract1, int subtract2) {

		int isSubtract = subtract1 - subtract2;
			if (isSubtract <= 0) 
				isSubtract = subtract2 - subtract1;
					return isSubtract;
	} 




	public static float isDivision(int numberDiv1, int numberDiv2) {

			int quotient =0;

		float isDivision = numberDiv2 / numberDiv1;
			/*if (numberDiv2 == 0) return true;
				else
				return false;*/

	System.out.print(numberDiv2 == 0 ? "True" : "False");
	return quotient;

	}





	public static int isFactorialOf(int isFactorial) {

			int factorial = 1;
			for ( int number = 1; number <= isFactorial; number ++)  factorial *= number;
				
			
				return factorial;
	}
		




	public static boolean squareRoot(int rootNumber) {
	
		double rootNumberSquared;
			rootNumberSquared = Math.sqrt(rootNumber);

			if (rootNumberSquared * rootNumberSquared == rootNumber)
				return true;
					else
					return false;

	}



	public static Boolean isPalindrome(int number) {
	
		int firstNum = number / 1 % 10;
		int secondNum  = number / 10 % 10;
		int thirdNum = number / 100 % 10;
		int fourthNum = number / 1000 % 10;
		int fifthNum = number / 100000 % 10;
 
		if (fifthNum == firstNum && fourthNum == secondNum) return true;
			return false;
	}

}

