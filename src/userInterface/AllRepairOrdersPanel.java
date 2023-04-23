package userInterface;

import javax.swing.*;
import java.awt.*;

public class AllRepairOrdersPanel extends JPanel {
    private JLabel buildingIDLabel;
    private JTextField buildingID;

    public AllRepairOrdersPanel() {
        this.setLayout(new GridLayout(3,3,5,5));

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());

        buildingIDLabel = new JLabel("Building ID :");
        buildingIDLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        buildingID = new JTextField();
        this.add(buildingIDLabel);
        this.add(buildingID);
        this.add(new Panel());

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());
    }

    public JTextField getBuildingID() {
        return buildingID;
    }

    public void setInitialAll() {
        buildingID.setText("");
    }
}
