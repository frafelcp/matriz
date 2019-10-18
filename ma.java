/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixes;

/**
 *
 * @author ADMIN
 */
public class ma {
    public static void main(String[] args) {
        //definicion y inicializacion de una matrix
        int [][] matriz = {{1, 4, 2, 3}, {3, 1, 4, 2}, {2, 3, 1, 4}, {4, 3, 2, 1}};
        
        //imprimir un dato de una matriz
        System.out.println("En la 2 fila y 4 columna esta almacenado "
                + "el valor:" + matriz[1][3]);
        
        System.out.println();
        
        //imprimir los datos de toda una fila
        System.out.println("Los valores de la segunda fila son:");
        for (int i = 0; i < matriz[1].length; i++) {
            System.out.printf("%3d ", matriz[1][i]);
        }
        
        System.out.println();
        
        //imprimir los datos de toda una columna
        System.out.println("Los valores de la segunda columna son:");
        for (int i = 0; i < matriz[1].length; i++) {
            System.out.println(matriz[i][1]);
        }
        
        System.out.println();
        
        //imprimimos toda la matriz
        System.out.println("Los valores de toda la matriz son:");
        for (int r = 0; r < matriz.length; r++) {
            for (int j = 0; j < matriz[r].length; j++) {
                System.out.printf("%3d ", matriz[r][j]);
            }
            System.out.println();
        }
    }
}
