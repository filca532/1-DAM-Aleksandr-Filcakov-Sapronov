import java.util.Scanner;

public class SumaNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int par = 0;

        System.out.print("Introduzca el primer numero del rango: ");
        int num1 = sc.nextInt();

        System.out.print("Introduzca el segundo numero del rango: ");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0){
                par = i + par;
            }
        }

        System.out.println("La suma de todos los pares del rango " + num1 + " al " + num2 + " és: " + par);
    }
}
