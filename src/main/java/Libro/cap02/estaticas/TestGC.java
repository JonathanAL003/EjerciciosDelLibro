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
public class TestGC 
{
    private static int cont = 0;
    public TestGC()
    {
        cont++;
        System.out.println(cont);
    }
    
    public void finalize()
    {
        cont--;
    }
    
    public static void main(String args[])
    {
        while( true )
        {
            new TestGC();
        }
    }
}
