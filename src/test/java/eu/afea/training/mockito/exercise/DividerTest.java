package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import eu.afea.training.mockito.services.DivisionResult;

public class DividerTest {

	private Divider divider;

	@Before
	public void setupTest() {

	}

	@Test
	public void testDrivedes() throws ImpossibleCalculationException {
		Integer dividend = 10;
		Integer divisor = 2;
		DivisionResult result = divider.divides(dividend, divisor);
		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDivident());
		assertEquals(Integer.valueOf(2), result.getDivisor());
	}

	@Test // secondo test diviso per 0
	public void testDivides_divisonby0() throws ImpossibleCalculationException {
		Integer dividend = 10;
		Integer divisor = 0;
		DivisionResult result = divider.divides(dividend, divisor);
		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDivident());
		assertEquals(Integer.valueOf(0), result.getDivisor());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivides_divisonby() throws ImpossibleCalculationException {
		Integer dividend = 10;
		Integer divisor = 0;
		try {
			DivisionResult result = divider.divides(dividend, divisor);
			fail("Should throw ImpossibleCalculationException");
		} catch (IllegalArgumentException e) {

		}
	}

}


