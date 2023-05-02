package business;

import dataAccess.*;
import model.*;
import java.util.HashMap;

public class RepairOrderManager {
    private RepairOrderDataAccess dao;

    public RepairOrderManager() {
        this.dao = new RepairOrderDBAccess();
    }

    public HashMap<Bike, String> getAllRepairOrders(String buildingID) throws AllRepairOrdersException {
        // TESTS A FAIRE !!!
        return dao.getAllRepairOrders(buildingID);
    }
}
