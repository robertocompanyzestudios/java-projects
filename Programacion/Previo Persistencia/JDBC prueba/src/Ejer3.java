import java.sql.*;
import java.util.Scanner;

public class Ejer3 {
        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception e){
                throw new RuntimeException(e);
            }


            String url = "jdbc:mysql://localhost:3306/tienda";
            String usuario= "root";
            String pass="toor";

            Scanner teclado = new Scanner(System.in);

            try{
                Connection conn = DriverManager.getConnection(url, usuario, pass);
                System.out.println("Conexión establecida");

                Statement stmt = conn.createStatement();

                System.out.println("Introduzca el producto a buscar: ");

                String busqueda =  teclado.nextLine();
                String consulta = "SELECT nombre, precio, id_fabricante as fabricante FROM producto where nombre Regexp'.*" + busqueda + ".*';";


                ResultSet rs = stmt.executeQuery(consulta);

                while(rs.next()){
                    System.out.println(rs.getString("nombre") + " - " + rs.getString("precio") + " Fabricante: " + rs.getString("fabricante"));

                }



                rs.close();

            } catch (SQLException e){
                throw new RuntimeException(e);
            }




        }

}
