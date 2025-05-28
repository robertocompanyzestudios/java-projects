public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.format("\nArgumento numero %d = %s", i + 1, args[i]);
        }

        String cadena = args[0];
        String regex = args[1];

        if(cadena.matches(regex)){
            System.out.println("\nEl isbn es correcto");
        }else {
            System.out.println("\nEl isbn no es correcto");

        }
    }




}
