package eu.afea.training.mockito.exercise;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DividerTest {

	public Divider divider;

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
	public void testCalcutation() throws ImpossibleCalculationException {
		Integer dividend = 5;
		Integer divisor = 0;

		DivisionResult result;
		try {
			result = divider.divides(dividend, divisor);
			fail();
		} catch (eu.afea.training.mockito.exercise.ImpossibleCalculationException e) {

			e.printStackTrace();
		}

	}

  
	@Test(expected = ImpossibleCalculationException.class)
    public void testCalcutation2() throws ImpossibleCalculationException {
	Integer dividend = 5;
	Integer divisor = 0;

	DivisionResult result = divider.divides(dividend, divisor);

}
	@Test
	public void testDividesNew() throws ImpossibleCalculationException {
		Integer dividend = 3;
		Integer divisor = 2;

		DivisionResult result = divider.divides(dividend, divisor);
		assertEquals(Integer.valueOf(2), result.getResult());
		assertEquals(Integer.valueOf(3), result.getDividend());
		assertEquals(Integer.valueOf(2), result.getDivisor());
	
		
	}
	
}
