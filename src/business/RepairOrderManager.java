package business;

import dataAccess.*;
import model.*;
import java.util.ArrayList;

public class RepairOrderManager {
    private RepairOrderDataAccess dao;

    public RepairOrderManager() {
        this.dao = new RepairOrderDBAccess();
    }

    public ArrayList<RepairOrder> getAllRepairOrders(String buildingID) throws AllRepairOrdersException {
        // TESTS A FAIRE !!!
        return dao.getAllRepairOrders(buildingID);
    }
}
