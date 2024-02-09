package com.programandoenjava.parte1;

public class Parte1 {

    /**
     * Escribe un programa en Java que reciba una cadena de texto y devuelva la
     * misma cadena pero con cada palabra invertida. Por ejemplo, para la entrada "Hola Mundo",
     * la salida debería ser "aloH odluM".
     * @param cadena cadena de entrada
     * @return cadena invertida
     */
    public String invertirPalabras(final String cadena) {
        //Tomar en cuenta que java utiliza el standar UTF-16 por defecto
        //https://agostudio.es/tabla-unicode/ lo caque para los numeros
        if (cadena == null) {
            return "";
        }
        char[] caracteres = cadena.toCharArray();
        String formador = "";
        String word = "";
        for(char letra: caracteres){
            if (64 < (int) letra && (int) letra < 256 && (int) letra != 161) {
                word = letra + word;
            } else {
                formador = formador + word;
                word = "";
                formador = formador + letra;
            }
        }
        formador = formador + word;
        return formador;
    }

}
