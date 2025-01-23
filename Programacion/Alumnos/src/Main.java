import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

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

        System.out.println("Elija 1 alumno: ");
        for(int i = 0; i < arrayAlumnos.length; i++){
            System.out.println((i+1)+ ". " + arrayAlumnos[i].getNombre()  );
        }

        int eleccion = teclado.nextInt();
        System.out.println(arrayAlumnos[eleccion-1].info());


    }
}
