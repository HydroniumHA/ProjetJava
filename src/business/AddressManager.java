package business;

import dataAccess.AddressDBAccess;
import model.AddAddressException;
import model.Address;

public class AddressManager {
    private AddressDBAccess dao;

    public AddressManager() {
        this.dao = new AddressDBAccess();
    }

    public void addAddress(Address address) throws AddAddressException {
        //TESTS A FAIRE !!!
        dao.addAddress(address);
    }
}
