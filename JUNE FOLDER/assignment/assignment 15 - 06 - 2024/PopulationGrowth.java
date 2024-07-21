import java.util.Scanner;

public class PopulationGrowth {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		double yearOne;
		double yearTwo;
		double yearThree;
		double yearFour;
		double yearFive;
		float annualGrowthRate;
		double currentPopulation;

		System.out.println("Enter the current world population: ");
		currentPopulation = input.nextDouble();

		System.out.println("Enter the annual world population growth rate: ");
		annualGrowthRate = input.nextFloat();

		//yearone = currentPopulation + ( currentPopulation * annualGrowthRate );
		System.out.printf("\nworld population after one year: %.of\n", yearOne );

		currentPopulation = yearOne;
	
		yearTwo = currentPopulation + ( currentPopulation * annualGrowthRate );
		System.out.printf( "            after two years: %.of\n", yearTwo );

		currentPopulation = yearTwo;

		yearThree = currentPopulation + ( currentPopulation * annualGrowthRate );
		System.out.printf( "              after three years: %.of\n", yearThree );
		
		currentPopulation = yearThree;

		yearFour = currentPopulation + ( currentPopulation * annualGrowthRate );
		System.out.printf( "             after four years: %.of\n", yearFour );
 
		currentPopulation = yearFour;

		yearFive = currentPopulation + ( currentPopulation * annualGrowthRate );
		System.out.printf( "             after five years: %.of\n", yearFive );

	}

}