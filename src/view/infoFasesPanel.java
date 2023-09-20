package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class infoFasesPanel extends JPanel {
    private JLabel fase1;
    private JLabel fase2;
    private JLabel fase3;
    private JLabel fase4;

    infoFasesPanel() {
        initComponents();
    }

    public void initComponents() {
        fase1 = new JLabel("FASE 1: (Expansión Isotermica) \n" +
                "");
        fase2 = new JLabel("FASE 2: (Expansi;ón adiabática)" + "");
        fase3 = new JLabel("FASE 3: (Compresión isotermica)" + "");
        fase4 = new JLabel("FASE 4: (Compresión adiabática)" + "");
        add(fase1);
        add(fase2);
        add(fase3);
        add(fase4);
    }
}
