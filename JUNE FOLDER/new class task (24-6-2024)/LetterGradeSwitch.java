import java.util.Scanner;

public class LetterGradeSwitch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter your score: ");
		int Score = input.nextInt();

		
		switch ( Score ) { 
		 case 80:
			System.out.println(" A ");
			break;

 		case 70: 
			System.out.print(" B ");
			break;
 
		 case 60: 
		 	System.out.print(" C ");
			break; 

		 case 50:
			System.out.print(" D ");
			break; 

		 case 40:
			System.out.print(" F ");
 			break;

		defualt:
			System.out.print(" Failed ");

		}	


	}
}