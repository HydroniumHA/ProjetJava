package userInterface;

import model.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.HashMap;

public class AddressModel extends AbstractTableModel {
    private ArrayList<String> columnNames;
    private HashMap<Address, String> contents;

    public AddressModel(HashMap<Address, String> address) {
        contents = new HashMap<>(address);
        columnNames = new ArrayList<>();
        columnNames.add("StreetNumber");
        columnNames.add("Street");
        columnNames.add("CityName");
        columnNames.add("Zip");
        columnNames.add("SubscriptionID");
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
        Address address = (Address)contents.keySet().toArray()[row];

        switch (column) {
            case 0: return address.getStreetNumber();
            case 1: return address.getStreet();
            case 2: return address.getCityName();
            case 3: return address.getZip();
            case 4: return contents.get(address);
            default: return null;
        }
    }

    public Class getColumnClass(int column) {
        Class c;

        switch (column) {
            case 0, 3:
                c = Integer.class;
                break;
            case 1, 2, 4:
            default:
                c = String.class;
        }
        return c;
    }
}
