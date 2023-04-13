package userInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuWindow extends JFrame {
    private JMenuBar menuBar;
    private JMenu fileMenu, customerMenu, helpMenu;
    private JMenuItem exit, signUp, remove, about;
    private Container mainContainer;

    public MenuWindow() {
        super("Menu");
        setBounds(100,100,750,500);

        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                System.exit(0);
            }
        });
        mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout());

        JLabel texte = new JLabel("Welcome to the Libiavelo management software.");
        texte.setHorizontalAlignment(SwingConstants.CENTER);
        mainContainer.add(texte, BorderLayout.CENTER);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        menuBar.add(fileMenu);

        exit = new JMenuItem("Exit");
        fileMenu.add(exit);
        ExitListener exitListener = new ExitListener();
        exit.addActionListener(exitListener);

        customerMenu = new JMenu("Customer");
        customerMenu.setMnemonic('C');
        menuBar.add(customerMenu);

        signUp = new JMenuItem("Inscription");
        customerMenu.add(signUp);
        SignUpListener signUpListener = new SignUpListener();
        signUp.addActionListener(signUpListener);

        customerMenu.addSeparator();

        remove = new JMenuItem("Remove");
        customerMenu.add(remove);
        RemoveListener removeListener = new RemoveListener();
        remove.addActionListener(removeListener);

        helpMenu = new JMenu("Help");
        helpMenu.setMnemonic('H');
        menuBar.add(helpMenu);

        about = new JMenuItem("About");
        helpMenu.add(about);
        AboutListener aboutListener = new AboutListener();
        about.addActionListener(aboutListener);

        setVisible(true);
    }

    private class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }

    private class SignUpListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            mainContainer.removeAll();
            mainContainer.add(new RegistrationForm(), BorderLayout.CENTER);
            revalidate();
            repaint();
        }
    }

    private class RemoveListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            mainContainer.removeAll();
            mainContainer.add(new RemoveForm(), BorderLayout.CENTER);
            revalidate();
            repaint();
        }
    }

    private class AboutListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            mainContainer.removeAll();
            mainContainer.add(new AboutInformation(), BorderLayout.CENTER);
            revalidate();
            repaint();
        }
    }
}
