package com.programandoenjava.parte3.domain.ports;

import com.programandoenjava.parte3.domain.entities.Libro;

public interface BibliotecaGestionable {
    void agregarLibro(Libro libro);
    Libro buscarLibroPorId(int id);
}
