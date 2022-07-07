package eu.afea.training.mockito.exercise;
import java.util.ArrayList;
import java.util.List;




public class Divider3 {  //  2.   modifico il metodo "Divides" aggiungendo le righe 35 e 36 e modificando 37 e 39

	
	
	private	static List<DivisionResult2> resultLista = new ArrayList<>();  //  5.  (eser. 4) creo una lista statica
	                       // list è una interfaccia, quindi va implementata e non inizializzata
                           
	
	public static List<DivisionResult2> getLista() {  //  6. implemento i metodi get e set
		return resultLista;
	}
	public static void setLista(List<DivisionResult2> lista) { 
		Divider3.resultLista = lista;
	}

	
	



	public   DivisionResult2 Divides (Integer dividendo, Integer divisore)  throws ImpossibleCalculationException
	{            


		if(divisore != 0 )
		{

			double result = (double) dividendo / (double) divisore;
			 result =  Math.ceil(result);
			 DivisionResult2 divisionResult2  = new DivisionResult2(dividendo, divisore, (int)result );//  7.  Inserisco il conteggio nella lista, con l'ADD
			resultLista.add(divisionResult2);  
			return  divisionResult2;
		}
		else
		{
			 DivisionResult2 divisionResult2  = new DivisionResult2(dividendo, divisore, null ); //  8.  Inserisco il conteggio nella lista, con l'ADD
			resultLista.add(divisionResult2);  
			
			
		log("Division of " +  dividendo + " by ZERO" );// mockito es.2  .2
			
			throw new ImpossibleCalculationException(); 
			
			
		}
		
	}
	
	
	
	
	
	
	public void log(String message)// mockito es.2  .1
	{
	System.out.println(message);
	}
	



}

