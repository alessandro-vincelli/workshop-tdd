package eu.afea.training.mockito.exercise;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;



public class Divider {
	
	private static List<DivisionResult> resultList;
	
	public DivisionResult dividers(Integer dividend, Integer divisor) throws ImpossibleCalculatorException{
		if( divisor != 0) {
		double result = (double) dividend/ (double) divisor;
		result = Math.ceil(result);
		DivisionResult divisionResult = new DivisionResult (dividend, divisor, (int) result);
		resultList.add(divisionResult);
		return divisionResult;
		}else{
		//resultList.add(divisionResult);
		throw new ImpossibleCalculatorException();
		}	
	}

	public static List<DivisionResult> getResultList() {
		return resultList;
	}

	public static void setResultList(List<DivisionResult> resultList) {
		Divider.resultList = resultList;
	}
	public static void clearResultList() {
		resultList.clear();
	}
}
	

	/*public DivisionResult dividers(Integer dividend, Integer divisor) throws ImpossibleCalculatorException{
		try {
		double result = (double) dividend/ (double) divisor;
		result = Math.ceil(result);
		DivisionResult divisionResult = new DivisionResult (dividend, divisor, (int) result);
		return divisionResult;
		}catch (ArithmeticException e)
		{
		throw new ImpossibleCalculatorException();
			}*/
		
	
	/*public DivisionResult dividers(Integer dividend, Integer divisor){
		double result = (double) dividend/ (double) divisor;
		result = Math.ceil(result);
		DivisionResult divisionResult = new DivisionResult (dividend, divisor, (int) result);
		return divisionResult;
		}*/
	
/*public DivisionResult dividers(Integer dividend, Integer divisor) {
		return new DivisionResult(dividend, divisor, dividend/divisor);
		
	}
*/
	
	
	/*	public DivisionResult dividers(Integer dividend, Integer divisor) throws ImpossibleCalculatorException{
		try {
			return new DivisionResult(dividend, divisor, dividend/divisor);
		}catch (ArithmeticException e)
		{
		throw new ImpossibleCalculatorException();
			}
		
	}*/
