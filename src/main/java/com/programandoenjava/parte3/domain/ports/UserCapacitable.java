package com.programandoenjava.parte3.domain.ports;

import com.programandoenjava.parte3.domain.entities.Libro;

public interface UserCapacitable {
    void tomarPrestadoLibro(Libro libro);
    void devolverLibro(Libro libro);
}
