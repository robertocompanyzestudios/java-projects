public class ConstructoresString {

        static public void main(String[] args) {
            String s1 = new String("Hola");
            String s2 = "Mundo Java";

            System.out.println(s1);
            System.out.println(s2);

            s1 = s1 + "-";
            s2 = s2.toUpperCase();            // Pasa a mayúsculas
            Boolean abierto = true;
            System.out.println(String.valueOf(abierto));

            System.out.println("Resultado = "+(5+3));
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1.concat(s2));     // Concatena dos cadenas.
            // Equivale a s1 + s2
            String s3 = s2;
        }



}
