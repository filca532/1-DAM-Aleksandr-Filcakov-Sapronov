package Tema4.Arrays_Unidimensionales;

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};

        for (int i : original) {
            System.out.print(i + " ");
        }

        int[] copia = Arrays.copyOf(original, 5);

        for (int j : copia) {
            System.out.print(j + " ");
        }

    }
}
