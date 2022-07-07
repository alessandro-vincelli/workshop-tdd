package eu.afea.training.mockito.exercise;

public class DivisionResult2 {
	
	
	//  2.  creo i parametri voluti dall esercizio
private Integer dividendo;
private Integer divisore;
private Integer risultato;




//  3.  genero i get e set in modo da poter agire sui metodi privati

public Integer getDividendo() {
	return dividendo;
}

public void setDividendo(Integer dividendo) {
	this.dividendo = dividendo;
}

public Integer getDivisore() {
	return divisore;
}

public void setDivisore(Integer divisore) {
	this.divisore = divisore;
}

public Integer getRisultato() {
	return risultato;
}

public void setRisultato(Integer risultato) {
	this.risultato = risultato;
}



//  4.  creo il costruttore, in modo cda passare i valori dei parametri al metodo che li necessita
public DivisionResult2(Integer dividendo, Integer divisore, Integer risultato) {
	super();
	this.dividendo = dividendo;
	this.divisore = divisore;
	this.risultato = risultato;
}
}



