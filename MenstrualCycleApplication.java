import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;


public class MenstrualCycleApplication {

        private static Scanner sammy = new Scanner(System.in);

        public static void main(String[] args) {
		mainMenu();
	
	}

	public static void mainMenu() {

        	while(true) {
	
			display();

		int option = sammy.nextInt();

			switch (option) {
				case 1-> checkNextPeriodDate();
		
				case 2-> checkOvulationPeriodDate();

				case 3-> checkFertilityPeriod();

				case 4-> checkSavePeriod();
						
				case 0-> System.exit(404);
					
				default-> System.out.println("Enter a Valid Option");
					
				
			}
		}
	
	}	

	

	public static void display() {
 
		System.out.println("\n You Are Welcome To Semcolon Medical Clinic, This Application Will help You Check Your Menstrual Cycle For Prompt Calculation And Prediction And All Menstrual Wahala......");
		System.out.println();
		System.out.println(" How May We Be Of Service To You? ");

			System.out.println( """

                	    Press 1 -> 		Check Next Period Date \n
                	    Press 2 ->		Check Ovulation Period Date \n
                	    Press 3 -> 		Check Fertility Period \n
                	    Press 4 -> 		Check Safe Period \n
                	    Press 0 -> 		Exit Application
	
				""");

			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println();
        
			option();
	}
	
    


	public static void option() {

		System.out.println(" Kindly Enter your option: \n");

			String response = sammy.next();

			if(response.equals("1")) {

               			checkNextPeriodDate();

                		System.out.print("\n");

			}
			 else if (response.equals("2")) {

                		checkOvulationPeriodDate();

            				System.out.print("\n");

            		}
			 else if (response.equals("3")) {

		                checkFertilityPeriod();
			
					System.out.print("\n");

            		}
			 else if (response.equals("4")) {

		                checkSavePeriod();

					System.out.print("\n");

            		}
			 else if (response.equals("0")) {

		                System.out.println("Guess You Are Satified With Our service? Hope To See you Again. \n");

                			System.exit(404);

            		}
			 else {

		                System.out.println("invalid input");

                display();
            }
        }




	public static void checkNextPeriodDate() {

		System.out.println("\n When is Your Next Menstrual Cycle Start Date And End Date?" );
            	System.out.println(" Please Enter Your Cycle length \n");
            	int cycleLength = sammy.nextInt();

            		while (cycleLength > 35 || cycleLength < 22) {

		                System.out.println(" You Have Irregular flow! Go See Your doctor For a Checkup.");
				System.out.println();
                		cycleLength = sammy.nextInt();
            		}

            		System.out.println(" Enter The date of your last period ");
            		int day = sammy.nextInt();

            		while(day > 31){

				System.out.println(" Enter valid date ");
            		}


            		System.out.println(" Enter The Month ");

	            	int month = sammy.nextInt();

            		if(month < 0 && month > 12){

                		System.out.println(" Enter a Valid Month ");
            		}


            		System.out.println(" Enter The Year ");

            		int year = sammy.nextInt();



            		LocalDate date = LocalDate.of(year, month, day);

	            	LocalDate newDate = date.plusDays(cycleLength);

            		System.out.println("Your Next Period Is On " + newDate);
			System.out.println();



            		System.out.println("\n Would You Love To Check Other Thing? YES/NO");

           	String reply = sammy.next();
            	if (reply.equalsIgnoreCase("YES")){

                	display();
            	} else {
                
			System.out.println("\n Thank you For Making Use Of Our Service......");
            	}
        }




        public static int checkOvulationPeriodDate() {
	
		System.out.println(" Enter Your Cycle Length ");

            		int cycleLength = sammy.nextInt();

            		int ovulationDate = cycleLength - 14;


            	System.out.println(" Enter Your Last Period Date ");

            		int lastPeriod = sammy.nextInt();

            		LocalDate localDate = LocalDate.now();


            	System.out.println("\n The Day Of Ovulation Is " + localDate.plusDays(ovulationDate));



            	System.out.println("\n Would You Love To Check Other Thing? YES/NO" );
            	String reply = sammy.next();

            	if (reply.equalsIgnoreCase("YES")){

                	display();

            	} else {
			System.out.println("\n Thank you For Making Use Of Our Service......");
            	}
            	return ovulationDate;

        }





        public  static void checkFertilityPeriod() {

		int fertilityWindow = 6;

            	System.out.println(" Enter Your Cycle Length ");

            	int cycleLength = sammy.nextInt();

            	int ovulationDay = checkOvulationPeriodDate();
		

	            	LocalDate localDate = LocalDate.now();

        	    	LocalDate fertilityStarting = localDate.plusDays(ovulationDay - fertilityWindow);

            		LocalDate fertilityEnding = localDate.plusDays(ovulationDay + fertilityWindow);



            	System.out.println("\n The Ovulation Day Will Be: " + localDate.plusDays(ovulationDay));

            	System.out.println("\n The Fertility Window Is From: " + fertilityStarting + " to: " + fertilityEnding);

            	System.out.println("\n Would You Love To Check Other Thing? YES/NO" );

            	String reply = sammy.next();

            	if (reply.equalsIgnoreCase("YES")) {

                	display();

	        } else {

                	System.out.println(" Thank you For Making Use Of Our Service...... ");
            	}
	}





	public static void checkSavePeriod() {

		System.out.print("\n Enter Your Average Menstrual Cycle Length In Days: ");

            	int cycleLength = sammy.nextInt();

            	System.out.print("\n Enter The Day Of The Last Menstrual Period (lastMenstrualPeriodDay): ");
            
		int lastMenstrualPeriodDay = sammy.nextInt();

            		int safePeriodStarting = lastMenstrualPeriodDay + 1;

            		int safePeriodEnding = lastMenstrualPeriodDay + cycleLength - 28;

            		System.out.println("\n Safe Period Is From Day " + safePeriodStarting + " to day " + safePeriodEnding);



		System.out.println("\n Would You Love To Check Other Thing? YES/NO" );

            	String reply = sammy.next();

            	if (reply.equalsIgnoreCase("YES")) {

                	display();

	        } else {

                	System.out.println(" Thank you For Making Use Of Our Service...... ");
            	}


        }


        
}



