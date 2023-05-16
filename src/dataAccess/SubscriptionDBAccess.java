package dataAccess;

import model.*;
import java.sql.*;

public class SubscriptionDBAccess implements SubscriptionDataAccess {
    public void addSubscription(Subscription subscription) throws AddSubscriptionException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "INSERT INTO subscription (subscriptionID, startDate, expectedDuration, person) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, subscription.getSubscriptionID());
            statement.setDate(2, java.sql.Date.valueOf(subscription.getStartDate()));
            statement.setInt(3, subscription.getExpectedDuration());
            statement.setString(4, subscription.getPersonID());
            statement.executeUpdate();
            if (subscription.getEndDate() != null) {
                sql = "UPDATE subscription SET endDate = ? WHERE subscriptionID = ?";
                statement = connection.prepareStatement(sql);
                statement.setDate(1, java.sql.Date.valueOf(subscription.getEndDate()));
                statement.setString(2, subscription.getPersonID());
                statement.executeUpdate();
            }
        } catch (SQLException | ConnectionException exception) {
            throw new AddSubscriptionException();
        }
    }
}
