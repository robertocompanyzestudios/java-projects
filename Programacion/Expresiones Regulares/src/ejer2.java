import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejer2 {
    public static void main(String[] args) {
        String texto = "49588712E";
        String regex = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";

        Pattern patron = Pattern.compile(regex);
        Matcher concordancias = patron.matcher(texto);

        System.out.println(concordancias.matches());
    }
}
