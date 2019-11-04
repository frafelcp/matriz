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
        int contP = 0;
        
        //cantidad de filas
        System.out.println("Ingrese cuantas filas requiere");
        filas = entrada.nextInt();
        
        System.out.println("---------------------------------");
        
        //cantidad de columnas
        System.out.println("Ingrese cuantas columnas requiere");
        columnas = entrada.nextInt();
        
        //inicializacion de vector y matrices
        numeros = new int[filas][columnas];;
        
        System.out.println("---------------------------------");
        
        //llenar matriz
        System.out.println("Entrada de datos en la matriz");
        for (int i = 0; i < filas; i++) {            
            for (int j = 0; j < columnas; j++) {
                System.out.println("Matriz[" + i + "][" + j +"]:");
                numeros[i][j] = entrada.nextInt();
                
                //comprobamos que cada elemento sea mayor a 0
                if (numeros[i][j] > 0) {
                    contP++;
                }
            }
        }
        
        System.out.println("---------------------------------");
        
        //imprimir matriz completa
        System.out.println("La matrix completa es: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("---------------------------------");
        
        //imprimir cols
        System.out.println("La columnas son: ");
        for (int i = 0; i < columnas; i++) {
            System.out.println(numeros[i][1]);
        }
        
        System.out.println("---------------------------------");
        
        //imprimir cuantos numeros positivos
        if (contP == 0) {
            System.out.println("No hay numeros positivos en la matriz");
        } else {
            System.out.println("Los numeros positivos son " + contP);
        }
    }
}
