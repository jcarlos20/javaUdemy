/*
Derechos reservados 2021
 */

package com.JavaUdemy;

/**
 * Clase para probar el concepto de JavaDoc
 * @author Juan Carlos Torres
 * @version 1.0
 */
public class PruebaJavaDoc {

    /**
     * Metodo que ejecuta la prueba de la clase Aritmetica
     * @param args es un arreglo de tipo String de la inea de comandos
     */
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica(3, 2);
        int resultado = aritmetica1.sumar();
        System.out.println("Resulltado: " + resultado);

    }
}
