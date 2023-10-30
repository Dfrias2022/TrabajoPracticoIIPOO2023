package ar.edu.unlu.poo.EstacionServicio;

public class Expendedor {
    private int codigo;
    private Combustible combustible;
    private int cantidadLitros;

    public Expendedor(int codigo,Combustible combustible ,int cantidadLitros){
        this.codigo = codigo;
        this.combustible = combustible;
        this.cantidadLitros = cantidadLitros;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadLitros() {
        return cantidadLitros;
    }

    public void setCantidadLitros(int cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
}
