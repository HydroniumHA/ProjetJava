package userInterface;

import javax.swing.*;
import java.awt.*;

public class RemoveForm extends JPanel {
    private RemovePanel removePanel;
    private RemoveButtonsPanel removeButtonsPanel;

    public RemoveForm() {
        this.setLayout(new BorderLayout());

        removePanel = new RemovePanel();
        removeButtonsPanel = new RemoveButtonsPanel(this);
        this.add(removePanel, BorderLayout.CENTER);
        this.add(removeButtonsPanel, BorderLayout.SOUTH);
    }

    public RemovePanel getRemovePanel() {
        return removePanel;
    }
}
