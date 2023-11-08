import java.util.Scanner;

public class EncuentraLaLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la frase a comprobar: ");
        String frase = sc.nextLine();

        System.out.print("Introduzca la letra la cual quiere contar: ");
        String letraCadena = sc.next();

        int aparicion = frase.indexOf(letraCadena);

        int contador;

        for(contador = 0; aparicion != -1; contador++) {

            aparicion = frase.indexOf(letraCadena, aparicion + 1);

        }

        System.out.println("La letra " + letraCadena + " aparace un total de " + contador + (contador == 0? " veces": contador == 1? " vez": " veces"));
    }
}
