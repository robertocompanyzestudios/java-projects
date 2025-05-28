import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejer1 {
    public static void main(String[] args) {
        String texto = "Aa22222222222222222";
        String regex = "^[a-zA-Z][\\w]{2,19}$";

        Pattern patron = Pattern.compile(regex);
        Matcher concordancias = patron.matcher(texto);

        System.out.println(concordancias.matches());
    }
}
