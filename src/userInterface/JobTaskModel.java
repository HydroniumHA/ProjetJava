package userInterface;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.HashMap;

public class JobTaskModel extends AbstractTableModel {
    private ArrayList<String> columnNames;
    private HashMap<String, Double> contents;

    public JobTaskModel(HashMap<String, Double> averageBuildingRepairTime) {
        contents = new HashMap<>(averageBuildingRepairTime);
        columnNames = new ArrayList<>();
        columnNames.add("BuildingID");
        columnNames.add("AverageRepairTime");
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
        String buildingID = (String)contents.keySet().toArray()[row];

        switch (column) {
            case 0: return buildingID;
            case 1: return contents.get(buildingID);
            default: return null;
        }
    }

    public Class getColumnClass(int column) {
        Class c;

        switch (column) {
            case 1:
                c = Double.class;
                break;
            case 0:
            default:
                c = String.class;
        }
        return c;
    }
}
