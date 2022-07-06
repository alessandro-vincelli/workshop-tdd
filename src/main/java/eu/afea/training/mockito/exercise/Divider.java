package eu.afea.training.mockito.exercise;

public class Divider {

	public Divider() {
		// TODO Auto-generated constructor stub
	}

	public  DivisionResult Div(Integer div1, Integer div2) throws ImpossibleClalculationException {
		// TODO Auto-generated method stub
		//DivisionResult D = new DivisionResult();
		try {
	        
	        System.out.println("Try Block -->  Start");
	       
	        
	        return new DivisionResult(div1, div2, div1/div2);
	        
	     }
	     catch (Exception e) { 
	        throw new ImpossibleClalculationException();
	    
	     }
		//return new DivisionResult(div1, div2, div1/div2);
	}



}
