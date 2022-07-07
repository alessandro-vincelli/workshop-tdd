package eu.afea.training.mockito.exercise;

public class Divider2 {




	public   DivisionResult2 Divides (Integer dividendo, Integer divisore)  throws ImpossibleCalculationException //  1.  creo il metodo, con le caratteristiche esplicitate nel eserc. 1
	{                                                                        // SENZA generare il try-catch, quindi scrivendo solo il "RETURN"

		try {
			return  new DivisionResult2(dividendo, divisore, dividendo / divisore );
		}
		catch (Exception e)
		{
			throw new ImpossibleCalculationException();  //  11.  creo, tramite "throw new" la mia eccezione personalizzata, ovviamente usando il throws per far capire che l ho denominata
		}
	}


	}


