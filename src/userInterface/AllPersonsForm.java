package userInterface;

import javax.swing.*;
import java.awt.*;

public class AllPersonsForm extends JPanel {
    private AllPersonsPanel allPersonsPanel;
    private PersonsButtonsPanel personsButtonsPanel;

    public AllPersonsForm() {
        this.setLayout(new BorderLayout());

        allPersonsPanel = new AllPersonsPanel();
        personsButtonsPanel = new PersonsButtonsPanel(this);
        this.add(allPersonsPanel, BorderLayout.CENTER);
        this.add(personsButtonsPanel, BorderLayout.SOUTH);
    }

    public AllPersonsPanel getAllPersonsPanel() {
        return allPersonsPanel;
    }
}
