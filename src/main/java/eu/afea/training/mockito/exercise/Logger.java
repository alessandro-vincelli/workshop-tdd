package eu.afea.training.mockito.exercise;

public class Logger implements I_Logger{
	
	@Override
	public void log(String m) {
		System.out.println(m);
	}
}
