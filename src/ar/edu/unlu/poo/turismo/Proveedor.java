package ar.edu.unlu.poo.turismo;


public abstract class Proveedor {
	private float precioBase;
	private String contacto;
	public Proveedor(float precioBase, String contacto) {
		this.precioBase = precioBase;
		this.contacto = contacto;
	}
	public float calcularPrecio(int cantidadClientes) {
		return precioBase + calcularPrecioExtra(cantidadClientes);
	}
	
	protected abstract float calcularPrecioExtra(int cantidadClientes);
	
	public String getContacto() {
		return contacto;
	}
	
}
