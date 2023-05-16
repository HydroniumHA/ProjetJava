package dataAccess;

import model.*;

import java.util.ArrayList;
import java.util.HashMap;

public interface AddressDataAccess {
    void addAddress(Address address) throws AddAddressException;
    HashMap<Address, String> getAddress(String cardID) throws AddressException;
    ArrayList<Address> getPersonAddress(String nationalRegistrationNumber) throws AddressException;
    void updateAddress(Address address) throws UpdateAddressException;
}
