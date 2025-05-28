package datos;

import modulo.Producto;

import java.util.List;

public interface ProductoDAO {

    List<Producto> getProductos(String nombre);

    void añadirProducto(String nombre, Double precio, int fabricante);

    void eliminarProducto(String nombre, Double precio, int fabricante);

}
