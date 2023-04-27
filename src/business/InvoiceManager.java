package business;

import dataAccess.InvoiceDBAccess;
import model.*;
import java.util.HashMap;

public class InvoiceManager {
    private InvoiceDBAccess dao;

    public InvoiceManager() {
        this.dao = new InvoiceDBAccess();
    }

    public HashMap<Invoice, String> getAllInvoices(String cityName, double minAmount) throws AllInvoicesException {
        // TESTS A FAIRE !!!
        return dao.getAllInvoices(cityName, minAmount);
    }
}
