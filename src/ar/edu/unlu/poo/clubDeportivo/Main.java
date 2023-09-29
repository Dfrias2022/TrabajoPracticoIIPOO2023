package ar.edu.unlu.poo.clubDeportivo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Socio> listaSocios = new ArrayList<>();
        SuscripcionBasica sb = new SuscripcionBasica(350.99,"3 meses");
        SuscripcionIntermedia sb2 = new SuscripcionIntermedia(650.99,"6 meses");
        SuscripcionDestacada sb3 =new SuscripcionDestacada(1500.00,"12 meses");
        Socio n1 = new Socio(01,"Ariel","Frias","example@example.com","algo432",1558582122,sb);
        listaSocios.add(n1);
        System.out.println(sb.mostrarActividades());
        System.out.println(sb2.mostrarActividades());
        System.out.println(sb3.mostrarActividades());
    }
}
