package userInterface;

import javax.swing.*;
import java.awt.*;

public class ModificationForm extends JPanel {
    private FormPanel formPanel;
    private ModificationButtonsPanel modificationButtonsPanel;

    public ModificationForm() {
        this.setLayout(new BorderLayout());

        formPanel = new FormPanel();
        modificationButtonsPanel = new ModificationButtonsPanel(this);
        this.add(formPanel, BorderLayout.CENTER);
        this.add(modificationButtonsPanel, BorderLayout.SOUTH);
    }

    public FormPanel getFormPanel() {
        return formPanel;
    }
}
