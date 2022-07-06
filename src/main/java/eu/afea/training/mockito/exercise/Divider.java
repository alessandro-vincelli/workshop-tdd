package eu.afea.training.mockito.exercise;
import static org.junit.Assert.*;

import org.junit.*;



public class Divider {
	
	public DivisionResult dividers(Integer dividend, Integer divisor) throws ImpossibleCalculatorException{
		try {
			return new DivisionResult(dividend, divisor, dividend/divisor);
		}catch (ArithmeticException e)
		{
		throw new ImpossibleCalculatorException();
			}
		
	}
/*public DivisionResult dividers(Integer dividend, Integer divisor) {
		return new DivisionResult(dividend, divisor, dividend/divisor);
		
	}
*/
	
}