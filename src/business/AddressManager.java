package business;

import dataAccess.*;
import model.*;

import java.util.ArrayList;
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

    public ArrayList<Address> getPersonAddress(String nationalRegistrationNumber) throws AddressException {
        //TESTS A FAIRE !!!
        return dao.getPersonAddress(nationalRegistrationNumber);
    }

    public void updateAddress(Address address) throws UpdateAddressException {
        //TESTS A FAIRE !!!
        dao.updateAddress(address);
    }
}
