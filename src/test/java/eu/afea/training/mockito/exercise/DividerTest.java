package eu.afea.training.mockito.exercise;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DividerTest {
	
	@Test
	public void testdivides(){
		Division_result d =  Diveder.divides(20, 2);
		assertEquals(d.getResult(), 10);
	}
	
}