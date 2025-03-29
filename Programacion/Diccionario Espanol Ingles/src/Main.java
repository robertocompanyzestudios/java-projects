import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Diccionario EspIng = new Diccionario();
        Double aciertos = 0.0;
        int errores = 0;
        Double preguntas = 0.0;

       EspIng.generarDiccionario("./assets/palabras.txt");

        String respuesta = "";
        while (!respuesta.equalsIgnoreCase("fin") ){
            String palabra = EspIng.palabraAleatoria();
            System.out.println(palabra + ": " + EspIng.primeraLetraTraduccion(palabra) + "...");
            System.out.println("Indique la respuesta:");
            respuesta = teclado.nextLine();
            preguntas++;

            if (respuesta.equalsIgnoreCase(EspIng.traduce(palabra))){
                aciertos++;
                System.out.println("!CORRECTO¡");
            } else {
                errores++;
                System.out.println("!No¡ La respuesta correcta es " + EspIng.traduce(palabra));
            }

            System.out.println("FIN DEL PROGRAMA");
            System.out.println("Total de preguntas: " + preguntas.toString().trim());
            System.out.println("Total de aciertos: " + aciertos);
            System.out.println("Total de errores: " + errores);
            System.out.println("Tasa de aciertos:" + ((aciertos/preguntas)*100) + "%");

        }

    }


}
