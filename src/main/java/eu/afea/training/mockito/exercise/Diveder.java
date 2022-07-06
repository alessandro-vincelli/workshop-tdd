package eu.afea.training.mockito.exercise;

public class Diveder {
	
	
	public static Division_result divides(int divided1, int diveded2) {
		Division_result d = new Division_result(divided1, diveded2, divided1/diveded2);
		return d;
	}
}
