package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DividerTest {

	private Divider divides;

	@Before
	public void setUp() {

		divides = new Divider();
	}

	@Test
	public void testDivides() throws ImpossibleCalcultationException {

		Integer dividend = 10;
		Integer divisor = 2;
		DivisionResult result = divides.Div(dividend, divisor);

		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDividend());
		assertEquals(Integer.valueOf(2), result.getDivisor());

	}

	@Test
	public void testdivision_By_zero() throws ImpossibleCalcultationException {
		Integer dividend = 10;
		Integer divisor = 0;
		DivisionResult result = divides.Div(dividend, divisor);

	}

}
