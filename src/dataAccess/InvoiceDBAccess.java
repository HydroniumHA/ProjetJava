package dataAccess;

import model.*;
import java.sql.*;
import java.util.HashMap;

public class InvoiceDBAccess implements InvoiceDataAccess {
    public HashMap<Invoice, String> getAllInvoices(String cityName, double minAmount) throws AllInvoicesException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = new StringBuilder()
                    .append("SELECT lastName, totalPriceWithoutVAT, totalPriceIncludingVAT, documentID, invoiceDate, isPaid, subscriptionID ")
                    .append("FROM address ")
                    .append("JOIN person per ON per.addressID = address.addressID ")
                    .append("JOIN subscription ON person = nationalRegistrationNumber ")
                    .append("JOIN invoice ON subscription = subscriptionID ")
                    .append("WHERE cityName = ? ")
                    .append("AND totalPriceIncludingVAT > ?")
                    .toString();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cityName);
            statement.setDouble(2, minAmount);
            ResultSet data = statement.executeQuery();
            HashMap<Invoice, String> allInvoices = new HashMap<>();
            Invoice invoice;
            while (data.next()) {
                invoice = new Invoice(data.getString("documentID"), data.getDate("invoiceDate").toLocalDate(), data.getDouble("totalPriceWithoutVAT"), data.getDouble("totalPriceIncludingVAT"), data.getBoolean("isPaid"), data.getString("subscriptionID"));
                allInvoices.put(invoice, data.getString("lastName"));
            }
            return allInvoices;
        } catch (SQLException | ConnectionException exception) {
            exception.printStackTrace();
            throw new AllInvoicesException();
        }
    }
}
