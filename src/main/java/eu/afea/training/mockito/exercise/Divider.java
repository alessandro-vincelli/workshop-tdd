package eu.afea.training.mockito.exercise;

import java.util.*;

public class Divider {
	
	private static List<Division_result> list = new ArrayList<>();

	public Division_result divides(int divided1, int diveded2) throws ImpossibleCalculationException{
		
		Division_result d = new Division_result(divided1, diveded2);
		d.setDiv1(divided1);
		d.setDiv2(diveded2);
		
		try {
			if(divided1%diveded2==1)
				d.setResult((divided1/diveded2)+1);
			else
				d.setResult(divided1/diveded2);
			
			list.add(d);
			return d;
		}
		catch(ArithmeticException e) {
			d.setResult(null);
			list.add(d);
			throw new ImpossibleCalculationException();
		}
			
	}

	public static List<Division_result> getList() {
		return list;
	}
	
	
}
