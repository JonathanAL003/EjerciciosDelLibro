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
public class DemoArray 
{
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor (0=>fin): ");
        int v = scanner.nextInt();
        int i=0;

        while( v!=0 && i<10 )
        {
            arr[i++] = v;
            System.out.println("Ingrese el siguiente valor (0=>fin): ");
            v = scanner.nextInt();
        }
        for( int j=0; j<i; j++ )
        {
            System.out.println(arr[j]);
        }
    }
}
