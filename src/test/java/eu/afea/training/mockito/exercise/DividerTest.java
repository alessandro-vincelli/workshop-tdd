package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

public class DividerTest {

	private Divider divides;

	@Before
	public void setUp() {

		divides = new Divider();
	}

	@Test
	public void testDivides() throws ImpossibleCalcultationException {

		Integer dividend = 10;
		Integer divisor = 2;
		DivisionResult result = divides.Div(dividend, divisor);

		assertEquals(Integer.valueOf(5), result.getResult());
		assertEquals(Integer.valueOf(10), result.getDividend());
		assertEquals(Integer.valueOf(2), result.getDivisor());

	}

	@Test
	public void testdivision_By_zero() throws ImpossibleCalcultationException {
		Integer dividend = 10;
		Integer divisor = 0;
		DivisionResult result = divides.Div(dividend, divisor);
		assertEquals(Integer.valueOf(10), result.getDividend());
		assertEquals(Integer.valueOf(0), result.getDivisor());
		
		

	}

	@Test
	public void testdivision_By_zero2() throws ImpossibleCalcultationException {
		
		Integer dividend = 10;
		Integer divisor = 0;
		divides = spy (divides);
		
		try {
	
		
		DivisionResult result = divides.Div(dividend, divisor);
	    
		fail("Should throw ImpossibleCalcultationException");
		
	    
		
		
		
		
		}
	   catch (ImpossibleCalcultationException e) {
		verify(divides).Log(anyString());
	}

	}
		@Test(expected= ImpossibleCalcultationException.class)
		
		
		public void testdivision_By_zero3() throws ImpossibleCalcultationException {
			Integer dividend = 10;
			Integer divisor = 0;
			DivisionResult result = divides.Div(dividend, divisor);
			assertEquals(Integer.valueOf(10), result.getDividend());
			assertEquals(Integer.valueOf(0), result.getDivisor());

		
		
		}
		
		
		@Test
		public void testDivides3by2() throws ImpossibleCalcultationException {
			Integer dividend = 3;
			Integer divisor = 2;
			DivisionResult result = divides.Div(dividend, divisor);
			assertEquals(Integer.valueOf(3),result.getDividend());
			assertEquals(Integer.valueOf(2),result.getDivisor());
			assertEquals(Integer.valueOf(2), result.getResult());
			assertEquals(1, divides.getResultList().size());
			assertEquals(Integer.valueOf(2), divides.getResultList().get(0).getResult());
			
			
			
		
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
