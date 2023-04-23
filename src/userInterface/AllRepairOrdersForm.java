package userInterface;

import javax.swing.*;
import java.awt.*;

public class AllRepairOrdersForm extends JPanel {
    private AllRepairOrdersPanel allRepairOrdersPanel;
    private RepairOrdersButtonsPanel repairOrdersButtonsPanel;

    public AllRepairOrdersForm() {
        this.setLayout(new BorderLayout());

        allRepairOrdersPanel = new AllRepairOrdersPanel();
        repairOrdersButtonsPanel = new RepairOrdersButtonsPanel(this);
        this.add(allRepairOrdersPanel, BorderLayout.CENTER);
        this.add(repairOrdersButtonsPanel, BorderLayout.SOUTH);
    }

    public AllRepairOrdersPanel getAllRepairOrdersPanel() {
        return allRepairOrdersPanel;
    }
}
