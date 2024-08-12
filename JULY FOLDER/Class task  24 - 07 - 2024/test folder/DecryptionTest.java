import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DecryptionTest {

	@Test
	public void testThatDecryptFourInputInterger() {

		CryptographyTools calculate = new CryptographyTools();

		int result = calculate.cryptography(0149);

		assertEquals( 8316, result);

	}


}