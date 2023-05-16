package userInterface;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JobTaskPanel extends JPanel {
    private JLabel monthLabel, yearLabel;
    private JSpinner month, year;

    public JobTaskPanel() {
        this.setLayout(new GridLayout(4,3,5,5));

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());

        monthLabel = new JLabel("Month :");
        monthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        ArrayList<String> months = new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        month = new JSpinner(new SpinnerListModel(months));
        this.add(monthLabel);
        this.add(month);
        this.add(new Panel());

        yearLabel = new JLabel("Year :");
        yearLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        ArrayList<Integer> years = new ArrayList<>(Arrays.asList(2022, 2023));
        year = new JSpinner(new SpinnerListModel(years));
        this.add(yearLabel);
        this.add(year);
        this.add(new Panel());

        this.add(new Panel());
        this.add(new Panel());
        this.add(new Panel());
    }

    public JSpinner getMonth() {
        return month;
    }

    public JSpinner getYear() {
        return year;
    }
}
