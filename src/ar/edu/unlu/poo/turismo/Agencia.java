package ar.edu.unlu.poo.turismo;

import java.util.ArrayList;
import java.util.Random;

public class Agencia {

	public static void main(String[] args) {
		ArrayList<Hospedaje> hospedaje = new ArrayList<>();
		ArrayList<Guia> guias = new ArrayList<>();
		ArrayList<Transporte> transportes = new ArrayList<>();
		Random rnd = new Random();
		hospedaje.add( new Hospedaje(1500.0f,20, "Calle La Pampa Nro 156 San Luis" ));
		hospedaje.add( new Hospedaje(1000.0f,10, "Calle Falsa 123 San Luis" ));
		hospedaje.add(  new Hospedaje(2500.0f,5, "Calle Del Hotel 3 156 San Luis" ));
		
		guias.add( new Guia(500.0f, "Celular 546546546546546" ));
		guias.add( new Guia(500.0f, "Celular 222222222222222" ));
		guias.add( new Guia(500.0f, "Celular 333333333333333" ));
		
		transportes.add(new Transporte(853.0f,"Celular 4654646466 colectivero Juan"));
		transportes.add(new Transporte(800.0f,"Celular 4654646466 colectivero Jose"));
		transportes.add(new Transporte(899.0f,"Celular 4654646466 colectivero Luis"));
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		
		ArrayList<Paquete> paquetes = new ArrayList<>();
		
		for (int i = 0; i < 30 ; i ++) {
			Paquete p = new Paquete("Destino " + i);
			int t = rnd.nextInt(3);
			int g = rnd.nextInt(3);
			int h = rnd.nextInt(3);
			p.agregarProveedor(transportes.get(t),guias.get(g),hospedaje.get(h));
			paquetes.add(p);
		}
		
		for (int i = 0; i < 1000 ; i ++) {
			Cliente c = new   Cliente("Cliente numero " + i);		
			clientes.add(c);
		}
		
		for (int i = 0; i < 3000 ; i ++) {
			int c = rnd.nextInt(1000);
			int p = rnd.nextInt(30);

			Cliente cliente = clientes.get(c);		
			cliente.realizaCompra(paquetes.get(p));
		}
		
		int p = rnd.nextInt(30);
		paquetes.get(p).mostrarComposicion();
		
		/// imprimir ventas del mes x
		int mes = rnd.nextInt(12) + 1;
		for (Cliente c : clientes) {
			Compra[] compra = c.comprasXDestino(mes,"Destino 1");
			for (Compra cpa : compra)
				System.out.println(cpa.getPaquete().getDestino() + " Cliente " + c.getNombre());
			
				
		}
		
		
	}

}
