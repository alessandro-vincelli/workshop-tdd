package eu.afea.training.mockito.exercise;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

public class DividerTest {

	private Divider divider;
	private Logger log;

	@Before
	public void setupTest() {
		log = Mockito.mock(Logger.class);
		divider = new Divider(log);
	}

	@After
	public void tearDown() {
		divider.clearResultList();

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
		Integer dividend = 10;
		Integer divisor = 0;
		//Divider dividerSpy = spy(divider);
		try {
			
			
			DivisionResult result = divider.divides(dividend, divisor);
			

			assertEquals(Integer.valueOf(null), result.getResult());
			assertEquals(Integer.valueOf(dividend), result.getDividend());
			assertEquals(Integer.valueOf(divisor), result.getDivisor());
			fail("Should throw IllegalArgumentException");
			
			
		} catch (ImpossibleCalculationException e) {
			
			assertEquals(1,divider.getResultList().size());
			
			verify(log).log(anyString());

			
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
		
	@Test
	public void testDivision_RoundUp() throws ImpossibleCalculationException {

		Integer dividend = 3;
		Integer divisor = 2;

		DivisionResult result = divider.divides(dividend, divisor);

		assertEquals(Integer.valueOf(2), result.getResult());
		assertEquals(Integer.valueOf(dividend), result.getDividend());
		assertEquals(Integer.valueOf(divisor), result.getDivisor());
		assertEquals(1,divider.getResultList().size());
		assertEquals(Integer.valueOf(2),divider.getResultList().get(0).getResult());
		
	}
}
