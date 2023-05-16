package dataAccess;

import model.*;
import java.sql.*;
import java.util.ArrayList;

public class PersonDBAccess implements PersonDataAccess {
    public void addPerson(Person person) throws AddPersonException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "INSERT INTO person (nationalRegistrationNumber, lastName, firstname, gender, birthdate, wantsNewsLetter, addressID) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, person.getNationalRegistrationNumber());
            statement.setString(2, person.getLastName());
            statement.setString(3, person.getFirstName());
            statement.setString(4, Character.toString(person.getGender()));
            statement.setDate(5, java.sql.Date.valueOf(person.getBirthdate()));
            statement.setBoolean(6, person.getWantsNewsLetter());
            statement.setString(7, person.getAddressID());
            statement.executeUpdate();
            if (!person.getEmail().equals("")) {
                sql = "UPDATE person SET email = ? WHERE nationalRegistrationNumber = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, person.getEmail());
                statement.setString(2, person.getNationalRegistrationNumber());
                statement.executeUpdate();
            }
            if (!person.getPhoneNumber().equals("")) {
                sql = "UPDATE person SET phoneNumber = ? WHERE nationalRegistrationNumber = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, person.getPhoneNumber());
                statement.setString(2, person.getNationalRegistrationNumber());
                statement.executeUpdate();
            }
        } catch (SQLException | ConnectionException exception) {
            exception.printStackTrace();
            throw new AddPersonException();
        }
    }

    public void deletePerson(String nationalRegistrationNumber) throws DeletePersonException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "DELETE FROM person WHERE nationalRegistrationNumber = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nationalRegistrationNumber);
            statement.executeUpdate();
        } catch (SQLException | ConnectionException exception) {
            exception.printStackTrace();
            throw new DeletePersonException();
        }
    }

    public ArrayList<Person> getAllPersons() throws AllPersonsException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "SELECT * FROM person";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet data = statement.executeQuery();
            ArrayList<Person> allPersons = new ArrayList<>();
            Person person;
            while (data.next()) {
                person = new Person(data.getString("nationalRegistrationNumber"), data.getString("lastName"), data.getString("firstname"), data.getString("gender").charAt(0), data.getDate("birthdate").toLocalDate(), data.getString("email"), data.getString("phoneNumber"), data.getBoolean("wantsNewsLetter"), data.getString("addressID"));
                allPersons.add(person);
            }
            return allPersons;
        } catch (SQLException | ConnectionException exception) {
            throw new AllPersonsException();
        }
    }

    public void updatePerson(Person person) throws UpdatePersonException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "UPDATE person SET lastName = ?, firstname = ?, gender = ?, birthdate = ?, wantsNewsLetter = ? WHERE nationalRegistrationNumber = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, person.getLastName());
            statement.setString(2, person.getFirstName());
            statement.setString(3, Character.toString(person.getGender()));
            statement.setDate(4, java.sql.Date.valueOf(person.getBirthdate()));
            statement.setBoolean(5, person.getWantsNewsLetter());
            statement.setString(6, person.getNationalRegistrationNumber());
            statement.executeUpdate();
            if (!person.getEmail().equals("")) {
                sql = "UPDATE person SET email = ? WHERE nationalRegistrationNumber = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, person.getEmail());
                statement.setString(2, person.getNationalRegistrationNumber());
                statement.executeUpdate();
            }
            if (!person.getPhoneNumber().equals("")) {
                sql = "UPDATE person SET phoneNumber = ? WHERE nationalRegistrationNumber = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, person.getPhoneNumber());
                statement.setString(2, person.getNationalRegistrationNumber());
                statement.executeUpdate();
            }
        } catch (SQLException | ConnectionException exception) {
            throw new UpdatePersonException();
        }
    }
}
