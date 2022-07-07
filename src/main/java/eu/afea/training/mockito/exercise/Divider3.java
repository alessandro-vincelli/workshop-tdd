package eu.afea.training.mockito.exercise;


public class Divider3 {  //  2.  lo modifico aggiungendo la rioga 9 & 10 


	public   DivisionResult2 Divides (Integer dividendo, Integer divisore)  throws ImpossibleCalculationException
	{            


		if(divisore != 0 )
		{

			double result = (double) dividendo / (double) divisore;
			int result1 = (int) Math.ceil(result);
			return  new DivisionResult2(dividendo, divisore, result1 );

		}
		else
		{
			throw new ImpossibleCalculationException(); 
		}
	}



}

