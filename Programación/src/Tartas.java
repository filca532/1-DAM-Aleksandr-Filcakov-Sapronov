import java.util.Scanner;

public class Tartas {
    public static void main(String[] args) {
        tarta();
    }

    public static void tarta() {
        Scanner sc = new Scanner(System.in);

        double precioTarta = 0;
        double precioMasNata = 0;
        double total = 0;

        System.out.print("Indique el sabor que quiera de la tarta (manzana, chocolate o fresa): ");
        String sabor = sc.next();

        switch (sabor) {
            case "manzana":
                System.out.println("Usted ha cogido manzana");
                precioTarta = 18.0;
                break;

            case "chocolate":
                System.out.print("Prefiere chocolate blanco o negro: ");
                String tipoChoc = sc.next();

                if (tipoChoc.equals("blanco")) {
                    System.out.println("Usted ha escogido chocolate blanco");
                    precioTarta = 15.0;
                } else if (tipoChoc.equals("negro")) {
                    System.out.println("Usted ha escogido chocolate negro");
                    precioTarta = 14.0;
                } else {
                    System.out.println("No has escogido ningun sabor correcto");
                    System.exit(0);
                }
                ;
                break;

            case "fresa":
                System.out.println("Usted ha cogido fresa");
                precioTarta = 18.0;
                break;

            default:
                System.out.print("No has escogido ningun sabor correcto");
                System.exit(0);
        }

        System.out.println(" ");
        System.out.print("Quiere nata en la tarta (Si o No): ");
        String nata = sc.next();

        if ("Si".equalsIgnoreCase(nata)) {
            precioMasNata = precioTarta + 2.5;
        } else {
            precioMasNata = precioTarta + 0;
        }

        double tartaMasNata = precioMasNata;

        System.out.println(" ");
        System.out.print("Quiere personalizacion en la tarta (Si o No): ");
        String personalizacion = sc.next();

        if ("Si".equalsIgnoreCase(personalizacion)) {
            total = tartaMasNata + 2.75;
        } else {
            total = tartaMasNata + 0;
        }

        System.out.println("El precio de su tarta de " + sabor + " es: " + total);

    }

}
