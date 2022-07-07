package eu.afea.training.mockito.exercise;

public class Divider {

	public Divider() {
		// TODO Auto-generated constructor stub
	}

	public  DivisionResult Div(Integer div1, Integer div2) throws ImpossibleClalculationException {
		// TODO Auto-generated method stub
		//DivisionResult D = new DivisionResult();
		if(div2 !=0)
			
		 {
	        
	        System.out.println("Try Block -->  Start");
	       //return Division(div1, div2, div1/div2)  iniziale prima della modifica 
	        
	       double ris = (double) div1 / (double) div2;
	         
	       ris =  Math.ceil(ris);
	        
	        DivisionResult divisionResult = new DivisionResult(div1, div2, (int) ris);
	        
	        return divisionResult;
	        
	     }
		else { 
	        throw new ImpossibleClalculationException();
	    
	     }
		//return new DivisionResult(div1, div2, div1/div2);
	}



}
