package business;

import dataAccess.*;
import model.*;
import java.util.ArrayList;

public class PersonManager {
    private PersonDataAccess dao;

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

    public ArrayList<Person> getAllPersons() throws AllPersonsException {
        return dao.getAllPersons();
    }
}
