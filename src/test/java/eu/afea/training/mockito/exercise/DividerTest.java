package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class DividerTest {

	private Divider divider;

	@Before
	public void setupTest() {
		divider = new Divider();

	}

	@Test
	public void setupDivides() {
		Integer dividend = 10;
		Integer divisor = 2;
		Integer result = 5;

		DividerResult result = divider.divides(dividend, divisor);
		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDivident());
		assertEquals(Integer.valueOf(2), result.getDivisor());
	}

}
