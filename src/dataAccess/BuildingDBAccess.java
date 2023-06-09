package dataAccess;

import model.*;
import java.sql.*;
import java.util.ArrayList;

public class BuildingDBAccess implements BuildingDataAccess {
    public ArrayList<Building> getAllBuildings() throws AllBuildingsException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "SELECT * FROM building";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet data = statement.executeQuery();
            ArrayList<Building> allBuildings = new ArrayList<>();
            Building building;
            while (data.next()) {
                if (data.getString("buildingType").equals("Workshop")) {
                    building = new Building(data.getString("buildingID"), data.getInt("numberMaxPlaces"), data.getInt("numberOccupiedPlaces"), data.getString("buildingType"), data.getString("address"));
                    allBuildings.add(building);
                }
            }
            return allBuildings;
        } catch (SQLException | ConnectionException | SettorException exception) {
            throw new AllBuildingsException();
        }
    }
}
