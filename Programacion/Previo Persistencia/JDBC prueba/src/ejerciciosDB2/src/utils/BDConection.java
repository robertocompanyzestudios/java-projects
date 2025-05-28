package ejerciciosDB2.src.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConection {

    private static String user = "tienda";
    private static String passwd = "tienda";
    private static String url = "jdbc:mysql://r2d2:3306/tienda";
    private static Connection connection;

        private BDConection(){}

        public static Connection getInstance() throws SQLException {

            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(url, user, passwd);
            }
            return connection;
        }
}
