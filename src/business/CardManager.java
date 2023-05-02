package business;

import dataAccess.*;
import model.*;

public class CardManager {
    private CardDataAccess dao;

    public CardManager() {
        this.dao = new CardDBAccess();
    }

    public void addCard(Card card) throws AddCardException {
        // TESTS A FAIRE !!!
        dao.addCard(card);
    }
}
