package userInterface;

import javax.swing.*;
import java.awt.*;

public class JobTaskForm extends JPanel {
    private JobTaskPanel jobTaskPanel;
    private JobTaskButtonsPanel jobTaskButtonsPanel;

    public JobTaskForm() {
        this.setLayout(new BorderLayout());

        jobTaskPanel = new JobTaskPanel();
        jobTaskButtonsPanel = new JobTaskButtonsPanel(this);
        this.add(jobTaskPanel, BorderLayout.CENTER);
        this.add(jobTaskButtonsPanel, BorderLayout.SOUTH);
    }

    public JobTaskPanel getJobTaskPanel() {
        return jobTaskPanel;
    }
}