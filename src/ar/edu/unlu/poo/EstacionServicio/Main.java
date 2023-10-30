package ar.edu.unlu.poo.EstacionServicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> listaTop5 = new ArrayList<>();
        List<Venta>listaVentas = new ArrayList<>();
        Empleado e1 = new Empleado("frias","diego","1111","5454");
        Empleado e2 = new Empleado("frias","diego","1111","5454");
        Empleado e3 = new Empleado("frias","diego","1111","5454");
        Empleado e4 = new Empleado("frias","diego","1111","5454");

        Combustible c1 = new Combustible("Nafta super",100.00);
        Combustible c2 = new Combustible("gasoil",90.00);
        Combustible c3 = new Combustible("nafta premium",300.00);

        Expendedor ex1 = new Expendedor(1,c1,500);
        Expendedor ex2 = new Expendedor(2,c2,500);
        Expendedor ex3 = new Expendedor(3,c3,500);
        Expendedor ex4 = new Expendedor(4,c1,500);

        Cliente cl1 = new Cliente("001","alguien1");
        Cliente cl2 = new Cliente("002","alguien2");
        Cliente cl3 = new Cliente("003","alguien3");

        listaTop5.add(cl1);
        listaTop5.add(cl2);
        listaTop5.add(cl3);

        Venta v1 = new Venta(cl1,ex1,e1, LocalDate.now(),5.500);
        Venta v2 = new Venta(cl2,ex1,e1, LocalDate.now(),5.500);
        Venta v3 = new Venta(cl1,ex2,e1, LocalDate.now(),5.500);
        Venta v4 = new Venta(cl1,ex3,e1, LocalDate.now(),5.500);

        listaVentas.add(v1);
        listaVentas.add(v2);
        listaVentas.add(v3);
        listaVentas.add(v4);

        //INFORME
        int ventasXSurtidos = 0;
        int litrosXSurtidos = 0;
        int ventasXEmpleado = 0;
        int ventasXCombustible = 0;
        for(Venta v:listaVentas){
            System.out.printf("Cliente: %s Expendedor: %s Combustible: %s Empleado: %s Importe: %.2f \n",v.getCliente().getPatente(),v.getExpendedor().getCodigo(),v.getExpendedor().getCombustible().getNombre(),v.getEmpleado().getNombre(),v.getImporteTotal());

        }

    }
}
