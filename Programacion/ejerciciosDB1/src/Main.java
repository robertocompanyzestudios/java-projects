import datos.ProductoDAO;
import datos.ProductoDAOImpl;
import modelo.Producto;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        ProductoDAO dao = new ProductoDAOImpl();
        List<Producto> productos = dao.getProductos();

        System.out.println("---- Productos ----");
        for (Producto producto : productos) {

            System.out.println(producto);
            System.out.println("--------------------------------------------------------");
        }
    }
}
