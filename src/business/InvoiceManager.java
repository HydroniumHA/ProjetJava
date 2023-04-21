package business;

import dataAccess.InvoiceDBAccess;
import model.AllInvoicesException;
import model.Invoice;

import java.util.ArrayList;

public class InvoiceManager {
    private InvoiceDBAccess dao;

    public InvoiceManager() {
        this.dao = new InvoiceDBAccess();
    }

    public ArrayList<Invoice> getAllInvoices(String cityName, double minAmount) throws AllInvoicesException {
        return dao.getAllInvoices(cityName, minAmount);
    }
}
