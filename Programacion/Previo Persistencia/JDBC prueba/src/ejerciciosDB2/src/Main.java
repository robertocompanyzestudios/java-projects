package ejerciciosDB2.src;

import datos.ProductoDAO;
import datos.ProductoDAOImpl;
import modulo.Producto;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductoDAO dao = new ProductoDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un precio mínimo: ");
        double precioMin = sc.nextDouble();

        List<Producto> productos = dao.getProductos(precioMin);

        System.out.println("---- Productos ----");
        for (Producto producto : productos) {

            System.out.println(producto);
            System.out.println("--------------------------------------------------------");
        }
    }
}
