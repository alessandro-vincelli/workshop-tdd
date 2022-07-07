package eu.afea.training.mockito.exercise;

import java.util.ArrayList;
import java.util.List;

public class Divider {

	private static List<DivisionResult> list = new ArrayList<>();
	
	

	public static List<DivisionResult> getList() {
		return list;
	}

	public static void setList(List<DivisionResult> list) {
		Divider.list = list;
		
		
	}

	public DivisionResult divides(Integer dividend, Integer divisor) throws ImpossibleCalculationException {
		if (divisor != 0) {
			double result = (double) dividend / (double) divisor;
			result = Math.ceil(result);
			DivisionResult divisionResult = new DivisionResult(dividend, divisor, (int) result);
			list.add(divisionResult);
			return divisionResult;
		
			
	

		} else {
			DivisionResult divisionResult = new DivisionResult(dividend, divisor, null);
			list.add(divisionResult);
			throw new ImpossibleCalculationException();

		}

	}
}
