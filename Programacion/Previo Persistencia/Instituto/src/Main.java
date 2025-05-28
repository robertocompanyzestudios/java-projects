import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
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

        System.out.println(biblioteca1.gettotalLibros());
         */

        System.out.println("¿Cuantos alumnos desea crear?");
        int n = teclado.nextInt();
        Alumno[] arrayAlumnos = new Alumno[n];
        teclado.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Introduzca el nombre del alumno:");
            String nombre = teclado.nextLine();

            System.out.println("Introduzca el apellidos del alumno:");
            String apellidos = teclado.nextLine();

            System.out.println("Introduzca el nre del alumno:");
            String nre = teclado.nextLine();

            System.out.println("Introduzca el email del alumno:");
            String email = teclado.nextLine();

            System.out.println("Introduzca el direccion del alumno:");
            String direccion = teclado.nextLine();

            arrayAlumnos[i] = new Alumno(nombre, apellidos, nre, email, direccion);
        }

        System.out.println("Alumnos: ");
        for (int i = 0; i < n; i++){
            System.out.println(arrayAlumnos[i].info());
        }
    }
}
