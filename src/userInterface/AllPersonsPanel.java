package userInterface;

import javax.swing.*;
import java.awt.*;

public class AllPersonsPanel extends JPanel {
    private JLabel bikeIDLabel;
    private JTextField bikeID;

    public AllPersonsPanel() {
        this.setLayout(new GridLayout(3,3,5,5));

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());

        bikeIDLabel = new JLabel("Bike ID :");
        bikeIDLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        bikeID = new JTextField();
        this.add(bikeIDLabel);
        this.add(bikeID);
        this.add(new Panel());

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());
    }

    public JTextField getBikeID() {
        return bikeID;
    }

    public void setInitialAll() {
        bikeID.setText("");
    }
}
