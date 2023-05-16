package userInterface;

import javax.swing.*;
import java.awt.*;

public class NewsLetterPanel extends JPanel {
    private JRadioButton accept, reject;
    private ButtonGroup buttonGroup;

    public NewsLetterPanel() {
        this.setLayout(new FlowLayout());

        accept = new JRadioButton("Accept");
        reject = new JRadioButton("Reject");
        this.add(accept);
        this.add(reject);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(accept);
        buttonGroup.add(reject);
    }

    public Boolean getSelected() {
        return accept.isSelected();
    }

    public void setSelected(boolean wantsNewsLetter) {
        if (wantsNewsLetter) {
            accept.setSelected(true);
        } else {
            reject.setSelected(true);
        }
    }

    public void setInitialAll() {
        buttonGroup.clearSelection();
    }
}
