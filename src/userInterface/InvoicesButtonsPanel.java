package userInterface;

import controller.ApplicationController;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InvoicesButtonsPanel extends ButtonsPanel {
    private JButton validation, reset;
    private AllInvoicesForm allInvoicesForm;
    private ApplicationController controller;

    public InvoicesButtonsPanel(AllInvoicesForm allInvoicesForm) {
        super(allInvoicesForm);
        this.allInvoicesForm = allInvoicesForm;
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
            allInvoicesForm.removeAll();
            //Valider les données ici !!!
            try {
                AllInvoicesModel model = new AllInvoicesModel(controller.getAllInvoices(allInvoicesForm.getAllInvoicesPanel().getCityName().getText(), Double.parseDouble(allInvoicesForm.getAllInvoicesPanel().getMinAmount().getText())));
                JTable table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                allInvoicesForm.add(scrollPane);
            } catch (AllInvoicesException exception) {
                JOptionPane.showMessageDialog(null, exception,"All Invoices Exception", JOptionPane.ERROR_MESSAGE);
            }
            allInvoicesForm.revalidate();
            allInvoicesForm.repaint();
        }
    }

    private class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            allInvoicesForm.getAllInvoicesPanel().setInitialAll();
        }
    }
}
