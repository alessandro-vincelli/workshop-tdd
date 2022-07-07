package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import eu.afea.training.mockito.services.DivisionResult;

public class DividerTest {

	public DividerTest() {
		
	}

	private Divider divider;

	@Before
	public void setupTest() {

		divider = new Divider();
	}

	@Test
	public void testDivides() throws ImpossibleCalculationException {
		Integer dividend = 10;
		Integer divisor = 2;
		DivisionResult result = divider.divides(dividend, divisor);
		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDividend());
		assertEquals(Integer.valueOf(2), result.getDivisor());

	}

	@Test
	@Ignore
	public void testDivides_divisionByZero() throws ImpossibleCalculationException {

		Integer dividend = 10;
		Integer divisor = 0;
		DivisionResult result = divider.divides(dividend, divisor);
		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDividend());
		assertEquals(Integer.valueOf(0), result.getDivisor());

	}

	
	@Test
	
	public void testSquareRoot_negativeArgument() throws ImpossibleCalculationException {
		Integer dividend = 10;
		Integer divisor = 0;
		try {

			DivisionResult result = divider.divides(dividend, divisor);
			fail("Should throw IllegalArgumentException");
		} catch (ImpossibleCalculationException e) {
			// Additional assertions...
		}
	}

	@Test(expected = ImpossibleCalculationException.class)
	public void testSquareRoot_negativeArgument_2() throws ImpossibleCalculationException {
		Integer dividend = 10;
		Integer divisor = 0;

		DivisionResult result = divider.divides(dividend, divisor);

	}

	@Test
	public void testDivides_3div2() throws ImpossibleCalculationException {
		Integer dividend = 3;
		Integer divisor = 2;
		DivisionResult result = divider.divides(dividend, divisor);
		assertEquals(Integer.valueOf(2), result.getResult());
		assertEquals(Integer.valueOf(3), result.getDividend());
		assertEquals(Integer.valueOf(2), result.getDivisor());
		
	}
	}



