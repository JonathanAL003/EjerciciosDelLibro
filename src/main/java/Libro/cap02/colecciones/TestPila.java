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
public class TestPila 
{
    public static void main(String[] args)
    {
        // utilizaremos una pila de Integer
        MiPila<Integer> c = new MiPila<Integer>();
        c.apilar(1);
        c.apilar(2);
        c.apilar(3);

        System.out.println(c.desapilar()); // saca el 3
        System.out.println(c.desapilar()); // saca el 2
        c.apilar(4);

        System.out.println(c.desapilar()); // saca el 4
        System.out.println(c.desapilar()); // saca el 1
    }
}
