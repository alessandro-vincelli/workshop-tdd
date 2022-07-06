package eu.afea.training.mockito.exercise;

public class Divisione{

	public Divisione() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisionResult D1 = new DivisionResult();
		D1.setDiv1(20);
		D1.setDiv2(0);
		//D1.setRis(null);
		
		int ris; //= D1.getRis();
		int val1 = D1.getDiv1();
		int val2 = D1.getDiv2();
	      try {
	         
	         System.out.println("Try Block -->  Start");
	        
	         ris = val1/val2;
	         System.out.println(ris);
	         System.out.println("Try Block -->  End");
	      }
	      catch (ArithmeticException e) { 
	         
	         System.out.println("ArithmeticException ---->  divisione per 0!!");
	      }
	      System.out.println("Fuori dal try-catch.");
	   }
	

	}


