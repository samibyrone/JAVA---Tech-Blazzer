import java.util.Scanner;

public class NokiaMenu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		
		int menu;
		int menuList = 0;	

		System.out.println(" You are Welcome to Nokia Menu-List " );
		System.out.println(" Kindly enter your name: ");
		String myName = input.next( " " );

			System.out.println(" Enter number 0 to show list: ");
			System.out.println(" Press -1 to quit: ");
			menu = input.nextInt();

		if (menuList == 0 ) {		
			System.out.println( """
				press 1 Phone Book
				press 2 Messages
				press 3 Chat
				press 4 Call Register
				press 5 Tones
				press 6 Settings
				press 7 Call Diverts
				press 8 Games
				press 9 Calculator
				press 10 Reminders
				press 11 Clocks
				press 12 Profiles 
				press 13 Sim Services
				""");
		menuList = input.nextInt();

		}
		
			switch ( menu ) {
		
			case 1 : System.out.println( " Phonebook " );
				System.out.println(""" 
						1.  Search
						2.  Service No
						3.  Add name
						4.  Erase
						5.  Edit
						6.  Assign tone
						7.  Send b'card
						8.  Option
						9.  Speed
						10. Voice tag
						""");
					int phonebook = input.nextInt();
					
						switch( phonebook ) {
							case 1: System.out.println(" Search ");
								break;
							case 2: System.out.println(" Service Nos ");
								break;
							case 3: System.out.println(" Add name ");
								break;
							case 4: System.out.println(" Erase ");
								break;
							case 5: System.out.println(" Edit ");
								break;
							case 6: System.out.println(" Assign tone ");
								break;
							case 7: System.out.println(" Send b'card ");
								break;
							case 8: System.out.println(" Options ");
				
								System.out.println("""
									1. Type of view
									2. Memory status
									""");

						int Option = input.nextInt();
							
							switch( Option ) {
								case 1: System.out.println(" Type of view ");
										break;
								case 2: System.out.println(" Memory status ");
										break;
									}
								break;
							case 9: System.out.println(" Speed dials ");
								break;
							case 10: System.out.println(" Voice tags ");
								break;
								default: System.out.println(" End of page: ");

						}

				break; 

			case 2 : System.out.println( " Messages " );
					System.out.println(""" 
						1.  Write messages
						2.  Inbox
						3.  Outbox
						4.  Picture messages
						5.  Templates
						6.  Smileys
						7.  Message settings
						8.  Info service
						9.  Voice mailbox number
						10. Service command editor
						""");
					int messages = input.nextInt();

						switch( messages ) {
							case 1: System.out.println(" Write messages ");
								break;
							case 2: System.out.println(" Inbox ");
								break;
							case 3: System.out.println(" Outbox ");
								break;
							case 4: System.out.println(" Picture messages ");
								break;
							case 5: System.out.println(" Templates ");
								break;
							case 6: System.out.println(" Smileys ");
								break;
							case 7: System.out.println(" Message settings ");

									System.out.println("""
									1. Set 1
									2. Common
									""");

						int messageSettings = input.nextInt();
							
							switch( messageSettings ) {
								case 1: System.out.println(" Set 1 ");
										System.out.println(""" 
												1.  Message center number
												2.  Message sent as
												3.  Mesaage validity
												""");

										int set1 = input.nextInt();

											switch (set1) {
												case 1: System.out.println(" Message center number ");
													break;
												case 2: System.out.println(" Message sent as ");
													break;
												case 3: System.out.println(" Message validity ");
													default: 
														System.out.println(" End of page: ");
												}
										break;

								case 2: System.out.println(" Comman ");
											System.out.println(""" 
												1.  Delivery reports
												2.  Reply via same centre
												3.  Character support
												""");
										int comman = input.nextInt();

											switch ( comman ) {
												case 1: System.out.println(" Delivery reports ");
													break;
												case 2: System.out.println(" Reply via same centre ");
													break;
												case 3: System.out.println(" Character support ");
													default: 
														System.out.println(" End of page: ");
												}
										break;
									}

								break;
							case 8: System.out.println(" Info service ");
								break;
							case 9: System.out.println(" Voice mailbox number ");
								break;
							case 10: System.out.println(" Service command editor ");
	
							default: 
								System.out.println(" End of page: ");
						}

				break; 

			case 3 : System.out.println( " Chat " );
				break; 

			case 4 : System.out.println( " Call Register " );
					System.out.println(""" 
						1.  Missed calls
						2.  Recieved calls
						3.  Dailed numbers
						4.  Erase recent cal lists
						5.  Show call duration
						6.  Show call costs
						7.  Call cost settings
						8.  Prepaid credit
						""");
					int callRegister = input.nextInt();

						switch( callRegister ) {
							case 1: System.out.println(" Missed calls ");
								break;
							case 2: System.out.println(" Recieved calls ");
								break;
							case 3: System.out.println(" Dailed numbers ");
								break;
							case 4: System.out.println(" Erase recent cal lists ");
								break;
							case 5: System.out.println(" Show call duration ");
									System.out.println("""
									1.  Last call duration
									2.  All call's duration
									3.  Recieved call's duration
									4.  Dialled call's duration
									5.  Clear timers
									""");

								int showcallduration = input.nextInt();

									switch( showcallduration ) {
										case 1: System.out.println(" Last call duration ");
											break;
										case 2: System.out.println(" All call's duration ");
											break;
										case 3: System.out.println(" Recieved call's duration ");
											break;
										case 4: System.out.println(" Dialled call's duration ");
											break;
										case 5: System.out.println(" Clear timers ");
											default: 
												System.out.println(" End of page: ");
									}
								break;

							case 6: System.out.println(" Show call costs ");
									System.out.println("""
									1. Last call cost
									2. All call's cost
									3. Clear counters
									""");

								int showCallCosts = input.nextInt();

									switch( showCallCosts ) {
										case 1: System.out.println(" Last call cost ");
											break;
										case 2: System.out.println(" All call's cost ");
											break;
										case 3: System.out.println(" Clear counters ");
											default: 
												System.out.println(" End of page: ");
									}
								break;
							case 7: System.out.println(" Call cost settings ");
									System.out.println("""
									1. Call cost limit
									2. Show costs in
									""");

								int callCostSettings = input.nextInt();

									switch( callCostSettings ) {
										case 1: System.out.println(" Call cost limit ");
											break;
										case 2: System.out.println(" Show costs in ");
											default: 
												System.out.println(" End of page: ");
									}
								break;
							case 8: System.out.println(" Prepaid credit ");
								
							default: 
								System.out.println(" End of page: ");
						}

				break; 

			case 5 : System.out.println( " Tones " );
					System.out.println(""" 
						1.  Ringing tone
						2.  Ringing volume
						3.  Incoming call alert
						4.  Composer
						5.  Message alert tone
						6.  Keypad tones
						7.  Warning and game tones
						8.  Vibrating alert
						9.  Screen saver
						""");
					int tones = input.nextInt();

						switch( tones ) {
							case 1: System.out.println(" Ringing tone ");
								break;
							case 2: System.out.println(" Ringing volume ");
								break;
							case 3: System.out.println(" Incoming call alert ");
								break;
							case 4: System.out.println(" Composer ");
								break;
							case 5: System.out.println(" Message alert tone ");
								break;
							case 6: System.out.println(" Keypad tones ");
								break;
							case 7: System.out.println(" Warning and game tones ");
								break;
							case 8: System.out.println(" Vibrating alert ");
								break;
							case 9: System.out.println(" Screen saver ");

							default: 
								System.out.println(" End of page: ");
						}

				break; 

			case 6 : System.out.println( " Settings " );
					System.out.println(""" 
						1.  Call settings
						2.  Phone settings
						3.  Security settings
						4.  Restore factory settings
						""");
					int settings = input.nextInt();

						switch( settings ) {
							case 1: System.out.println(" Call settings ");
									System.out.println(""" 
										1.  Automatic redial
										2.  Speed dialing
										3.  Call waiting options
										4.  Own number sending
										5.  Phone line in use
										6.  Automatic answer
										""");
								int callSettings = input.nextInt();

									switch( callSettings ) {
										case 1: System.out.println(" Automatic redial ");
											break;
										case 2: System.out.println(" Speed dialing ");
											break;
										case 3: System.out.println(" Call waiting options ");
											break;
										case 4: System.out.println(" Own number sending ");
											break;
										case 5: System.out.println(" Phone line in use ");
											break;
										case 6: System.out.println(" Automatic answer ");
											default: 
												System.out.println(" End of page: ");
									}
								break;
							case 2: System.out.println(" Phone settings ");
									System.out.println(""" 
										1.  Language
										2.  Cell info display
										3.  Welcome note
										4.  Network selection
										5.  Light
										6.  Confirm SIM service actions
										""");
								int phoneSettings = input.nextInt();

									switch( phoneSettings ) {
										case 1: System.out.println(" Language ");
											break;
										case 2: System.out.println(" Cell info display ");
											break;
										case 3: System.out.println(" Welcome note ");
											break;
										case 4: System.out.println(" Network selection ");
											break;
										case 5: System.out.println(" Light ");
											break;
										case 6: System.out.println(" Confirm SIM service actions ");
											default: 
												System.out.println(" End of page: ");
									}
								break;
							case 3: System.out.println(" Security settings ");
									System.out.println(""" 
										1.  PIN code request
										2.  Call barring service
										3.  Fixed dialing
										4.  Closed user group
										5.  Phone security
										6.  Change access codes
										""");
								int securitySettings = input.nextInt();

									switch( securitySettings ) {
										case 1: System.out.println(" PIN code request ");
											break;
										case 2: System.out.println(" Call barring service ");
											break;
										case 3: System.out.println(" Fixed dialing ");
											break;
										case 4: System.out.println(" Closed user group ");
											break;
										case 5: System.out.println(" Phone security ");
											break;
										case 6: System.out.println(" Change access codes ");
											default: 
												System.out.println(" End of page: ");
									}
								break;
							case 4: System.out.println(" Restore factory settings ");
								break;
							default: 
								System.out.println(" End of page: ");
						}

				break; 

			case 7 : System.out.println( " Call Diverts " );
				break; 

			case 8 : System.out.println( " Games " );
				break; 

			case 9 : System.out.println( " Calculator " );
				break; 

			case 10 : System.out.println( " Reminder " );
				break; 

			case 11 : System.out.println( " Clocks " );
					System.out.println(""" 
						1.  Alarm clock
						2.  Clock settings
						3.  Date settings
						4.  Stopwatch
						5.  Countdown timer
						6.  Auto update of date and time
						""");
					int clocks = input.nextInt();

						switch( clocks ) {
							case 1: System.out.println(" Alarm clock ");
								break;
							case 2: System.out.println(" Clock settings ");
								break;
							case 3: System.out.println(" Date settings ");
								break;
							case 4: System.out.println(" Stopwatch ");
								break;
							case 5: System.out.println(" Countdown timer ");
								break;
							case 6: System.out.println(" Auto update of date and time ");
							default: 
								System.out.println(" End of page: ");
						}
				break; 

			case 12 : System.out.println( " Profiles " );
				break; 

			case 13 : System.out.println( " Sim Services " );
				break; 

			default : 
				System.out.println(" Number Invalid, Enter a Valid Number! ");
				System.out.println(" Kindly enter a number to continue or -1 to quit : ");

		}

	}
}

