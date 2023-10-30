package ar.edu.unlu.poo.sunBeachFinal;

public class PaqueteTuristico {
    private ProveedorTransporte transporte;
    private ProveedorGuia guia;
    private ProveedorHospedaje hospedaje;
    private Double costo;
    private String destino;

    public PaqueteTuristico(ProveedorTransporte transporte,ProveedorGuia guia,ProveedorHospedaje hospedaje,String destino){
        this.transporte = transporte;
        this.guia = guia;
        this.hospedaje = hospedaje;
        this.costo = 0.00;
        this.destino = destino;
    }

    public ProveedorTransporte getTransporte() {
        return transporte;
    }

    public void setTransporte(ProveedorTransporte transporte) {
        this.transporte = transporte;
    }

    public ProveedorGuia getGuia() {
        return guia;
    }

    public void setGuia(ProveedorGuia guia) {
        this.guia = guia;
    }

    public ProveedorHospedaje getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(ProveedorHospedaje hospedaje) {
        this.hospedaje = hospedaje;
    }

    public Double getCosto() {
        return costo;
    }

    public void calcularCosto(){
        this.costo = transporte.getImporteBase() + guia.getImporteBase() +hospedaje.getImporteBase();
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
