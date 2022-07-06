package eu.afea.training.mockito.exercise;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DividerTest {
	
	Divider divider = new Divider();
	
	@Test
	public void testdivides(){
		int n1, n2;
		n1 = 20;
		n2 = 2;;
		Division_result d =  divider.divides(n1, n2);
		assertEquals(d.getResult(), n1/n2);
	}
}