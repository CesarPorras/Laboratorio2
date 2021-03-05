package laboratorio.pkg2;

import java.util.Scanner;

public class MetodosOrdenamiento {    

    public void CrearArregloDoble(int tamaño) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Porfavor Ingrese el tamaño del arreglo: ");
        tamaño = teclado.nextInt();
        double arreglo[] = new double[tamaño];
        for (int x = 0; x < arreglo.length; x++) {
            arreglo[x] = (double) (Math.random() * 20) + 1;
            System.out.println(arreglo[x]);
        }
    }

    public void ArregloaOrdenar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public void Merge(int array[], int l, int m, int r) {
        long startTime;
        long endTime;
        long tiempo;
        startTime = System.currentTimeMillis();

        int num1 = m - l + 1;
        int num2 = r - m;
        int I[] = new int[num1];
        int D[] = new int[num2];
        for (int i = 0; i < num1; ++i) {
            I[i] = array[l + i];
        }
        for (int j = 0; j < num2; ++j) {
            D[j] = array[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < num1 && j < num2) {

            if (I[i] <= D[j]) {
                array[k] = I[i];
                i++;
            } else {
                array[k] = D[j];
                j++;
            }
            k++;
        }
        ArregloaOrdenar(array);
        while (i < num1) {
            array[k] = I[i];
            i++;
            k++;
        }
        ArregloaOrdenar(array);

        while (j < num2) {
            array[k] = D[j];
            j++;
            k++;
        }
        ArregloaOrdenar(array);
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        System.out.println("El tiempo que tarde en ejecutar el algoritmo de MergeSort fue de: " + tiempo + " milisegundo(s)");
    }

    void sort(int array[], int extremoIzquierdo, int extremoDerecho) {

        if (extremoIzquierdo < extremoDerecho) {
            int puntoMedio = (extremoIzquierdo + extremoDerecho) / 2;

            sort(array, extremoIzquierdo, puntoMedio);

            sort(array, puntoMedio + 1, extremoDerecho);

            Merge(array, extremoIzquierdo, puntoMedio, extremoDerecho);
        }

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

    public void BubbleSortPersonas(Ejercicio4[] arreglo) {

        for (int cont1 = 0; cont1 < arreglo.length; cont1++) {
            for (int cont2 = 0; cont2 < arreglo.length; cont2++) {
                if ((cont2 + 1) < arreglo.length) {
                    if (arreglo[cont2].getedad() > arreglo[cont2 + 1].getedad()) {
                        Ejercicio4 tempo = new Ejercicio4();
                        tempo = arreglo[cont2];
                        arreglo[cont2] = arreglo[cont2 + 1];
                        arreglo[cont2 + 1] = tempo;
                    }
                }
            }

        }

    }

    public void InsertionSort(int[] array) {
        long startTime;
        long endTime;
        long tiempo;
        startTime = System.currentTimeMillis();
        ArregloaOrdenar(array);
        for (int lugar = 1; lugar < array.length; lugar++) {
            int contComparacion = lugar;
            int numEvaluado = array[lugar];
            while (array[contComparacion - 1] > numEvaluado && contComparacion > 0) {
                array[contComparacion] = array[contComparacion - 1];
                contComparacion--;
                if (contComparacion == 0) {
                    break;
                }
            }
            array[contComparacion] = numEvaluado;
            ArregloaOrdenar(array);
        }
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        System.out.println("El tiempo que tarde en ejecutar el algoritmo de InsertionSort fue de: " + tiempo + " milisegundo(s)");
    }

    public void SelectionSort(int[] array) {
        long startTime;
        long endTime;
        long tiempo;
        startTime = System.currentTimeMillis();
        for (int lugarArreglo = 0; lugarArreglo < array.length; lugarArreglo++) {
            int lugarMinimo = lugarArreglo;
            for (int posicion = lugarArreglo; posicion < array.length; posicion++) {
                if (array[posicion] < array[lugarMinimo]) {
                    lugarMinimo = posicion;
                }
            }
            int t = array[lugarArreglo];
            array[lugarArreglo] = array[lugarMinimo];
            array[lugarMinimo] = t;
            ArregloaOrdenar(array);
        }
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        System.out.println("El tiempo que tarde en ejecutar el algoritmo de SelectionSort fue de: " + tiempo + " milisegundo(s)");
    }

}
