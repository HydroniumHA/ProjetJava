package dataAccess;

import model.*;

public interface SubscriptionDataAccess {
    void addSubscription(Subscription subscription) throws AddSubscriptionException;
}
