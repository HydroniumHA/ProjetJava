package userInterface;

import controller.ApplicationController;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AddressForm extends JPanel {
    private JLabel cardIDLabel;
    private JComboBox combox;
    private ApplicationController controller;

    public AddressForm() {
        this.controller = new ApplicationController();

        this.setLayout(new GridLayout(3,3,5,5));

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());

        cardIDLabel = new JLabel("Card ID :");
        cardIDLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(cardIDLabel);
        try {
            ArrayList<String> cardIDs = new ArrayList<>();

            for (Card card : controller.getAllCards()) {
                cardIDs.add(card.getCardID());
            }
            combox = new JComboBox(cardIDs.toArray());
            combox.setSelectedItem(null);
            this.add(combox);
            ComboBoxListener comboBoxListener = new ComboBoxListener();
            combox.addItemListener(comboBoxListener);
        } catch (AllCardsException exception) {
            JOptionPane.showMessageDialog(null, exception, "Card Exception", JOptionPane.ERROR_MESSAGE);
        }
        this.add(new Panel());

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());
    }

    private class ComboBoxListener implements ItemListener {
        public void itemStateChanged(ItemEvent event) {
            removeAll();
            //Valider les données ici !!!
            try {
                AddressModel model = new AddressModel(controller.getAddress(combox.getSelectedItem().toString()));
                JTable table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                AddressForm.this.add(scrollPane);
            } catch (AddressException exception) {
                JOptionPane.showMessageDialog(null, exception,"Address Exception", JOptionPane.ERROR_MESSAGE);
            }
            revalidate();
            repaint();
        }
    }
}
