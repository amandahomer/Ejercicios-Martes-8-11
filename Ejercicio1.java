/*Este programa pide dos numeros y muestra su multiplicacion
@AmandaNR */

public class Ejercicio1 {

	public static void main (String [] args) {
	
		String numero;
		System.out.print("Introduce un numero: ");
		numero = System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt( numero );
		
		System.out.print("Introduce otro numero: ");
		numero = System.console().readLine();
		int segundoNumero;
		segundoNumero = Integer.parseInt( numero );
		
		int total;
		total = primerNumero * segundoNumero;
		
		System.out.print("El resultado de la multiplicacion es: " + total);
	
	}
}
