package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        String user = "postgres";
        String password = "postgres";
        String connectionUrl = "jdbc:postgresql://localhost:5432/testuser/userdb";
        Class.forName("org.postgresql.Driver");


        return  DriverManager.getConnection(connectionUrl, user, password);



    }
}