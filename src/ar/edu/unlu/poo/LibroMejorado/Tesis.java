package ar.edu.unlu.poo.LibroMejorado;

import java.time.LocalDate;

public class Tesis extends Publicacion{
    private String autor;
    private LocalDate anioMesPublicacion;
    public Tesis(String nombre, String editor, String telefono,String autor,LocalDate anioMesPublicacion) {
        super(nombre, editor, telefono);
        this.autor = autor;
        this.anioMesPublicacion = anioMesPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getAnioMesPublicacion() {
        return anioMesPublicacion;
    }

    public void setAnioMesPublicacion(LocalDate anioMesPublicacion) {
        this.anioMesPublicacion = anioMesPublicacion;
    }
}
