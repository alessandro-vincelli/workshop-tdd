package eu.afea.training.mockito.exercise;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DividerTest {

	private divider divider;

	@Before
	public void setupTest() {
		divider = new divider();

	}

	@Test
	public void testDivides() throws ImpossibleCalculationException {
		Integer dividend = 10;
		Integer divisor = 2;

		DivisionResult result = divider.divides(dividend, divisor);

		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(dividend), result.getDividend());
		assertEquals(Integer.valueOf(divisor), result.getDivisor());

	}
    @Ignore("Solo per vedere")
	@Test
	public void testDivision_ByZero() throws ImpossibleCalculationException {

		Integer dividend = 10;
		Integer divisor = 0;

		DivisionResult result = divider.divides(dividend, divisor);

		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(dividend), result.getDividend());
		assertEquals(Integer.valueOf(divisor), result.getDivisor());

	}

	@Test
	public void testDivision_ByZero2() throws ImpossibleCalculationException {
		try {
			Integer dividend = 10;
			Integer divisor = 0;

			DivisionResult result = divider.divides(dividend, divisor);

			assertEquals(Integer.valueOf(5), result.getResult());
			assertEquals(Integer.valueOf(dividend), result.getDividend());
			assertEquals(Integer.valueOf(divisor), result.getDivisor());
			fail("Should throw IllegalArgumentException");
		} catch (ImpossibleCalculationException e) {

		}
		
	}
		@Test(expected = ImpossibleCalculationException.class)
		public void testDivision_ByZero3() throws ImpossibleCalculationException {

			Integer dividend = 10;
			Integer divisor = 0;

			DivisionResult result = divider.divides(dividend, divisor);

			assertEquals(Integer.valueOf(5), result.getResult());
			assertEquals(Integer.valueOf(dividend), result.getDividend());
			assertEquals(Integer.valueOf(divisor), result.getDivisor());
	}

}
