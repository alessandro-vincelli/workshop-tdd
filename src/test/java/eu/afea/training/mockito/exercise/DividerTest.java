package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DividerTest {
	private Divider divider;

	@Before
	
	public void setup() {
		this.divider = new Divider();
		
	}
	@Test
	public void testdIV()
	{
		assertEquals("1/1 != 1 ", 1, this.divider.Div(1,1));
	}

}
