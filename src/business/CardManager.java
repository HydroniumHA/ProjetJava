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
        // TESTS A FAIRE !!!
        dao.addCard(card);
    }

    public ArrayList<Card> getAllCards() throws AllCardsException {
        return dao.getAllCards();
    }
}
