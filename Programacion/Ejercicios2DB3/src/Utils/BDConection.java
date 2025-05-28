package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BDConection {

    private static String user = "root";
    private static String passwd = "toor";
    private static String url = "jdbc:mysql://localhost:3306/";
    private static String bd = "instituto";
    private static Connection connection;

        private BDConection(){}

        public static Connection getInstance() throws SQLException {

            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(url + bd, user, passwd);
            }
            return connection;
        }

        public static void crearBD() throws SQLException{
            try{
                Connection conn = DriverManager.getConnection(url, user, passwd);
                Statement stmt = conn.createStatement();

                String sql1 = "create database if not exists instituto;";
                stmt.executeUpdate(sql1);

                String sql2 = "use instituto;";
                stmt.executeUpdate(sql2);

                String sql3 = "create table if not exists alumno( " +
                        "id int primary key, " +
                        "nombre varchar(100), " +
                        "apellidos varchar(100), " +
                        "dni varchar(20), " +
                        "email varchar(100), " +
                        "direccion varchar(200), " +
                        "telefono varchar(20));";

                stmt.executeUpdate(sql3);

                String sql4 = "create table if not exists alumno_primaria( " +
                        "id int primary key, " +
                        "nombre varchar(100), " +
                        "apellidos varchar(100), " +
                        "dni varchar(20), " +
                        "email varchar(100), " +
                        "direccion varchar(200), " +
                        "telefono varchar(20), " +
                        "curso int);";

                stmt.executeUpdate(sql4);

                String sql5 = "create table if not exists alumno_fp( " +
                        "id int primary key, " +
                        "nombre varchar(100), " +
                        "apellidos varchar(100), " +
                        "dni varchar(20), " +
                        "email varchar(100), " +
                        "direccion varchar(200), " +
                        "telefono varchar(20)" +
                        "familia varchar(30));";

                stmt.executeUpdate(sql5);


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
