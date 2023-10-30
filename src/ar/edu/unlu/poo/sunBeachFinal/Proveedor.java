package ar.edu.unlu.poo.sunBeachFinal;

public class Proveedor {
    protected Double importeBase;
    private String nombre;
    private int cantClientes;


    public Proveedor(Double importebase,String nombre, int cantClientes){
        this.importeBase = importebase;
        this.nombre = nombre;
        this.cantClientes = cantClientes;
    }

    public void setImporteBase(Double importeBase) {
        this.importeBase = importeBase;
    }

    public void setCantClientes(int cantClientes) {
        this.cantClientes = cantClientes;
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public Double getImporteBase() {
        return importeBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
