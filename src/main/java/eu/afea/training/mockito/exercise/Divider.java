package eu.afea.training.mockito.exercise;


public class Divider {

	public DivisionResult divides(Integer dividend, Integer divisor) throws ImpossibleCalculationException {
            if (divisor != 0) 
            {
			double result = (double) dividend / (double) divisor;
			result = Math.ceil(result);
			DivisionResult divisionResult = new DivisionResult(dividend, divisor, (int) result);
			return divisionResult;
            } 
            
            else 
            {
			throw new ImpossibleCalculationException();
            }

		}
}
