/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.interfaces.criterios;

/**
 *
 * @author Jonathan AL
 */
public abstract class Criterio<T> 
{
    public abstract int comparar(T a, T b);
}
