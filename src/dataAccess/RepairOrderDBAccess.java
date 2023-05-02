package dataAccess;

import model.*;
import java.sql.*;
import java.util.HashMap;

public class RepairOrderDBAccess implements RepairOrderDataAccess {
    public HashMap<Bike, String> getAllRepairOrders(String buildingID) throws AllRepairOrdersException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "SELECT"; // !!!!! pas fini
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet data = statement.executeQuery();
            HashMap<Bike, String> allRepairOrders = new HashMap<>();
            while (data.next()) {
                Bike bike = new Bike(data.getString("bikeID"), data.getString("model"), data.getString("brand"), data.getDate("purchaseDate").toLocalDate(), data.getDouble("value"), data.getBoolean("isDeclassified"));
                allRepairOrders.put(bike, data.getString("repairID"));
            }
            return allRepairOrders;
        } catch (SQLException exception) {
            throw new AllRepairOrdersException();
        }
    }
}
