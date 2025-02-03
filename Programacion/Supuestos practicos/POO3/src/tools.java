import java.util.Scanner;

public class tools {
    public static String pedirString(){
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();

        return cadena;
    }
}
