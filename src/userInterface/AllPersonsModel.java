package userInterface;

import model.*;
import javax.swing.table.AbstractTableModel;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class AllPersonsModel extends AbstractTableModel {
    private ArrayList<String> columnNames;
    private HashMap<Person, String> contents;

    public AllPersonsModel(HashMap<Person, String> persons) {
        contents = new HashMap<>(persons);
        columnNames = new ArrayList<>();
        columnNames.add("Name");
        columnNames.add("Firstname");
        columnNames.add("Birthdate");
        columnNames.add("Gender");
        columnNames.add("CardID");
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
        Person person = (Person) contents.keySet().toArray()[row];

        switch (column) {
            case 0:
                return person.getName();
            case 1:
                return person.getFirstName();
            case 2:
                return java.util.Date.from(person.getBirthdate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            case 3:
                return person.getGender();
            case 4:
                return contents.get(person);
            default:
                return null;
        }
    }

    public Class getColumnClass(int column) {
        Class c;

        switch (column) {
            case 2:
                c = Date.class;
                break;
            case 3:
                c = Character.class;
                break;
            case 0, 1, 4:
            default:
                c = String.class;
        }
        return c;
    }
}