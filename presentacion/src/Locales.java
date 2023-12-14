public class Locales {
    public static void main(String[] args) {
        // Aquí estamos declarando una variable local dentro del método main
        int numero = 10;
        System.out.println("El valor de la variable local 'numero' es: " + numero);

        // Llamamos al método mostrarMensaje
        mostrarMensaje();
    }

    public static void mostrarMensaje() {
        // Esta es una variable local para el método mostrarMensaje
        String mensaje = "¡Hola, mundo!";
        System.out.println("El valor de la variable local 'mensaje' es: " + mensaje);
        //No puede compilar, ya que no encuentra la variable en el método
    }
}
