import java.util.Scanner;

public class PizzaWahala {

	private static Scanner sammy = new Scanner(System.in);

	public static void main(String... args) {

		System.out.println("\n WELCOME TO YOUR PIZZA JOINT, YOU GET TO ORDER FOR SOME HOT AND SPICY SLICES OF PIZZA FOR HANGOUT AND BIRTHDAY PARTIES AND HAVE IT DELIVERED AT YOUR DOOR STEP. ");

		System.out.println("\n Here You Get To Decide Many Boxes Of Pizza Would Be Enough To Best Serve You Right!!! ");

		mainMenu();
		menuOption();
	}




	public static void mainMenu() {

        	while(true) {
	
			menu();

		int menuOption = sammy.nextInt();

			switch (menuOption) {

				case 1-> sapaSize();
		
				case 2-> smallMoney();

				case 3-> bigBoys();

				case 4-> odogwu();
						
				case 0-> System.exit(404);
					
				default-> System.out.println("Enter a Valid Option");	
			}
		}
	
	}	

	

	public static void menu() {
	
	//	System.out.println(" How Many Number Of People Do You Wish To Serve So Pizza? ");
	//	int pizza = sammy.nextInt();
 
		
		System.out.println();
		System.out.println("\n KIndly Enter The Best Size Of Your Choice That Best Suits You? ");

			System.out.println( """

                	    Press 1 -> 		Sapa Size \n
                	    Press 2 ->		Small Money Size \n
                	    Press 3 -> 		Big Boys Size\n
                	    Press 4 -> 		Odogwu Size\n
                	    Press 0 -> 		Exit Application
	
				""");

			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println();
		menuOption();
      
	}
	



	
	public static void menuOption() {

		System.out.print("\n Kindly Enter your option: ");

			String response = sammy.next();

			if(response.equals("1")) {

               			sapaSize();

                		System.out.print("\n");


			}
			 else if (response.equals("2")) {

                		smallMoney();

            				System.out.print("\n");

            		}
			 else if (response.equals("3")) {

		                bigBoys();
			
					System.out.print("\n");

            		}
			 else if (response.equals("4")) {

		                odogwu();

					System.out.print("\n");

            		}
			 else if (response.equals("0")) {

		                System.out.println("\n Guess You Are Well Satified With Our service? Do Make Sure To Patronize Again Anytime Sooner, Can't Wait To Have Your Orders Again!!!! \n");

                			System.exit(404);

            		}
			 else {

		                System.out.println("\n invalid input, Kindly Open Your Eyes Well Enough And Select From The Options Available ");
				System.out.println();
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println();

                menu();

            	}
        }




	public static void sapaSize() {

		System.out.println(" You Get To Have 4 Slices Of Pizza In your Order Box. ");
		System.out.print("\n How Many Pack Would You Like To Order? ");
            	int sapa = sammy.nextInt();

			int sapaPay = 2000;
			
			int total = sapa * sapaPay;
				
			System.out.println(" Your Total Payment Will Be: $" + total);
			System.out.println();
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println();


		System.out.print("\n Would You Like To Order For More? ");

		String response = sammy.next();
				
            	if (response.equalsIgnoreCase("YES")) {

               		menu();

	       	} else {

               	System.out.println(" Thank you For Your Patronage, Please Come Back Again Anytime Soon, Can't Wait To Have Your Orders Again...... ");
		
           	}
			
	}



	
	public static void smallMoney() {

		System.out.println(" You Get To Have 6 Slices Of Pizza In your Order Box. ");
		System.out.print("\n How Many Pack Would You Like To Order? ");
            	int smallMoney = sammy.nextInt();

			int sapaPay = 2400;
			
			int total = smallMoney * sapaPay;

			System.out.println(" Your Total Payment Will Be: $" + total);
			System.out.println();
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println();


		System.out.print("\n Would You Like To Order For More? ");

		String response = sammy.next();
				
            	if (response.equalsIgnoreCase("YES")) {

               		menu();

	       	} else {

               	System.out.println(" Thank you For Your Patronage, Please Come Back Again Anytime Soon, Can't Wait To Have Your Orders Again...... ");

           	}
						
	}




	
	public static void bigBoys() {

		System.out.println(" You Get To Have 8 Slices Of Pizza In your Order Box. ");
		System.out.print("\n How Many Pack Would You Like To Order? ");
            	int bigBoys = sammy.nextInt();

			int sapaPay = 3000;
			
			int total = bigBoys * sapaPay;

			System.out.println(" Your Total Payment Will Be: $ " + total);
			System.out.println();
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println();


		System.out.print("\n Would You Like To Order For More? ");

		String response = sammy.next();
				
            	if (response.equalsIgnoreCase("YES")) {

               		menu();

	       	} else {

               	System.out.println(" Thank you For Your Patronage, Please Come Back Again Anytime Soon, Can't Wait To Have Your Orders Again...... ");
		
           	}
			
	}




	
	public static void odogwu() {

		System.out.println(" You Get To Have 12 Slices Of Pizza In your Order Box. ");
		System.out.print("\n How Many Pack Would You Like To Order? ");
            	int odogwu = sammy.nextInt();

			int sapaPay = 4200;
			
			int total = odogwu *= sapaPay;

			System.out.println(" Your Total Payment Will Be: $ " + total);
			System.out.println();
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println();

		
		System.out.print("\n Would You Like To Order For More? ");

		String response = sammy.next();
				
            	if (response.equalsIgnoreCase("YES")) {

               		menu();

	       	} else {

               	System.out.println(" Thank you For Your Patronage, Please Come Back Again Anytime Soon, Can't Wait To Have Your Orders Again...... ");
		
           	}

	}


}