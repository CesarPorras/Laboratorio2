/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg2;

import java.util.Scanner;

/**
 *
 * @author cfpor
 */
public class CreacionArreglos {
    int tamaño;
    public CreacionArreglos(){}

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public void CrearArreglo() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Porfavor Ingrese el tamaño del arreglo: ");
        tamaño = teclado.nextInt();
        int array[] = new int[tamaño];
        for (int x = 0; x < array.length; x++) {
            array[x] = (int) (Math.random() * 20) + 1;
            System.out.println(array[x]);
        }
    }
    
    public void CrearArregloDoble() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Porfavor Ingrese el tamaño del arreglo: ");
        tamaño = teclado.nextInt();
        double arreglo[] = new double[tamaño];
        for (int x = 0; x < arreglo.length; x++) {
            arreglo[x] = (double) (Math.random() * 20) + 1;
            System.out.println(arreglo[x]);
        }
    }
}