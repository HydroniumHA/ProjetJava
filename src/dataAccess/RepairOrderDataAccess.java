package dataAccess;

import model.*;
import java.util.ArrayList;

public interface RepairOrderDataAccess {
    ArrayList<RepairOrder> getAllRepairOrders(String buildingID) throws AllRepairOrdersException;
}
