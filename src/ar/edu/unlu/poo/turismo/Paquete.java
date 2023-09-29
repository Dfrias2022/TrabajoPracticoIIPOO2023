package ar.edu.unlu.poo.turismo;

import java.util.ArrayList;
import java.util.List;

public class Paquete {
	private String destino;
	private List<Proveedor> proveedores = new ArrayList<Proveedor>();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	public Paquete(String destino) {
		this.destino = destino;
	}
	
	public void agregarProveedor(Transporte t , Guia g, Hospedaje h ) {
		proveedores.add(t);
		proveedores.add(g);
		proveedores.add(h);
	}
	
	public float calcularPrecio() {
		float precio = 0;
		for(Proveedor p : proveedores)
			precio += p.calcularPrecio(clientes.size());
		return precio;
	}
	
	public void agregarCliente(Cliente c) {
		clientes.add(c);
	}

	public String getDestino() {
		return destino;
	}
	
	public void getContacto() {
		for(Proveedor p : proveedores)
			System.out.println("Contacto : " + p.getContacto());
		
	}
	
	public void mostrarComposicion() {
		getContacto();
		System.out.println("------Clientes------");
		for( Cliente c : clientes) {
			System.out.println(c.getNombre());
		}
	}
	

}
