package eu.afea.training.mockito.exercise;


import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class DividerTest {
	
	private divider divider;
	
	@Before
	public void setupTest() {
		divider = new divider();
		
		
	}
	
	@Test
	public void testDivides() {
		Integer dividend = 10;
		Integer divisor = 2;
		
		DivisionResult result = divider.divides(dividend, divisor);
		
		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getResult());
		assertEquals(Integer.valueOf(2), result.getResult());

		
		
		
	

	}
	
}




