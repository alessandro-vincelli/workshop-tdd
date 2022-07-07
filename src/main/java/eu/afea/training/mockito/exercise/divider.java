package eu.afea.training.mockito.exercise;

public class divider {

	public DivisionResult divides(Integer dividend, Integer divisor) throws ImpossibleCalculationException {
		
		if(divisor != 0) {
		  double result = Math.ceil((double) dividend / (double) divisor);
		  result = Math.ceil(result);		
		 
				
		DivisionResult divisionResult = new DivisionResult(dividend, divisor,(int)result);
				return divisionResult;
		}

			else 
	    
		
				throw new ImpossibleCalculationException();


		}

	}


/*
double result = (double) dividend/ (double) divisor;
	
	double r = Math.ceil(result);
	
return new DivisionResult(dividend,divisor, (int) r);		
*/


/*
try {
	int a;
	if (dividend%divisor == 1)
		a = ((dividend/divisor)+1);
	
	else
		a= (dividend/divisor);
	
return new DivisionResult(dividend,divisor, a);	
*/