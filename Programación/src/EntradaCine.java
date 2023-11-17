import java.util.Scanner;

public class EntradaCine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas entradas va a comprar: ");
        int entradas = Math.abs(sc.nextInt());

        if (entradas == 0) {
            entradas = 1;
        }

        int diaSemana = 0, precioBase = 8, precioEspectador = 5, precioPareja = 11;
        double precioEntrada = 0, precioEntradaImpar = 0;

        do {
            System.out.print("1.- Lunes: Dia normal = 8€ \n" +
                    "2.- Martes: Dia normal = 8€ \n" +
                    "3.- Miercoles: Dia del espectador = 5€ \n" +
                    "4.- Jueves: Dia de la pareja = 11€ - 2 entradas \n" +
                    "5.- Viernes: Dia normal = 8€ \n" +
                    "6.- Sabado: Dia normal = 8€ \n" +
                    "7.- Domingo: Dia normal = 8€ \n" +
                    "Para que dia de la semana las quieres (indique el numero): ");
            diaSemana = sc.nextInt();
            System.out.println("-----------------------------------------------");


        } while (diaSemana < 1 || diaSemana > 7);

        switch (diaSemana) {
            case 1, 2, 5, 6, 7:
                precioEntrada = precioBase * entradas;
                break;
            case 3:
                precioEntrada = precioEspectador * entradas;
                break;
            case 4:
                if ((entradas % 2) == 0) {
                    precioEntrada = precioPareja * (entradas / 2.0);
                } else {
                    precioEntradaImpar = precioPareja * ((entradas - 1) / 2.0) + precioBase;
                }
                break;
        }

        if (diaSemana == 4 && (entradas % 2) != 0) {
            System.out.println("El precio indivudual por pareja es de " + ((precioEntradaImpar - precioBase) / (entradas - 1)) + "€ por entrada \n" +
                    "El precio individual por la entrada solitaria es de " + precioBase + "€ por entrada \n" +
                    "Y el precio total de " + entradas + (entradas != 1 ? " entradas" : " entrada") + " es de " + precioEntradaImpar + "€ en total");
            System.out.println("-----------------------------------------------");
        } else {
            System.out.println("El precio individual de cada entrada es de " + (precioEntrada / entradas) + "€ por entrada \n" +
                    "Y el precio total de " + entradas + (entradas != 1 ? " entradas" : " entrada") + " es de " + precioEntrada + "€ en total");
            System.out.println("-----------------------------------------------");
        }

        System.out.print("Tiene tarjeta de fidelidad? (S/N): ");
        String tarjeta = sc.next();

        if (tarjeta.equalsIgnoreCase("S") && (diaSemana == 4 && (entradas % 2) != 0)) {

            System.out.println("Se le aplicara un descuento de un 10%");
            precioEntradaImpar = precioEntradaImpar - (precioEntradaImpar * 0.10);
            double precioBaseDescuento = precioBase - (precioBase * 0.10);
            System.out.println("-----------------------------------------------");
            System.out.println("El precio indivudual por pareja es de " + ((precioEntradaImpar - precioBase) / (entradas - 1)) + "€ por entrada \n" +
                    "El precio individual por la entrada solitaria es de " + precioBaseDescuento + "€ por entrada \n" +
                    "Y el precio total de " + entradas + (entradas != 1 ? " entradas" : " entrada") + " es de " + precioEntradaImpar + "€ en total");
        } else if (tarjeta.equalsIgnoreCase("S")) {
            System.out.println("Se le aplicara un descuento de un 10%");
            precioEntrada = precioEntrada - (precioEntrada * 0.10);
            System.out.println("-----------------------------------------------");
            System.out.println("El precio individual de cada entrada es de " + (precioEntrada / entradas) + "€ por entrada \n" +
                    "Y el precio total de " + entradas + (entradas != 1 ? " entradas" : " entrada") + " es de " + precioEntrada + "€ en total");

        } else {
            System.out.println("No se le ha aplicado ningun descuento, tendra el precio base de: \n" +
                    "Individual: " + precioEntrada / entradas + "€ por entrada \n" +
                    "Total: " + precioEntrada + "€ en total");
        }

        sc.close();
    }
}
