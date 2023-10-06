package ar.edu.unlu.poo.Empresa;

public class EmpleadoComision extends Empleado{
    private int cantidadVentas;
    private double porcentajeFijo;

    public EmpleadoComision(String apellido, String nombre, String cuit, String telefono,int cantidadVentas,double porcentajeFijo,int dia,int mes) {
        super(apellido, nombre, cuit, telefono,dia,mes);
        this.cantidadVentas = cantidadVentas;
        this.porcentajeFijo = porcentajeFijo;
    }


    @Override
    public double calcularSueldo() {
        return (porcentajeFijo * porcentajeFijo);
    }
    @Override
    public Double bonoCumple(){
        return super.getBonoC() + (calcularSueldo() * 1.05);
    }
}
