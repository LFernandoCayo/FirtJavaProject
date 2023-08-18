package principal;

import java.util.Scanner;

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
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Ingrese el nombre del Producto: ");
		String nombreProducto = scanner.next();
		System.out.println("Ingrese el precio del producto sin iva: ");
		double precioProducto = scanner.nextDouble();
		System.out.println("¿Posee descuento del 10%?");
		boolean poseeDescuento = scanner.nextBoolean();
		double precioConIva = precioProducto * 1.21;
		System.out.println("El precio de venta (con IVA) es " + precioConIva);	
		double precioFinal;
		if(poseeDescuento == true) {
			precioFinal = precioConIva * 0.9;
		}else {
			precioFinal = precioConIva * 1.05;
		}
		System.out.println("El precio con descuento es " + precioFinal);	
	}
	

}
