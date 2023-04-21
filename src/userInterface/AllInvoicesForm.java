package userInterface;

import javax.swing.*;
import java.awt.*;

public class AllInvoicesForm extends JPanel {
    private AllInvoicesPanel allInvoicesPanel;
    private InvoicesButtonsPanel invoicesButtonsPanel;

    public AllInvoicesForm() {
        this.setLayout(new BorderLayout());

        allInvoicesPanel = new AllInvoicesPanel();
        invoicesButtonsPanel = new InvoicesButtonsPanel(this);
        this.add(allInvoicesPanel, BorderLayout.CENTER);
        this.add(invoicesButtonsPanel, BorderLayout.SOUTH);
    }

    public AllInvoicesPanel getAllInvoicesPanel() {
        return allInvoicesPanel;
    }
}
