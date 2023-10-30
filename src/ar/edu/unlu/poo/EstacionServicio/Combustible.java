package ar.edu.unlu.poo.EstacionServicio;

public class Combustible {
    private String nombre;
    private Double precioVenta;

    public Combustible(String nombre, Double precioVenta){
        this.nombre = nombre;
        this.precioVenta = precioVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
