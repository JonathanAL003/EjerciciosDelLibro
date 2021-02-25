/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.misclases;

import Libro.cap02.fechas.Fecha;
/**
 *
 * @author Jonathan AL
 */
public class FechaDetallada extends Fecha
{
    private static String meses[]=
    {
        "Enero"
        ,"Febrero"
        ,"Marzo"
        ,"Abril"
        ,"Mayo"
        ,"Junio"
        ,"Julio"
        ,"Agosto"
        ,"Septiembre"
        ,"Octubre"
        ,"Noviembre"
        ,"Diciembre"
    };
    
    public FechaDetallada(int dia, int mes, int anio)
    {
        // invocamos al constructor del padre
        super(dia,mes,anio);
    }
    
    public FechaDetallada(String s)
    {
        // invocamos al constructor del padre
        super(s);
    }
    
    public FechaDetallada()
    {
        // invocamos al constructor de tres int pasando ceros
        this(0,0,0);
    }
    
    public String toString()
    {
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
    }
}
