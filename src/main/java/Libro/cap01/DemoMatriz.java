/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;

import java.util.Scanner;
/**
 *
 * @author Jonathan AL
 */
public class DemoMatriz 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas: ");
        int n=scanner.nextInt();

        System.out.println("Ingrese la cantidad de columnas: ");
        int m=scanner.nextInt();

        int mat[][]=new int[n][m];
        int nro;
        for(int i=0; i<n; i++ )
        {
            for(int j=0; j<m; j++)
            {
            // Generador de numero aleatorio 0-1000
            nro=(int)(Math.random()*1000);

            mat[i][j]=nro;
            }
        }
        for(int i=0; i<n; i++ )
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
