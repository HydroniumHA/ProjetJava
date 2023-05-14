package userInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class ButtonsPanel extends JPanel {
    private JButton back;
    private JPanel jpanel;

    public ButtonsPanel(JPanel jpanel) {
        this.jpanel = jpanel;

        this.setLayout(new FlowLayout());

        back = new JButton("Back");
        this.add(back);
        ButtonListener buttonListener = new ButtonListener();
        back.addActionListener(buttonListener);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            jpanel.removeAll();
            jpanel.add(new WelcomePanel());
            jpanel.revalidate();
            jpanel.repaint();
        }
    }

    private abstract class ButtonListener2 implements ActionListener {
        public abstract void actionPerformed(ActionEvent event);
    }

    private abstract class ButtonListener3 implements ActionListener {
        public abstract void actionPerformed(ActionEvent event);
    }
}
