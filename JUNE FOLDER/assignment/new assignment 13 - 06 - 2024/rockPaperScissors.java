import java.util.Random;
import java.util.Scanner;

public class rockScissorsPaper {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

		while (true) {
		String[] rsp = {"r", "s", "p"};
		String computerMove = rsp[new Random().nextInt(rps.lenght)];

		String playerMove;

		while(true) {
		System.out.println("Please enter your move (r, s, or p)");
		playerMove = scanner.nextLine();
		if (playerMove.equals("r") || playerMove.equals("s") || playerMove.equals) {
			break;
			}
		System.out.print(playerMove + " is not a valid move. ");
		}

		System.out.println("Computer played: " + computerMove);

		if (playerMove.equals(computerMove)) {
		System.out.println("The game was a tie1");
		}
		else if (playerMove.equals("r")) {
		  if (computerMove.equals("s")) {
			System.out.print("You lose!");

		  } else if (computerMove.equals("p")) {
		  System.out.println("You win");
		  }
		}

		else if (playerMove.equals("p")) {
		  if (computerMove.equals("r")) {
			System.out.print("You win!");

		  } else if (computerMove.equals("s")) {
		  System.out.println("You lose");
		  }
		}

		else if (playerMove.equals("s")) {
		  if (computerMove.equals("p")) {
			System.out.print("You win!");

		  } else if (computerMove.equals("r")) {
		  System.out.println("You lose");
		  }
		}
	     }
	}
}