import java.util.Scanner;

public class Rombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char espacio = ' ';
        char almohadilla = '#';
        int contAlmohadilla = 0;
        int contEspacio = 0;
        int almohadillaNum = 1;
        int espacioNum = 3;

        System.out.print("Indica cuantas lineas quieres que haya desde el inicio hasta el centro: ");
        int lineas = sc.nextInt();

        for (int fila = 1; fila <= lineas; fila++) {
            contAlmohadilla = almohadillaNum;
            contEspacio = espacioNum;

            for (int columna = 1; columna <= lineas * 2 - 1; columna++) {
                if (contEspacio > 0) {
                    System.out.print(espacio);
                    contEspacio--;
                } else {
                    if (contAlmohadilla > 0) {
                        System.out.print(almohadilla);
                        contAlmohadilla--;
                    } else {

                        break;
                    }
                }
            }
            System.out.println("");
            espacioNum --;
            almohadillaNum = almohadillaNum + 2;
        }


        for (int fila = 1; fila <= lineas - 1; fila++) {
            if (fila == 1){
                contEspacio = 1;
                espacioNum = 1;

                almohadillaNum = lineas - 1;
                contAlmohadilla = lineas - 1;
            }


            for (int columna = 1; columna <= (lineas - 1) * 2 - 1; columna++) {
                if (contEspacio > 0) {
                    System.out.print(espacio);
                    contEspacio--;
                } else {
                    if (contAlmohadilla > 0) {
                        System.out.print(almohadilla);
                        contAlmohadilla--;
                    } else {

                        break;
                    }
                }
            }
            System.out.println("");
            espacioNum++;
            almohadillaNum = almohadillaNum - 2;
        }

    }
}
