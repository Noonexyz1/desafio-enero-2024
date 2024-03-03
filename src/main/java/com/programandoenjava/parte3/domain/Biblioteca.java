package com.programandoenjava.parte3.domain;

import com.programandoenjava.parte3.domain.entities.Libro;
import com.programandoenjava.parte3.domain.ports.BibliotecaGestionable;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements BibliotecaGestionable {
    private List<Libro> libros = new ArrayList<>();

    @Override
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    @Override
    public Libro buscarLibroPorId(int id) {
        return libros.stream().filter(lib -> lib.getId() == id).findFirst().orElse(new Libro());
    }

}
