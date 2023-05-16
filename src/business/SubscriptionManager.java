package business;

import dataAccess.*;
import model.*;

public class SubscriptionManager {
    private SubscriptionDataAccess dao;

    public SubscriptionManager() {
        this.dao = new SubscriptionDBAccess();
    }

    public void addSubscription(Subscription subscription) throws AddSubscriptionException {
        if (subscription.getSubscriptionID() != null && subscription.getStartDate() != null && String.valueOf(subscription.getExpectedDuration()).matches("^\\d+$") && subscription.getPersonID() != null) {
            dao.addSubscription(subscription);
        } else {
            throw new AddSubscriptionException();
        }
    }

    public void deleteSubscription(String nationalRegistrationNumber) throws DeleteSubscriptionException {
        if (nationalRegistrationNumber.matches("^\\d{2}\\.\\d{2}\\.\\d{2}-\\d{3}\\.\\d{2}$")) {
            dao.deleteSubscription(nationalRegistrationNumber);
        } else {
            throw new DeleteSubscriptionException();
        }
    }
}
