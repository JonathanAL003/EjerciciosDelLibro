/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.instancias;

import Libro.cap02.fechas.Fecha;
import Libro.cap02.misclases.FechaDetallada;
/**
 *
 * @author Jonathan AL
 */
public class Persona 
{
    private String nombre;
    private String dni;
    private Fecha fechaNacimiento;
    private int cont = 0;
    
    public Persona(String nombre, String dni, Fecha fecNac)
    {
        this.nombre = nombre; this.dni = dni; this.fechaNacimiento = fecNac;
    }
    
    public String toString()
    {
        cont++;
        return nombre + ", DNI: " + dni
        + ", nacido el: " + fechaNacimiento
        + " (" + cont + ")";
    }
}
