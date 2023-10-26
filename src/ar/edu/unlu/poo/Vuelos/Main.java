package ar.edu.unlu.poo.Vuelos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pasajero p1 = new Pasajero("diego1","1111","algo",1);
        Pasajero p2 = new Pasajero("diego2","2222","algo",2);
        Pasajero p3 = new Pasajero("diego3","3333","algo",3);
        Tripulante t1 =new Tripulante("alfonso1","6666","algomaximo","piloto");
        Tripulante t2 =new Tripulante("alfonso2","6666","algomaximo","co-piloto");
        Vuelo v1 = new Vuelo();
        ReciboSueldo r1 = new ReciboSueldo(t1,50000, LocalDate.now());
        ReciboSueldo r2 = new ReciboSueldo(t2,50000, LocalDate.now());
        Ticket tk1 = new Ticket(v1,p1);
        Ticket tk2 = new Ticket(v1,p2);
        Ticket tk3 = new Ticket(v1,p3);
        //aqui se presenta el problema, no puedo generar un ticket de vuelo para un tripulante, por lo que
        //tendria que generar una instancia de pasajero con los datos del tripulante.
        v1.agregarPasajero(p1);
        v1.agregarPasajero(p2);
        v1.agregarPasajero(p3);
        v1.agregarPasajero(t1);
        v1.agregarPasajero(t2);
        //Muestro el vuelo
        for (Persona p: v1.getListaPasajeros()){
            if(p instanceof Pasajero){
                System.out.printf("pasajero: %d Nombre: %s\n",((Pasajero) p).getNumeroPasajero(),p.getNombre());
            } else if (p instanceof Tripulante) {
                System.out.printf("tripulante: %s cargo: %s\n",p.getNombre(),((Tripulante) p).getCargo());
            }
        }

    }
}
