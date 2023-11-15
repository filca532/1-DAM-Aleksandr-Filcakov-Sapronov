import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.*;
public class FechaCum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GregorianCalendar calendario = new GregorianCalendar();

        System.out.print("Indica cual es la fecha de tu nacimiento en formato YYYY-MM-DD: ");
        String nacimiento = sc.next();

        LocalDate nacimientoFecha = LocalDate.parse(nacimiento);
        LocalDate hoy = LocalDate.now();

        Period anyos = Period.between(nacimientoFecha, hoy);

        int anyo = (int) (hoy.getYear());

        int dias = (int) ((nacimientoFecha.getDayOfYear() - hoy.getDayOfYear()));

        int diasPasados = (int) ((hoy.getDayOfYear() - nacimientoFecha.getDayOfYear()));

        int horas = (int) ((nacimientoFecha.getDayOfYear() - hoy.getDayOfYear()) * 24);

        int cuantoFaltaBisiesto = 366 - diasPasados;
        int cuantoFaltaNormal = 365 - diasPasados;


        if (dias == 0) {
            System.out.println("Tu cumpleaños es hoy: Felicidades");
            if (calendario.isLeapYear(anyo + 1)) {
                System.out.println("Tu cumpleaños es en 366 dias");
            } else {
                System.out.println("Tu cumpleaños es en 365 dias");
            }
        } else if (dias > 0) {
            System.out.println("Tu cumpleaños es en: " + dias + " dias");
            System.out.println("Tu cumpleaños es en: " + horas + " horas");
        } else if (dias < 0) {
            System.out.println("Tu cumpleaños ha sido hace: " + (diasPasados = Math.abs(diasPasados)) + " dias");
            if (calendario.isLeapYear(anyo + 1)) {
                System.out.println("Tu cumpleaños es en " + cuantoFaltaBisiesto + " dias");
            } else {
                System.out.println("Tu cumpleaños es en " + cuantoFaltaNormal + " dias");
            }
        }

        System.out.println("Tienes " + anyos.getYears() + " años");
    }
}
