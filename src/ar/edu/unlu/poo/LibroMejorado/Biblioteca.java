package ar.edu.unlu.poo.LibroMejorado;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Socio> listaSocios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.listaSocios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public int prestamosTotales() {
        int total = 0;
       // for(Socio s:listaSocios){
      //      total = total + (s.getEjemplaresTotales() - s.getEjemplaresDisponibles());
      //  }
        return total;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }
}