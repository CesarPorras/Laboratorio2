/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg2;

/**
 *
 * @author cfpor
 */
public class Ejercicio4 {
    private String nombre;
    private double cedula;
    private int edad;
    
    public Ejercicio4 (){
        
    }

    public Ejercicio4(String n, double c, int e) {
        nombre = n;
        cedula = c;
        edad = e;

    }
    public String getnombre() {
        return nombre;

    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public double getcedula() {
        return cedula;
    }

    public void setcedula(double cedula) {
        this.cedula = cedula;
    }
    public int getedad() {
        return edad;

    }

    public void setedad(int edad) {
        this.edad = edad;
    }
}
