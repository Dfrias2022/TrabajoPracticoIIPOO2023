package ar.edu.unlu.poo.turismo;

public class Hospedaje extends Proveedor {
	private int minimo;
	public Hospedaje(float precioBase,int minima, String contacto) {
		super(precioBase, "Hospedaje : " + contacto);
		this.minimo = minima;
	}
	
	@Override
	protected float calcularPrecioExtra(int cantidadClientes) {
		
		return (float) ((cantidadClientes > minimo)?(cantidadClientes * 0.5):0);
	}

}
