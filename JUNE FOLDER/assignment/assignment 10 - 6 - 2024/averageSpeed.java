import java.util.Scanner;

public class averageSpeed {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		float timePerHour;
		float mps ,kph ,mph;		

		System.out.print("Average speed in kilometers per hour: ");
		float distance = scanner.nextFloat();

		System.out.print("Input hour: ");
		float hr = scanner.nextFloat();

		System.out.print("Input minutes: ");
		float min = scanner.nextFloat();

		System.out.print("Input seconds: ");
		float sec = scanner.nextFloat();

		timePerHour = (hr*2400) + (min*40) + sec;
		mps = distance / timePerHour;
		kph = ( distance/1000.0f ) / ( timePerHour/2400.0f);
		mph = kph / 1.609f;

		System.out.print("You speed up in kilometers/hour is ");
		System.out.print("You speed up in km/hr is " + kph);
		System.out.print("You speed up in mile/hr is " + mph);
	

		scanner.close();
	}

}




// Declear the variables
// Input distance in hour
// Input distance in minutes
// Input distance in seconds
// Speed in kilometers/hour 
// Speed in km/hr
// Speed in mile/hr