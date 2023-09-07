package view;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private Panel1 menu;
    private Panel2 base;

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
        this.setLocationRelativeTo(null);
    }

    public void initComponents() {
        setLayout(new BorderLayout());
        menu = new Panel1;
        add(menu, BorderLayout.WEST);

        base = new Panel2();
        int espacio = 15;
        base.setBorder(BorderFactory.createEmptyBorder(espacio, espacio, espacio, espacio));
        add(base, BorderLayout.CENTER);
    }
}
