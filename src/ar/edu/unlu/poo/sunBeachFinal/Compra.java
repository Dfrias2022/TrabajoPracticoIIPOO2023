package ar.edu.unlu.poo.sunBeachFinal;

import java.time.LocalDate;

public class Compra {
    private Cliente cliente;
    private PaqueteTuristico paquete;
    private Boolean pagado;
    private LocalDate fecha;

    public Compra(Cliente cliente,PaqueteTuristico paquete,Boolean pagado,LocalDate fecha){
        this.cliente = cliente;
        this.paquete = paquete;
        this.pagado = pagado;
        this.fecha = LocalDate.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public PaqueteTuristico getPaquete() {
        return paquete;
    }

    public Boolean isPagado() {
        return pagado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }
}
