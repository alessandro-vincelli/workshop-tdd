package eu.afea.training.mockito.exercise;

import java.util.ArrayList;
import java.util.List;

public class Divider {
	
	private static List<DivisionResult> resultList = new ArrayList<>();
	
	public void Log (String message) {
		
		System.out.println(message);
		
		
		
	}

	public DivisionResult Div(Integer dividend, Integer divisor) throws ImpossibleCalcultationException {

		if (divisor != 0) {

			double result = (double) dividend / (double) divisor;

			result = Math.ceil(result);

			DivisionResult divisionResult = new DivisionResult(dividend, divisor, (int) result);
			
			resultList.add(divisionResult);
			
			

			return divisionResult;

		}

		else

		{
			Log("Division of " + dividend + "by zero");
			
			DivisionResult divisionResult = new DivisionResult(dividend, divisor, null);
			throw new ImpossibleCalcultationException();

		
			
		
			
			
			
		
		    //try {
		

			//return new DivisionResult(dividend, divisor, dividend / divisor);

		      }

		    //catch (Exception e) {

			//throw new ImpossibleCalcultationException();
		

	

	
	//}

	

	 
	//}
			
			
			
			
			
			
	}

	
	

	public static List<DivisionResult> getResultList() {
		return resultList;
	}

	public static void setResultList(List<DivisionResult> resultList) {
		Divider.resultList = resultList;
	}
	
}
