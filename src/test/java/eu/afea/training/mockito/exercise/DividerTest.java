package eu.afea.training.mockito.exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class DividerTest {
	
	@Test
	public void testDiv(){
		assertEquals("20/2 != 10", 10, Diveder.div(20, 2));
	}
	
}
