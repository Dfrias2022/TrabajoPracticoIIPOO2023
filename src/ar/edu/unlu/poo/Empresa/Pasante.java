package ar.edu.unlu.poo.Empresa;

public class Pasante extends Empleado{
    public Pasante(String apellido, String nombre, String cuit, String telefono,int dia,int mes) {
        super(apellido, nombre, cuit, telefono,dia,mes);
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }
    public Double bonoCumple(){
        return 0.00;
    }
}
