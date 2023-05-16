package dataAccess;

import model.ConnectionException;

import javax.swing.*;
import java.sql.*;

public class SingletonConnection {
    private static Connection uniqueConnection;

    public static Connection getInstance() throws ConnectionException {
        if (uniqueConnection == null) {
            try {
                uniqueConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/libiavelodb","root","Xps923cr");
            } catch (SQLException exception) {
                throw new ConnectionException();
            }
        }
        return uniqueConnection;
    }
}
