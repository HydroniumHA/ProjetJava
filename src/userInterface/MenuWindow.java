package userInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuWindow extends JFrame {
    private JMenuBar menuBar;
    private JMenu fileMenu, customerMenu, queriesMenu, helpMenu;
    private JMenuItem exit, signUp, modifications, remove, invoices, repairOrders, about;
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

        JLabel text = new JLabel("Welcome to the Libiavelo management software.");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        mainContainer.add(text, BorderLayout.CENTER);

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

        modifications = new JMenuItem("Modifications");
        customerMenu.add(modifications);
        ModificationsListener modificationsListener = new ModificationsListener();
        modifications.addActionListener(modificationsListener);

        customerMenu.addSeparator();

        remove = new JMenuItem("Remove");
        customerMenu.add(remove);
        RemoveListener removeListener = new RemoveListener();
        remove.addActionListener(removeListener);

        queriesMenu = new JMenu("Queries");
        queriesMenu.setMnemonic('Q');
        menuBar.add(queriesMenu);

        invoices = new JMenuItem("Invoices");
        queriesMenu.add(invoices);
        InvoicesListener invoicesListener = new InvoicesListener();
        invoices.addActionListener(invoicesListener);

        queriesMenu.addSeparator();

        repairOrders = new JMenuItem("RepairOrders");
        queriesMenu.add(repairOrders);
        RepairOrdersListener repairOrdersListener = new RepairOrdersListener();
        repairOrders.addActionListener(repairOrdersListener);

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

    private class ModificationsListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            mainContainer.removeAll();
            mainContainer.add(new RemoveForm(), BorderLayout.CENTER);
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

    private class InvoicesListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            mainContainer.removeAll();
            mainContainer.add(new AllInvoicesForm(), BorderLayout.CENTER);
            revalidate();
            repaint();
        }
    }

    private class RepairOrdersListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            mainContainer.removeAll();
            mainContainer.add(new AllRepairOrdersForm(), BorderLayout.CENTER);
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
