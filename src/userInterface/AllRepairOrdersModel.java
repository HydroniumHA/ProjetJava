package userInterface;

import model.*;
import javax.swing.table.AbstractTableModel;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class AllRepairOrdersModel extends AbstractTableModel {
    private ArrayList<String> columnNames;
    private HashMap<Bike, String> contents;

    public AllRepairOrdersModel(HashMap<Bike, String> repairOrders) {
        contents = new HashMap<>(repairOrders);
        columnNames = new ArrayList<>();
        columnNames.add("BikeID");
        columnNames.add("Model");
        columnNames.add("Brand");
        columnNames.add("purchaseDate");
        columnNames.add("repairID");
    }

    public int getColumnCount() {
        return columnNames.size();
    }

    public int getRowCount() {
        return contents.size();
    }

    public String getColumnName(int column) {
        return columnNames.get(column);
    }

    public Object getValueAt(int row, int column) {
        Bike bike = (Bike)contents.keySet().toArray()[row];

        switch (column) {
            case 0: return bike.getBikeID();
            case 1: return bike.getModel();
            case 2: return bike.getBrand();
            case 3: return java.util.Date.from(bike.getPurchaseDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            case 4: return contents.get(bike);
            default: return null;
        }
    }

    public Class getColumnClass(int column) {
        Class c;

        switch (column) {
            case 3:
                c = Date.class;
                break;
            case 0, 1, 2, 4:
            default:
                c = String.class;
        }
        return c;
    }
}
