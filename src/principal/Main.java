package principal;
/**
 * @author lfc
 * @version 1.0
 * Esta clase permite identificar el punto de partida
 * de ejecucion
 */
public class Main {

	/**
	 * Este método es el que usa el lenguaje como punto de partida	
	 * @param args representa valores que se pueden asignar desde
	 * el sistema de ejacucíon
	 */
	public static void main(String[] args) {
		
		// primera de código del bootcamp
		System.out.println("Hola Mundo JAVA");
		
		//variables de entrada
		int primerNumero = 5;
		int segundoNumero = 6;
		
		//procesos
		//Se  requiere la suma de los numeros
		int resultadoSuma = primerNumero + segundoNumero;
		
		System.out.println("El resultado de la suma es:  " + resultadoSuma);
		
		final double PI = 3.14;
		
		System.out.println("el valor de PI es:  "+ PI);
		
		
	}

}
