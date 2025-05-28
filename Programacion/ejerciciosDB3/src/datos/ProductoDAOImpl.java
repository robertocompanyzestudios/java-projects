package datos;

import modulo.Producto;
import utils.BDConection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO{
    @Override
    public List<Producto> getProductos(String nombreBusqueda) {

        ArrayList<Producto> productos = new ArrayList<>();
        try {
            Connection conn = BDConection.getInstance();

            String sql = "SELECT nombre, precio, id_fabricante from producto " +
                    "where nombre Regexp ? ";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ".*"+ nombreBusqueda + ".*");

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

    @Override
    public void añadirProducto(String nombre, Double precio, int fabricante) {
        try{
            Connection conn = BDConection.getInstance();
            String sql = "insert into producto(nombre, precio, id_fabricante) values (?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setDouble(2, precio);
            pstmt.setInt(3, fabricante);



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminarProducto(String nombre, Double precio, int fabricante) {
        try{
            Connection conn = BDConection.getInstance();
            String sql = "delete from producto where nombre = ? and preccio = ? and id_fabricante = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setDouble(2, precio);
            pstmt.setInt(3, fabricante);



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
