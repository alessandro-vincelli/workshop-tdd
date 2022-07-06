package eu.afea.training.mockito.exercise;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class DividerTest {

	
	
	private Divider divider; //

	
	
	@Before
	public void setupTest() { //
		divider = new Divider();
	}

	
	
	@Test
	public void testDivides() throws ImpossibleCalculationException { //
		Integer dividendo = 10;
		Integer divisore = 2;

		DivisionResult risultato = divider.divides(dividendo, divisore); //
		assertEquals(Integer.valueOf(5), risultato.getResult());
		assertEquals(Integer.valueOf(10), risultato.getDividendo());
		assertEquals(Integer.valueOf(2), risultato.getDivisore());
	
	}

	
	
	
	 @Ignore("solo per studiare")
	 @Test
	public void testDivisione_per_Zero() throws ImpossibleCalculationException { //
		Integer dividendo = 5;
		Integer divisore = 0;

		DivisionResult risultato = divider.divides(dividendo, divisore); //
		//assertEquals(Integer.valueOf(5), risultato.getResult());
		assertEquals(Integer.valueOf(5), risultato.getDividendo());
		assertEquals(Integer.valueOf(0), risultato.getDivisore());
	
	}
	
	
	
	 @Ignore("solo per studiare")
	@Test(expected = ImpossibleCalculationException.class)
	public void testDivisione_per_Zero1() throws ImpossibleCalculationException { //
		Integer dividendo = 5;
		Integer divisore = 0;

		DivisionResult risultato = divider.divides(dividendo, divisore); //
	}

	
	
	@Test
	public void testDivisione_per_Zero2()  { //
		try
		{
		Integer dividendo = 5;
		Integer divisore = 0;

		DivisionResult risultato = divider.divides(dividendo, divisore); 
		fail("ImpossibleCalculationException");
		}
		catch (Exception e)
		{
		}
	}


}
