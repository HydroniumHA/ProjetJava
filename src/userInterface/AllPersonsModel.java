package userInterface;

import model.*;
import javax.swing.table.AbstractTableModel;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class AllPersonsModel extends AbstractTableModel {
    private ArrayList<String> columnNames;
    private ArrayList<Person> contents;

    public AllPersonsModel(ArrayList<Person> persons) {
        contents = new ArrayList<>(persons);
        columnNames = new ArrayList<>();
        columnNames.add("NationalRegistrationNumber");
        columnNames.add("Name");
        columnNames.add("Firstname");
        columnNames.add("Birthdate");
        columnNames.add("Gender");
        columnNames.add("Email");
        columnNames.add("WantsNewsLetter");
        columnNames.add("PhoneNumber");
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
        Person person = contents.get(row);

        switch (column) {
            case 0:
                return person.getNationalRegistrationNumber();
            case 1:
                return person.getLastName();
            case 2:
                return person.getFirstName();
            case 3:
                return java.util.Date.from(person.getBirthdate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            case 4:
                return person.getGender();
            case 5:
                return person.getEmail();
            case 6:
                return person.getWantsNewsLetter();
            case 7:
                return person.getPhoneNumber();
            default:
                return null;
        }
    }

    public Class getColumnClass(int column) {
        Class c;

        switch (column) {
            case 3:
                c = Date.class;
                break;
            case 4:
                c = Character.class;
                break;
            case 6:
                c = Boolean.class;
                break;
            case 0, 1, 2, 5, 7:
            default:
                c = String.class;
        }
        return c;
    }
}