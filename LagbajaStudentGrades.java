import java.util.Scanner;
import java.util.Arrays;

public class LagbajaStudentGrades{

	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
		
		System.out.println("\n WELCOME TO SEMICOLON-AFRICA."); 
		System.out.println("\n THIS APPLICATION ALLOWS TEACHER TO MANAGES THERE STUDENT GRADES ON EVERY SUBJECTS OFFERED.\n");
		
		
		System.out.print(" How many Student do you have? ");
		int numStudents = input.nextInt();

		System.out.print(" How many Subject do they offer Student? ");
		int numSubjects = input.nextInt();

		System.out.println(" Saving  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> "); 
		System.out.println();
		System.out.println(numStudents + " Number Of Student For " +numSubjects+ " Subject Offered Collected Successfully. ");
		System.out.println();

			int [][] registration = new int[numStudents][numSubjects];
			int [] total = new int[numStudents];
			int [] sorted = new int[numStudents];
			double [] average = new double[numStudents];
			int [] classPosition = new int [numStudents];

		

			for(int index = 0; index < registration.length; index++){
				System.out.println("\n Entering Score For Student " +(index + 1)+ ": ");
				System.out.println();
				for(int counter = 0; counter < registration[index].length; counter++){
					System.out.print("Enter Score For Subject " +(counter + 1)+ ": ");
					registration[index][counter] = input.nextInt();
						
				System.out.println();						
				System.out.println(" Saved >>>>>>>>>> ");
				System.out.println();
				}
			}



			for(int student = 0; student < registration.length; student ++){

				int sum = 0;
				double sammy = 0;

				for(int subject = 0; subject < registration[student].length; subject ++){

					sum += registration[student][subject];
				}

				sammy = (double)sum / numStudents;
				average[student] = sammy;
				total[student] = sum;
				sorted[student] = sum;
			}
	


		Arrays.sort(sorted);
		for(int count = 0; count < sorted.length; count++){

			for(int index = 0; index < sorted.length; index++){

				if(sorted[count] == total[index]) 

					classPosition[count] = sorted.length - index;
			}
		}
		
	
		
		System.out.println("==============================================================================");
		System.out.printf("\t\n%8s","STUDENT");
       		for(int index = 1; index < numSubjects + 1; index ++){
           		System.out.printf("\t%s","SUB" + index);
      		}


	
      		System.out.printf("\t%5s\t%5s\t%5s%n"," TOTAL "," AVE ", " POS ");
		System.out.println();
		System.out.println("=============================================================================");
		System.out.println();

		 for (int counter = 0; counter < numStudents; counter ++) {
			
            		System.out.printf("Student %d ", counter + 1);

           		 for (int innerCounter = 0; innerCounter < numSubjects; innerCounter ++) {

               			 System.out.printf("\t%d", registration[counter][innerCounter]);

           		 }

			
          	System.out.printf("%10d%10.2f%5d", total[counter], average[counter], classPosition[counter]);
            	System.out.println();
		}
		System.out.println();
		System.out.println("===========================================================================");
		System.out.println();
		System.out.println("===========================================================================");
       		System.out.println();



		System.out.println();
		System.out.print("\nSubject Summary");
		for(int index = 0; index < numSubjects; index++){
			System.out.println("\nStudent " +(index + 1));
			for(int count = 0; count < numStudents; count++){
				System.out.printf("\nHighest scoring student is: Student %d Scoring %d",  classPosition[0], );
				System.out.printf("\n Lowest Scoring Student is: Student %d Scoring %d" + classPosition[-1]);
			//	System.out.printf("\n Total Scoring of Student is : %d" + total[]);
			//	System.out.printf("\n Average Scoring of Student is : %d" + average[]);
			//	System.out.printf("\n Number of Passed Student is : %d" + passes);
			//	System.out.printf("\n Number of failed Student is: %d" + fails);
				System.out.println();
				System.out.println();
			}
		}




		System.out.println();
		System.out.printf(" The hardest subject is %d with %d failures ");
		System.out.println();
		System.out.printf(" The easiest subject is %d with %d passes ");
		System.out.println();
		System.out.printf(" The Overall Highest Score is Scored by Student %d in subject %d Scoring %d: ");
		System.out.println();
		System.out.printf(" The Overall Lowest Score is Scored by Student %d in subject %d Scoring %d: ");



		System.out.println();
		System.out.println();
		System.out.println(" ========================================================");
		System.out.println();
		System.out.println();
		System.out.println("CLASS SUMMARY");
		System.out.println();
		System.out.println("=========================================================");

		System.out.println();
		System.out.printf(" Best Graduating Student is: Student %d Scoring %d ");
		System.out.println();
		System.out.println("=========================================================");

		System.out.println();
		System.out.println();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		System.out.printf(" Worst Graduating Student is: Student %d Scoring %d ");
		System.out.println();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();

		System.out.println();
		System.out.println("============================================================");
		System.out.println();
		System.out.printf(" Class Total Score is %d: ");
		System.out.println();
		System.out.printf(" Class Average Score is %d: ");
		System.out.println();
		System.out.println("============================================================");
		



	}
}