package ar.edu.unlu.poo.billeteras;

public class CuentaCredito extends Cuenta{
    private double limite;
    private double algo;
    private double list;

    public CuentaCredito(double saldo, double limiteGiroDescubierto) {
        super(saldo, limiteGiroDescubierto);
    }

    @Override
    public boolean gastar() {
        return false;
    };

}
