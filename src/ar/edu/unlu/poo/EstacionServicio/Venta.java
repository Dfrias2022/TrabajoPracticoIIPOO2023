package ar.edu.unlu.poo.EstacionServicio;

import java.time.LocalDate;

public class Venta {
    private Cliente cliente;
    private  Expendedor expendedor;
    private Empleado empleado;
    private LocalDate fecha;
    private Double importeTotal;
    private Double litrosVendidos;

    public Double getLitrosVendidos() {
        return litrosVendidos;
    }

    public void setLitrosVendidos(Double litrosVendidos) {
        this.litrosVendidos = litrosVendidos;
    }

    public Venta(Cliente cliente, Expendedor expendedor, Empleado empleado, LocalDate fecha, Double litrosVendidos){
        this.cliente = cliente;
        this.expendedor = expendedor;
        this.empleado = empleado;
        this.fecha = fecha;
        this.importeTotal = expendedor.getCombustible().getPrecioVenta() * litrosVendidos;
        this.litrosVendidos = litrosVendidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Expendedor getExpendedor() {
        return expendedor;
    }

    public void setExpendedor(Expendedor expendedor) {
        this.expendedor = expendedor;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(Double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
