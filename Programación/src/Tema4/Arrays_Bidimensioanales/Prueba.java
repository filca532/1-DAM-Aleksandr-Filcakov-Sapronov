package Tema4.Arrays_Bidimensioanales;

import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {

        int[][] pruebaArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] pruebaArray2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < pruebaArray.length; i++) {
            for (int j = 0; j < pruebaArray[i].length; j++) {
                System.out.print(pruebaArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(pruebaArray));
        System.out.println(Arrays.deepEquals(pruebaArray, pruebaArray2));
    }
}
