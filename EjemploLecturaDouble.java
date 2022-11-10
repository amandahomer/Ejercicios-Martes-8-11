/*Lectura de datos numericos desde teclado
@AmandaNR */

public class EjemploLecturaDouble {

	public static void main (String [] args) {
	
		String linea;
		System.out.print("Por favor, introduce un numero: ");
		linea = System.console().readLine();
		double primerNumero;
		primerNumero = Double.parseDouble( linea);
		
		System.out.print("Introduce otro, por favor: ");
		linea = System.console().readLine();
		double segundoNumero;
		segundoNumero = Double.parseDouble( linea);
		
		double total;
		total = (2 * primerNumero) + segundoNumero;
		
		System.out.print("El primer numero introducido es " + primerNumero);
		System.out.println(" y el segundo es " + segundoNumero);
		
		System.out.print("El doble del primer numero mas el segundo es ");
		System.out.print(total);
	
	}
}
