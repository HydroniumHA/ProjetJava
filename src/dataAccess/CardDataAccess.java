package dataAccess;

import model.*;

public interface CardDataAccess {
    void addCard(Card card) throws AddCardException;
}
