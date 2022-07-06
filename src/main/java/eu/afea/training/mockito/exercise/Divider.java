package eu.afea.training.mockito.exercise;

public class Divider {
	
	
	public Division_result divides(int divided1, int diveded2) {
		Division_result d = new Division_result(divided1, diveded2, divided1/diveded2);
		d.setDiv1(divided1);
		d.setDiv2(diveded2);
		d.setResult(divided1/diveded2);
		return d;
	}
}
