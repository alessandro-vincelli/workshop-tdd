/**
 * @author alessandro vincelli
 *  
 */
package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class Divider {
	
	private static List <DivisionResult> dr = new ArrayList <DivisionResult>();
	
	public DivisionResult divides (Integer dividend, Integer divisor) throws ImpossibleCalculationException {
		if(divisor != 0) {
			double result = (double) dividend / (double) divisor;
			result = Math.ceil (result);
			DivisionResult divisionResult = new DivisionResult (dividend, divisor, (int) result); 
			dr.add(divisionResult);
			return divisionResult;
		} else  {
			DivisionResult divisionResult = new DivisionResult (dividend, divisor, null); 
			dr.add(divisionResult);
			throw new ImpossibleCalculationException ();
		}
		
		 
	}

	public static List<DivisionResult> getDr() {
		return dr;
	}

	public static void setDr(List<DivisionResult> dr) {
		Divider.dr = dr;
	}
	
	public static void clearResultList () {
		dr.clear();
	}
	
	
	
	
}