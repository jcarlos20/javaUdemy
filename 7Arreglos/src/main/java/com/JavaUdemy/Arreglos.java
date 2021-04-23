package com.JavaUdemy;

import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
//        exerciseOne();
//        exerciseTwo();
//        exerciseThree();
        exerciseFour();
    }

    public static void exerciseOne(){
        int edades [];
        edades = new int[3];
        edades[0] = 30;
        edades[1] = 15;

        System.out.println("Arreglo indice 0: " + edades[0]);
        System.out.println("Arreglo indice 1: " + edades[1]);
        System.out.println("Arreglo: " + edades.toString());

        String nombres[] = {"Sara", "Laura", "Carlos", "Carmen"};
        for (int i = 0; i < nombres.length; i ++){
            System.out.println("Nombre: " + nombres[i]);
        }
        System.out.println("Arreglo: " + Arrays.toString(nombres));
    }

    public static void exerciseTwo(){
        //        1. Declaramos una variable de tipo arreglo, un arrego de int
        int edades[];
//        2. Instanciar el arreglo de int
        edades = new int[3];
//        3. Inicializar los valores de los elementos del arreglo
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

//        4. Imprimir los valores del arreglo
        System.out.println("Arreglo enteros indice 0: " + edades[0]);
        System.out.println("Arreglo enteros indice 1: " + edades[1]);
        System.out.println("Arreglo enteros indice 2: " + edades[2]);
    }

    public static void exerciseThree(){
        Persona personas[] = new Persona[4];
        personas[0] = new Persona("Juan");
        personas[2] = new Persona("Karla");
        System.out.println(Arrays.toString(personas));
    }

    public static void exerciseFour(){
        String nombres[] = {"Sara", "Laura", "Carlos", "Carmen"};
        for (int i = 0; i < nombres.length; i++){
            System.out.println("Arreglo String indice: " + i + " nombre: " + nombres[i]);
        }
    }
}
