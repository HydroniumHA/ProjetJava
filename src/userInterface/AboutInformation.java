package userInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AboutInformation extends JPanel {
    private JLabel texte;
    private JButton back;

    public AboutInformation() {
        texte = new JLabel("<html>INFORMATIONS A MODIF</html>");
        texte.setHorizontalAlignment(SwingConstants.CENTER);
        this.setLayout(new BorderLayout());
        this.add(texte, BorderLayout.CENTER);

        back = new JButton("Back");
        this.add(back, BorderLayout.SOUTH);
        ButtonListener buttonListener = new ButtonListener();
        back.addActionListener(buttonListener);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            AboutInformation.this.removeAll();
            JLabel text = new JLabel("Welcome to the Libiavelo management software.");
            text.setHorizontalAlignment(SwingConstants.CENTER);
            AboutInformation.this.add(text);
            AboutInformation.this.revalidate();
            AboutInformation.this.repaint();
        }
    }
}
