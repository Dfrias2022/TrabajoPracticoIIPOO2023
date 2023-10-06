package ar.edu.unlu.poo.Empresa;

public class Main {
    public static void main(String[] args) {
    EmpleadoFullTime eF = new EmpleadoFullTime("perez","pepe","2012223278","1558582122",2000,4,8);
    EmpleadoComision eC = new EmpleadoComision("perez","pepe","2012223278","1558582122",10,5,6,10);
    EmpleadoComisionBase eCB = new EmpleadoComisionBase("perez","pepe","2012223278","1558582122",12,5,5000,6,10);
    EmpleadoPorHora eH = new EmpleadoPorHora("perez","pepe","2012223278","1558582122",1500,8,6,10);
    Pasante p = new Pasante("perez","pepe","2012223278","1558582122",6,10);

    System.out.printf("Salario empleado FullTime %.2f\n",eF.calcularSueldo());
    System.out.printf("Salario empleado por Comision %.2f\n",eC.calcularSueldo());
    System.out.printf("Salario empleado por comision Base %.2f\n",eCB.calcularSueldo());
    System.out.printf("Salario empleado Por Hora %.2f\n",eH.calcularSueldo());
    System.out.printf("Salario pasante %.2f\n",p.calcularSueldo());

    }
}
