package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.*;

public class DividerTest {

	private Divider divider;

	@Before
	public void setupTest() {
		divider = new Divider();

	}

	@Test
	public void setupDivides() throws ImpossibleCalculationException {
		Integer dividend = 10;
		Integer divisor = 2;

		DividerResult result = divider.divides(dividend, divisor);
		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDivident());
		assertEquals(Integer.valueOf(2), result.getDivisor());
	}

	@Test
	public void testDivides_divisionByZero() {
		Integer dividend = 10;
		Integer divisor = 0;

		DividerResult result;
		try {
			result = divider.divides(dividend, divisor);
			fail("dovrebbe lanciare un'ecezzione e non la fatto");

		} catch (ImpossibleCalculationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(expected = ImpossibleCalculationException.class)
	public void testDivides_divisionByZero2() throws ImpossibleCalculationException {
		Integer dividend = 10;
		Integer divisor = 0;
		DividerResult result;
		result = divider.divides(dividend, divisor);
	
	}
	
	@Test
	public void testDivides_3_2() throws ImpossibleCalculationException {
		Integer dividend = 3;
		Integer divisor = 2;
		
		DividerResult result; 
		
		result = divider.divides(dividend, divisor);
		assertEquals(Integer.valueOf(2), result.getResult());
		assertEquals(Integer.valueOf(3), result.getDivident());
		assertEquals(Integer.valueOf(2), result.getDivisor());
	}
		
		
		
		
		


	}


