package userInterface;

import javax.swing.*;
import java.awt.*;

public class RemovePanel extends JPanel {
    private JLabel nationalRegistrationNumberLabel;
    private JTextField nationalRegistrationNumber;

    public RemovePanel() {
        this.setLayout(new GridLayout(3,3,5,5));

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());

        nationalRegistrationNumberLabel = new JLabel("National registration number :");
        nationalRegistrationNumberLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        nationalRegistrationNumber = new JTextField();
        this.add(nationalRegistrationNumberLabel);
        this.add(nationalRegistrationNumber);
        this.add(new Panel());

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());
    }

    public JTextField getNationalRegistrationNumber() {
        return nationalRegistrationNumber;
    }

    public void setInitialAll() {
        nationalRegistrationNumber.setText("");
    }
}
