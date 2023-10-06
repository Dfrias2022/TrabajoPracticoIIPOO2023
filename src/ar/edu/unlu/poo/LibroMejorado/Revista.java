package ar.edu.unlu.poo.LibroMejorado;

public class Revista extends Publicacion{
    private String ISSN;
    private int año;
    private int numero;

    public Revista(String nombre, String editor, String telefono,String ISSN, int año, int numero) {
        super(nombre, editor, telefono);
        this.ISSN = ISSN;
        this.año = año;
        this.numero = numero;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
