package eu.afea.training.mockito.exercise;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Spy;
import static org.mockito.Mockito.spy;
import static org.mockito.ArgumentMatchers.anyString;



public class DividerTest3 {



	private Divider3 divider3; 




	@Before 
	public void setupTest() { 
		divider3 = spy(  new Divider3());  // mockito es.2  .4 . adesso,fatto questo, devo solo aggiungere il verify
	}                                      // SENZA LI MOCK  SPY sarebbe:   divider3 = new Divider3();




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
	@Ignore // solo nel caso uno volesse tutto pulito, senza l eccezione personalizzata
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
			verify(divider3).log(anyString());      // mockito es.2  .5   se non legge anyString, importalo staticamente)
		}	                                  // per verificarlo, commento il metodo log nell else della classe Divider3
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

		//  9. aggiungo il controllo della mia lista
		assertEquals(1, divider3.getLista().size());
		assertEquals(Integer.valueOf(2), divider3.getLista().get(0).getRisultato());

		
		
List lista2_Mock = spy (new ArrayList()); // mockito es.2  .3





		//  3.  adesso lo eseguo e funziona. TUTTAVIA adesso saranno alcuni dei test precedenti a non funzionare
		// questo perchè si aspettano una eccezione, che adesso non viene più catturata 


		//  4.  per rimediare al problema descritto, faccio un if
	}



}







