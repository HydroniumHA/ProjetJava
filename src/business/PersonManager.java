package business;

import dataAccess.PersonDBAccess;
import model.*;

public class PersonManager {
    private PersonDBAccess dao;

    public PersonManager() {
        this.dao = new PersonDBAccess();
    }

    public void addPerson(Person person) throws AddPersonException {
        //TESTS A FAIRE !!!
        dao.addPerson(person);
    }

    public void deletePerson(String nationalRegistrationNumber) throws DeletePersonException {
        //TESTS A FAIRE !!!
        dao.deletePerson(nationalRegistrationNumber);
    }
}
