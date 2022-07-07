package eu.afea.training.mockito.exercise;
import java.util.ArrayList;



public class DividerResult {
	private Integer divident;
	private Integer divisor;
	private Integer result;
	
	

	public DividerResult(Integer divident, Integer divisor, Integer result) {
		super();
		this.divident = divident;
		this.divisor = divisor;
		this.result = result;
	}
	
	

	public DividerResult() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Integer getDivident() {
		return divident;
	}

	public void setDivident(Integer divident) {
		this.divident = divident;
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
