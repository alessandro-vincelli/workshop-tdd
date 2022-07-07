package eu.afea.training.mockito.exercise;

import java.util.*;

public class Divider {

	private static List<DivisionResult> resultList = new ArrayList<>();

	private Logger logger;
	
	
	
	public Divider(Logger logger) {
		super();
		this.logger = logger;
	}

	public Divider() {
		super();

	}

	public DivisionResult divides(Integer dividend, Integer divisor) throws ImpossibleCalculationException {

		if (divisor != 0) {
			double result = Math.ceil((double) dividend / (double) divisor);
			result = Math.ceil(result);

			DivisionResult divisionResult = new DivisionResult(dividend, divisor, (int) result);

			resultList.add(divisionResult);

			return divisionResult;
		}

		else {
			DivisionResult divisionResult = new DivisionResult(dividend, divisor, null);

			resultList.add(divisionResult);

			logger.log("Division of" + dividend + "by zero");

			throw new ImpossibleCalculationException();

		}

	}



	public static List<DivisionResult> getResultList() {
		return resultList;
	}



	public static void setResultList(List<DivisionResult> resultList) {
		Divider.resultList = resultList;
	}
	
	
	public static void clearResultList() {
		resultList.clear();
	}






}
	
	



























//modo alternativo da vedere



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