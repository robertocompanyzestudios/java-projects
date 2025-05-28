import datos.ProductoDAO;
import datos.ProductoDAOImpl;
import modulo.Producto;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductoDAO dao = new ProductoDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del producto: ");
        String busqueda = sc.nextLine();

        List<Producto> productos = dao.getProductos(busqueda);

        System.out.println("---- Productos ----");
        for (Producto producto : productos) {

            System.out.println(producto);
            System.out.println("--------------------------------------------------------");
        }
    }
}
