/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.figuras;

/**
 *
 * @author Jonathan AL
 */
public abstract class FiguraGeometrica 
{
    private String nombre;
    // metodo abstracto
    public abstract double area();
    // agregamos un contructor
    public FiguraGeometrica(String nom)
    {
        nombre = nom;
    }
    
    public static double areaPromedio(FiguraGeometrica arr[])
    {
        int sum=0;
        for( int i=0; i<arr.length; i++ )
        {
            sum += arr[i].area();
        }
        return sum/arr.length;
    }
    
    // ahora en el toString muestro tambien el nombre
    public String toString()
    {
        return nombre +" (area = "+ area()+") ";
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
