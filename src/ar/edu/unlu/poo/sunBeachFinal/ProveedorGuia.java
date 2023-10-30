package ar.edu.unlu.poo.sunBeachFinal;

public class ProveedorGuia extends Proveedor{
    private final Double extraFijo = 90.00;
    private final int limiteFijo = 200;
    public ProveedorGuia(Double importebase,String nombre, int cantClientes) {
        super(importebase, nombre, cantClientes);
    }

    @Override
    public Double getImporteBase() {
        Double cobro = 0.00;
        if (getCantClientes() > limiteFijo){
            cobro = super.getImporteBase() + extraFijo;
        }else{
            cobro = super.getImporteBase();
        }
        return cobro;
    }


}
