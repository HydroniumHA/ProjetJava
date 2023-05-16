package dataAccess;

import model.*;
import java.sql.*;
import java.util.HashMap;

public class AddressDBAccess implements AddressDataAccess {
    public void addAddress(Address address) throws AddAddressException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "INSERT INTO address VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, address.getAddressID());
            statement.setString(2, address.getStreet());
            statement.setInt(3, address.getStreetNumber());
            statement.setString(4, address.getCityName());
            statement.setInt(5, address.getZip());
            statement.executeUpdate();
        } catch (SQLException | ConnectionException exception) {
            throw new AddAddressException();
        }
    }

    public HashMap<Address, String> getAddress(String cardID) throws AddressException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = new StringBuilder()
                    .append("SELECT addr.addressID, streetNumber, street, cityName, zip, subscriptionID ")
                    .append("FROM card ")
                    .append("JOIN subscription ON subscriptionID = subscription ")
                    .append("JOIN person per ON nationalRegistrationNumber = person ")
                    .append("JOIN address addr ON addr.addressID = per.addressID ")
                    .append("WHERE cardID = ?")
                    .toString();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cardID);
            ResultSet data = statement.executeQuery();
            HashMap<Address, String> allAddress = new HashMap<>();
            Address address;
            while (data.next()) {
                address = new Address(data.getString("addressID"), data.getString("street"), data.getInt("streetNumber"), data.getString("cityName"), data.getInt("zip"));
                allAddress.put(address, data.getString("subscriptionID"));
            }
            return allAddress;
        } catch (SQLException | ConnectionException exception) {
            throw new AddressException();
        }
    }
}
