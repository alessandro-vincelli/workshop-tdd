package eu.afea.training.mockito.exercise;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DividerTest {
	
	@Test
	public void testdivides(){
		Division_result d =  Diveder.divides(20, 2);
		Division_result d1 =  Diveder.divides(20, 2);
		assertEquals(d, d1);
	}
	
}