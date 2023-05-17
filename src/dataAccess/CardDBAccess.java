package dataAccess;

import model.*;
import java.sql.*;
import java.util.ArrayList;

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
        } catch (SQLException | ConnectionException exception) {
            throw new AddCardException();
        }
    }

    public ArrayList<Card> getAllCards() throws AllCardsException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "SELECT * FROM card";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet data = statement.executeQuery();
            ArrayList<Card> allCards = new ArrayList<>();
            Card card;
            while (data.next()) {
                card = new Card(data.getString("cardID"), data.getDate("creationDate").toLocalDate(), data.getString("subscription"));
                allCards.add(card);
            }
            return allCards;
        } catch (SQLException | ConnectionException | SettorException exception) {
            throw new AllCardsException();
        }
    }

    public void deleteCard(String nationalRegistrationNumber) throws DeleteCardException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = new StringBuilder()
                    .append("SELECT cardID ")
                    .append("FROM card ")
                    .append("JOIN subscription ON subscription = subscriptionID ")
                    .append("JOIN person ON person = nationalRegistrationNumber ")
                    .append("WHERE nationalRegistrationNumber = ? ")
                    .toString();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nationalRegistrationNumber);
            ResultSet data = statement.executeQuery();
            String cardID = null;
            while (data.next()) {
                cardID = data.getString("cardID");
            }
            sql = "DELETE FROM card WHERE cardID = ?";
            PreparedStatement statement2 = connection.prepareStatement(sql);
            statement2.setString(1, cardID);
            statement2.executeUpdate();
        } catch (SQLException | ConnectionException exception) {
            throw new DeleteCardException();
        }
    }
}
