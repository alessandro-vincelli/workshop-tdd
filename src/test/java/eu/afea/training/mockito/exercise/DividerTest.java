package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DividerTest {
	private Divider divider;

	@Before
	
	public void setup() {
		this.divider = new Divider();   //per istanziare e non ripetere per ogni testdIV
		
	}
	@Test
	public void testdIV()
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
		DivisionResult R = new DivisionResult(10,30,89);
		R.setDiv1(10);
		R.setDiv2(30);
		R.setRis(89);
		assertEquals("1/1 != 1 ", 1, this.divider.Div(R.getDiv2(),R.getDiv1()));
		*/
	
	

}
