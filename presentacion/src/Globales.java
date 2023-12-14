public class Globales {
    // Esta es una variable de instancia (a veces considerada como una variable "global")
    private String mensajeInstancia = "¡Hola, mundo!";

    // Esta es una variable estática (otro tipo de variable "global")
    private static int contador = 0;

    public static void main(String[] args) {
        // Creamos una instancia de la clase Main
        Globales ejemplo = new Globales();

        // Accedemos a la variable de instancia
        System.out.println("El valor de la variable de instancia 'mensajeInstancia' es: " + ejemplo.mensajeInstancia);

        // Modificamos y accedemos a la variable estática
        contador++;
        System.out.println("El valor de la variable estática 'contador' es: " + contador);
    }
}
