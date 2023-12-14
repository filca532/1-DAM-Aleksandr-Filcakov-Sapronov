public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int factorialAnterior = factorial(n -1);

            System.out.println("Factorial de " + (n -1) + ": " + factorialAnterior);

            return factorialAnterior * n;
        }
    }

    public static void main(String[] args) {
        int resultado = factorial(1000);
        System.out.println("El factorial del numero 4 es: " + resultado);
    }
}
