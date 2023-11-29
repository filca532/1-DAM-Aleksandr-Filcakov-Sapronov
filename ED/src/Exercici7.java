import java.util.Scanner;

public class Exercici7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numfiguras;
        do {
            System.out.print("¿Cuántas figuras quieres?");
            numfiguras = entrada.nextInt();
        } while (numfiguras < 2);
        int nfiguras = numfiguras;
        int numlinea;
        do {
            System.out.print("¿Cuántos asteriscos quieres?");
            numlinea = entrada.nextInt();
        } while (numlinea < 2);
        int numespacios = 0;
        int posasterisco;
        int nespacios;
        while (numlinea > 0) {
            numfiguras = nfiguras;
            while (numfiguras > 0) {
                posasterisco = numlinea;
                nespacios = numespacios;
                while (posasterisco-- > 0) {
                    System.out.print("*");
                }
                while (nespacios-- > 0) {
                    System.out.print(" ");
                }
                if (numfiguras > 1) {
                    System.out.print("||");
                }
                numfiguras = numfiguras - 1;
            }
            System.out.println("");
            numlinea = numlinea - 1;
            numespacios = numespacios + 1;
        }
    }
}
