import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes;
        int anyo;

        System.out.println("1.- Enero");
        System.out.println("2.- Febrero");
        System.out.println("3.- Marzo");
        System.out.println("4.- Abril");
        System.out.println("5.- Mayo");
        System.out.println("6.- Junio");
        System.out.println("7.- Julio");
        System.out.println("8.- Agosto");
        System.out.println("9.- Septiembre");
        System.out.println("10.- Octubre");
        System.out.println("11.- Noviembre");
        System.out.println("12.- Diciembre");
        System.out.println("------------------------");

        System.out.print("Indique con un numero el mes que quiera comprobar: ");
        mes = sc.nextInt();

        System.out.print("Indique el año que quiera comprobar: ");
        anyo = sc.nextInt();

        int bisiesto = anyo % 4;

        switch (mes){
            case 1: System.out.println("Enero tiene 31 dias"); break;
            case 2: if(bisiesto == 0){
                System.out.println("Febrero tiene 29 dias");
            } else {
                System.out.println("Febrero tiene 28 dias");
            }; break;
            case 3: System.out.println("Marzo tiene 31 dias"); break;
            case 4: System.out.println("Abril tiene 30 dias"); break;
            case 5: System.out.println("Mayo tiene 31 dias"); break;
            case 6: System.out.println("Junio tiene 30 dias"); break;
            case 7: System.out.println("Julio tiene 31 dias"); break;
            case 8: System.out.println("Agosto tiene 31 dias"); break;
            case 9: System.out.println("Septiembre tiene 30 dias"); break;
            case 10: System.out.println("Octubre tiene 31 dias"); break;
            case 11: System.out.println("Noviembre tiene 30 dias"); break;
            case 12: System.out.println("Diciembre tiene 31 dias"); break;

        }
    }
}
