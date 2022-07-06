package eu.afea.training.mockito.exercise;


public class Divider {

	public DivisionResult divides(Integer dividend, Integer divisor) throws ImpossibleCalculationException {
	       
	       
	       
	       try {
	    		 
	    		 return new DivisionResult(dividend, divisor, dividend/divisor);
	    	 } catch (Exception e) {
	    		 throw new ImpossibleCalculationException();
	    		 
	    	 }
	    		       
	       
	       
	       
	
}
	

}
