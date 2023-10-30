package ar.edu.unlu.poo.sunBeachFinal;

public class ProveedorHospedaje extends Proveedor{
    private int cantMinClientes;
    private final Double rebaja = 0.5;

    public ProveedorHospedaje(Double importebase, String nombre, int cantClientes, int cantMinClientes) {
        super(importebase, nombre, cantClientes);
        this.cantMinClientes = cantMinClientes;
    }
    @Override
    public Double getImporteBase() {
        Double total = 0.00;
        Double cobro =0.00;
        int diferencia = 0;
        if (getCantClientes() > cantMinClientes){
            diferencia = getCantClientes() - cantMinClientes;
            total = rebaja * diferencia;
            cobro = ((total / 100) * super.getImporteBase()) - super.getImporteBase();
        } else{
            cobro = super.getImporteBase();
        }
        return cobro;
    }

}
