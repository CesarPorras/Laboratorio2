package laboratorio.pkg2;

import java.util.Scanner;

public class Operaciones {

    double media;
    double desviacion;
    double varianza;

    /*public Operaciones(){}      

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(double desviacion) {
        this.desviacion = desviacion;
    }

    public double getVarianza() {
        return varianza;
    }

    public void setVarianza(double varianza) {
        this.varianza = varianza;
    }*/
  
    CreacionArreglos ArregloInt = new CreacionArreglos();
    public void media(int[] array) {
        double suma = 0.0;

        for (int x = 0; x < array.length; x++) {
            suma = suma + array[x];
        }
        media = (suma / array.length);

        System.out.println("La media aritmetica del vector es: " + media);

    }

    public void Varianza(int[] array) {

        for (int i = 0; i < array.length; i++) {
            double rango;
            rango = Math.pow(array[i] - media, 2f);
            varianza = varianza + rango;
        }
        varianza = varianza / array.length;

        System.out.println("La Varianza del vector es: " + varianza);

    }

    public void Desviacion(int[] array) {
        {
            desviacion = Math.sqrt(varianza);
            System.out.println("La Desviacion Estandar del vector es: " + desviacion);
        }
    }
    
    public void ArregloaOrdenar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
    
   
}
