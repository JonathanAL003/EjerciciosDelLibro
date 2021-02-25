/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.colecciones;

/**
 *
 * @author Jonathan AL
 */
public class TestCola 
{
    public static void main(String[] args)
    {
        MiCola<Integer> c = new MiCola<Integer>();
        c.encolar(1);
        c.encolar(2);
        c.encolar(3);
        System.out.println(c.desencolar()); // saca el 1
        System.out.println(c.desencolar()); // saca el 2
        c.encolar(4);
        System.out.println(c.desencolar()); // saca el 3
        System.out.println(c.desencolar()); // saca el 4
    }
}
