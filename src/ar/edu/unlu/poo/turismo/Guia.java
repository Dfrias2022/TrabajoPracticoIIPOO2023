package ar.edu.unlu.poo.turismo;

public class Guia extends Proveedor {

	public Guia(float precioBase, String contacto) {
		super(precioBase, "Guia : " + contacto);
	}

	@Override
	protected float calcularPrecioExtra(int cantidadClientes) {
		return (cantidadClientes > 200)?90:0;
	}

}
