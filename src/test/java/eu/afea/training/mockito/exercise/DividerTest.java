package eu.afea.training.mockito.exercise;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class DividerTest {

	
	
	private Divider divider; //

	
	
	@Before
	public void setupTest() { //
		divider = new Divider();
	}

	
	
	@Test
	public void testDivides() { //
		Integer dividendo = 10;
		Integer divisore = 2;

		DivisionResult risultato = divider.divides(dividendo, divisore); //
		assertEquals(Integer.valueOf(5), risultato.getResult());
		assertEquals(Integer.valueOf(10), risultato.getDividendo());
		assertEquals(Integer.valueOf(2), risultato.getDivisore());
	
	}

	
}
