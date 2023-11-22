import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
        int N = 0, i = 0, j = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero > 0: ");
            N = sc.nextInt();
        } while (N <= 0);
        System.out.println("Números primos desde 1 hasta " + N);
        for (j = 2; j <= N; j++) {
            i = 2;
            while (i <= j / 2 && j % i != 0) {
                i++;
            }
            if ((i > j / 2)) {
                System.out.println(j);
            }
        }
    }
}
