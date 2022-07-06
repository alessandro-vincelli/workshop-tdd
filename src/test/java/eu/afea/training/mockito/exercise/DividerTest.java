package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DividerTest {
	private Divider divider;

	@Before
	
	public void setup() {
		this.divider = new Divider();   //per istanziare e non ripetere per ogni testdIV
		
	}
	@Test
	public void testdIV() throws ImpossibleClalculationException
	{
		Integer div1 = 10;
		Integer div2 = 2; 
		//Integer ris = 5;
		DivisionResult ris = divider.Div(div1,div2);
		assertEquals(Integer.valueOf(5), ris.getRis());
		assertEquals(Integer.valueOf(10), ris.getDiv1());
		assertEquals(Integer.valueOf(2), ris.getDiv2());
		
	}
	/*
	@Test
	public void Divisione_per_zero() throws ImpossibleClalculationException
	{
		Integer div1 = 10;
		Integer div2 = 0;
		//Integer ris = 5;
		DivisionResult ris = divider.Div(div1,div2);
		//assertEquals(Integer.valueOf(5), ris.getRis());
		assertEquals(Integer.valueOf(10), ris.getDiv1());
		assertEquals(Integer.valueOf(0), ris.getDiv2()); 
		
		}
	*/
	@Test(expected = ImpossibleClalculationException.class)
	public void Divisione_per_zero() throws ImpossibleClalculationException {
		Integer div1 = 10;
		Integer div2 = 0;
		DivisionResult ris = divider.Div(div1,div2);
			assertEquals(Integer.valueOf(10), ris.getDiv1());
			assertEquals(Integer.valueOf(0), ris.getDiv2());
	 //int result = calculator.squareRoot(-1);
	}
	// Test is skipped:


	/*
	@Test
	public void testSquareRoot_negativeArgument() {
	 try {
		 	Integer div1 = 10;
			Integer div2 = 0;
		 DivisionResult ris = divider.Div(div1,div2);
		 assertEquals(Integer.valueOf(10), ris.getDiv1());
		 assertEquals(Integer.valueOf(0), ris.getDiv2()); 
	 //int result = calculator.squareRoot(-1);
	 //fail(“Should throw IllegalArgumentException”);
	 } 
	 catch(IllegalArgumentException e) {
	 // Additional assertions...
		 
	 }
	 */
	}
		/*
		DivisionResult R = new DivisionResult(10,30,89);
		R.setDiv1(10);
		R.setDiv2(30);
		R.setRis(89);
		assertEquals("1/1 != 1 ", 1, this.divider.Div(R.getDiv2(),R.getDiv1()));
		*/
	
	


