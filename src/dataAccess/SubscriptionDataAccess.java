package dataAccess;

import model.*;

public interface SubscriptionDataAccess {
    void addSubscription(Subscription subscription) throws AddSubscriptionException;

    void deleteSubscription(String nationalRegistrationNumber) throws DeleteSubscriptionException;
}
