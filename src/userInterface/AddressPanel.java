package userInterface;

import javax.swing.*;
import java.awt.*;

public class AddressPanel extends JPanel {
    private JLabel cardIDLabel;
    private JTextField cardID;

    public AddressPanel() {
        this.setLayout(new GridLayout(3,3,5,5));

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());

        cardIDLabel = new JLabel("Card ID :");
        cardIDLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        cardID = new JTextField();
        this.add(cardIDLabel);
        this.add(cardID);
        this.add(new Panel());

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());
    }

    public JTextField getCardID() {
        return cardID;
    }

    public void setInitialAll() {
        cardID.setText("");
    }
}
