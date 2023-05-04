package dataAccess;

import model.*;
import java.util.ArrayList;

public interface PersonDataAccess {
    void addPerson(Person person) throws AddPersonException;
    void deletePerson(String nationalRegistrationNumber) throws DeletePersonException;
    ArrayList<Person> getAllPersons() throws AllPersonsException;
    void updatePerson(Person person) throws UpdatePersonException;
}
