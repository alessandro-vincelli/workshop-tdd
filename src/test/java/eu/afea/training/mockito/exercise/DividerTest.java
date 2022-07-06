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
		DivisionResult R = new DivisionResult(10,30,89);
		R.setDiv1(10);
		R.setDiv2(30);
		R.setRis(89);
		assertEquals("1/1 != 1 ", 1, this.divider.Div(R.getDiv2(),R.getDiv1()));
	}
	

}
