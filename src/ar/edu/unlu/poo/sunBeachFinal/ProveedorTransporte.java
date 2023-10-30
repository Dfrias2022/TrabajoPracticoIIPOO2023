package ar.edu.unlu.poo.sunBeachFinal;

public class ProveedorTransporte extends Proveedor{
    private final Double extra = 0.3;

    public ProveedorTransporte(Double importebase,String nombre, int cantClientes) {
        super(importebase,nombre, cantClientes);
    }

    @Override
    public Double getImporteBase() {
        return (((extra * getCantClientes())/100) * super.getImporteBase()) + super.getImporteBase();
    }





}
