package ar.edu.unlu.poo.Empresa;

public class EmpleadoComisionBase extends EmpleadoComision{
    private double salarioBase;

    public EmpleadoComisionBase(String apellido, String nombre, String cuit, String telefono, int cantidadVentas, double porcentajeFijo, double salarioBase,int dia,int mes) {
        super(apellido, nombre, cuit, telefono, cantidadVentas, porcentajeFijo,dia,mes);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSueldo() {
        return (super.calcularSueldo()+ salarioBase);
    }
    @Override
    public Double bonoCumple(){
        return super.bonoCumple() + 1000.00;
    }

}
