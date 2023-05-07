package userInterface;

import model.*;
import javax.swing.table.AbstractTableModel;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class AllRepairOrdersModel extends AbstractTableModel {
    private ArrayList<String> columnNames;
    private ArrayList<RepairOrder> contents;

    public AllRepairOrdersModel(ArrayList<RepairOrder> repairOrders) {
        contents = new ArrayList<>(repairOrders);
        columnNames = new ArrayList<>();
        columnNames.add("RepairID");
        columnNames.add("IssueDate");
        columnNames.add("RepairDate");
        columnNames.add("Comments");
        columnNames.add("BikeID");
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
        RepairOrder repairOrder = contents.get(row);

        switch (column) {
            case 0: return repairOrder.getRepairID();
            case 1: return java.util.Date.from(repairOrder.getIssueDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            case 2: return java.util.Date.from(repairOrder.getRepairDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            case 3: return repairOrder.getComments();
            case 4: return repairOrder.getBike();
            default: return null;
        }
    }

    public Class getColumnClass(int column) {
        Class c;

        switch (column) {
            case 1, 2:
                c = Date.class;
                break;
            case 0, 3, 4:
            default:
                c = String.class;
        }
        return c;
    }
}
