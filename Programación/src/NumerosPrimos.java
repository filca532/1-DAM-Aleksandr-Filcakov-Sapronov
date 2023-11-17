import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        String salir;


        do {
            do {
                System.out.print("Introduzca el numero a comprobar: ");
                num = Math.abs(sc.nextInt());

                if (num < 2) {
                    System.out.println("No ha introducido un valor correcto, vuelve a intentarlo, tiene que ser un numero mayor de 1 \n");
                }

            } while (num < 2);

            if ((num % 2) == 0 && num != 2) {
                System.out.println("El numero " + num + " es compuesto \n");
            } else if ((num % 3) == 0 && num != 3) {
                System.out.println("El numero " + num + " es compuesto \n");
            } else if ((num % 5) == 0 && num != 5) {
                System.out.println("El numero " + num + " es compuesto \n");
            } else {
                System.out.println("El numero " + num + " es primo \n");
            }

            System.out.print("Quiere comprobar otro numero? (S/N) ");
            salir = sc.next();

        } while (salir.equalsIgnoreCase("S"));

        System.out.println("Saliendo del programa");

        sc.close();
    }
}
