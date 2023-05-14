package userInterface;

import controller.ApplicationController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JobTaskButtonsPanel extends ButtonsPanel {
    private JButton validation, reset;
    private JobTaskForm jobTaskForm;
    private ApplicationController controller;

    public JobTaskButtonsPanel(JobTaskForm jobTaskForm) {
        super(jobTaskForm);
        this.jobTaskForm = jobTaskForm;
        this.controller = new ApplicationController();

        this.setLayout(new FlowLayout());

        validation = new JButton("Validation");
        reset = new JButton("Reset");
        this.add(validation);
        this.add(reset);
        ButtonListener2 buttonListener2 = new ButtonListener2();
        validation.addActionListener(buttonListener2);
        ButtonListener3 buttonListener3 = new ButtonListener3();
        reset.addActionListener(buttonListener3);
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
