public class Utilidades {
    public static void main(String[] args) {
        System.out.println(validarTelefono("603 323 419"));
    }

    /**
     * Valida si la cadena recibida concuerda con un nif
     * @param nif
     * @return true/false
     */
    public static boolean validarNif(String nif){
        String regex = "^[0-9]{8}[A-Z]$";
        return nif.matches(regex);
    }

    /**
     * Valida si la cadena recibida concuerda con un email
     * @param email
     * @return true/false
     */
    public static boolean validarEmail(String email){
        String regex = "^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za\n" + "-z]{2,})$";
        return email.matches(regex);
    }

    /**
     * Valida si la cadena recibida concuerda con un telefono
     * @param telefono
     * @return true/false
     */
    public static boolean validarTelefono(String telefono){
        String regex = "^[0-9]{3} [0-9]{3} [0-9]{3}$";
        return telefono.matches(regex);
    }

    public static boolean validarFecha(String fecha){
        String regex = "^(([0-9])|([12][0-9])|(3[01]))/((0[0-9])|(1[0-2]))/((19[0-9]{2})|(20[0-9]{2}))$";
        return fecha.matches(regex);
    }

    public static boolean validarMatricula(String matricula){
        String regex = "^[0-9]{4} [WRTYPDFGHJKLZXCVBNM]{3}$";
        return matricula.matches(regex);
    }

    public static boolean validarDescuento(String descuento){
        String regex = "^\\d*(\\.\\d*)?$";
        return descuento.matches(regex);
    }
}
