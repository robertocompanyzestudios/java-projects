package ejerciciosDB1.src.datos;

import util.ConexionBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import ejerciciosDB1.src.modelo.Producto;

public class ProductoDAOImpl implements ProductoDAO{

    private final double EUR_DOL = 1.13;

    @Override
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            Connection conn = ConexionBD.getInstance();
            Statement stmt = conn.createStatement();

            String sql = "SELECT nombre, precio FROM producto";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                String nombre = rs.getString("nombre");
                double euros = rs.getDouble("precio");
                double doll = euros * EUR_DOL;
                productos.add(new Producto(euros, doll, nombre));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return productos;
    }
}
