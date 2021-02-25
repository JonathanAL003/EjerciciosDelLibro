/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.excepciones;

/**
 *
 * @author Jonathan AL
 */
public class Demo1 
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Hola, chau !");
            return;
        }
        catch(Exception ex)
        {
            System.out.println("Entre al catch...");
        }
        finally
        {
            System.out.println("Esto sale siempre !");
        }
    }
}
