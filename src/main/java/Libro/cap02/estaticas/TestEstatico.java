/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.estaticas;

/**
 *
 * @author Jonathan AL
 */
public final class TestEstatico 
{
    private int a = 0;
    
    public void unMetodo()
    {
        System.out.println("este es unMetodo()");
    }
    
    /* MANERA INCORRECTA
    public static void main(String[] args)
    {
        // no tengo acceso a la variable a
        System.out.println("a vale " + a); // ERROR... NO COMPILA

        // no tengo acceso al metodo unMetodo
        unMetodo(); // ERROR... NO COMPILA
    }
    */
    
    public static void main(String[] args)
    {
        TestEstatico t = new TestEstatico();
        System.out.println("A vale " + t.a); // accedo a la variable a
        t.unMetodo(); // accedo al metodo unMetodo
    }
}
