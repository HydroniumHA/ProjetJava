package userInterface;

import controller.ApplicationController;
import model.DeletePersonException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RemoveButtonsPanel extends JPanel {
    private JButton back, validation, reset;
    private RemoveForm removeForm;
    private ApplicationController controller;

    public RemoveButtonsPanel(RemoveForm removeForm) {
        this.controller = new ApplicationController();
        this.removeForm = removeForm;

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
            removeForm.removeAll();
            JLabel texte = new JLabel("Welcome to the Libiavelo management software.");
            texte.setHorizontalAlignment(SwingConstants.CENTER);
            removeForm.add(texte);
            removeForm.revalidate();
            removeForm.repaint();
        }
    }

    private class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                controller.deletePerson(removeForm.getRemovePanel().getNationalRegistrationNumber().getText());
            } catch (DeletePersonException exception) {
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