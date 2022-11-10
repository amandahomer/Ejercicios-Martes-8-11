/*Este programa es un conversor de euros a pesetas
@AmandaNR */

public class Ejercicio2 {

	public static void main (String [] args) {
	
		String euros;
		
		System.out.print("Introduce la cantidad en euros: ");
		euros = System.console().readLine();
		double cantidad;
		cantidad = Double.parseDouble( euros );
	
		double pesetas;
		pesetas = 166.38;
		
		double total;
		total = cantidad * pesetas;
		
		System.out.printf(euros +" euros son "+ total +" pesetas");
	
	}
}
