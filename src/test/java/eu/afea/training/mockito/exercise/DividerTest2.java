package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DividerTest2 {


	private Divider2 divider2;  //  5.  il Divider2(D maiuscola) va a prendere il contenuto della classe Divider2 , in modo da usarlo sotto



	//  6.  una volta svolti i passaggi richiesti dalla traccia, creo il mio test, prima il before poi l after



	@Before //  nel creare il test, prima faccio un Before, che funge da pulizia/resettaggio prima del test effettivo. viene avviato per ogni test.
	public void setupTest() { 
		divider2 = new Divider2(); //  con questo costruttore, vado a passare il valore voluto della classe Divider2 al mio dividerTest
	}




	@Test
	public void testDivides() throws ImpossibleCalculationException {  // il throw servirà solo per l esercizio 2, SOLO dopo aver fatto il ".11" della classe Divider2
		Integer dividendo = 50;// assegno il valore alle mie variabili
		Integer divisore = 5;


		DivisionResult2 risultato = divider2.Divides(dividendo, divisore); // e con questo svolgoo il test desiderato 


		assertEquals(Integer.valueOf(10), risultato.getRisultato()); //  il risultato lo so gia, quindi verifico che sia esatto 
		assertEquals(Integer.valueOf(50), risultato.getDividendo()); //  allo stesso modo, verifico che i valori dei parametri che ho utilizzato siano quelli voluti
		assertEquals(Integer.valueOf(5), risultato.getDivisore()); 

		// in questo caso, tutto è corretto e il test funziona 

	}





	//  7.  svolgo l esercizio numero 2


	@Test // ((è solo un passaggio intermedio= alla fine il risultato finale è o con il fail o con l expected = i test devono funzionare!))
	public void testDivido_per_zero() throws ImpossibleCalculationException {  // il throws dopo aver fatto il try-catch
		Integer dividendo = 10;
		Integer divisore = 0;


		DivisionResult2 risultato = divider2.Divides(dividendo, divisore);  

		//assertEquals(Integer.valueOf(10), risultato.getRisultato());  in questo caso non serve
		assertEquals(Integer.valueOf(10), risultato.getDividendo()); 
		assertEquals(Integer.valueOf(0), risultato.getDivisore()); 

		//  8.  cosi facendo, il debug mi lancerà = java.lang.ArithmeticException: / by zero


		//  9.  adesso devo cambiare il nome della eccezione ricevuta (quella lanciata) in "ImpossibleCalculationException2"
		// per farlo, creo anche una classe "ImpossibleCalculationException2" in modo da estendere la classe "exception"


	}	




	//  12.  sotto, scrivo sempre lo STESSO "testDivido_per_zero2()", ma in 2 altri modi, uno con il "fail" e uno con il "expected"


	// test con il FAIL 
	@Test
	public void testDivisione_per_Zero2()  { 
		try
		{
			Integer dividendo = 5;
			Integer divisore = 0;

			DivisionResult2 risultato = divider2.Divides(dividendo, divisore); 
			fail("ImpossibleCalculationException"); // mi risparmio i 3 asserEquals, aggiungendo semplicemente il nome della nuova eccezione dentro il FAIL
		}
		catch (Exception e)
		{
		}	
	}



	// test con l' EXPECTED			
	@Test(expected = ImpossibleCalculationException.class) // mi risparmio i 3 asserEquals, aggiungendo semplicemente il nome della nuova eccezione dentro l' EXPECTED	 
	public void testDivisione_per_Zero3() throws ImpossibleCalculationException { 
		Integer dividendo = 5;
		Integer divisore = 0;

		DivisionResult2 risultato = divider2.Divides(dividendo, divisore); 
	}



	
	
	
	// 13 es. 3
	@Test
	public void test3diviso2() throws ImpossibleCalculationException {  // il throw servirà solo per l esercizio 2, SOLO dopo aver fatto il ".11" della classe Divider2
		Integer dividendo = 3;// assegno il valore alle mie variabili
		Integer divisore = 2;


		DivisionResult2 risultato = divider2.Divides(dividendo, divisore); // e con questo svolgoo il test desiderato 


		assertEquals(Integer.valueOf(2), risultato.getRisultato()); //  il risultato lo so gia, quindi verifico che sia esatto 
		assertEquals(Integer.valueOf(3), risultato.getDividendo()); //  allo stesso modo, verifico che i valori dei parametri che ho utilizzato siano quelli voluti
		assertEquals(Integer.valueOf(2), risultato.getDivisore()); 

		// in questo caso, tutto è corretto e il test funziona 

	}



}








