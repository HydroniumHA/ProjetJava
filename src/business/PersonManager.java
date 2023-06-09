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
        if (person.getNationalRegistrationNumber().matches("^\\d{2}\\.\\d{2}\\.\\d{2}-\\d{3}\\.\\d{2}$") && person.getLastName() != null && person.getFirstName() != null && person.getGender() != null && person.getBirthdate() != null && (person.getEmail() == null || person.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) && (person.getPhoneNumber() == null || person.getPhoneNumber().matches("^\\+\\d+$")) && person.getWantsNewsLetter() != null && person.getAddressID() != null) {
            dao.addPerson(person);
        } else {
            throw new AddPersonException();
        }
    }

    public void deletePerson(String nationalRegistrationNumber) throws DeletePersonException {
        if (nationalRegistrationNumber.matches("^\\d{2}\\.\\d{2}\\.\\d{2}-\\d{3}\\.\\d{2}$")) {
            dao.deletePerson(nationalRegistrationNumber);
        } else {
            throw new DeletePersonException();
        }
    }

    public ArrayList<Person> getAllPersons() throws AllPersonsException {
        return dao.getAllPersons();
    }

    public void updatePerson(Person person) throws UpdatePersonException {
        if (person.getNationalRegistrationNumber().matches("^\\d{2}\\.\\d{2}\\.\\d{2}-\\d{3}\\.\\d{2}$") && person.getLastName() != null && person.getFirstName() != null && person.getGender() != null && person.getBirthdate() != null && (person.getEmail() == null || person.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) && (person.getPhoneNumber() == null || person.getPhoneNumber().matches("^\\+\\d+$")) && person.getWantsNewsLetter() != null && person.getAddressID() != null) {
            dao.updatePerson(person);
        } else {
            throw new UpdatePersonException();
        }
    }
}
