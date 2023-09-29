package ar.edu.unlu.poo.academiaDanza;

public class Arancel {
    private double importe;
    private String fecha;
    public Arancel(double importe,String fecha){
        this.importe = importe;
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
