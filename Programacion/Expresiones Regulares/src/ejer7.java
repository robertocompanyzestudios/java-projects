public class ejer7 {
    public static void main(String[] args) {
        String texto = "Oracle ha anunciado hoy su nueva generación de compilador Java hoy. Utiliza analizador avanzado y optimizador especial para la JVM de Oracle";
        String regex = "JVM,Java,Oracle";
        System.out.println(reemplazarPalabras(texto, regex));
    }

    public static String reemplazarPalabras(String texto, String regex){
        String[] regexSeparado = regex.split(",");

        for (String i:regexSeparado){
            StringBuilder asteriscos = new StringBuilder();
            for (int j = 0; j<i.length();j++){
                asteriscos.append("*");
            }

            texto = texto.replaceAll(i, asteriscos.toString());
            asteriscos=null;
        }

        return texto;



    }
}
