package com.programandoenjava.parte2;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementa en Java que tenga un método
 * para agregar números enteros y otro método para calcular
 * la suma de todos los elementos en la lista.
 */
public class Parte2 {

    private List<Integer> list;

    public Parte2(){
        this.list = new ArrayList<>();
    }

    /**
     * Calcula la suma de todos los números enteros.
     *
     * @return La suma de los números enteros.
     */
    public int sumarNumeros() {
        var sumaTotal = list.stream().reduce(0, (a, b) -> Integer.sum(a, b));
        return sumaTotal;
    }

    /**
     * Agrega un número entero a la lista.
     *
     * @param numero El número entero que se va a agregar.
     */
    public void agregarNumero(int numero) {
        list.add(numero);
    }

}
