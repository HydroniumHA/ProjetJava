package userInterface;

import controller.ApplicationController;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JobTaskButtonsPanel extends JPanel {
    private JButton back, validation, reset;
    private JobTaskForm jobTaskForm;
    private ApplicationController controller;

    public JobTaskButtonsPanel(JobTaskForm jobTaskForm) {
        this.controller = new ApplicationController();
        this.jobTaskForm = jobTaskForm;

        this.setLayout(new FlowLayout());

        back = new JButton("Back");
        validation = new JButton("Validation");
        reset = new JButton("Reset");
        this.add(back);
        this.add(validation);
        this.add(reset);
        ButtonListener buttonListener = new ButtonListener();
        back.addActionListener(buttonListener);
        ButtonListener2 buttonListener2 = new ButtonListener2();
        validation.addActionListener(buttonListener2);
        ButtonListener3 buttonListener3 = new ButtonListener3();
        reset.addActionListener(buttonListener3);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            jobTaskForm.removeAll();
            jobTaskForm.add(new WelcomePanel());
            jobTaskForm.revalidate();
            jobTaskForm.repaint();
        }
    }

    private class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {

        }
    }

    private class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            jobTaskForm.getJobTaskPanel().setInitialAll();
        }
    }
}
