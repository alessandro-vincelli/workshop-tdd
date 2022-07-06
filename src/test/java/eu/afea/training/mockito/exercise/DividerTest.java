package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DividerTest {

	private Divider divider;
	@Before
	public void setUp() {               //set del testing
		divider = new Divider();
	}
	
	@Test
	public void testDivides() {      //metodo per la divisione
	
	Integer dividend = 10;
	Integer divisor = 2;
	DivisionResult result = divider.dividers(dividend, dividend);
	assertEquals(Integer.valueOf(5), result.getResult());
	assertEquals(Integer.valueOf(10), result.getDividend());
	assertEquals(Integer.valueOf(2), result.getDivisor());
}
	
}
