package david;

public class StringBuilderVsBuffer {
	public static void main(String[] args) throws InterruptedException{
		MiHebra mh = new MiHebra();
		
		Thread t1, t2;
		t1 = new Thread(mh);
		t2 = new Thread(mh);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		int longitud = mh.getString().length();
		int esperado = MiHebra.NUM_VECES * MiHebra.CADENA.length() * 2;
		
		System.out.println("Longitud: "+longitud);
		System.out.println("Se esperaba: "+esperado);
		
		if(longitud != esperado){
			System.out.println("¡¡¡NO COINCIDEN!!!");
		}
	}
}
