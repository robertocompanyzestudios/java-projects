import java.util.ArrayList;
import java.util.Scanner;

public class Tarea {
    public static final Scanner teclado = new Scanner(System.in);

    private String nombre;
    private String personaResponsable;
    private int numPersonas;
    private String ubicacion;
    private boolean finalizada;

    //Constructors
    public Tarea(String nombre, String personaResponsable, int numPersonas, String ubicacion) {
        this.nombre = nombre;
        this.personaResponsable = personaResponsable;
        this.numPersonas = numPersonas;
        this.ubicacion = ubicacion;
        this.finalizada = false;
    }

    //Getters and Setters
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    @Override
    public String toString() {
        return "Tarea:" +
                "\nNombre: " + nombre +
                "\nPersona Responsable: " + personaResponsable +
                "\nNumero de Personas: " + numPersonas +
                "\nUbicacion: " + ubicacion +
                "\nFinalizada: " + finalizada;
    }

    /**
     * Pide todos los datos necesarios y crea una Tarea
     * @return
     */
    public static Tarea crearTarea(){
        System.out.println("Introduzca el nombre de la tarea: ");
        String nombre = teclado.nextLine();

        System.out.println("Introduzca el nombre de la persona responsable: ");
        String personaResponsable = teclado.nextLine();

        System.out.println("Introduzca el numero de personas que se necesitan: ");
        int numPersonas = teclado.nextInt();

        System.out.println("Introduzca la ubicacion de la tarea: ");
        String ubicacion = teclado.nextLine();

        Tarea miTarea = new Tarea(nombre, personaResponsable, numPersonas, ubicacion);

        return miTarea;
    }
    public static Tarea crearTarea(String nombre){
        System.out.println("Introduzca el nombre de la persona responsable: ");
        String personaResponsable = teclado.nextLine();

        System.out.println("Introduzca el numero de personas que se necesitan: ");
        int numPersonas = teclado.nextInt();

        teclado.nextLine();
        System.out.println("Introduzca la ubicacion de la tarea: ");
        String ubicacion = teclado.nextLine();

        Tarea miTarea = new Tarea(nombre, personaResponsable, numPersonas, ubicacion);

        return miTarea;
    }


    public static ArrayList<Tarea> anadirTareaNombre(ArrayList<Tarea> listaTareas, String nombre){

        for (Tarea i : listaTareas){
            if (i.nombre.equals(nombre)){
                System.out.println("Ya hay una tarea con ese nombre");
                return null;
            }
        }
        Tarea miTarea = crearTarea(nombre);
        listaTareas.add(miTarea);
        return listaTareas;
    }

    public static ArrayList<Tarea> borrarTareaNombre(ArrayList<Tarea> listaTareas, String nombre){

        for (Tarea i : listaTareas){
            if (i.nombre.equals(nombre)){
                listaTareas.remove(i);
                return listaTareas;
            }
        }
        System.out.println("No hay ninguna tarea con ese nombre");
        return null;
    }

   public static ArrayList<Tarea> mostrarTareasResponsable(ArrayList<Tarea> listaTareas, String personaResponsable){
        ArrayList<Tarea> tareasPersonaResponsable = new ArrayList<Tarea>();
        for(Tarea i : listaTareas){
            if (i.personaResponsable.equals(personaResponsable)){
                tareasPersonaResponsable.add(i);
            }

        }
        return tareasPersonaResponsable;
   }

   public void marcarFinalizada(){
        setFinalizada(true);
   }

   public static String mostrarLista(ArrayList<Tarea> listaTareas){
        String msg = "";
       for(Tarea i : listaTareas){
           msg = msg + i.toString();
           msg = msg + "\n----------------------";
       }

       return msg;
   }


}
