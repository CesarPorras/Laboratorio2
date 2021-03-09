/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg2;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author cfpor
 */
public class CreacionArreglos {

    int tamaño;
    int array[] = new int[tamaño];
    double arreglo[] = new double[tamaño];

    public int[] CrearArregloInt(int tamaño) {
        
        for (int x = 0; x < array.length; x++) {
            array[x] = (int) (Math.random() * 20) + 1;

        }
        return array;
    }

    public double[] CrearArregloDoble(int tamaño) {

        
        for (int x = 0; x < arreglo.length; x++) {
            arreglo[x] = (double) (Math.random() * 20) + 1;
        }
        return arreglo;
    }
}
