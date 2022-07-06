package eu.afea.training.mockito.exercise;

public class Division_result {
	
	
	//Properties
	private int div1, div2, result;
	
	//Constructor
	public Division_result() {}
	
	public Division_result(int d1, int d2, int r){
		super();
		div1 = d1;
		div2 = d2;
		result = r;
	}

	//Setter & Getter
	public int getDiv1() {
		return div1;
	}

	public void setDiv1(int div1) {
		this.div1 = div1;
	}

	public int getDiv2() {
		return div2;
	}

	public void setDiv2(int div2) {
		this.div2 = div2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	
}
