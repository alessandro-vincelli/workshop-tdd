package eu.afea.training.mockito.exercise;

public class Divider {
	
	public DividerResult divides(Integer divided , Integer divider ) throws ImpossibleCalculationException {
		
		if(divider!=0){
			double result=Math.ceil((double)divided/(double)divider);
			result =Math.ceil(result);
			DividerResult divisionResult = new DividerResult(divided , divider ,(int)result );
			
		return divisionResult;
				
		}
		else{
			throw new ImpossibleCalculationException();
		}
	}
	

	
	

}
