package ar.edu.unlu.poo.turismo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private List<Compra> compras = new ArrayList<Compra>();
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public void realizaCompra(Paquete p) {
		compras.add(new Compra(p,this));
		p.agregarCliente(this);
	}

	public Compra[] comprasXDestino(int mes, String destino) {
		ArrayList<Compra> misCompras = new ArrayList<>();
		for (Compra c : compras)
			if (c.getMes() == mes && c.getPaquete().getDestino().equals(destino))
				misCompras.add(c);
		
		Compra[] respueta = new Compra[misCompras.size()];
		int i = 0;
		for (Compra c : misCompras)
			respueta[i++] = c;
					
		return respueta;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
