public class Cryptography{

	public int encryption(int number){

		if(number>1000 && number<10000){

			int digit1 = number/1000;
			int digit2 = (number/100)%10;
			int digit3 = (number/10)%10;
			int digit4 = number%10;

			int encrypt1 = (digit1 + 7)/10;
			int encrypt2 = (digit2 + 7)/10;
			int encrypt3 = (digit3 + 7)/10;
			int encrypt4 = (digit4 + 7)/10;

			String newEncrypt1= String.valueOf(encrypt3);
			String newEncrypt2 = String.valueOf(encrypt4);
			String newEncrypt3 = String.valueOf(encrypt1);
			String newEncrypt4 = String.valueOf(encrypt2);
	
			int encryptionNumber = Integer.valueOf(newEncrypt1 + newEncrypt2 + newEncrypt3 + newEncrypt4);

		}

			return encryptionNumber;
	

	}



}