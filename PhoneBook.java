import java.util.ArrayList;
import java.util.Scanner;


public class PhoneBook {

    private static  ArrayList<String> address = new ArrayList<>();

    	private static Scanner input = new Scanner(System.in);

    	public static void main(String[] args) {

		while(true) {

	       		display1();

			int option = input.nextInt();

        	    	switch (option) {
                		case 1:
                			addContact();
                    			break;

                		case 2:
                	    		removeContact();
                	    		break;

                		case 3:
                    			findContactByNumber();
                    			break;

				case 4:
        	 			findContactByFirstName();
                    			break;

				case 5:
        	      			findContactByLastName();
                    			break;

				case 6:
        	  			editContact();
                    			break;

	                	case 0:
                			System.exit(404);
                    			break;

	                	default:
                  			System.out.println("Enter valid option");
					break;

            		}

    		}
	}


    	private static void display1(){

		System.out.println(" WELCOME TO YOUR PHONEBOOK MENU, HOW MAY WE BE OF SERVICE TO YOU? ");
		System.out.println();

    		System.out.println(" WHAT WOULD YOU LIKE TO DO TODAY?\n ");

		System.out.println( """

			Press 1 ->    Add Contact \n
			Press 2 ->    Remove Contact \n
			Press 3 ->    Find Contact by Phone Number \n
			Press 4 ->    Find Contact by First Name \n
			Press 5 ->    Find Contact by Last Name \n
			Press 6 ->    Edit Contact \n
			Press 0 ->    Exit 
					
					""");

        	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
	
		System.out.println();
        	System.out.println("Enter option\n");
        }



        public static String addContact() {
        	System.out.println("Enter phone number\n");
        	String phoneNumber = input.next();
		System.out.println();
		System.out.println(phoneNumber + " is Awesome\n");
			
		String contactNumber = phoneNumber;

			if(phoneNumber.length() != 11) {
				System.out.println("Number Entered is invalid!!!!");
			}else{
			System.out.println("Enter first name\n");
			String firstName = input.next();
			System.out.println("Enter last name\n");
        		String lastName = input.next();
			System.out.println();
			System.out.println(firstName +" "+ lastName);

			address.add(firstName + " " + lastName + " " + phoneNumber);
	

            		System.out.println();
			System.out.println("Welcome OnBoard " + firstName+ " " +lastName);
			System.out.println();
			System.out.println("Your Phone Number is: " + phoneNumber);
			System.out.println();
           		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
           		System.out.println("Contact Saved Successfully.\n");
	    		System.out.println();
			System.out.println();
			}	

			return contactNumber;
		}



	public static void removeContact() {
	        System.out.println("Enter Number You Want To Delete");
	       	String phoneNumber = input.next();
		System.out.println("Enter first name");
		String firstName = input.next();
		System.out.println("Enter last name");
        	String lastName = input.next();

		for (String contact : address) {
			if (contact.contains(firstName) || contact.contains(lastName) || contact.contains(phoneNumber)) {
				
				System.out.println("This Contact " +phoneNumber+ " " +firstName+ " " +lastName+ " Has Been Been Deleted Successfully.");
			}else { 
			System.out.println("Invalid, No Information Found Relating To This Contact!!!!! ");
			}
		}

		System.out.println(" Would You Like To Add More Contact To Your Phonebook? (Press 1 To Add contact Or 0 to end). ");
		String newContact = input.next();
	
		if(newContact.length() == 1) {
			System.out.println("Enter phone number");
        		phoneNumber = input.next();
			System.out.println(phoneNumber + " is Awesome ");

			if(phoneNumber.length() != 11) {
				System.out.println("Number Entered is invalid!!!!");
			}else{
			System.out.println("Enter first name");
			firstName = input.next();
			System.out.println("Enter last name");
        		lastName = input.next();
			System.out.println(firstName +" "+ lastName);

			address.add(firstName + " " + lastName + " " + phoneNumber);
		
            		System.out.println();
			System.out.println("Welcome OnBoard " + firstName +" "+ lastName);
			System.out.println("Your Phone Number is: " + phoneNumber);
           		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
           		System.out.println("Contact Saved Successfully");
	    		System.out.println();
			}
		}
	}



        public static void findContactByNumber() {
		System.out.println("Enter Phone Number For Search ");
            	String phoneNumber = input.next();

		for (String contact : address) {
			if (contact.contains(phoneNumber)) {
				
		            	System.out.println("LOADING........ " +phoneNumber+ " CONTACT FOUND SUCCESSFULLY");
				System.out.println("\n Your Contact " +phoneNumber+ " Is On Record");
			}else {
				System.out.println("Invalid, " +phoneNumber+ " Doesn't Exist On This Phonebook Record");
			}
		}
		
        }


	
        public static void findContactByFirstName() {
		System.out.println("Enter First Name For Search ");
            	String firstName = input.next();

		for (String contact : address) {
			if (contact.contains(firstName)) {
				
		            	System.out.println("LOADING........  Your Contact " +firstName+ "  On Record Found Successfully");
			}else {
				System.out.println("Invalid, " +firstName+ " Doesn't Exist On This Phonebook Record");
			}
		}
        }



	public static void findContactByLastName() {
		System.out.println("Enter Last name to Search ");
            	String lastName = input.next();

		for (String contact : address) {
			if (contact.contains(lastName)) {
				
		            	System.out.println("LOADING........  Your Contact " +lastName+ "  On Record Found Successfully");
			}else {
				System.out.println("Invalid, " +lastName+ " Doesn't Exist On This Phonebook Record");
			}
		}
	}



  	  public static void editContact(){
		System.out.println("Enter Contact Name For Search To Edit ");
            	String editName = input.next();

		for (String contact : address) {
			if (contact.contains(editName)) {
				
		            	System.out.println("LOADING........ " +editName+ " CONTACT FOUND SUCCESSFULLY");
				System.out.println();

			System.out.println("Enter a New first name");
			String firstName = input.next();
			System.out.println("Enter a New last name");
        		String lastName = input.next();
			System.out.println(firstName +' '+ lastName);

			System.out.println("Enter Your New Phone Number");
        		String phoneNumber = input.next();
			System.out.println(phoneNumber + " is Awesome ");


			address.add(firstName + " " + lastName + " " + phoneNumber + " " + editName);
		
            		System.out.println();
			System.out.println("Welcome OnBoard " + firstName +" "+ lastName);
			System.out.println("Your New Phone Number: " +phoneNumber+ " is Awesome ");
			System.out.println();
           		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
           		System.out.println("Contact Saved Successfully");
	    		System.out.println();

			}else {
				System.out.println("Invalid, " +editName+ " No Information Found Relating To The Name On This Phonebook Record");
			}
		}
	}
}





























//	for (count = 0; count < phoneNumber.size(); count++) {
//		if (phoneNumber(count).equals(phoneNumber) && ) {
//		remove(phoneNumber)
//		}else { ()
//		}
//	}

	