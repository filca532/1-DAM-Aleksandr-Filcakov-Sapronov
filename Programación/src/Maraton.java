import java.util.Scanner;

public class Maraton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique su edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {

            System.out.print("Ha corrido alguna maraton alguna vez? Indique Si o No: ");
            String confirmacion = sc.next();

            if ("Si".equalsIgnoreCase(confirmacion)) {

                System.out.print("Indique cuantos minutos tardo en completar la carrera: ");
                int min = sc.nextInt();

                if (((edad <= 35) && (min < 190)) || (edad > 35) && (min < 225)) {

                    System.out.println("Persona seleccionada");

                } else {

                    System.out.println("No seleccionado");
                }

            } else {
                System.out.println("No puede participar");
            }

        } else {
            System.out.println("No puede participar");
        }
    }
}