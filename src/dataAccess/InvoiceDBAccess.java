package dataAccess;

import model.*;
import java.sql.*;
import java.util.ArrayList;

public class InvoiceDBAccess {
    public ArrayList<Invoice> getAllInvoices(String cityName, double minAmount) throws AllInvoicesException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "SELECT"; // !!!!! pas fini
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet data = statement.executeQuery();
            ArrayList<Invoice> allInvoices = new ArrayList<>();
            Invoice invoice;
            while (data.next()) {
                invoice = new Invoice(data.getString("documentID"), data.getDate("date").toLocalDate(), data.getDouble("totalPriceWithoutVAT"), data.getDouble("totalPriceIncludingVAT"), data.getBoolean("isPaid"));
                allInvoices.add(invoice);
            }
            connection.close();
            return allInvoices;
        } catch (SQLException exception) {
            throw new AllInvoicesException();
        }
    }
}
