package userInterface;

import javax.swing.*;
import java.awt.*;

public class WelcomePanel extends JPanel {
    private JLabel text;

    public WelcomePanel() {
        this.setLayout(new BorderLayout());

        text = new JLabel(
            "<html><h1 style=\"text-align:center;\"><img src=\""
                + WelcomePanel.class.getResource("/userInterface/libiaveloLogo.png")
                + "\"><br><br>Welcome to the Libiavelo management software.</h1></html>");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(text, BorderLayout.CENTER);
    }
}
