package com.company;
import sun.java2d.pipe.SpanShapeRenderer;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.math.*;
import java.text.SimpleDateFormat;

public class Main {

//    static void isPrime(int number){
//        int m = number / 2;
//
//    }

    static void fillAxes(int[][] myArray){
        int numero = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i][0] = numero;
            numero = numero + 1;
        }
        numero = 0;
        for (int j = 0; j < myArray[0].length; j++) {
            myArray[0][j] = numero;
            numero++;
        }
    }

    static void printMatriz(int[][] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.printf("% 3d ",myArray[i][j]);
            }
            System.out.print("\n");
        }
    }

    static void cargarMatriz(int[][] myArray) {
        int numero, contador = 0;
        int i, j;
        for (i = 2; i < myArray.length; i++) {
            numero = i;
            for (j = 2; j < myArray[i].length; j++) {
                while ((numero % j == 0) && (numero != 1)) {
                    contador++;
                    numero = numero / j;
                }
                myArray[i][j] = contador;
                contador = 0;
            }
        }
    }


    public static void main(String[] args) {
        int rows= 101;
        int col = 101;
        int[][] miMatriz = new int[rows][col];
        fillAxes(miMatriz);
        cargarMatriz(miMatriz);
        printMatriz(miMatriz);
    }

}


