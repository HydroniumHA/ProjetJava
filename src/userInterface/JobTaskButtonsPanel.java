package userInterface;

import controller.ApplicationController;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JobTaskButtonsPanel extends ButtonsPanel {
    private JButton validation;
    private JobTaskForm jobTaskForm;
    private ApplicationController controller;

    public JobTaskButtonsPanel(JobTaskForm jobTaskForm) {
        super(jobTaskForm);
        this.jobTaskForm = jobTaskForm;
        this.controller = new ApplicationController();

        this.setLayout(new FlowLayout());

        validation = new JButton("Validation");
        this.add(validation);
        ButtonListener2 buttonListener2 = new ButtonListener2();
        validation.addActionListener(buttonListener2);
    }

    private class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            jobTaskForm.removeAll();
            try {
                int nbMonth = -1;
                String month = jobTaskForm.getJobTaskPanel().getMonth().getValue().toString();
                String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
                for (int i = 0; i < 12; i++) {
                    if (month.equals(months[i])) {
                        nbMonth = i + 1;
                        break;
                    }
                }
                JobTaskModel model = new JobTaskModel(controller.getJobTaskInfos(nbMonth, Integer.parseInt(jobTaskForm.getJobTaskPanel().getYear().getValue().toString())));
                JTable table = new JTable(model);
                table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                JScrollPane scrollPane = new JScrollPane(table);
                jobTaskForm.add(scrollPane, BorderLayout.CENTER);
            } catch (AllBuildingsException | AllRepairOrdersException | JobTaskException exception) {
                JOptionPane.showMessageDialog(null, exception, "JobTask Exception", JOptionPane.ERROR_MESSAGE);
            }
            revalidate();
            repaint();
        }
    }
}
