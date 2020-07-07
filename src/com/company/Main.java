package com.company;
import sun.java2d.pipe.SpanShapeRenderer;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import java.math.*;
import java.text.SimpleDateFormat;

public class Main {

    static void fillMatriz(int[][] myArray, int rows, int col){
        int numero = 0;
        for (int i = 0; i < rows; i++) {
            myArray[i][0] = numero;
            numero = numero + 1;
        }
        numero = 0;
        for (int j = 0; j < col; j++) {
            myArray[0][j] = numero;
            numero++;
        }
    }

    static void printMatriz(int[][] myArray, int rows, int col) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    static void cargarMatriz(int[][] myArray, int rows, int col) {
        int numero, contador = 0;
        int i, j;
        for (i = 2; i < rows; i++) {
            numero = i;
            for (j = 2; j < col; j++) {
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
        fillMatriz(miMatriz, rows, col);
        cargarMatriz(miMatriz, rows, col);
        printMatriz(miMatriz, rows, col);
    }

}


