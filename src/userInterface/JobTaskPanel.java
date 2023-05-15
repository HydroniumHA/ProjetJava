package userInterface;

import javax.swing.*;
import java.awt.*;

public class JobTaskPanel extends JPanel {
    private JLabel monthLabel, yearLabel;
    private JTextField month, year;

    public JobTaskPanel() {
        this.setLayout(new GridLayout(4,3,5,5));

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());

        monthLabel = new JLabel("Month :");
        monthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        month = new JTextField();
        this.add(monthLabel);
        this.add(month);
        this.add(new Panel());

        yearLabel = new JLabel("Year :");
        yearLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        year = new JTextField();
        this.add(yearLabel);
        this.add(year);
        this.add(new Panel());

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());
    }

    public void setInitialAll() {
        month.setText("");
        year.setText("");
    }

    public JTextField getMonth() {
        return month;
    }

    public JTextField getYear() {
        return year;
    }
}
