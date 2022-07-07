package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DividerTest {

	private Divider divider;
	@Before
	public void setUp() {               //set del testing
		divider = new Divider();
	}
	@After
	public void setClear() {
		Divider.clearResultList();
	}
	@Test
	public void testDivides() throws ImpossibleCalculatorException {      //metodo per la divisione
	
	Integer dividend = 10;
	Integer divisor = 2;
	DivisionResult result = divider.dividers(dividend, divisor);
	assertEquals(Integer.valueOf(5), result.getResult());
	assertEquals(Integer.valueOf(10), result.getDividend());
	assertEquals(Integer.valueOf(2), result.getDivisor());
}
	@Ignore
	public void DivisionZeroOG() throws ImpossibleCalculatorException {
		Integer dividend = 10;
		Integer divisor = 0;
		DivisionResult result = divider.dividers(dividend, divisor);
		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDividend());
		assertEquals(Integer.valueOf(0), result.getDivisor());
		/*assertEquals(1, divider.getResultList().size());
		assertEquals(Integer.valueOf(2), divider.getResultList().get(0).getResult());*/
		}
	
	@Test
	public void divisionzero() throws ImpossibleCalculatorException {
		Integer dividend = 10;
		Integer divisor = 0;
	 try {
		 DivisionResult result = divider.dividers(dividend, divisor);
		 fail("Should throw ImpossibileCalculatorException");
	 } 
	 catch(ImpossibleCalculatorException e) {
	 }
	}
	
	@Test(expected = ImpossibleCalculatorException.class)
	public void DivisionZero2() throws ImpossibleCalculatorException {
		Integer dividend = 10;
		Integer divisor = 0;
		DivisionResult result = divider.dividers(dividend, divisor);
	}
	

	
	@Test
	public void DivisionTre_due2() throws ImpossibleCalculatorException {
		Integer dividend = 3;
		Integer divisor = 2;
		DivisionResult result = divider.dividers(dividend, divisor);
		assertEquals(Integer.valueOf(2), result.getResult());
		assertEquals(Integer.valueOf(3), result.getDividend());
		assertEquals(Integer.valueOf(2), result.getDivisor());
		/*assertEquals(1, divider.getResultList().size());
		assertEquals(Integer.valueOf(2), divider.getResultList().get(0).getResult());*/
	}
	
	
	}

