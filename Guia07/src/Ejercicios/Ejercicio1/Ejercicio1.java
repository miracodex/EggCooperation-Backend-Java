package Ejercicios.Ejercicio1;

import Ejercicios.Ejercicio1.Entidades.Libro;

public class Ejercicio1 {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        
        libro1.cargarLibro();
        libro1.mostrarInfo();
        
        System.out.println(libro1.toString());
    }

}
