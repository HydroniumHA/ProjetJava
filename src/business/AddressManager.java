package business;

import dataAccess.*;
import model.*;
import java.util.HashMap;

public class AddressManager {
    private AddressDataAccess dao;

    public AddressManager() {
        this.dao = new AddressDBAccess();
    }

    public void addAddress(Address address) throws AddAddressException {
        //TESTS A FAIRE !!!
        dao.addAddress(address);
    }

    public HashMap<Address, String> getAddress(String cardID) throws AddressException {
        //TESTS A FAIRE !!!
        return dao.getAddress(cardID);
    }
}
