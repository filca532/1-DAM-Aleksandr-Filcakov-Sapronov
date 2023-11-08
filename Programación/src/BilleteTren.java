import java.util.Scanner;
import java.text.DecimalFormat;

public class BilleteTren {

    public static void main(String[] args) {
        Billetes();
    }

    public static void Billetes() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");

        double precioBillete;
        double precioKilometro = 0;
        int billete;

        do {
            System.out.println("1.- Billete Sencillo");
            System.out.println("2.- Bille de Ida y Vuelta");
            System.out.print("Indique que tipo de billete tiene: ");
            billete = sc.nextInt();

            if (billete == 1) {
                precioKilometro = 0.33;
            } else if (billete == 2) {
                precioKilometro = 0.26;
            } else {
                System.out.println("No ha introducido un billete correcto");
                System.out.println(" ");
                System.out.println("Vuelve a introducir un tipo de billete correcto");
                System.out.println(" ");
            }
        } while (billete >= 3);

        System.out.println(" ");

        System.out.print("De cuantos kilometros es su viaje: ");
        double kilometros = sc.nextDouble();

        precioBillete = precioKilometro * kilometros;

        System.out.println(" ");

        System.out.print("Tiene la tarjeta interrail (s/n): ");
        String tarjeta = sc.next();

        String b = billete == 1 ? "sencillo" : " ida y vuelta";

        if ("s".equalsIgnoreCase(tarjeta)) {
            double precioTotal = precioBillete - (precioBillete * 0.25);
            System.out.printf("%s", "Su precio de billete " + (billete == 1 ? "sencillo" : " ida y vuelta") +
                    " tiene un descuento de un 25% y con un precio final de " + (df.format(precioTotal)) + "€ ");
        } else if (precioBillete > 110) {
            double precioTotal = precioBillete - (precioBillete * 0.10);
            System.out.printf("%s", "Su precio de billete " + (billete == 1 ? "sencillo" : " ida y vuelta") +
                    " tiene un descuento de un 10% y con un precio final de " + (df.format(precioTotal)) + "€");
        } else if (precioBillete > 50) {
            double precioTotal = precioBillete - (precioBillete * 0.05);
            System.out.printf("%s", "Su precio de billete " + (billete == 1 ? "sencillo" : " ida y vuelta") +
                    " tiene un descuento de un 5% y con un precio final de " + (df.format(precioTotal)) + "€");
        } else {
            System.out.printf("%s", "Su precio de billete " + (billete == 1 ? "sencillo" : " ida y vuelta") +
                    " es de " + (df.format(precioBillete)) + "€");
        }
    }
}