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
	public void testDivides() {
		Integer dividend = 10;
		Integer divisor = 2;
		
		DivisionResult result = divider.divides(dividend, divisor);
		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDividend());
		assertEquals(Integer.valueOf(2), result.getDivisor());
	

	}
}
