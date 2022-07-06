package eu.afea.training.mockito.exercise;


public class DivisionResult {

	/*
	 * fai le 3 variabili
	 * poi get e set
	 * poi genera costruttori e fields
	 * e cgenero costruttore di default
	 */

	private	Integer dividendo;
	private	Integer divisore;
	private	Integer result;

	
	public DivisionResult() {
		
	}

	
	public DivisionResult(Integer dividendo, Integer divisore, Integer result) {
		super();
		this.dividendo = dividendo;
		this.divisore = divisore;
		this.result = result;
	}



	public Integer getDividendo() 
	{
		return dividendo;
	}
	public void setDividendo(Integer dividendo)
	{
		this.dividendo = dividendo;
	}


	public Integer getDivisore() 
	{
		return divisore;
	}
	public void setDivisore(Integer divisore) 
	{
		this.divisore = divisore;
	}


	public Integer getResult() 
	{
		return result;
	}
	public void setResult(Integer result)
	{
		this.result = result;
	}


}
