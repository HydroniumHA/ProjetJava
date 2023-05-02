package dataAccess;

import model.*;
import java.sql.*;

public class CardDBAccess implements CardDataAccess {
    public void addCard(Card card) throws AddCardException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "INSERT INTO card VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, card.getCardID());
            statement.setDate(2, java.sql.Date.valueOf(card.getCreationDate()));
            statement.setString(3, card.getSubscriptionID());
            statement.executeUpdate();
        } catch (SQLException exception) {
            throw new AddCardException();
        }
    }
}
