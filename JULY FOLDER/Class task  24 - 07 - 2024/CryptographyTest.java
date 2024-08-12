import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptographyTest{

	@Test
	public void testToEncrypt(){
	
		Cryptography encrypt = new Cryptography();
		
		int numberEncrypt = encrypt.encryption(1234);

		assertEquals(0012,numberEncrypt);

	}



}