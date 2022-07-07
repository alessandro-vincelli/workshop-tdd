package eu.afea.training.mockito.exercise;

import java.util.ArrayList;

public class Divider {
	
	public DividerResult divides(Integer divided , Integer divider ) throws ImpossibleCalculationException {
		
		private static ArrayList<DividerResult> resultList= new ArrayList<>();
		if(divider!=0){
			
			
			double result=Math.ceil((double)divided/(double)divider);
			result =Math.ceil(result);
			DividerResult divisionResult = new DividerResult(divided , divider ,(int)result );
			
			resultList.add(divisionResult);
			
		return divisionResult;
				
		}
		else{
			DividerResult divisionResult = new DividerResult(divided , divider ,null );
			resultList.add(divisionResult);
			
			
			throw new ImpossibleCalculationException();
		}
	}
	

	
	

}
