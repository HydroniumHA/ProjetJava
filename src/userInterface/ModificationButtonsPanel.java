package userInterface;

import controller.ApplicationController;
import model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.UUID;

public class ModificationButtonsPanel extends ButtonsPanel {
    private JButton validation, reset;
    private ModificationForm modificationForm;
    private ApplicationController controller;

    public ModificationButtonsPanel(ModificationForm modificationForm) {
        super(modificationForm);
        this.modificationForm = modificationForm;
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
            FormPanel formPanel = modificationForm.getFormPanel();
            GenderPanel genderPanel = modificationForm.getFormPanel().getGenderPanel();
            NewsLetterPanel newsLetterPanel = modificationForm.getFormPanel().getNewsLetterPanel();
            String birthdate = formPanel.getBirthdate().getText();
            int year = Integer.parseInt(birthdate.substring(6, 10));
            int month = Integer.parseInt(birthdate.substring(3, 5));
            int day = Integer.parseInt(birthdate.substring(0, 2));
            //Valider les données ici !!!

            try {
                Person person = new Person(formPanel.getNationalRegistrationNumber().getText(), formPanel.getLastName().getText(), formPanel.getFirstName().getText(), genderPanel.getGender(), LocalDate.of(year, month, day), formPanel.getEmail().getText(), formPanel.getPhoneNumber().getText(), newsLetterPanel.getSelected(), controller.getPersonAddress(formPanel.getNationalRegistrationNumber().getText()).get(0).getAddressID());
                Address address = new Address(person.getAddressID(), formPanel.getStreet().getText(), Integer.parseInt(formPanel.getNumber().getText()), formPanel.getCityName().getText(), Integer.parseInt(formPanel.getZip().getText()));
                controller.updatePerson(person);
                controller.updateAddress(address);
            } catch (UpdatePersonException | UpdateAddressException | AddressException exception) {
                JOptionPane.showMessageDialog(null, exception, "Person Exception", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            modificationForm.getFormPanel().setInitialAll();
        }
    }
}
