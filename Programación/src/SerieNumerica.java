import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class SerieNumerica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero que quiera saber la suma de la serie numerica: ");
        int numSerie = sc.nextInt();

        int suma = 1;
        int sumando = 3;
        int sumaTotal = 0;

        System.out.print(suma);

        if(numSerie < 11){
            System.out.println("Introduce un  numero mayor que 10");
        } else {
            for(int contador = 0; contador < numSerie; ++contador){
                sumaTotal = suma + sumaTotal;

                if(contador != (numSerie - 1)) {
                    suma = suma + sumando;
                    System.out.print(" + " + suma);
                }
            }
            System.out.print(" = " + sumaTotal);
        }


    }
}
