package dataAccess;

import model.*;
import java.util.ArrayList;

public interface CardDataAccess {
    void addCard(Card card) throws AddCardException;
    public ArrayList<Card> getAllCards() throws AllCardsException;
}
