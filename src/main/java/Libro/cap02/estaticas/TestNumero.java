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
public class TestNumero 
{
    public static void main(String[] args)
    {
        // sumamos utilizando el metodo estatico
        double d = Numero.sumar(2,3);
        System.out.println(d);
        // definimos un numero con valor 5 y luego
        // sumamos 4 con el metodo sumar de instancia
        Numero n1 = new Numero(5);
        n1.sumar(4);
        System.out.println(n1);
        // sumamos concatenando invocaciones al metodo sumar
        n1.sumar(4).sumar(6).sumar(8).sumar(1);
        System.out.println(n1);
    }
}
