package userInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AboutInformation extends JPanel {
    private JLabel texte;
    private JButton back;

    public AboutInformation() {
        texte = new JLabel(
                "<html><h1>Software Information<h2>Libiavelo</h2><p>Version : 1.0.0<br>Developer : Simon Georges<br>Contact : simgeorges000@gmail.com +32460946755<br>Release Date : 17/05/23"
                + "<br><br><h2>There are 5 menus with submenus.</h2><br>In the Customer menu, you can register, delete or modify a customer's information."
                + "<br>The management menu (JobTask) is used to display the average monthly repair time of the bicycles in each building."
                + "<br>The query menu is used to search:"
                + "<br>&emsp;-All invoices above a certain amount for a given city."
                + "<br>&emsp;-The repair number of bicycles being repaired in a given building."
                + "<br>&emsp;-An address from a card number.</p></html>");
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
            AboutInformation.this.add(new WelcomePanel());
            AboutInformation.this.revalidate();
            AboutInformation.this.repaint();
        }
    }
}
