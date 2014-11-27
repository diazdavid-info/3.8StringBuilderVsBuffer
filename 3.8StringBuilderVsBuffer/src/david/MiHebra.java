package david;

public class MiHebra implements Runnable {
	//private StringBuilder st = new StringBuilder();
	private StringBuffer st = new StringBuffer();
	public static final String CADENA = "123456789";
	public static final int NUM_VECES = 1000;
	
	public void run(){
		for (int i = 0; i < NUM_VECES; i++) {
			st.append(CADENA);
		}
	}
	
	public String getString(){
		return st.toString();
	}
}
