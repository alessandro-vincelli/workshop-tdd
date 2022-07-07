/**
 * @author Federico Virili
 *  
 */
package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import eu.afea.training.mockito.services.DivisionResult;

public class Divider {
	        
	      public DivisionResult divides (Integer dividend, Integer divisor) throws ImpossibleCalculationException {
		if (divisor !=0) {	
			double result = (double) dividend/ (double) divisor;
			 result = Math.ceil(result);
			 DivisionResult DivisionResult = new DivisionResult(dividend,divisor, (int) result);
			    
			 return DivisionResult;
		} else  {
			throw new ImpossibleCalculationException ();
		}
				
	}
	
	}



	
	
	