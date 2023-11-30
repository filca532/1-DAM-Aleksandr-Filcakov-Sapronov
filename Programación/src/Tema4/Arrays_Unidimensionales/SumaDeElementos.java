package Tema4.Arrays_Unidimensionales;

import java.util.Scanner;

public class SumaDeElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres sumar: ");
        int cantidadNum = sc.nextInt();

        int[] cadenaNum = new int[cantidadNum];

        for (int i = 0; i < cadenaNum.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            cadenaNum[i] = sc.nextInt();
        }

        int suma = 0;
        for (int j : cadenaNum) {
            suma += j;
        }

        System.out.println("La suma de todos los numeros es: " + suma);
    }
}
