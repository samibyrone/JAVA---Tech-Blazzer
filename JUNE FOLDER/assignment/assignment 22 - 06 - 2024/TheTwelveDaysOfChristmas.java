import java.util.Scanner;

public class TheTwelveDaysOfChristmas {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

			int i;
			int j;
			int days;
			
    		System.out.print( " Enter number of day : (-1 to quit) ");
    			days = input.nextInt();

    		while (days != -1)	
		for (i = 1; i <= 12; i++) {

			System.out.print(" On the ");
	
			switch(days) {
			case 1:
				System.out.print(" First ");
				break;
			
			case 2:
				System.out.print(" Second ");
				break;
				
			case 3:
				System.out.print(" Third ");
				break;
			
			case 4:
				System.out.print(" Fourth ");
				break;
			
			case 5:
				System.out.print(" Fifth ");
				break;
			
			case 6:
				System.out.print(" Sixth ");
				break;

			case 7:
				System.out.print(" Seventh ");
				break;

			case 8:
				System.out.print(" Eighth ");
				break;

			case 9:
				System.out.print(" Ninth ");
				break;

			case 10:
				System.out.print(" Tenth ");
				break;

			case 11:
				System.out.print(" Eleventh ");
				break;

			case 12:
				System.out.print(" Twelfth ");
				break;
			
			}
		}
				
			System.out.println(" Day of christmas my true love gave to me ");

			for(j = 1; j <= 12; j++) {

				switch(days) {

				case first:
					System.out.println(" \n On the first day of Christmas \n"
							"\n My true love sent to me \n"
							"\n A partridge in a pear tree! \n ");
						break;

				case second:
					System.out.println("\n two Turtle Doves
							"\n On the second day of Christmas \n"
							"\n My true love sent to me \n"
							"\n Two turtle doves \n"
							"\n And a partridge in a pear tree! \n ");
						break;

				case third:
					System.out.println(" \n Three french hens
							"\n On the third day of Christmas \n "
							"\n My true love sent to me \n "
							"\n Three french hens \n "
							"\n Two turtle doves \n "
							"\n And a partridge in a pear tree! \n ");
						break;

				case fourth:
					System.out.println(" \n four Calling Birds
							"\n On the fourth day of Christmas (what's a calling bird) \n"
							"\n My true love sent to me \n"
							"\n Four calling birds "\n
							"\n Three french hens \n"
							"\n Two turtle doves \n"
							"\n And a partridge in a pear tree! \n ");
						break;

				case fifth:
					System.out.println(" \n five Golden Rings
							"\n On the fifth day of Christmas \n"
							"\n My true love sent to me \n"
							"\n Five golden rings! \n"
							"\n Four calling birds \n"
							"\n Three french hens \n"
							"\n Two turtle doves \n"
							"\n And a partridge in a pear tree! \n ");
						break;

				case sixth:
					System.out.println(" \n six Geese a laying
							"\n On the sixth day of Christmas \n"
							"\n My true love sent to me \n"
							"\n Six geese a layin' \n"
							"\n Five golden rings! \n"
							"\n Four calling birds \n"
							"\n Three french hens \n"
							"\n Two turtle doves \n"
							"\n And a partridge in a pear tree! \n ");
						break;

				case seventh:
					System.out.println(" \n seven Swans a swimming
							"\n On the seventh day of Christmas \n"
							"\n My true love sent to me \n"
							"\n Seven swans a swimmin' \n"
							"\n Six geese a layin' \n"
							"\n Five golden rings! \n"
							"\n Four calling birds \n"
							"\n Three french hens \n"
							"\n Two turtle doves \n"
							"\n And a partridge in a pear tree! \n ");
						break;

				case eighth:
					System.out.println(" \n eight Maids a milking
							"\n On the eighth day of Christmas \n"
							"\n My true love sent to me \n"
							"\n Eight maids a milkin' \n"
							"\n Seven swans a swimmin' \n"
							"\n Six geese a layin' \n"
							"\n Five golden rings! \n"
							"\n Four calling birds (calling birds) \n"
							"\n Three french hens \n"
							"\n Two turtle doves \n"
							"\n And a partridge in a pear tree! \n ");
						break;

				case nineth:
					System.out.println(" \n nine Ladies Dancing
							"\n Seven swans a swimmin' \n"
							"\n On the seventh day of Christmas \n"
							"\n My true love sent to me \n"
							"\n Seven swans a swimmin' \n"
							"\n Six geese a layin' \n"
							"\n Five golden rings! \n"
							"\n Four calling birds \n"
							"\n Three french hens \n"
							"\n Two turtle doves \n"
							"\n And a partridge in a pear tree! \n ");
						break;

				case tenth:
					System.out.println(" \n Ten lords a leapin'
							"\n On the tenth day of Christmas \n"
							"\n My true love sent to me \n"
							"\n Ten lords a leapin' \n"
							"\n Nine ladies dancin' \n"
							"\n Eight maids a milkin' \n"
							"\n Seven swans a swimmin' \n"
							"\n Six geese a layin' \n"
							"\n Five golden rings! \n"
							"\n Four calling birds \n"
							"\n Three french hens \n"
							"\n Two turtle doves \n"
							"\n And a partridge in a pear tree! \n ");
						break;

				case eleventh:
					System.out.println(" \n Eleven pipers pipin'
							"\n On the eleventh day of Christmas \n"
							"\n My true love sent to me \n"
							"\n Eleven pipers pipin' \n"
							"\n Ten lords a leapin' \n"
							"\n Nine ladies dancin' \n"
							"\n Eight maids a milkin' \n"
							"\n Seven swans a swimmin' \n"
							"\n Six geese a layin' \n"
							"\n Five golden rings! \n"
							"\n Four calling birds \n"
							"\n Three french hens \n"
							"\n Two turtle doves \n"
							"\n And a partridge in a pear tree! \n ");
						break;

				case twelveth:
					System.out.println(" \n Twelve drummers drummin' "
							"\n On the twelfth day of Christmas "
							"\n My true love sent to me, "
							"\n Twelve drummers drummin', "
							"\n Eleven pipers pipin', "
							"\n Ten lords a leapin',"
							"\n Nine ladies dancin',"
							"\n Eight maids milkin',"
							"\n Seven swans a swimmin',"
							"\n Six geese a layin', "
							"\n Five golden rings!, "
							"\n Four calling birds, "
							"\n Three french hens, "
							"\n Two turtle doves, "
							"\n And a partridge in a pear tree! \n ");
						break;

				}
			}			
		}
	}