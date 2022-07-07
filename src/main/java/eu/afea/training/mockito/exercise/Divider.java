/**
 * @author Federico Virili
 *  
 */
package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import eu.afea.training.mockito.services.DivisionResult;

public class Divider {
	
	
	
	public DivisionResult divides (Integer dividend, Integer divisor) throws ImpossibleCalculationException {
		try {	
			return new DivisionResult (dividend, divisor, dividend/divisor);
		} catch (ArithmeticException ArithmeticException) {
			throw new ImpossibleCalculationException ();
		}
		
		 
	}
	
	
}


	
	
	