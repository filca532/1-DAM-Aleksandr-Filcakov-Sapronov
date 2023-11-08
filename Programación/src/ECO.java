import java.util.Scanner;

public class ECO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String eco = "";

        do {
            eco = sc.nextLine();
            System.out.println("Ha introducido: " + eco);
        } while (eco.compareToIgnoreCase("salir") != 0);

        System.out.println("Saliendo");
    }
}
