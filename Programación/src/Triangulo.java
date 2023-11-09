import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char asterisco = '*';

        System.out.print("Introduce la cantidad de lineas del triangulo: ");
        int lineas = sc.nextInt();

        for (int i = 0; i <= lineas; i++) {
            for (int vecesAparece = 0; vecesAparece < i; vecesAparece++) {
                System.out.print(asterisco);
            }
            System.out.println(" ");
        }
    }
}
