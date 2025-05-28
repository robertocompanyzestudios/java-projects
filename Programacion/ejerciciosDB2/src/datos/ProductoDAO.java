package datos;

import modulo.Producto;

import java.util.List;

public interface ProductoDAO {

    List<Producto> getProductos(double precioMin);

}
