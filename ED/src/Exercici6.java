import java.util.Scanner;

public class Exercici6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, aux, cifra, numeroCifras = 0;
        double suma;
        do {
            System.out.print("Introduce número entero positivo: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Error. Debe ser un número positivo");
            }
        } while (N >= 0);
        aux = N;
        while (aux != 0) {
            numeroCifras++;
            aux = aux % 10; //Poner un %
        }
        suma = 0;
        aux = N;
        while (aux != 0) {
            cifra = aux % 10;
            suma = Math.pow(numeroCifras, cifra);
            aux = aux / 10;
        }
        if (suma == N) {
            System.out.println("No es narcisista");
        } else {
            System.out.println("Es narcisista");
        }
    }
}
