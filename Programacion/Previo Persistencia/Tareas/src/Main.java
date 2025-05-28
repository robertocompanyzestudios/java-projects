import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
        listaTareas.add(new Tarea("inventario", "Antonio Martínez", 10, "Almacen principal"));
        listaTareas.add(new Tarea("Sacar Pedido 7", "Hugo Guillen", 3, "Ala de pedidos"));

        listaTareas = Tarea.anadirTareaNombre(listaTareas, "Limpieza maquinaria");

        System.out.println(Tarea.mostrarLista(listaTareas));

        ArrayList<Tarea> tareasAntonioMartinez = Tarea.mostrarTareasResponsable(listaTareas, "Antonio Martínez");

        System.out.println(Tarea.mostrarLista(tareasAntonioMartinez));

        Tarea mitarea = Tarea.crearTarea("Comunicado");
        mitarea.marcarFinalizada();
        System.out.println(mitarea);





    }
}
