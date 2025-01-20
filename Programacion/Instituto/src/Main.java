public class Main {
    public static void main(String[] args) {
        //Crear biblioteca
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca UMU Merced");

        //Crear libros
        Libro libro1 = new Libro("Quijote", "Miguel de Cervantes" );
        Libro libro2 = new Libro("El Alquimista", "Paulo Cohelo" );
        Libro libro3 = new Libro("La Celestina", "Fernando de Rojas" );

        //Asignar libros a la biblioteca
        biblioteca1.anadirLibro(libro1);
        biblioteca1.anadirLibro(libro2);
        biblioteca1.anadirLibro(libro3);
        System.out.println(biblioteca1.getLibros());

        biblioteca1.borrarLibro("Quijote");

        System.out.println(biblioteca1.getLibros());

    }
}
