public class expresiones {
    public static void main(String[] args) {

        System.out.println(validarFecha("17/03/2005"));

    }
   public static boolean validarReal(String texto, int n){
        return (texto.matches("^-?[0-9]+\\.[0-9]{" + n + "}$"));
   }

    public static boolean validarFecha(String texto){
        return (texto.matches("^(0?[1-9]|[12][0-9]|3[0-1])/(0?[1-9]|1[0-2])/(19|20)[0-9]{2}$"));
    }


}
