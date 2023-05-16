package userInterface;

import controller.ApplicationController;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RemoveButtonsPanel extends ButtonsPanel {
    private JButton validation, reset;
    private RemoveForm removeForm;
    private ApplicationController controller;

    public RemoveButtonsPanel(RemoveForm removeForm) {
        super(removeForm);
        this.removeForm = removeForm;
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
            String nationalRegistrationNumber = removeForm.getRemovePanel().getNationalRegistrationNumber().getText();

            try {
                if (nationalRegistrationNumber.matches("^\\d{2}\\.\\d{2}\\.\\d{2}-\\d{3}\\.\\d{2}$")) {
                    if (JOptionPane.showConfirmDialog(null, "If you delete this person, it will also delete their subscription data as well as their card data.") == JOptionPane.OK_OPTION) {
                        controller.deleteCard(nationalRegistrationNumber);
                        controller.deleteSubscription(nationalRegistrationNumber);
                        controller.deletePerson(nationalRegistrationNumber);
                        controller.deleteAddress(nationalRegistrationNumber);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "The national registration number don't match this : xx.xx.xx-xxx.xx (x are digits).","Delete Person Exception", JOptionPane.ERROR_MESSAGE);
                }
            } catch (DeletePersonException | DeleteAddressException | DeleteSubscriptionException | DeleteCardException exception) {
                JOptionPane.showMessageDialog(null, exception,"Delete Person Exception", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            removeForm.getRemovePanel().setInitialAll();
        }
    }
}