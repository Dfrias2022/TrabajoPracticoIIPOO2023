package ar.edu.unlu.poo.turismo;

public class Transporte  extends Proveedor{

	public Transporte(float precioBase, String contacto) {
		super(precioBase, "Trasnporte : " + contacto);
	}

	protected float calcularPrecioExtra(int cantidadClientes) {
		return (float) (cantidadClientes * 0.3);
	};
}
