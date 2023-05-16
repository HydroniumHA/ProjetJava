package userInterface;

import controller.ApplicationController;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.util.UUID;

public class RegistrationButtonsPanel extends ButtonsPanel {
    private JButton validation, reset;
    private RegistrationForm registrationForm;
    private ApplicationController controller;

    public RegistrationButtonsPanel(RegistrationForm registrationForm) {
        super(registrationForm);
        this.registrationForm = registrationForm;
        this.controller = new ApplicationController();

        this.setLayout(new FlowLayout());

        validation = new JButton("Validation");
        reset = new JButton("Reset");
        this.add(validation);
        this.add(reset);
        ButtonListener2 buttonListener2 = new ButtonListener2();
        validation.addActionListener(buttonListener2);
        ButtonListener3 buttonListener3 = new ButtonListener3();
        reset.addActionListener(buttonListener3);
    }

    private class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            FormPanel formPanel = registrationForm.getFormPanel();
            String nationalRegistrationNumber = formPanel.getNationalRegistrationNumber().getText();
            String lastName = formPanel.getLastName().getText();
            String firstName = formPanel.getFirstName().getText();
            Character gender = registrationForm.getFormPanel().getGenderPanel().getGender();
            String birthdate = formPanel.getBirthdate().getText();
            String email = formPanel.getEmail().getText();
            String phoneNumber = formPanel.getPhoneNumber().getText();
            boolean newsLetter = registrationForm.getFormPanel().getNewsLetterPanel().getSelected();
            String street = formPanel.getStreet().getText();
            String streetNumber = formPanel.getNumber().getText();
            String cityName = formPanel.getCityName().getText();
            String zip = formPanel.getZip().getText();

            try {
                if (nationalRegistrationNumber.isBlank() | lastName.isBlank() | firstName.isBlank() | birthdate.isBlank() | street.isBlank() | streetNumber.isBlank() | cityName.isBlank() | zip.isBlank()) {
                    JOptionPane.showMessageDialog(null, "All fields must be filled except email and phoneNumber.", "Person Exception", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (nationalRegistrationNumber.matches("^\\d{2}\\.\\d{2}\\.\\d{2}-\\d{3}\\.\\d{2}$")) {
                        if (birthdate.matches("^(0[1-9]|1\\d|2\\d|3[01])\\/(0[1-9]|1[0-2])\\/(19\\d{2}|20\\d{2})$")) {
                            String year = birthdate.substring(6, 10);
                            String month = birthdate.substring(3, 5);
                            String day = birthdate.substring(0, 2);

                            if (streetNumber.matches("^\\d+$") && zip.matches("^\\d+$")) {
                                Address address = new Address(UUID.randomUUID().toString(), street, Integer.parseInt(streetNumber), cityName, Integer.parseInt(zip));
                                Person person = new Person(nationalRegistrationNumber, lastName, firstName, gender, LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day)), email, phoneNumber, newsLetter, address.getAddressID());
                                Subscription subscription = new Subscription(UUID.randomUUID().toString(), LocalDate.now(), 31, null, person.getNationalRegistrationNumber());
                                Card card = new Card(UUID.randomUUID().toString(), LocalDate.now(), subscription.getSubscriptionID());
                                controller.addAddress(address);
                                controller.addPerson(person);
                                controller.addSubscription(subscription);
                                controller.addCard(card);
                            } else {
                                JOptionPane.showMessageDialog(null, "The street number/zip are not whole numbers.","Person Exception", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "The birthdate don't match this : dd/MM/yyyy or is not valid.","Person Exception", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "The national registration number don't match this : xx.xx.xx-xxx.xx (x are digits).","Person Exception", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (AddPersonException | AddAddressException | AddSubscriptionException | AddCardException exception) {
                JOptionPane.showMessageDialog(null, exception, "Person Exception", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            registrationForm.getFormPanel().setInitialAll();
        }
    }
}