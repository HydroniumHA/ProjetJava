package dataAccess;

import model.*;
import java.util.HashMap;

public interface RepairOrderDataAccess {
    HashMap<Bike, String> getAllRepairOrders(String buildingID) throws AllRepairOrdersException;
}
