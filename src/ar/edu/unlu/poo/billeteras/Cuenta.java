package ar.edu.unlu.poo.billeteras;

import java.time.LocalDate;

public abstract class Cuenta {
    private double saldo;
    private double limiteGiroDescubierto;
    private double giroDescubierto;
    private double saldoInvertido;
    private final double INTERES_POR_INVERSION = 0.05;
    private LocalDate fechaInversion;

    public Cuenta(double saldo,double limiteGiroDescubierto){
        this.saldo = saldo;
        this.limiteGiroDescubierto = limiteGiroDescubierto;
        this.giroDescubierto = 0;
        this.saldoInvertido = 0;
        this.fechaInversion = null;
    }
    public abstract boolean gastar();

    public void depositar(double monto){
        this.saldo = saldo + monto;
    }
    public boolean invertir(double monto){
        this.saldoInvertido = monto;
        return true;
    }
    public boolean recuperarInversion(){
        return true;
    }

    public double getSaldoInvertido() {
        return saldoInvertido;
    }
    public double getInteresAGanar(){
        double total = 0;
        return total;
    }

}
