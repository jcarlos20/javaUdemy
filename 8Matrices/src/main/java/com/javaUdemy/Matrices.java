package com.javaUdemy;

import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
//        exerciseOne();
//        exerciseTwo();
        exerciseThree();
    }

    public static void exerciseOne(){
        int edades [][];
        edades = new int[3][2];
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        System.out.println(Arrays.toString(edades));
        System.out.println(edades[0][0]);
    }

    public static void exerciseTwo(){
        String nombres [][] = {
                {"Teresa", "Cesar", "William"},
                {"Yesenia", "Esteban", "Maria"}
        };
        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j ++){
                System.out.println("Matriz " + i + " - " + j + " :"+ nombres[i][j]);
            }
        }
    }

    public static void exerciseThree(){
        Persona personas [][] = new Persona[2][2];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[1][1] = new Persona("Alberto");
        System.out.println("Matriz indice 0 - 0: " + personas[0][0]);

        for(int i = 0; i < personas.length; i ++){
            for(int j = 0; j < personas[i].length; j ++){
                System.out.println(personas[i][j]);
            }
        }

    }
}
