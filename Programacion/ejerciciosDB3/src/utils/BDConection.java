package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConection {

    private static String user = "root";
    private static String passwd = "toor";
    private static String url = "jdbc:mysql://localhost:3306/tienda";
    private static Connection connection;

        private BDConection(){}

        public static Connection getInstance() throws SQLException {

            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(url, user, passwd);
            }
            return connection;
        }
}
