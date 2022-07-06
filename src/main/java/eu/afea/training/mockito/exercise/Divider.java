package eu.afea.training.mockito.exercise;

public class Divider {

	public Divider() {
		// TODO Auto-generated constructor stub
	}

	public  DivisionResult Div(Integer div1, Integer div2) {
		// TODO Auto-generated method stub
		//DivisionResult D = new DivisionResult();
		
		return new DivisionResult(div1, div2, div1/div2);
	}



}
