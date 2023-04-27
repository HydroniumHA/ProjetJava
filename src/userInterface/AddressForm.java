package userInterface;

import javax.swing.*;
import java.awt.*;

public class AddressForm extends JPanel {
    private AddressPanel addressPanel;
    private AddressButtonsPanel addressButtonsPanel;

    public AddressForm() {
        this.setLayout(new BorderLayout());

        addressPanel = new AddressPanel();
        addressButtonsPanel = new AddressButtonsPanel(this);
        this.add(addressPanel, BorderLayout.CENTER);
        this.add(addressButtonsPanel, BorderLayout.SOUTH);
    }

    public AddressPanel getAddressPanel() {
        return addressPanel;
    }
}
