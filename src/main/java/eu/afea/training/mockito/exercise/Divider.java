package eu.afea.training.mockito.exercise;

import java.util.ArrayList;
import java.util.List;

public class Divider {
	private static List<DivisionResult> ListaDiv = new ArrayList<>();
	private Logger L ; 
	
	public Divider(Logger l) {
		super();
		this.L = l;
	}

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
	         ListaDiv.add(divisionResult);
	        return divisionResult;
	        
	     }
		else { 
			
			 DivisionResult divisionResult = new DivisionResult(div1, div2, null);
	        ListaDiv.add(divisionResult);
	        
	        L.log("messaggio division of " + div1 + "by 0 ");
	        throw new ImpossibleClalculationException();
	        
	      
	     }
		//return new DivisionResult(div1, div2, div1/div2);
	}
	
	public static List<DivisionResult> getListaDiv()
	{
		return ListaDiv;
	}
	

}
