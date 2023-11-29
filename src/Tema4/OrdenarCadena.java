package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique cuantas palabras quieres ordenar: ");
        int cantidadPalabras = sc.nextInt();

        String[] palabras = new String[cantidadPalabras];

        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = sc.next();
        }

        Arrays.sort(palabras);

        System.out.println("Palabras ordenadas: ");
        for (String j : palabras) {
            System.out.println(j);
        }
    }
}
