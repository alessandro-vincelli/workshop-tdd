package eu.afea.training.mockito.exercise;

public class Divider {
	
	public DividerResult divides(Integer divided , Integer divider ) throws ImpossibleCalculationException {
		
		try {
		return new DividerResult(divided , divider ,divided/divider );
		}
		catch(Exception e){
			throw new ImpossibleCalculationException();
		}
	}
	

	
	

}
