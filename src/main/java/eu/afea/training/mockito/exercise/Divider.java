/**
 * @author Federico Virili
 *  
 */
package eu.afea.training.mockito.exercise;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import eu.afea.training.mockito.services.DivisionResult;

public class Divider {
	
	private static List<DivisionResult> resultlist =new ArrayList <>();
	
	
	      public static ArrayList<DivisionResult> getList() {
		  return getList();
	}

		public DivisionResult divides (Integer dividend, Integer divisor) throws ImpossibleCalculationException {
		if (divisor !=0) {	
			double result = (double) dividend/ (double) divisor;
			 result = Math.ceil(result);
			 DivisionResult DivisionResult = new DivisionResult(dividend,divisor, (int) result);
			 resultlist.add(DivisionResult);
			 return DivisionResult;
		} else  {
			 DivisionResult DivisionResult = new DivisionResult(dividend,divisor, null);
			 resultlist.add(DivisionResult);
			throw new ImpossibleCalculationException ();
		}
				
	}

		public static List<DivisionResult> getResultlist() {
			return resultlist;
		}
	public static void clearResultlista() {
		resultlist.clear();
	}
	}



	
	
	