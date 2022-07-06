/**
 * @author Federico Virili
 * 
 */
package eu.afea.training.mockito.exercise;

import eu.afea.training.mockito.services.DivisionResult;


public class Divider 
{
	public DivisionResult divides( Integer dividend, Integer divisor){
		return new DivisionResult (dividend, divisor, dividend/divisor);
	
}
}


	
	
	