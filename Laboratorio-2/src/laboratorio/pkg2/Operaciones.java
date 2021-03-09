package laboratorio.pkg2;

import java.util.Scanner;

public class Operaciones {

    double media;
    double desviacion;
    double varianza;

    
  
    CreacionArreglos ArregloInt = new CreacionArreglos();
    public double media(int[] array) {
        double suma = 0.0;

        for (int x = 0; x < array.length; x++) {
            suma = suma + array[x];
        }
        media = (suma / array.length);       
        return media;
    }

    public double Varianza(int[] array) {

        for (int i = 0; i < array.length; i++) {
            double rango;
            rango = Math.pow(array[i] - media, 2f);
            varianza = varianza + rango;
        }
        varianza = varianza / array.length;       
        return varianza;
    }

    public double Desviacion(int[] array) {
        {
            desviacion = Math.sqrt(varianza);
            System.out.println("La Desviacion Estandar del vector es: " + desviacion);
        }
        return desviacion;
    } 
    
   
}
