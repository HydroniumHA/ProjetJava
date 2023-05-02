package dataAccess;

import javax.swing.*;
import java.sql.*;

public class SingletonConnection {
    private static Connection uniqueConnection;

    public static Connection getInstance() {
        if (uniqueConnection == null) {
            try {
                uniqueConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/libiavelodb","root","Xps923cr");
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(null, exception, "SQL Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return uniqueConnection;
    }
}
