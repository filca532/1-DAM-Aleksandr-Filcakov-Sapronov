package Tema4.Arrays_Bidimensioanales;

import java.util.Arrays;

public class Suma_Parcial {
    public static void main(String[] args) {

        int[][] arraySuma = new int[4][5];
        int sumaTotal = 0;

        for (int i = 0; i < arraySuma.length; i++) {
            for (int j = 0; j < arraySuma[i].length; j++) {
                arraySuma[i][j] = (int) (Math.random() * 10);
            }
        }

        int sumaFila0 = 0;
        int sumaFila1 = 0;
        int sumaFila2 = 0;
        int sumaFila3 = 0;

        int sumaColumna0 = 0;
        int sumaColumna1 = 0;
        int sumaColumna2 = 0;
        int sumaColumna3 = 0;
        int sumaColumna4 = 0;

        for (int i = 0; i < arraySuma[0].length; i++) {
            sumaFila0 += arraySuma[0][i];
        }

        for (int i = 0; i < arraySuma[1].length; i++) {
            sumaFila1 += arraySuma[1][i];
        }

        for (int i = 0; i < arraySuma[2].length; i++) {
            sumaFila2 += arraySuma[2][i];
        }

        for (int i = 0; i < arraySuma[3].length; i++) {
            sumaFila3 += arraySuma[3][i];
        }

        for (int i = 0; i < arraySuma[0].length; i++) {
            System.out.print(arraySuma[0][i] + "  ");
        }
        System.out.print("--> " + sumaFila0);
        System.out.println();

        for (int i = 0; i < arraySuma[1].length; i++) {
            System.out.print(arraySuma[1][i] + "  ");
        }
        System.out.print("--> " + sumaFila1);
        System.out.println();

        for (int i = 0; i < arraySuma[2].length; i++) {
            System.out.print(arraySuma[2][i] + "  ");
        }
        System.out.print("--> " + sumaFila2);
        System.out.println();

        for (int i = 0; i < arraySuma[3].length; i++) {
            System.out.print(arraySuma[3][i] + "  ");
        }
        System.out.print("--> " + sumaFila3);
        System.out.println();

        for (int i = 0; i < arraySuma.length; i++) {
            sumaColumna0 += arraySuma[i][0];
        }

        for (int i = 0; i < arraySuma.length; i++) {
            sumaColumna1 += arraySuma[i][1];
        }

        for (int i = 0; i < arraySuma.length; i++) {
            sumaColumna2 += arraySuma[i][2];
        }

        for (int i = 0; i < arraySuma.length; i++) {
            sumaColumna3 += arraySuma[i][3];
        }

        for (int i = 0; i < arraySuma.length; i++) {
            sumaColumna4 += arraySuma[i][4];
        }

        sumaTotal = sumaColumna0 + sumaColumna1 + sumaColumna2 + sumaColumna3 + sumaColumna4;

        System.out.println("-------------");

        System.out.println(sumaColumna0 + " " + sumaColumna1 + " " + sumaColumna2 + " " + sumaColumna3 + " " + sumaColumna4 + " --> " + sumaTotal);
    }
}
