package com.programandoenjava;

import com.programandoenjava.parte3.domain.Biblioteca;
import com.programandoenjava.parte3.domain.Persona;
import com.programandoenjava.parte3.domain.entities.Libro;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro(1, "Libro Uno", "Diego Dm", 1995));
        biblioteca.agregarLibro(new Libro(2, "Libro Dos", "Diego Rm", 1996));
        biblioteca.agregarLibro(new Libro(3, "Libro Tres", "Diego Zn", 1997));
        biblioteca.agregarLibro(new Libro(4, "Libro Cuatro", "Diego Tm", 1998));

        Persona persona = new Persona(100, "Juana", 25);
        Libro libroEncontrar =  biblioteca.buscarLibroPorId(4);

        persona.tomarPrestadoLibro(libroEncontrar);
        System.out.println("Pasa un tiempo de prestamo....");
        persona.devolverLibro(libroEncontrar);

    }
}