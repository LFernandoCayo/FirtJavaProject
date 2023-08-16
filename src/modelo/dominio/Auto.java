package modelo.dominio;

public class Auto {

	public String nombre;
	public String modelo;
	public float precioLista;
	
	
	public void mostrarDatos() {
		System.out.println("Nombre: +nombre");
		System.out.println("modelo: +modelo");
		System.out.println("Precio de Lista: +precioLista");
			
	}
	public void registrarDatos(String nombre, String modelo, float precioLista) {
		this.nombre = nombre;
		this.modelo = modelo;
		this.precioLista = precioLista;
		}
}

