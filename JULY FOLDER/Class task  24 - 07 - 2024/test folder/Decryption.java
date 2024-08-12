public class Decryption {

	public int Decryption(int number) {

		int firstNumber = (number / 1000 % 10 + 7) % 10;
		int secondNumber = (number / 100 % 10 + 7) % 10;
		int thirdNumber = (number / 10 % 10 + 7) % 10;
		int fourthNumber = (number / 1 % 10 + 7) % 10;


		int flipped [] = {thirdNumber, fourthNumber, firstNumber, secondNumber};
			
			int new_number = flipped [0];
			
			for (int index = 0; index < flipped.length; index ++) {

				new_number = (new_number * 10);
				new_number = new_number + (flipped[index]);
					return new_number;
			}
	}

}