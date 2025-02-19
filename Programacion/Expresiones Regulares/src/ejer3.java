import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejer3 {
    public static void main(String[] args) {
        String texto = "192.168.0.1";
        String regex = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$";

        Pattern patron = Pattern.compile(regex);
        Matcher concordancias = patron.matcher(texto);

        System.out.println(concordancias.matches());
    }
}
