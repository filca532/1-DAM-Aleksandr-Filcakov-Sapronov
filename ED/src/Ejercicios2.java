public class Ejercicios2 {
    public static void main(String[] args){
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
    }

    //Ejercicio1
    public static void ejercicio1(){
        int numero1 = 10;
        int numero2 = 5;

        int resultado = numero1 * numero2;
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    //Ejercicio2
    public static void ejercicio2(){
        int[] numeros = {1, 2, 3};
        System.out.println("El tercer número es: " + numeros[2]);
    }

    //Ejercicio3
    public static void ejercicio3(){
        int numero = 10;
        int contador = 0;

        while(contador < numero) {
            contador++;
            System.out.println("Resultado: " + contador);
        }
    }

    //Ejercicio4
    public static void ejercicio4(){
        String cadena = "Ejemplo";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            System.out.println("Carácter en la posición " + i + ": " + c);
        }
    }
}
