package ar.edu.unlu.poo.LibroMejorado;

import java.util.ArrayList;
import java.util.List;

public class Libro extends Publicacion {
    private int isbn;
    private List<Autor> autor;
    private int año;
    private int paginas;
    private int ejemplaresTotales;
    private int ejemplaresDisponibles;

    public Libro(String nombre, String editor, String telefono, int isbn,int año) {
        super(nombre, editor, telefono);
        autor = new ArrayList<>();
        this.isbn = isbn;
        this.año = año;
    }

    public void prestar() {
        if (this.ejemplaresDisponibles > 1) {
            this.ejemplaresDisponibles--;
            System.out.printf("prestamo de \"%s\" realizado.\n", super.getNombre());
        } else {
            System.out.printf("No se puede realizar el prestamos de \"%s\", queda un ejemplar.\n", super.getNombre());
        }
    }

    public void devolver() {
        if (this.ejemplaresDisponibles < this.ejemplaresTotales) {
            this.ejemplaresDisponibles++;
            System.out.println("Devolucion realizada!\n");
        } else {
            System.out.println("No se puede aceptar la devolucion, todos los ejemplares fueron devueltos\n");
        }

    }

    public String getDescripcion() {
        return "El libro " + super.getNombre() + " creado por el autor " + this.autor + " tiene " + this.paginas + " páginas, quedan " + this.ejemplaresDisponibles + " disponibles y se prestaron " + (this.ejemplaresTotales - this.ejemplaresDisponibles) + ".\n";
    }
}