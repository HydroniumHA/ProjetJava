package userInterface;

import controller.ApplicationController;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PersonsButtonsPanel extends JPanel {
    private JButton back, validation, reset;
    private AllPersonsForm allPersonsForm;
    private ApplicationController controller;

    public PersonsButtonsPanel(AllPersonsForm allPersonsForm) {
        this.controller = new ApplicationController();
        this.allPersonsForm = allPersonsForm;

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
            allPersonsForm.removeAll();
            JLabel text = new JLabel("Welcome to the Libiavelo management software.");
            text.setHorizontalAlignment(SwingConstants.CENTER);
            allPersonsForm.add(text);
            allPersonsForm.revalidate();
            allPersonsForm.repaint();
        }
    }

    private class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            allPersonsForm.removeAll();
            //Valider les données ici !!!
            try {
                AllPersonsModel model = new AllPersonsModel(controller.getAllPersons(allPersonsForm.getAllPersonsPanel().getBikeID().getText()));
                JTable table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                allPersonsForm.add(scrollPane);
            } catch (AllPersonsException exception) {
                JOptionPane.showMessageDialog(null, exception,"All Person Exception", JOptionPane.ERROR_MESSAGE);
            }
            allPersonsForm.revalidate();
            allPersonsForm.repaint();
        }
    }

    private class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            allPersonsForm.getAllPersonsPanel().setInitialAll();
        }
    }
}
