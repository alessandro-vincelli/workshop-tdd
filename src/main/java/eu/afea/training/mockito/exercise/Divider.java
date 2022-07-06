package eu.afea.training.mockito.exercise;

public class Divider {

	public DivisionResult Div(Integer dividend, Integer divisor) throws ImpossibleCalcultationException {

		

	
	
	try {
		
		return new DivisionResult(dividend, divisor, dividend / divisor);
		
		
		
	}
	
	catch (Exception e) {
		
		throw new ImpossibleCalcultationException();
	}
	

}
}
