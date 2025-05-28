import java.security.MessageDigest;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws Exception {
        String hashObjetivo = "zcVLWCxYiCpTtldXI55i0hAFFGYofetzHLfWGgSQn9UoPBIgyB04p53R25oyGG1oUHuV5demuoaF3OnuLXtcww==";

        MessageDigest md = MessageDigest.getInstance("SHA-512");

        for (int i = 0; i <= 200; i++) {
            String entrada = String.valueOf(i);
            byte[] hashBytes = md.digest(entrada.getBytes());
            String hashBase64 = Base64.getEncoder().encodeToString(hashBytes);
            System.out.println(i + " = " + hashBase64);
            if (hashBase64.equals(hashObjetivo)) {
                System.out.println("La entrada original es: " + entrada);
                return;
            }
        }

        System.out.println("No se encontró ninguna coincidencia en el rango especificado.");
    }
}
