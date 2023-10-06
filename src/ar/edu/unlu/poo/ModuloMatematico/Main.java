package ar.edu.unlu.poo.ModuloMatematico;

public class Main {

    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado(4);
        Cubo c2 = new Cubo(5);
        System.out.printf("area del cuadrado %.2f\n",c1.getArea());
        System.out.printf("volumen del cubo %.2f\n",c2.getVolumen());
    }
}
