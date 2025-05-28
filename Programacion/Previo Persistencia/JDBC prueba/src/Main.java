import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e){
            throw new RuntimeException(e);
        }


        String url = "jdbc:mysql://localhost:3306/tienda";
        String usuario= "root";
        String pass="toor";


        try{
            Connection conn = DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexión establecida");

            Statement stmt = conn.createStatement();

            String consulta = "SELECT * FROM producto";
            ResultSet rs = stmt.executeQuery(consulta);

            while(rs.next()){
                System.out.println(rs.getString("nombre") + " - " + rs.getString(3) + "€");

            }

            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet rs2 = metaData.getCatalogs();

            System.out.println("BD del sistema: ");
            while (rs2.next()){
                System.out.println(rs2.getRow() + "." + rs2.getString(1));
            }

            String insert1 = "INSERT INTO tienda.producto (id, nombre, precio, id_fabricante) " +
                    "VALUES ('19', 'platano', 19.99, 2)";

            String insert2 = "INSERT INTO tienda.producto (id, nombre, precio, id_fabricante) " +
                    "VALUES ('20', 'portatil innecesariamente caro(Mac)', 1500.0, 2)";
            String insert3 = "INSERT INTO tienda.producto (id, nombre, precio, id_fabricante) " +
                    "VALUES ('21', 'cono de chocolate', 4.99, 2)";
            //int filasAfectadas = stmt.executeUpdate(insert1);

            //System.out.println("Filas afectadas por el INSERT: " + filasAfectadas);


            stmt.executeUpdate("DELETE FROM producto WHERE id >= 19");
            conn.setAutoCommit(false);

            stmt.addBatch(insert1);
            stmt.addBatch(insert2);
            stmt.addBatch(insert3);
            int [] filas_afectadas = stmt.executeBatch();

            for (int i = 0; i < filas_afectadas.length; i++){
                System.out.println("Insert " + (i+1) + " - Filas afectadas: " + filas_afectadas[i]);
            }

            conn.commit();

            rs.close();

        } catch (SQLException e){
            throw new RuntimeException(e);
        }




    }
}
