package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

public class DividerTest {
	private Divider divider;
	private Logger log;

	@Before //serve per istanziare per ogni test cos� da farli ogni volta ciascuno e ripetere il procedimento
	
	public void setup() {
		 this.log = Mockito.mock(Logger.class);
		//log = spy(new Logger(log));
		//divider = spy(new Divider(log));
		divider = new Divider(log);   //per istanziare e non ripetere per ogni testdIV
		//divider = new Divider();
		
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
	@Ignore("solo per Studiarci sopra perch� era una passaggio intermedio")
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
		
	
	
	@Test(expected = ImpossibleClalculationException.class)
	public void Divisione_per_zero2() throws ImpossibleClalculationException {
		Integer div1 = 10;
		Integer div2 = 0;
		DivisionResult ris = divider.Div(div1,div2);
			assertEquals(Integer.valueOf(10), ris.getDiv1());
			assertEquals(Integer.valueOf(0), ris.getDiv2());
	 //int result = calculator.squareRoot(-1);
	}
	// Test is skipped:
	

	
	@Test
	public void Divisione_per_zero3() throws ImpossibleClalculationException {
	 try {
		 	Integer div1 = 3;
			Integer div2 = 2;
			DivisionResult ris = divider.Div(div1,div2);
		 //assertEquals(Integer.valueOf(10), ris.getDiv1());
		// assertEquals(Integer.valueOf(0), ris.getDiv2()); 
	 //int result = calculator.squareRoot(-1);
		 fail("Should throw ImpossibleClalculationException");
	 } 
	 catch(ImpossibleClalculationException e) {
	 // Additional assertions...
 
	 }
	 
	 
	}
	
	@Test
	public void divisione32() throws ImpossibleClalculationException{
		
				Integer div1 = 3;
				Integer div2 = 2;
				DivisionResult ris = divider.Div(div1,div2);
			assertEquals(Integer.valueOf(3), ris.getDiv1());
			assertEquals(Integer.valueOf(2), ris.getDiv2()); 
			assertEquals(Integer.valueOf(2), ris.getRis());
		//	assertEquals(1, Divider.getListaDiv()), ris.getRis());
			
		
	}
	
	@Test()
	public void Divisione_per_Zero4() throws ImpossibleClalculationException
	{
		Integer div1 = 10;
		Integer div2 = 2; 
		//Integer ris = 5;
		try {
		DivisionResult ris = divider.Div(div1,div2);
		fail();
		}
		catch(ImpossibleClalculationException e)
		{
			
			
			
		}
	}
	
	@Test
	public void Divisione_per_Zero5() throws ImpossibleClalculationException
	{
		//divider = spy(new Divider());
		
		Integer div1 = 10;
		Integer div2 = 0;
		//Integer ris = 5;
		try {
		DivisionResult ris = divider.Div(div1,div2);
		fail();
		}
		catch(ImpossibleClalculationException e)
		{
			verify(log).log(anyString());
			assertEquals(1, Divider.getListaDiv().size());
			
			
		}
}
	
}
		
	
	
	


