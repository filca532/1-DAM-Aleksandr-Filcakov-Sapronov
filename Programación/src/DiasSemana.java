import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique un numero del 1 al 7: ");
        int numero = sc.nextInt();

        String dia = numero == 1 ? "es el lunes"
                : numero == 2 ? "es el martes"
                : numero == 3 ? "es el miercoles"
                : numero == 4 ? "es el jueves"
                : numero == 5 ? "es el viernes"
                : numero == 6 ? "es el sabado"
                : numero == 7 ? "es el domingo"
                : "no es un día valido";

                System.out.println("El día de la semana indicado " + dia);
    }
}
