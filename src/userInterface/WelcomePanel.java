package userInterface;

import javax.swing.*;
import java.awt.*;

public class WelcomePanel extends JPanel {
    private JLabel text;

    public WelcomePanel() {
        this.setLayout(new BorderLayout());

        text = new JLabel("Welcome to the Libiavelo management software.");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(text, BorderLayout.CENTER);
    }
}
