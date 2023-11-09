import java.util.Scanner;
import java.math.MathContext;
import java.text.DecimalFormat;

public class Receta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");


        int coliflor = 100;
        double cebolla = 0.1666666666666666666666666;
        double zanahoria = 0.5;
        double pollo = 83.33333333333333333333333333;
        double pinyones = 4.166666666666666666666666666;
        double pasas = 12.5;
        double caldo = 36.6666666666666666666666666666;
        double curry = 0.25;


        System.out.print("Cuantos comensales van a haber: ");
        int personas = sc.nextInt();

        if (personas < 1) {
            personas = 1;
        }

        //Restricciones para 1 persona y para 2 personas
        if ((personas == 1) || (personas == 2)) {
            curry = 0.5;
            pasas = 20;
            pinyones = 10;
            cebolla = 0.5;
        }

        curry *= personas;
        coliflor *= personas;
        cebolla *= personas;
        pasas *= personas;
        caldo *= personas;
        zanahoria *= personas;
        pollo *= personas;
        pinyones *= personas;

        System.out.println("La receta para " + personas + (personas == 1 ? " persona" : " personas") + " es: \n" +
                "coliflor: " + (df.format(coliflor)) + "g \n" +
                "cebolla: " + (df.format(cebolla)) + (cebolla > 1 ? " cebollas" : " cebolla") + "\n" +
                "zanahoria: " + (df.format(Math.ceil(zanahoria))) + (zanahoria > 1 ? " zanahorias" : " zanahoria") + "\n" +
                "pollo: " + (df.format(pollo)) + "g \n" +
                "piñones: " + (df.format(pinyones)) + "g \n" +
                "pasas: " + pasas + "g \n" +
                "caldo: " + (df.format(caldo)) + " ml \n" +
                "curry: " + curry + "c");

        sc.close();
    }
}
