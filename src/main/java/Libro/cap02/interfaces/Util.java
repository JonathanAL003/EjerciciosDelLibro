/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.interfaces;

/**
 *
 * @author Jonathan AL
 */
public class Util 
{
    public static void ordenar(Comparable arr[])
    {
        boolean ordenado = false;
        while( !ordenado )
        {
            ordenado = true;
            for(int i = 0; i<arr.length-1; i++)
            {
                if(arr[i+1].compareTo(arr[i])<0)
                {
                    Comparable aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;
                }
            }
        }
    }
}
