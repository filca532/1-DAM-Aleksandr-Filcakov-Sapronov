import java.util.Scanner;

public class CalificacionExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la puntuación obtenida del 0 al 100: ");
        int nota = sc.nextInt();

        String calificacion = (nota >= 90 && nota <= 100 ? "A"
                : nota >= 80 && nota <= 89 ? "B"
                : nota >= 70 && nota <= 79 ? "C"
                : nota >= 60 && nota <= 69 ? "D"
                : nota < 60 ? "F" : "No ha introducido un valor correcto");

        System.out.println("Puntuación: " + nota + " => " + "Calificación: " + calificacion);
    }

}
