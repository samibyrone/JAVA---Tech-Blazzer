import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaxCalculatorTest {

	@ Test
	public void testThatCanCalculateTax() {

		//Given
		TaxCalculator taxCalculator = new TaxCalculator();

		//When
		taxCalculator.calculateTax(30_000);

		//Assert
		assertEquals(4_500, tax);

	}


	
	@ Test
	public void testThatCanCalculateTaxForInvalidAmountFailures() {

		//Given
		TaxCalculator taxCalculator = new TaxCalculator();

		//When
		taxCalculator.calculateTax(-30_000);

		//Assert
		assertThrows(RuntimeException.class, () -> taxCalculator.calculateTax(-30_000));

	}

}