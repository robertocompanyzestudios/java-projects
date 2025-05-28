public class ejer6 {
    public static void main(String[] args) {

        System.out.println(padRight("Hola", '*', 20));

    }

    public static String padRight(String cadena, char caracter, int numero){
        if (numero < cadena.length()){
            return cadena;
        } else {
            StringBuilder texto = new StringBuilder();
            texto.append(cadena);
            while (texto.length() < numero){
                texto.append(caracter);
            }
            return texto.toString();
        }


    }


}
