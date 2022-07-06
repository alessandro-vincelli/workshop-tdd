package eu.afea.training.mockito.exercise;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class DividerTest {
	
	private Divider divider;
	
	@Before
	public void setUp() {
		divider = new Divider();
	}
	
	@Test
	public void testdivides(){
		
		int n1, n2;
		n1 = 20;
		n2 = 2;;
		
		Division_result d =  divider.divides(n1, n2);
		assertEquals(d.getResult(), n1/n2);
		assertEquals(d.getResult(), 32);
		assertEquals(d.getResult(), 15);
	}
	
	@After
	public void cleanUp() {}
}