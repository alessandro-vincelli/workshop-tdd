package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import eu.afea.training.mockito.services.DivisionResult;

public class DividerTest {

	private Divider divider;

	@Before
	public void setupTest() {

	}

	@Test
	public void testDrivedes() {
		Integer dividend = 10;
		Integer divisor = 2;
		DivisionResult result = divider.divides(dividend, divisor);
		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDivident());
		assertEquals(Integer.valueOf(2), result.getDivisor());

	}

}
