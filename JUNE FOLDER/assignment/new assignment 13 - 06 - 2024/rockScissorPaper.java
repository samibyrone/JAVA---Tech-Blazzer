import java.util.Scanner;

public class phoneKeyPads {

	public static void main(String[] args) {

		Scanner input;
		input = new Scanner(System.in);

	System.out.print("Enter a letter: ");
	String s = input.nextLine();
	char ch = s.charArt(0);
	ch = character.toUpperCase(ch);

	int number = 0;
	if (character.isLetter(ch)) {

		if (ch >= 'W')
			number = 9;
		else if (ch >= 'T')
			number = 8;
		else if (ch >= 'P')
			number = 7;
		else if (ch >= 'M')
			number = 6;
		else if (ch >= 'J')
			number = 5;
		else if (ch >= 'G')
			number = 4;
		else if (ch >= 'D')
			number = 3;
		else if (ch >= 'A')
			number = 2;

	System.out.println("The correspondiing number is " + number);

	}
	
	else

	System.out.println(ch + "is an invalid input");

	}
}
