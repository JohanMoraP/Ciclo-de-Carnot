package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Toolkit;

public class PanelInfo1 extends JPanel {
    private JLabel info1;
    private JLabel info2;
    private JLabel info3;
    private JLabel infoImage;
    private Image image;

    PanelInfo1() {
        initComponents();
    }

    public void initComponents() {
        info1 = new JLabel("");
        info2 = new JLabel("");
        info3 = new JLabel("");
        image = Toolkit.getDefaultToolkit().getImage("images/imagem.png");
        ImageIcon icon = new ImageIcon(image);
        infoImage = new JLabel(icon);

        add(info1);
        add(info2);
        add(info3);
        add(infoImage);

    }

}
