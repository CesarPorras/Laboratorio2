
package laboratorio.pkg2;

import java.util.Scanner;

public class ReemplazarCaracteres {

    public void ReemplazarCaracter() {
        Scanner teclado = new Scanner(System.in);
        String cadena = " ";
        String[] CadenaCaracteres;
        char MasRepetida = 0;
        int ContadorMasrepetida = 0;
        System.out.print("Digite la cadena de caracteres: ");
        cadena = teclado.nextLine();        
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {           
            contador = 0;
            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(i) == cadena.charAt(j)) {
                    contador++;
                }
                if (contador > ContadorMasrepetida) {
                    ContadorMasrepetida = contador;
                    MasRepetida = cadena.charAt(i);
                }
            }
            

        }
        StringBuilder myName = new StringBuilder(cadena);

        for (int i = 0; i < cadena.length(); i++) {
            if(String.valueOf(cadena.charAt(i)).equals("a")|| String.valueOf(cadena.charAt(i)).equals("e") || String.valueOf(cadena.charAt(i)).equals("i")|| String.valueOf(cadena.charAt(i)).equals("o")|| String.valueOf(cadena.charAt(i)).equals("u")){
                cadena.replace(cadena.charAt(i), MasRepetida); 
                myName.setCharAt(i, MasRepetida);
            }
        }
        System.out.println(myName);
    }
}
