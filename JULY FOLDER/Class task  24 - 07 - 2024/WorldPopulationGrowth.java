import java.util.Scanner;

public class WorldPopulationGrowth {

    public static void main(String... args) {

		Scanner input = new Scanner(System.in);

        double currentPopulation = 8.1e9;
        double growthRate = 0.0071;
	double initialPopulation = 0;
	int doublingYear = 0;
        int years = 75;
		
	System.out.println("\n Application that checks and calculate the current popuation growth rate of the world population and predict what the population will be after 75Years. ");

	//	System.out.println(" Enter the number of years: ")
	//	doublingYear = input.nextInt();

        	System.out.printf("\n %10s %20s %20s%n", " Year ", " Population ", " Increase ");

		for (int year = 1; year <= years; year++) {
   
			double increase = currentPopulation * growthRate;

			currentPopulation += increase;
        
			System.out.printf("\n %10d %20.2f %20.2f%n ", year, currentPopulation, increase);
		}

	        currentPopulation = initialPopulation;
       
	        while (currentPopulation < 2 * initialPopulation) {
      
			currentPopulation += currentPopulation * growthRate;
				
				doublingYear++;
        	}
	
        System.out.println(" \nThe population will be double in " + doublingYear + " years.");
    }
}