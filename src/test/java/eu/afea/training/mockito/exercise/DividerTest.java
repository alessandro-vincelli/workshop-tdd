package eu.afea.training.mockito.exercise;

import org.junit.*;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DividerTest {
	
	private Divider divider;
	private Logger l;
	//private I_Logger l;
	
	@Before
	public void setUp() {
		l = Mockito.mock(Logger.class);
		//l = new Logger();
		divider = new Divider(l);
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
		assertEquals(1, Divider.getList().size());
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
		assertEquals(1, Divider.getList().size());
	}
	
	@Test
	public void testdivides_byzero2() throws ImpossibleCalculationException{
		int n1, n2;
		n1 = 20;
		n2 = 0;
		
		Division_result d;
		
		try {
			d = divider.divides(n1, n2);
			
			assertEquals(d.getResult(), null);
			assertEquals(d.getDiv1(), n1);
			assertEquals(d.getDiv2(), n2);
			
			fail("Should throw ImpossibleCalculationException");
		} catch (ImpossibleCalculationException e) {
			//I check if log() print somethings
			verify(l).log(anyString());
		}
	}
	
	@Test(expected = ImpossibleCalculationException.class)
	public void testdivides_byzero() throws ImpossibleCalculationException {
		int n1, n2;
		n1 = 3;
		n2 = 0;
		
		Division_result d1 =  divider.divides(n1, n2);
		assertEquals(1, Divider.getList().size());
	}
	
	@After
	public void cleanUp() {
		Divider.getList().clear();
	}
}