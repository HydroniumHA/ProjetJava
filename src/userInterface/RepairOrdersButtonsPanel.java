package userInterface;

import controller.ApplicationController;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RepairOrdersButtonsPanel extends JPanel {
    private JButton back, validation, reset;
    private AllRepairOrdersForm allRepairOrdersForm;
    private ApplicationController controller;

    public RepairOrdersButtonsPanel(AllRepairOrdersForm allRepairOrdersForm) {
        this.controller = new ApplicationController();
        this.allRepairOrdersForm = allRepairOrdersForm;

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
            allRepairOrdersForm.removeAll();
            JLabel texte = new JLabel("Welcome to the Libiavelo management software.");
            texte.setHorizontalAlignment(SwingConstants.CENTER);
            allRepairOrdersForm.add(texte);
            allRepairOrdersForm.revalidate();
            allRepairOrdersForm.repaint();
        }
    }

    private class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            allRepairOrdersForm.removeAll();
            //Valider les données ici !!!
            try {
                AllRepairOrdersModel model = new AllRepairOrdersModel(controller.getAllRepairOrders(allRepairOrdersForm.getAllRepairOrdersPanel().getBuildingID().getText()));
                JTable table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                allRepairOrdersForm.add(scrollPane);
            } catch (AllRepairOrdersException exception) {
                JOptionPane.showMessageDialog(null, exception,"All Repair Orders Exception", JOptionPane.ERROR_MESSAGE);
            }
            allRepairOrdersForm.revalidate();
            allRepairOrdersForm.repaint();
        }
    }

    private class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            allRepairOrdersForm.getAllRepairOrdersPanel().setInitialAll();
        }
    }
}
