import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class ArrayAscendingFunctionTest {

	@ Test 
	public void testThatTakesNumberAndSortItInAscendingOrder() {

		ArrayFunction arrayFunction = new ArrayFunction();

		int [] number = {2, 28, 9, 5, -15, 35, -7, 45};
		int [] newNumber = {-15, -7, 2, 5, 9, 28, 35, 45};

		assertArrayEquals(newNumber, arrayFunction.sammy(number));

	}

}