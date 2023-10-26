package ar.edu.unlu.poo.Vuelos;

import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private List<Persona> listaPasajeros;

    public Vuelo(){
        this.listaPasajeros = new ArrayList<>();
    }

    public void agregarPasajero(Persona persona){
        listaPasajeros.add(persona);
    }

    public List<Persona> getListaPasajeros() {
        return listaPasajeros;
    }
}
