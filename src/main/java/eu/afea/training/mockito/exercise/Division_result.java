package eu.afea.training.mockito.exercise;

public class Division_result {
	
	//Properties
	private Integer div1, div2, result;
	
	//Constructor
	public Division_result() {
	}
	
	public Division_result(Integer d1, Integer d2){
		super();
		div1 = d1;
		div2 = d2;
	}

	//Setter & Getter
	public int getDiv1() {
		return div1;
	}

	public void setDiv1(Integer div1) {
		this.div1 = div1;
	}

	public int getDiv2() {
		return div2;
	}

	public void setDiv2(Integer div2) {
		this.div2 = div2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}
	
	
}
