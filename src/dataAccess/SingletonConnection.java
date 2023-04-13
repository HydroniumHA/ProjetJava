package dataAccess;

import java.sql.*;

public class SingletonConnection {
    private static Connection uniqueConnection;

    public static Connection getInstance() {
        if (uniqueConnection == null) {
            //DriverManager.getConnection("jdbc:mysql://localhost:3306/libiavelodb","root","mdpBD");
        }
        return uniqueConnection;
    }
}
