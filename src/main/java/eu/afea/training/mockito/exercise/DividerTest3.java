package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;


public class DividerTest3 {



	private Divider3 divider3; 




	@Before 
	public void setupTest() { 
		divider3 = new Divider3(); 
	}




	@Test
	public void testDivides() throws ImpossibleCalculationException {  
		Integer dividendo = 50;
		Integer divisore = 5;


		DivisionResult2 risultato = divider3.Divides(dividendo, divisore);  


		assertEquals(Integer.valueOf(10), risultato.getRisultato());  
		assertEquals(Integer.valueOf(50), risultato.getDividendo()); 
		assertEquals(Integer.valueOf(5), risultato.getDivisore()); 


	}







	@Test  
	public void testDivido_per_zero() throws ImpossibleCalculationException {  
		Integer dividendo = 10;
		Integer divisore = 0;


		DivisionResult2 risultato = divider3.Divides(dividendo, divisore);  

		assertEquals(Integer.valueOf(10), risultato.getDividendo()); 
		assertEquals(Integer.valueOf(0), risultato.getDivisore()); 


	}	






	@Test
	public void testDivisione_per_Zero2()  { 
		try
		{
			Integer dividendo = 5;
			Integer divisore = 0;

			DivisionResult2 risultato = divider3.Divides(dividendo, divisore); 
			fail("ImpossibleCalculationException");
		}
		catch (Exception e)
		{
		}	
	}




	@Test(expected = ImpossibleCalculationException.class) 
	public void testDivisione_per_Zero3() throws ImpossibleCalculationException { 
		Integer dividendo = 5;
		Integer divisore = 0;

		DivisionResult2 risultato = divider3.Divides(dividendo, divisore); 
	}






	//  1.  ( es. 3)  dentro al test lascio tutto uuale, tranne i valori del dividendo e del divisoere, che diventanto 3 e 2. 
	//  poi modifico il metodo con il RETURN, ovvero (in questo caso) Divide3
	
	
	
	@Test
	public void test3diviso2() throws ImpossibleCalculationException {  
		Integer dividendo = 3;
		Integer divisore = 2;


		DivisionResult2 risultato = divider3.Divides(dividendo, divisore); 


		assertEquals(Integer.valueOf(2), risultato.getRisultato());  
		assertEquals(Integer.valueOf(3), risultato.getDividendo());  
		assertEquals(Integer.valueOf(2), risultato.getDivisore()); 

		
		//  3.  adesso lo eseguo e funziona. TUTTAVIA adesso saranno alcuni dei test precedenti a non funzionare
		// questo perchè si aspettano una eccezione, che adesso non viene più catturata 


	}



}







