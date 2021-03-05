package laboratorio.pkg2;

import java.util.Scanner;

public class Operaciones {

    double media = 0.0;
    double desviacion = 0.0;
    double varianza = 0.0;

    public void CrearArreglo(int tamaño) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Porfavor Ingrese el tamaño del arreglo: ");
        tamaño = teclado.nextInt();
        int array[] = new int[tamaño];
        for (int x = 0; x < array.length; x++) {
            array[x] = (int) (Math.random() * 20) + 1;
            System.out.println(array[x]);
        }
    }

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
    
    public void BubbleSort(int[] array) {
        long startTime;
        long endTime;
        long tiempo;
        startTime = System.currentTimeMillis();
        for (int cont1 = 0; cont1 < array.length; cont1++) {
            for (int cont2 = 0; cont2 < array.length; cont2++) {
                if ((cont2 + 1) < array.length) {
                    if (array[cont2] > array[cont2 + 1]) {
                        int t = array[cont2];
                        array[cont2] = array[cont2 + 1];
                        array[cont2 + 1] = t;
                    }
                }
            }
            ArregloaOrdenar(array);
        }
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        System.out.println("El tiempo que tarde en ejecutar el algoritmo de BubbleSort fue de: " + tiempo + " milisegundo(s)");
    }
}
