package eu.afea.training.mockito.exercise;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DividerTest {
	
	private Divider divider;
	
	@Before
	public void setUp() {
		divider = new Divider();
	}
	
	@Test
	public void testDivides_roundup() throws ImpossibleCalculationException{
		int n1, n2;
		n1 = 3;
		n2 = 2;
		
		Division_result d =  divider.divides(n1, n2);
		assertEquals(2, d.getResult());
		assertEquals(n1, d.getDiv1());
		assertEquals(n2, d.getDiv2());
	}
	
	
	@Test
	public void testdivides() throws ImpossibleCalculationException{
		int n1, n2;
		n1 = 20;
		n2 = 5;
		
		Division_result d =  divider.divides(n1, n2);
		assertEquals(d.getResult(), n1/n2);
		assertEquals(d.getDiv1(), n1);
		assertEquals(d.getDiv2(), n2);
	}
	
	@Test
	public void testdivides_byzero2() throws ImpossibleCalculationException{
		int n1, n2;
		n1 = 20;
		n2 = 0;
		
		Division_result d;
		try {
			d = divider.divides(n1, n2);
			assertEquals(d.getResult(), n1/n2);
			assertEquals(d.getDiv1(), n1);
			assertEquals(d.getDiv2(), n2);
			fail("Should throw ImpossibleCalculationException");
		} catch (ImpossibleCalculationException e) {
			//e.printStackTrace();
		}
	}
	
	@Test(expected = ImpossibleCalculationException.class)
	public void testdivides_byzero() throws ImpossibleCalculationException {
		int n1, n2;
		n1 = 3;
		n2 = 0;
		
		Division_result d1 =  divider.divides(n1, n2);
	}
	
	@After
	public void cleanUp() {}
}