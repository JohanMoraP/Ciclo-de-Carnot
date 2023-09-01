package view;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private PanelBase base;
    private PanelMenu menu;

    public MyFrame() {
        super("Ciclo de Carnot");
        this.setSize(1000, 500);
        this.setMinimumSize(new Dimension(400, 400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        this.revalidate();
        this.pack();
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    public void initComponents() {
        setLayout(new BorderLayout());
        menu = new PanelMenu();
        add(menu, BorderLayout.WEST);

        base = new PanelBase();
        int espacio = 15;
        base.setBorder(BorderFactory.createEmptyBorder(espacio, espacio, espacio, espacio));
        add(base, BorderLayout.CENTER);
    }
}
