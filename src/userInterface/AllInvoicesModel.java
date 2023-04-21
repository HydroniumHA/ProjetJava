package userInterface;

import model.*;
import javax.swing.table.AbstractTableModel;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class AllInvoicesModel extends AbstractTableModel {
    private ArrayList<String> columnNames;
    private ArrayList<Invoice> contents;

    public AllInvoicesModel(ArrayList<Invoice> invoices) {
        columnNames = new ArrayList<>();
        columnNames.add("DocumentID");
        columnNames.add("Date");
        columnNames.add("TotalPriceWithoutVAT");
        columnNames.add("TotalPriceIncludingVAT");
        columnNames.add("isPaid");
        //setContents(invoices);
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
        Invoice invoice = contents.get(row);

        switch (column) {
            case 0: return invoice.getDocumentID();
            case 1: return java.util.Date.from(invoice.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            case 2: return invoice.getTotalPriceWithoutVAT();
            case 3: return invoice.getTotalPriceIncludingVAT();
            case 4: return invoice.getPaid();
            default: return null;
        }
    }

    public Class getColumnClass(int column) {
        Class c;

        switch (column) {
            case 0:
                c = String.class;
                break;
            case 1:
                c = Date.class;
                break;
            case 2, 3:
                c = Double.class;
                break;
            case 4:
                c = Boolean.class;
                break;
            default:
                c = String.class;
        }
        return c;
    }
}
