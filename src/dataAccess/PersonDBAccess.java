package dataAccess;

import model.*;
import java.sql.*;
import java.util.ArrayList;

public class PersonDBAccess {
    public void addPerson(Person person) throws AddPersonException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "INSERT INTO person (nationalRegistrationNumber, name, firstname, gender, birthdate, wantsNewsLetter, addressID) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, person.getNationalRegistrationNumber());
            statement.setString(2, person.getName());
            statement.setString(3, person.getFirstName());
            statement.setString(4, Character.toString(person.getGender()));
            java.sql.Date sqlDate = java.sql.Date.valueOf(person.getBirthdate());
            statement.setDate(5, sqlDate);
            statement.setBoolean(6, person.getWantsNewsLetter());
            statement.setString(7, person.getAddressID());
            statement.executeUpdate();
            if (person.getEmail() != null) {
                sql = "UPDATE person SET email = ? WHERE nationalRegistrationNumber = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, person.getEmail());
                statement.setString(2, person.getNationalRegistrationNumber());
                statement.executeUpdate();
            }
            if (person.getPhoneNumber() != null) {
                sql = "UPDATE person SET phoneNumber = ? WHERE nationalRegistrationNumber = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, person.getPhoneNumber());
                statement.setString(2, person.getNationalRegistrationNumber());
                statement.executeUpdate();
            }
            connection.close();
        } catch (SQLException exception) {
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
            connection.close();
        } catch (SQLException exception) {
            throw new DeletePersonException();
        }
    }

    public ArrayList<Person> getAllPersons() throws AllPersonsException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "SELECT"; // !!!!! pas fini
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet data = statement.executeQuery();
            ArrayList<Person> allPersons = new ArrayList<>();
            while (data.next()) {
                Person person = new Person(data.getString("nationalRegistrationNumber"), data.getString("name"), data.getString("firstname"), data.getString("gender").charAt(0), data.getDate("birthdate").toLocalDate(), data.getString("email"), data.getString("phoneNumber"), data.getBoolean("wantsNewsLetter"), data.getString("addressID"));
                allPersons.add(person);
            }
            connection.close();
            return allPersons;
        } catch (SQLException exception) {
            throw new AllPersonsException();
        }
    }
}
