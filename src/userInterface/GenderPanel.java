package userInterface;

import javax.swing.*;
import java.awt.*;

public class GenderPanel extends JPanel {
    private JRadioButton male, female, other;
    private ButtonGroup buttonGroup;

    public GenderPanel() {
        this.setLayout(new FlowLayout());

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");
        this.add(male);
        this.add(female);
        this.add(other);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);
        buttonGroup.add(other);
    }

    public Character getGender() {
        if (male.isSelected()) {
            return 'M';
        }
        if (female.isSelected()) {
            return 'F';
        }
        return 'O';
    }

    public void setSelected(char gender) {
        switch (gender) {
            case 'M':
                male.setSelected(true);
                break;
            case 'F':
                female.setSelected(true);
                break;
            case 'O':
                other.setSelected(true);
                break;
        }
    }

    public void setInitialAll() {
        buttonGroup.clearSelection();
    }
}
