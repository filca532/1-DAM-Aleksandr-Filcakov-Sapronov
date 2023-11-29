package Tema4;

import java.util.Scanner;

public class BuscarMaximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique la cantidad de numeros que quiera comprobar: ");
        int cantidadNum = sc.nextInt();

        int[] cadenaNum = new int[cantidadNum];

        for (int i = 0; i < cadenaNum.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            cadenaNum[i] = sc.nextInt();
        }

        int maximo = cadenaNum[0];
        for (int j : cadenaNum) {
            maximo = Math.max(maximo, j);
        }

        System.out.println("El numero maximo es el " + maximo);
    }
}
