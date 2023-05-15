package dataAccess;

import model.*;
import java.sql.*;
import java.util.ArrayList;

public class RepairOrderDBAccess implements RepairOrderDataAccess {
    public ArrayList<RepairOrder> getAllRepairOrders(String buildingID) throws AllRepairOrdersException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = new StringBuilder()
                    .append("SELECT repairID, issueDate, repairDate, comments, bikeID ")
                    .append("FROM building ")
                    .append("JOIN movementOrder ON departureBuilding = buildingID ")
                    .append("JOIN bike ON bike = bikeID ")
                    .append("JOIN repairOrder rep ON bikeID = rep.bike ")
                    .append("WHERE buildingID = ?")
                    .toString();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, buildingID);
            ResultSet data = statement.executeQuery();
            ArrayList<RepairOrder> allRepairOrders = new ArrayList<>();
            RepairOrder repairOrder;
            while (data.next()) {
                repairOrder = new RepairOrder(data.getString("repairID"), data.getDate("issueDate").toLocalDate(), data.getDate("repairDate").toLocalDate(), data.getString("comments"), data.getString("bikeID"));
                allRepairOrders.add(repairOrder);
            }
            return allRepairOrders;
        } catch (SQLException exception) {
            exception.printStackTrace();
            throw new AllRepairOrdersException();
        }
    }
}
