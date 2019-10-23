/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixes;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ma {
    public static void main(String[] args) {
        //por teclado y consola
        Scanner entrada = new Scanner(System.in);
        
        //definicion de variables y matriz
        int [][] numeros;
        int filas;
        int columnas;
        
        //cantidad de filas
        System.out.println("Ingrese cuantas filas requiere");
        filas = entrada.nextInt();
        
        System.out.println();
        
        //cantidad de columnas
        System.out.println("Ingrese cuantas columnas requiere");
        columnas = entrada.nextInt();
        
        //inicializacion de vector
        numeros = new int[filas][columnas];
        
        System.out.println();
        
        //llenar matriz
        System.out.println("Entrada de datos en la matriz");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Fila: " + i);
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println();
        
        //imprimir un dato de una matriz
        System.out.println("En la 2 fila y 4 columna esta almacenado "
                + "el valor:" + numeros[0][1]);
        
        System.out.println();
        
        //imprimir los datos de toda una fila
        System.out.println("Los valores de la segunda fila son:");
        for (int i = 0; i < numeros[1].length; i++) {
            System.out.printf("%3d ", numeros[1][i]);
        }
        
        System.out.println();
        
        //imprimir los datos de toda una columna
        System.out.println("Los valores de la segunda columna son:");
        for (int i = 0; i < numeros[1].length; i++) {
            System.out.println(numeros[i][1]);
        }
        
        System.out.println();
        
        //imprimimos toda la matriz
        System.out.println("Los valores de toda la matriz son:");
        for (int r = 0; r < numeros.length; r++) {
            for (int j = 0; j < numeros[r].length; j++) {
//                System.out.print(numeros[r][j] + " ");
                  System.out.printf("%3d ", numeros[r][j]);
            }
        }
        
        System.out.println();
    }
}
