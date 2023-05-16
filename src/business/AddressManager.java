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
        if (address.getAddressID() != null && address.getStreet() != null && address.getStreetNumber().toString().matches("^\\d+$") && address.getCityName() != null && address.getZip().toString().matches("^\\d+$")) {
            dao.addAddress(address);
        } else {
            throw new AddAddressException();
        }
    }

    public HashMap<Address, String> getAddress(String cardID) throws AddressException {
        if (cardID != null) {
            return dao.getAddress(cardID);
        }
        throw new AddressException();
    }

    public ArrayList<Address> getPersonAddress(String nationalRegistrationNumber) throws AddressException {
        if (nationalRegistrationNumber.matches("^\\d{2}\\.\\d{2}\\.\\d{2}-\\d{3}\\.\\d{2}$")) {
            return dao.getPersonAddress(nationalRegistrationNumber);
        }
        throw new AddressException();
    }

    public void updateAddress(Address address) throws UpdateAddressException {
        if (address.getAddressID() != null && address.getStreet() != null && address.getStreetNumber().toString().matches("^\\d+$") && address.getCityName() != null && address.getZip().toString().matches("^\\d+$")) {
            dao.updateAddress(address);
        } else {
            throw new UpdateAddressException();
        }
    }

    public void deleteAddress(String nationalRegistrationNumber) throws DeleteAddressException {
        if (nationalRegistrationNumber != null) {
            dao.deleteAddress(nationalRegistrationNumber);
        } else {
            throw new DeleteAddressException();
        }
    }
}
