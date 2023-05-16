package userInterface;

import controller.ApplicationController;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AllRepairOrdersForm extends JPanel {
    private JLabel buildingIDLabel;
    private JComboBox combox;
    private ApplicationController controller;

    public AllRepairOrdersForm() {
        this.controller = new ApplicationController();

        this.setLayout(new GridLayout(3,3,5,5));

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());

        buildingIDLabel = new JLabel("Building ID :");
        buildingIDLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(buildingIDLabel);
        try {
            ArrayList<String> buildingIDs = new ArrayList<>();

            for (Building building : controller.getAllBuildings()) {
                buildingIDs.add(building.getBuildingID());
            }
            combox = new JComboBox(buildingIDs.toArray());
            combox.setSelectedItem(null);
            this.add(combox);
            ComboBoxListener comboBoxListener = new ComboBoxListener();
            combox.addItemListener(comboBoxListener);
        } catch (AllBuildingsException exception) {
            JOptionPane.showMessageDialog(null, exception, "Building Exception", JOptionPane.ERROR_MESSAGE);
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
                AllRepairOrdersModel model = new AllRepairOrdersModel(controller.getAllRepairOrders(combox.getSelectedItem().toString()));
                JTable table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                AllRepairOrdersForm.this.add(scrollPane);
            } catch (AllRepairOrdersException exception) {
                JOptionPane.showMessageDialog(null, exception,"All Repair Orders Exception", JOptionPane.ERROR_MESSAGE);
            }
            revalidate();
            repaint();
        }
    }
}
