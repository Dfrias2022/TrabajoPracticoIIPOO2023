package ar.edu.unlu.poo.sunBeachFinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Compra> listaVentas = new ArrayList<>();
        List<Proveedor> listaProveedores = new ArrayList<>();

        ProveedorTransporte t1 = new ProveedorTransporte(1200.00,"pepe",200);
        System.out.println(t1.getImporteBase());
        ProveedorHospedaje h1 = new ProveedorHospedaje(1200.00,"juan",200,100);
        ProveedorGuia g1 = new ProveedorGuia(1200.00,"jorge",200);

        ProveedorTransporte t2 = new ProveedorTransporte(1200.00,"pepe2",400);
        ProveedorHospedaje h2 = new ProveedorHospedaje(1200.00,"juan2",400,100);
        ProveedorGuia g2 = new ProveedorGuia(1200.00,"jorge2",400);

        //AGREGO LOS PROVEEDORES A LA LISTA DE PROVEEDORES
        listaProveedores.add(t1);
        listaProveedores.add(t2);
        listaProveedores.add(h1);
        listaProveedores.add(h2);
        listaProveedores.add(g1);
        listaProveedores.add(g2);

        PaqueteTuristico paquete1 = new PaqueteTuristico(t1,g1,h1,"cancun");
        PaqueteTuristico paquete2 = new PaqueteTuristico(t2,g2,h2,"argentina");
        PaqueteTuristico paquete3 = new PaqueteTuristico(t1,g2,h2,"disney");

        Cliente c1 = new Cliente(1,"frias","diego","1111111","45454545");
        Cliente c2 = new Cliente(1,"frias","maria","1112222","45454575");

        Compra com1 = new Compra(c1,paquete2,true, LocalDate.now());
        Compra com2 = new Compra(c2,paquete2,true, LocalDate.now());
        Compra com3 = new Compra(c2,paquete3,true, LocalDate.now());
        Compra com4 = new Compra(c1,paquete2,true, LocalDate.now());

        //AGREGO LAS COMPRAS REALIZADAS POR LOS CLIENTES
        listaVentas.add(com1);
        listaVentas.add(com2);
        listaVentas.add(com3);
        listaVentas.add(com4);


        for(Compra c:listaVentas){
            System.out.printf("Cliente: %s Destino: %s Costo: %f\n",c.getCliente().getNombre(),c.getPaquete().getDestino(),c.getPaquete().getCosto());
        }



    }
}
