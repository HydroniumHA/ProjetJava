package business;

import dataAccess.*;
import model.*;
import java.util.HashMap;

public class InvoiceManager {
    private InvoiceDataAccess dao;

    public InvoiceManager() {
        this.dao = new InvoiceDBAccess();
    }

    public HashMap<Invoice, String> getAllInvoices(String cityName, double minAmount) throws AllInvoicesException {
        if (cityName != null && String.valueOf(minAmount).matches("^\\d+(\\.\\d+)?$")) {
            return dao.getAllInvoices(cityName, minAmount);
        }
        throw new AllInvoicesException();
    }
}
