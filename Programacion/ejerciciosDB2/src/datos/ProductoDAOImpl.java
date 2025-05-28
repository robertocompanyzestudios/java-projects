package datos;

import modulo.Producto;
import utils.BDConection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO{
    @Override
    public List<Producto> getProductos(double precioMin) {

        ArrayList<Producto> productos = new ArrayList<>();
        try {
            Connection conn = BDConection.getInstance();

            String sql = "SELECT nombre, precio, id_fabricante from producto " +
                    "where precio >= ? " +
                    "order by precio asc";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, precioMin);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {

                String nombre = rs.getString("nombre");
                double euros = rs.getDouble("precio");
                String idFabricante = rs.getString("id_fabricante");

                productos.add(new Producto(nombre, euros, idFabricante));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return productos;

    }
}
