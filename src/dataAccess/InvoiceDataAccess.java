package dataAccess;

import model.*;
import java.util.HashMap;

public interface InvoiceDataAccess {
    HashMap<Invoice, String> getAllInvoices(String cityName, double minAmount) throws AllInvoicesException;
}
