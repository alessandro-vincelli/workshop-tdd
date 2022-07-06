package eu.afea.training.mockito.exercise;

public class DivisionResult {

	private Integer dividend;
	private Integer divisor;
	private Integer result;

	public DivisionResult(Integer dividend, Integer divisor, Integer result) {
		super();
		this.dividend = dividend;
		this.divisor = divisor;
		this.result = result;
	}

	public Integer getDividend() {
		return dividend;
	}

	public void setDividend(Integer dividend) {
		this.dividend = dividend;
	}

	public Integer getDivisor() {
		return divisor;
	}

	public void setDivisor(Integer divisor) {
		this.divisor = divisor;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}
}
