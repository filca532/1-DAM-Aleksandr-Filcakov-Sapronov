public class Multiplicacion {
    public static void main(String[] args) {
        int multiplicando = 0;
        int multiplicador = 1;

        while (multiplicando <= 10) {
            multiplicador = 1;

            System.out.println(" ");
            System.out.println("La tabla del " + multiplicando);

            while (multiplicador <= 10) {
                int producto = multiplicando * multiplicador;

                System.out.println(multiplicando + " * " + multiplicador + " = " + producto);

                ++multiplicador;
            }
            ++multiplicando;
        }
    }
}

