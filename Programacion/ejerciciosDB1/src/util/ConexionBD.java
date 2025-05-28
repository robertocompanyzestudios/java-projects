package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static String user = "tienda";
    private static String passwd = "tienda";
    private static String url = "jdbc:mysql://r2d2:3306/tienda";
    private static Connection connection;

    private ConexionBD(){}

    public static Connection getInstance() throws SQLException {

        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url, user, passwd);
        }
        return connection;

    }

    public void disableConection(Connection conn) {

        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
