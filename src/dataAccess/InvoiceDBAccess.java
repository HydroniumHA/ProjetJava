package dataAccess;

import model.*;
import java.sql.*;
import java.util.HashMap;

public class InvoiceDBAccess {
    public HashMap<Invoice, String> getAllInvoices(String cityName, double minAmount) throws AllInvoicesException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "SELECT"; // !!!!! pas fini
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet data = statement.executeQuery();
            HashMap<Invoice, String> allInvoices = new HashMap<>();
            Invoice invoice;
            while (data.next()) {
                invoice = new Invoice(data.getString("documentID"), data.getDate("date").toLocalDate(), data.getDouble("totalPriceWithoutVAT"), data.getDouble("totalPriceIncludingVAT"), data.getBoolean("isPaid"), data.getString("subscriptionID"));
                allInvoices.put(invoice, data.getString("name"));
            }
            connection.close();
            return allInvoices;
        } catch (SQLException exception) {
            throw new AllInvoicesException();
        }
    }
}
