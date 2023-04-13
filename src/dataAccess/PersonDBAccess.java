package dataAccess;

import model.AddPersonException;
import model.DeletePersonException;
import model.Person;

import java.sql.*;

public class PersonDBAccess {
    public void addPerson(Person person) throws AddPersonException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "INSERT INTO person VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, person.getNationalRegistrationNumber());
            statement.setString(2, person.getName());
            statement.setString(3, person.getFirstName());
            statement.setString(4, Character.toString(person.getGender()));
            java.sql.Date sqlDate = java.sql.Date.valueOf(person.getBirthdate());
            statement.setDate(5, sqlDate);
            if (person.getEmail() == null) {
                statement.setNull(6, Types.VARCHAR);
            } else {
                statement.setString(6, person.getEmail());
            }
            if (person.getPhoneNumber() == null) {
                statement.setNull(7, Types.VARCHAR);
            } else {
                statement.setString(7, person.getPhoneNumber());
            }
            statement.setBoolean(8, person.getWantsNewsLetter());
            statement.executeUpdate();
            connection.close();
        } catch (SQLException exception) {
            throw new AddPersonException();
        }
    }

    public void deletePerson(String nationnalRegistrationNumber) throws DeletePersonException {
        try {
            Connection connection = SingletonConnection.getInstance();
            String sql = "DELETE FROM person WHERE nationnalRegistrationNumber = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nationnalRegistrationNumber);
            statement.executeUpdate();
            connection.close();
        } catch (SQLException exception) {
            throw new DeletePersonException();
        }
    }
}
