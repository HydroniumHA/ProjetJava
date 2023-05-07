package dataAccess;

import model.*;
import java.sql.*;
import java.util.ArrayList;

public class RepairOrderDBAccess implements RepairOrderDataAccess {
    public ArrayList<RepairOrder> getAllRepairOrders(String buildingID) throws AllRepairOrdersException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "SELECT"; // !!!!! pas fini
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet data = statement.executeQuery();
            ArrayList<RepairOrder> allRepairOrders = new ArrayList<>();
            RepairOrder repairOrder;
            while (data.next()) {
                repairOrder = new RepairOrder(data.getString("repairID"), data.getDate("issueDate").toLocalDate(), data.getDate("repairDate").toLocalDate(), data.getString("comments"), data.getString("bikeID"));
                allRepairOrders.add(repairOrder);
            }
            return allRepairOrders;
        } catch (SQLException exception) {
            throw new AllRepairOrdersException();
        }
    }
}
