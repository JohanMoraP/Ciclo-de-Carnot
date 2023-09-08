package view;

import javax.swing.JPanel;

public class PanelBase extends JPanel {

    private Panel1 panel1;

    public PanelBase() {

        initComponents();
    }

    public void initComponents() {
        panel1 = new Panel1();
        add(panel1);
    }
}
