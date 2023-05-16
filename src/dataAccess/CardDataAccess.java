package dataAccess;

import model.*;
import java.util.ArrayList;

public interface CardDataAccess {
    void addCard(Card card) throws AddCardException;

    ArrayList<Card> getAllCards() throws AllCardsException;

    void deleteCard(String nationalRegistrationNumber) throws DeleteCardException;
}
