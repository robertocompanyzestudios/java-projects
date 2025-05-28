package ejerciciosDB2.src.datos;

import ejerciciosDB2.src.modulo.Producto;

import java.util.List;

public interface ProductoDAO {

    List<Producto> getProductos(double precioMin);

}
