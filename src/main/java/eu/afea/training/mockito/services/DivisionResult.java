/**
 * @author Federico Virili
 * 
 */
package eu.afea.training.mockito.services;

public class DivisionResult {

	private static final Object DivisionResult = null;
	private Integer result;
	private Integer dividend;
	private Integer divisor;

	public DivisionResult(Integer result, Integer dividend, Integer divisor) {

		this.dividend = dividend;
		this.divisor = divisor;
		this.result = result;

		setresult(dividend, divisor, dividend / divisor);

		return;

	}

	private void setresult(Integer dividend, Integer divisor, Integer result) {

	}

	private void setresult() {

	}

	public Integer getDivident() {
		return dividend;
	}

	public void setDivident(Integer divident) {
		this.dividend = divident;
	}

	public Integer getDivisor() {
		return divisor;
	}

	public void setDivisor(Integer divisor) {
		this.divisor = divisor;
	}

	public void setresult(Integer rresult) {
		result = result;
	}

	public eu.afea.training.mockito.services.DivisionResult divides(Integer dividend, Integer divisor2) {

		return null;
	}

	public Object getResult() {

		return null;
	}

}
