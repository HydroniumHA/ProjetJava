package userInterface;

import controller.ApplicationController;
import model.AddAddressException;
import model.AddPersonException;
import model.Address;
import model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class RegistrationButtonsPanel extends JPanel {
    private JButton back, validation, reset;
    private RegistrationForm registrationForm;
    private ApplicationController controller;

    public RegistrationButtonsPanel(RegistrationForm registrationForm) {
        this.controller = new ApplicationController();
        this.registrationForm = registrationForm;

        this.setLayout(new FlowLayout());

        back = new JButton("Back");
        validation = new JButton("Validation");
        reset = new JButton("Reset");
        this.add(back);
        this.add(validation);
        this.add(reset);
        ButtonListener buttonListener = new ButtonListener();
        back.addActionListener(buttonListener);
        ButtonListener2 buttonListener2 = new ButtonListener2();
        validation.addActionListener(buttonListener2);
        ButtonListener3 buttonListener3 = new ButtonListener3();
        reset.addActionListener(buttonListener3);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            registrationForm.removeAll();
            JLabel texte = new JLabel("Welcome to the Libiavelo management software.");
            texte.setHorizontalAlignment(SwingConstants.CENTER);
            registrationForm.add(texte);
            registrationForm.revalidate();
            registrationForm.repaint();
        }
    }

    private class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            FormPanel formPanel = registrationForm.getFormPanel();
            GenderPanel genderPanel = registrationForm.getFormPanel().getGenderPanel();
            NewsLetterPanel newsLetterPanel = registrationForm.getFormPanel().getNewsLetterPanel();
            //Valider les données ici !!!
            Address address = new Address(formPanel.getStreet().getText(), Integer.parseInt(formPanel.getNumber().getText()), formPanel.getCityName().getText(), Integer.parseInt(formPanel.getPostalCode().getText()));
            //Mettre date correcte dans person !!!
            Person person = new Person(formPanel.getNationalRegistrationNumber().getText(), formPanel.getLastName().getText(), formPanel.getFirstName().getText(), genderPanel.getGender(), LocalDate.now(), formPanel.getEmail().getText(), formPanel.getPhoneNumber().getText(), newsLetterPanel.getSelected(), address.getAddressID());

            try {
                controller.addPerson(person);
                controller.addAddress(address);
            } catch (AddPersonException | AddAddressException exception) {

            }
        }
    }

    private class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            registrationForm.getFormPanel().setInitialAll();
        }
    }
}