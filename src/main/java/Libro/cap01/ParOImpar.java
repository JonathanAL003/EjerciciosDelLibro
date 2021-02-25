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
public class ParOImpar {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int v = scanner.nextInt();

        int resto = v % 2;
        
        if( resto == 0 )
        {
            System.out.println(v+" es un numero par");
        }
        else
        {
            System.out.println(v+" es un numero impar");
        }
    }
    
}
