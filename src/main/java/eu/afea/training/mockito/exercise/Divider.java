package eu.afea.training.mockito.exercise;

public class Divider {



	public DivisionResult divides(Integer dividendo, Integer divisore) throws ImpossibleCalculationException {

try {
		return new DivisionResult(dividendo, divisore, dividendo/ divisore);
	}
	
	catch(Exception e)
	{
		throw new ImpossibleCalculationException();
	}

	}
}
