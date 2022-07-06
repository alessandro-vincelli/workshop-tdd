/**
 * @author Federico Virili
 * 
 */
package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import eu.afea.training.mockito.services.DivisionResult;

public class Divider {
	private DivisionResult divider;

	public DivisionResult divides(Integer dividend, Integer divisor) {
		try {
			return new DivisionResult(dividend, divisor, dividend / divisor);

		} catch (Exception e) {
			throw new IllegalArgumentException();
		}

	}
}

	




	
	
	