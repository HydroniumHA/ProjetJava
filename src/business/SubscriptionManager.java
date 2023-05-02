package business;

import dataAccess.*;
import model.*;

public class SubscriptionManager {
    private SubscriptionDataAccess dao;

    public SubscriptionManager() {
        this.dao = new SubscriptionDBAccess();
    }

    public void addSubscription(Subscription subscription) throws AddSubscriptionException {
        // TESTS A FAIRE !!!
        dao.addSubscription(subscription);
    }
}
