package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenu extends JPanel {
    private JButton infoBtn;
    private JButton graphBtn;
    private JLabel AppTittle;
    private JLabel graphJLabel;

    public PanelMenu() {
        setBackground(new Color(75, 162, 181));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 15, 15));
        initComponents();
        setVisible(true);
    }

    public void initComponents() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        AppTittle = new JLabel("Ciclo de Carnot");
        AppTittle.setForeground(Color.WHITE);
        add(AppTittle);

        infoBtn = new JButton();
        ImageIcon imageMenu1 = new ImageIcon(((new ImageIcon("images/graph.png")).getImage()).getScaledInstance(50, 50,
                java.awt.Image.SCALE_SMOOTH));
        infoBtn.setIcon(imageMenu1);
        infoBtn.setText("información");
        add(infoBtn);

        graphBtn = new JButton();
        ImageIcon imageMenu2 = new ImageIcon(((new ImageIcon("images/info.png")).getImage()).getScaledInstance(50, 50,
                java.awt.Image.SCALE_SMOOTH));
        graphBtn.setIcon(imageMenu2);
        graphBtn.setText("Gráfico");
        add(graphBtn);
    }
}
