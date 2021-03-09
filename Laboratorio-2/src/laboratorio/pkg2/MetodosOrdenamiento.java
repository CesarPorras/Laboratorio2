package laboratorio.pkg2;

import java.util.Scanner;

public class MetodosOrdenamiento {

    public MetodosOrdenamiento() {
    }

    public void ArregloOrdenarDouble(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println();
    }

    public void ArregloOrdenarInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public void Merge(double arreglo[], int l, int m, int r) {
        long startTime;
        long endTime;
        long tiempo;
        startTime = System.currentTimeMillis();

        int num1 = m - l + 1;
        int num2 = r - m;
        double I[] = new double[num1];
        double D[] = new double[num2];
        for (int i = 0; i < num1; ++i) {
            I[i] = arreglo[l + i];
        }
        for (int j = 0; j < num2; ++j) {
            D[j] = arreglo[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < num1 && j < num2) {

            if (I[i] <= D[j]) {
                arreglo[k] = I[i];
                i++;
            } else {
                arreglo[k] = D[j];
                j++;
            }
            k++;
        }
        ArregloOrdenarDouble(arreglo);
        while (i < num1) {
            arreglo[k] = I[i];
            i++;
            k++;
        }
        ArregloOrdenarDouble(arreglo);

        while (j < num2) {
            arreglo[k] = D[j];
            j++;
            k++;
        }
        ArregloOrdenarDouble(arreglo);
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        System.out.println("El tiempo que tarde en ejecutar el algoritmo de MergeSort fue de: " + tiempo + " milisegundo(s)");
    }

    void sort(double arreglo[], int extremoIzquierdo, int extremoDerecho) {

        if (extremoIzquierdo < extremoDerecho) {
            int puntoMedio = (extremoIzquierdo + extremoDerecho) / 2;

            sort(arreglo, extremoIzquierdo, puntoMedio);

            sort(arreglo, puntoMedio + 1, extremoDerecho);

            Merge(arreglo, extremoIzquierdo, puntoMedio, extremoDerecho);
        }

    }

    public void BubbleSort(double[] arreglo) {
        long startTime;
        long endTime;
        long tiempo;
        startTime = System.currentTimeMillis();
        for (int cont1 = 0; cont1 < arreglo.length; cont1++) {
            for (int cont2 = 0; cont2 < arreglo.length; cont2++) {
                if ((cont2 + 1) < arreglo.length) {
                    if (arreglo[cont2] > arreglo[cont2 + 1]) {
                        double t = arreglo[cont2];
                        arreglo[cont2] = arreglo[cont2 + 1];
                        arreglo[cont2 + 1] = t;
                    }
                }
            }
            ArregloOrdenarDouble(arreglo);
        }
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        System.out.println("El tiempo que tarde en ejecutar el algoritmo de BubbleSort fue de: " + tiempo + " milisegundo(s)");
    }

    public void InsertionSort(double[] arreglo) {
        long startTime;
        long endTime;
        long tiempo;
        startTime = System.currentTimeMillis();
        ArregloOrdenarDouble(arreglo);
        for (int lugar = 1; lugar < arreglo.length; lugar++) {
            int contComparacion = lugar;
            double numEvaluado = arreglo[lugar];
            while (arreglo[contComparacion - 1] > numEvaluado && contComparacion > 0) {
                arreglo[contComparacion] = arreglo[contComparacion - 1];
                contComparacion--;
                if (contComparacion == 0) {
                    break;
                }
            }
            arreglo[contComparacion] = numEvaluado;
            ArregloOrdenarDouble(arreglo);
        }
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        System.out.println("El tiempo que tarde en ejecutar el algoritmo de InsertionSort fue de: " + tiempo + " milisegundo(s)");
    }

    public void SelectionSort(double[] arreglo) {
        long startTime;
        long endTime;
        long tiempo;
        startTime = System.currentTimeMillis();
        for (int lugarArreglo = 0; lugarArreglo < arreglo.length; lugarArreglo++) {
            int lugarMinimo = lugarArreglo;
            for (int posicion = lugarArreglo; posicion < arreglo.length; posicion++) {
                if (arreglo[posicion] < arreglo[lugarMinimo]) {
                    lugarMinimo = posicion;
                }
            }
            double t = arreglo[lugarArreglo];
            arreglo[lugarArreglo] = arreglo[lugarMinimo];
            arreglo[lugarMinimo] = t;
            ArregloOrdenarDouble(arreglo);
        }
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        System.out.println("El tiempo que tarde en ejecutar el algoritmo de SelectionSort fue de: " + tiempo + " milisegundo(s)");
    }

    /*public void BubbleSortPersonas(Ejercicio4[] arreglo) {

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

    }*/

    public void BubbleSortOperaciones(int[] array) {
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
            ArregloOrdenarInt(array);
        }
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        System.out.println("El tiempo que tarde en ejecutar el algoritmo de BubbleSort fue de: " + tiempo + " milisegundo(s)");
    }
}
