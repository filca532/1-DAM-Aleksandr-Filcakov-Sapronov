import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduzca valor de N: ");
        n = sc.nextInt(); //

        System.out.println("Primera cifra de " + n + " -> " + (n / 100));
        System.out.println("Cifra central de " + n + " -> " + (((n % 100) - (n % 10))) / 10);
        System.out.println("Última cifra de " + n + " -> " + (n % 10));
    }

}
