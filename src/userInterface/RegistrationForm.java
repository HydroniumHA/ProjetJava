package userInterface;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JPanel {
    private FormPanel formPanel;
    private RegistrationButtonsPanel registrationButtonsPanel;

    public RegistrationForm() {
        this.setLayout(new BorderLayout());

        formPanel = new FormPanel();
        registrationButtonsPanel = new RegistrationButtonsPanel(this);
        this.add(formPanel, BorderLayout.CENTER);
        this.add(registrationButtonsPanel, BorderLayout.SOUTH);
    }

    public FormPanel getFormPanel() {
        return formPanel;
    }
}
