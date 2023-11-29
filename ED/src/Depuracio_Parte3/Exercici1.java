package Depuracio_Parte3;

import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();
        if (n1 % 10 != n2 % 10) {
            System.out.println("Los números acaban con cifras distintas");
        } else {
            System.out.println("Los dos números acaban con la misma cifra");
        }
    }

}
