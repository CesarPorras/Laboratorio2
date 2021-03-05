package laboratorio.pkg2;

import java.util.Scanner;

public class Laboratorio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int tamaño = 0;
        int[] array = new int[tamaño];

        Operaciones NuevaOperacion = new Operaciones();
        MetodosOrdenamiento NuevoOrdenamiento = new MetodosOrdenamiento();
        ReemplazarCaracteres Reemplazar = new ReemplazarCaracteres();
        int opcion = 0;
        do {

            System.out.println("Seleccione la opción que desee");
            System.out.println("1 - Ordenar");
            System.out.println("2 - Media");
            System.out.println("3 - Varianza");
            System.out.println("4 - Desviacion Estandar");
            System.out.println("5 - Reemplazar caracter");
            System.out.println("5 - Organizar Merge and Sort");
            System.out.println("5 - Organizar Burbuja");
            System.out.println("5 - Organizar Insercion");
            System.out.println("5 - Organizar Seleccion");

            System.out.print("Digite la opcion: ");
            opcion = Integer.parseInt(teclado.next());

            switch (opcion) {
                case 1:
                    NuevoOrdenamiento.sort(array, 0, array.length - 1);
                    break;
                case 2:
                    NuevaOperacion.media(array);
                    break;
                case 3:
                    NuevaOperacion.Varianza(array);
                    break;
                case 4:
                    NuevaOperacion.Desviacion(array);
                    break;
                case 5:
                    Reemplazar.ReemplazarCaracter();
                    break;
                case 6:
                    NuevoOrdenamiento.sort(array, 0, array.length - 1);
                    break;
                case 7:
                    NuevoOrdenamiento.BubbleSort(array);
                    break;
                case 8:
                    NuevoOrdenamiento.InsertionSort(array);
                    break;
                case 9:
                    NuevoOrdenamiento.SelectionSort(array);
                    break;
                default:
                    System.out.println("La opción seleccionada no es correcta");
            }
        } while (opcion != 8);
    }
}
