package com.programandoenjava.parte3.domain;

import com.programandoenjava.parte3.domain.entities.Libro;
import com.programandoenjava.parte3.domain.ports.UserCapacitable;

public class Persona implements UserCapacitable {
    private int id;
    private String nombre;
    private int edad;

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(){

    }

    @Override
    public void tomarPrestadoLibro(Libro libro) {
        System.out.println(libro.toString());
    }
    @Override
    public void devolverLibro(Libro libro) {
        System.out.println(libro.toString());
    }

}
