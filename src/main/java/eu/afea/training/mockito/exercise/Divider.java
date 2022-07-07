package eu.afea.training.mockito.exercise;
import static org.junit.Assert.*;

import org.junit.*;



public class Divider {
	
	public DivisionResult dividers(Integer dividend, Integer divisor){
		double result = (double) dividend/ (double) divisor;
		result = Math.ceil(result);
		DivisionResult divisionResult = new DivisionResult (dividend, divisor, (int) result);
		return divisionResult;
		
		
	}
/*public DivisionResult dividers(Integer dividend, Integer divisor) {
		return new DivisionResult(dividend, divisor, dividend/divisor);
		
	}
*/
	
	
	/*	public DivisionResult dividers(Integer dividend, Integer divisor) throws ImpossibleCalculatorException{
		try {
			return new DivisionResult(dividend, divisor, dividend/divisor);
		}catch (ArithmeticException e)
		{
		throw new ImpossibleCalculatorException();
			}
		
	}*/
}