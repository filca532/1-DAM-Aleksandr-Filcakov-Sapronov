package Tema4.Arrays_Unidimensionales;

public class InvertirArray {
    public static void main(String[] args) {
        int[] cadenaNum = {1,2,3,4,5};

        for (int i = (cadenaNum.length - 1); i >= 0; i--) {
            System.out.print(cadenaNum[i] + " ");
        }
    }
}