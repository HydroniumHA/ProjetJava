package userInterface;

import model.*;
import javax.swing.table.AbstractTableModel;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class AllInvoicesModel extends AbstractTableModel {
    private ArrayList<String> columnNames;
    private HashMap<Invoice, String> contents;

    public AllInvoicesModel(HashMap<Invoice, String> invoices) {
        contents = new HashMap<>(invoices);
        columnNames = new ArrayList<>();
        columnNames.add("Name");
        columnNames.add("TotalPriceIncludingVAT");
        columnNames.add("DocumentID");
        columnNames.add("InvoiceDate");
        columnNames.add("IsPaid");
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
        Invoice invoice = (Invoice)contents.keySet().toArray()[row];

        switch (column) {
            case 0: return contents.get(invoice);
            case 1: return invoice.getTotalPriceIncludingVAT();
            case 2: return invoice.getDocumentID();
            case 3: return java.util.Date.from(invoice.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
            case 4: return invoice.getPaid();
            default: return null;
        }
    }

    public Class getColumnClass(int column) {
        Class c;

        switch (column) {
            case 1:
                c = Double.class;
                break;
            case 3:
                c = Date.class;
                break;
            case 4:
                c = Boolean.class;
                break;
            case 0, 2:
            default:
                c = String.class;
        }
        return c;
    }
}
