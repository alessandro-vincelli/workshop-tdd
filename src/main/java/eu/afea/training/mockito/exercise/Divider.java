package eu.afea.training.mockito.exercise;

public class Divider {



	public DivisionResult divides(Integer dividendo, Integer divisore) {


		return new DivisionResult(dividendo, divisore, dividendo/ divisore);
	}



}
