package userInterface;

import controller.ApplicationController;
import model.AddressException;
import model.AllPersonsException;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class MenuWindow extends JFrame {
    private JMenuBar menuBar;
    private JMenu fileMenu, customerMenu, queriesMenu, helpMenu;
    private JMenuItem exit, signUp, modifications, remove, invoices, repairOrders, address, about;
    private Container mainContainer;
    private ApplicationController controller;

    public MenuWindow() {
        super("Menu");
        setBounds(100,100,750,500);

        this.controller = new ApplicationController();

        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                System.exit(0);
            }
        });
        mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout());

        mainContainer.add(new WelcomePanel(), BorderLayout.CENTER);

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

        queriesMenu.addSeparator();

        address = new JMenuItem("Address");
        queriesMenu.add(address);
        AddressListener addressListener = new AddressListener();
        address.addActionListener(addressListener);

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
            try {
                AllPersonsModel model = new AllPersonsModel(controller.getAllPersons());
                JTable table = new JTable(model);
                table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                JScrollPane scrollPane = new JScrollPane(table);
                table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
                    public void valueChanged(ListSelectionEvent e) {
                        mainContainer.removeAll();
                        int i = table.getSelectedRow();
                        RegistrationForm registrationForm = new RegistrationForm();

                        registrationForm.getFormPanel().setNationalRegistrationNumber((String)model.getValueAt(i,0));
                        registrationForm.getFormPanel().setLastName((String)model.getValueAt(i,1));
                        registrationForm.getFormPanel().setFirstName((String)model.getValueAt(i,2));
                        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                        registrationForm.getFormPanel().setBirthdate(format.format(model.getValueAt(i,3)));
                        registrationForm.getFormPanel().setGender((char)model.getValueAt(i,4));
                        registrationForm.getFormPanel().setEmail((String)model.getValueAt(i,5));
                        registrationForm.getFormPanel().setNewsLetter((boolean)model.getValueAt(i,6));
                        registrationForm.getFormPanel().setPhoneNumber((String)model.getValueAt(i,7));
                        registrationForm.getFormPanel().setAddressNonEditable();
                        mainContainer.add(registrationForm);
                        revalidate();
                        repaint();
                    }
                });
                mainContainer.add(scrollPane, BorderLayout.CENTER);
                JLabel text = new JLabel("Click on a row to modify.");
                text.setHorizontalAlignment(SwingConstants.CENTER);
                mainContainer.add(text, BorderLayout.SOUTH);
            } catch (AllPersonsException exception) {
                JOptionPane.showMessageDialog(null, exception,"All Persons Exception", JOptionPane.ERROR_MESSAGE);
            }
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

    private class AddressListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            mainContainer.removeAll();
            mainContainer.add(new AddressForm(), BorderLayout.CENTER);
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
