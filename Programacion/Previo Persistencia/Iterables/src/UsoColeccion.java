import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;



public class UsoColeccion {
    /**
     * método genérico que realiza algún tratamiento sobre una Collection
     * @param coleccion
     */
    public static void hacerAlgo(Collection coleccion) {
        Iterator iterador = coleccion.iterator();
        while (iterador.hasNext()) {
            Object objeto = iterador.next();
//hace algo con objeto ...
        }
    }

    /**
     * llamadas al método hacerAlgo() con diferentes subtipos de Collection.
     */
    public static void main(String[] args) {

// No importa la variedad de Collection que se use.
        Stack pila = new Stack();
        List lista = new ArrayList();
        hacerAlgo(pila);
        hacerAlgo(lista);

// Hay disponibles métodos comunes para añadir y eliminar elementos.
        String cad1 = "Esto es una prueba";
        String cad2 = "Esto es otra prueba";
        Collection coleccion = new LinkedList();
        boolean huboUnCambio = coleccion.add(cad1);
        System.out.println(coleccion.add(cad2));
        if (coleccion.remove(cad1)) {
            System.out.println("Se eliminó...");
        }

        // Añade elementos de una colección a otra.
        lista.addAll(coleccion);

        // Elimina elementos de una colección contenidos en otra.
        lista.removeAll(coleccion);

        // Elimina elementos de una colección que no están en otra.
        lista.retainAll(coleccion);

        if (coleccion.contains("Esto es una prueba")) {
            System.out.println("Se encontró...");
        }
        if (lista.containsAll(coleccion)) {
            System.out.println("Se encontraron...");
        }
        System.out.println("Número de elementos: " + coleccion.size());
    }
}
