package ar.edu.unlu.poo.turismo;
import java.util.Random;

public class Compra {
	private int mes;
	private Cliente cliente;
	private Paquete paquete;
	
	public Compra(Paquete p, Cliente cliente) {
		Random rnd = new Random();
		paquete = p;
		this.cliente = cliente;
		mes = rnd.nextInt(12) + 1;
	}

	public int getMes() {
		return mes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Paquete getPaquete() {
		return paquete;
	}
	

}
