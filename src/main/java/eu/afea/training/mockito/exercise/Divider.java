package eu.afea.training.mockito.exercise;

import java.util.ArrayList;

public class Divider {
	
	private Logger logger;
	
	
	public Divider(Logger logger) {
		super();
		this.logger = logger;
	}


	public DividerResult divides(Integer divided , Integer divider ) throws ImpossibleCalculationException {
		
		
		if(divider!=0){
			
			
			double result=Math.ceil((double)divided/(double)divider);
			result =Math.ceil(result);
			DividerResult divisionResult = new DividerResult(divided , divider ,(int)result );
			
		
			
		return divisionResult;
				
		}
		else{
			DividerResult divisionResult = new DividerResult(divided , divider ,null );
			
			logger.log("division of " + divided +"by zero");
			
			throw new ImpossibleCalculationException();
		}
	}
	

	
	

}
