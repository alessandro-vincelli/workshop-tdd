package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class DividerTest {

	private Divider divider;
	@Before
	public void setUp() {               //set del testing
		divider = new Divider();
	}
	
	/*@Test
	public void testDivides() {      //metodo per la divisione
	
	Integer dividend = 10;
	Integer divisor = 2;
	DivisionResult result = divider.dividers(dividend, divisor);
	assertEquals(Integer.valueOf(5), result.getResult());
	assertEquals(Integer.valueOf(10), result.getDividend());
	assertEquals(Integer.valueOf(2), result.getDivisor());
}*/
	/*@Test
	public void DivisionZero() throws ImpossibleCalculatorException {
		Integer dividend = 10;
		Integer divisor = 0;
		DivisionResult result = divider.dividers(dividend, divisor);
		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDividend());
		assertEquals(Integer.valueOf(0), result.getDivisor());
		}*/
	
	@Test
	public void DivisionZero() throws ImpossibleCalculatorException {
		Integer dividend = 10;
		Integer divisor = 0;
	 try {
		 DivisionResult result = divider.dividers(dividend, divisor);
		 fail("Should throw ImpossibileCalculatorException");
	 } 
	 catch(ArithmeticException e) {
		 throw new ImpossibleCalculatorException();
	 }
	}
	
	@Test(expected = ImpossibleCalculatorException.class)
	public void DivisionZero2() throws ImpossibleCalculatorException {
		Integer dividend = 10;
		Integer divisor = 0;
		DivisionResult result = divider.dividers(dividend, divisor);
	}
	
	}

