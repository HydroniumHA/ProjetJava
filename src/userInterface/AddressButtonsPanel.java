package userInterface;

import controller.ApplicationController;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddressButtonsPanel extends ButtonsPanel {
    private JButton validation, reset;
    private AddressForm addressForm;
    private ApplicationController controller;

    public AddressButtonsPanel(AddressForm addressForm) {
        super(addressForm);
        this.addressForm = addressForm;
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
            addressForm.removeAll();
            //Valider les données ici !!!
            try {
                AddressModel model = new AddressModel(controller.getAddress(addressForm.getAddressPanel().getCardID().getText()));
                JTable table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                addressForm.add(scrollPane);
            } catch (AddressException exception) {
                JOptionPane.showMessageDialog(null, exception,"Address Exception", JOptionPane.ERROR_MESSAGE);
            }
            addressForm.revalidate();
            addressForm.repaint();
        }
    }

    private class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            addressForm.getAddressPanel().setInitialAll();
        }
    }
}
