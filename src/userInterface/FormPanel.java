package userInterface;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FormPanel extends JPanel {
    private JLabel nationalRegistrationNumberLabel, lastNameLabel, firstNameLabel, genderLabel, birthdateLabel, emailLabel, phoneNumberLabel, streetLabel, streetNumberLabel, cityNameLabel, zipLabel, newsLetterLabel;
    private JTextField nationalRegistrationNumber, lastName, firstName, email, phoneNumber, street, streetNumber, cityName, zip;
    private JFormattedTextField birthdate;
    private GenderPanel genderPanel;
    private NewsLetterPanel newsLetterPanel;

    public FormPanel() {
        this.setLayout(new GridLayout(12,3,5,5));

        nationalRegistrationNumberLabel = new JLabel("National registration number :");
        nationalRegistrationNumberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        nationalRegistrationNumber = new JTextField();
        this.add(nationalRegistrationNumberLabel);
        this.add(nationalRegistrationNumber);
        this.add(new Panel());

        lastNameLabel = new JLabel("Lastname :");
        lastNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        lastName = new JTextField();
        this.add(lastNameLabel);
        this.add(lastName);
        this.add(new Panel());

        firstNameLabel = new JLabel("Firstname :");
        firstNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        firstName = new JTextField();
        this.add(firstNameLabel);
        this.add(firstName);
        this.add(new Panel());

        genderLabel = new JLabel("Gender :");
        genderLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        genderPanel = new GenderPanel();
        this.add(genderLabel);
        this.add(genderPanel);
        this.add(new Panel());

        birthdateLabel = new JLabel("Birthdate :");
        birthdateLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        birthdate = new JFormattedTextField(format);
        this.add(birthdateLabel);
        this.add(birthdate);
        this.add(new Panel());

        emailLabel = new JLabel("Email :");
        emailLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        email = new JTextField();
        this.add(emailLabel);
        this.add(email);
        this.add(new Panel());

        phoneNumberLabel = new JLabel("Phone number :");
        phoneNumberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        phoneNumber = new JTextField();
        this.add(phoneNumberLabel);
        this.add(phoneNumber);
        this.add(new Panel());

        streetLabel = new JLabel("Street :");
        streetLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        street = new JTextField();
        this.add(streetLabel);
        this.add(street);
        this.add(new Panel());

        streetNumberLabel = new JLabel("Street number :");
        streetNumberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        streetNumber = new JTextField();
        this.add(streetNumberLabel);
        this.add(streetNumber);
        this.add(new Panel());

        cityNameLabel = new JLabel("City name :");
        cityNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        cityName = new JTextField();
        this.add(cityNameLabel);
        this.add(cityName);
        this.add(new Panel());

        zipLabel = new JLabel("Postal code :");
        zipLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        zip = new JTextField();
        this.add(zipLabel);
        this.add(zip);
        this.add(new Panel());

        newsLetterLabel = new JLabel("Newsletter :");
        newsLetterLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        newsLetterPanel = new NewsLetterPanel();
        this.add(newsLetterLabel);
        this.add(newsLetterPanel);
        this.add(new Panel());
    }

    public JTextField getNationalRegistrationNumber() {
        return nationalRegistrationNumber;
    }

    public JTextField getLastName() {
        return lastName;
    }

    public JTextField getFirstName() {
        return firstName;
    }

    public JFormattedTextField getBirthdate() {
        return birthdate;
    }

    public JTextField getEmail() {
        return email;
    }

    public JTextField getPhoneNumber() {
        return phoneNumber;
    }

    public JTextField getStreet() {
        return street;
    }

    public JTextField getNumber() {
        return streetNumber;
    }

    public JTextField getCityName() {
        return cityName;
    }

    public JTextField getZip() {
        return zip;
    }

    public GenderPanel getGenderPanel() {
        return genderPanel;
    }

    public NewsLetterPanel getNewsLetterPanel() {
        return newsLetterPanel;
    }

    public void setNationalRegistrationNumber(String text) {
        nationalRegistrationNumber.setText(text);
    }

    public void setLastName(String text) {
        lastName.setText(text);
    }

    public void setFirstName(String text) {
        firstName.setText(text);
    }

    public void setEmail(String text) {
        email.setText(text);
    }

    public void setPhoneNumber(String text) {
        phoneNumber.setText(text);
    }

    public void setBirthdate(String text) {
        birthdate.setText(text);
    }

    public void setGender(char gender) {
        genderPanel.setSelected(gender);
    }

    public void setNewsLetter(boolean wantsNewsLetter) {
        newsLetterPanel.setSelected(wantsNewsLetter);
    }

    public void setStreet(String text) {
        street.setText(text);
    }

    public void setStreetNumber(String text) {
        streetNumber.setText(text);
    }

    public void setCityName(String text) {
        cityName.setText(text);
    }

    public void setZip(String text) {
        zip.setText(text);
    }

    public void setInitialAll() {
        nationalRegistrationNumber.setText("");
        lastName.setText("");
        firstName.setText("");
        genderPanel.setInitialAll();
        birthdate.setText("");
        email.setText("");
        phoneNumber.setText("");
        street.setText("");
        streetNumber.setText("");
        cityName.setText("");
        zip.setText("");
        newsLetterPanel.setInitialAll();
    }
}
