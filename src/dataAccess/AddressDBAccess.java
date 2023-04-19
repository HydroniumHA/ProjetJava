package dataAccess;

import model.*;
import java.sql.*;

public class AddressDBAccess {
    public void addAddress(Address address) throws AddAddressException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "INSERT INTO address VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, address.getAddressID().toString());
            statement.setString(2, address.getStreet());
            statement.setInt(3, address.getNumber());
            statement.setString(4, address.getCityName());
            statement.setInt(5, address.getPostalCode());
            statement.executeUpdate();
            connection.close();
        } catch (SQLException exception) {
            throw new AddAddressException();
        }
    }
}
