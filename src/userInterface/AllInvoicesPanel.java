package userInterface;

import javax.swing.*;
import java.awt.*;

public class AllInvoicesPanel extends JPanel {
    private JLabel cityNameLabel, minAmountLabel;
    private JTextField cityName, minAmount;

    public AllInvoicesPanel() {
        this.setLayout(new GridLayout(4,3,5,5));

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());

        cityNameLabel = new JLabel("City Name :");
        cityNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        cityName = new JTextField();
        this.add(cityNameLabel);
        this.add(cityName);
        this.add(new Panel());

        minAmountLabel = new JLabel("Minimum Amount :");
        minAmountLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        minAmount = new JTextField();
        this.add(minAmountLabel);
        this.add(minAmount);
        this.add(new Panel());

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());
    }

    public JTextField getCityName() {
        return cityName;
    }

    public JTextField getMinAmount() {
        return minAmount;
    }

    public void setInitialAll() {
        cityName.setText("");
        minAmount.setText("");
    }
}
