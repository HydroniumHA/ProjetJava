package business;

import dataAccess.*;
import model.*;
import java.util.ArrayList;

public class CardManager {
    private CardDataAccess dao;

    public CardManager() {
        this.dao = new CardDBAccess();
    }

    public void addCard(Card card) throws AddCardException {
        if (card.getCardID() != null && card.getCreationDate() != null && card.getSubscriptionID() != null) {
            dao.addCard(card);
        } else {
            throw new AddCardException();
        }
    }

    public ArrayList<Card> getAllCards() throws AllCardsException {
        return dao.getAllCards();
    }

    public void deleteCard(String nationalRegistrationNumber) throws DeleteCardException {
        if (nationalRegistrationNumber.matches("^\\d{2}\\.\\d{2}\\.\\d{2}-\\d{3}\\.\\d{2}$")) {
            dao.deleteCard(nationalRegistrationNumber);
        } else {
            throw new DeleteCardException();
        }
    }
}
